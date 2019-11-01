#!/usr/bin/python
#
# Copyright 2019 Polyaxon, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# coding: utf-8
from __future__ import absolute_import, division, print_function

from click import ClickException


class PolyaxonException(ClickException):
    def __init__(self, message=None):
        super(PolyaxonException, self).__init__(message)


class PolyaxonConfigurationError(PolyaxonException):
    """Exception class to raise if a Configurable object has an issue."""

    pass


class PolyaxonDeploymentConfigError(PolyaxonConfigurationError):
    pass


class PolyaxonSchemaError(Exception):
    """Exception class to raise if a schema has an issue."""

    pass


class PolyaxonfileError(PolyaxonSchemaError):
    """Exception class to raise if an error is encountered during the parsing of a Polyaxonfile."""

    pass


class PolyaxonConfigurationError(PolyaxonSchemaError):
    """Exception class to raise if a Configurable object has an issue."""

    pass


class PolyaxonClientException(Exception):
    def __init__(self, message=None):
        Exception.__init__(self, message)
        self.message = message

    def __str__(self):
        return self.message


class PolyaxonShouldExitError(PolyaxonClientException):
    pass


class PolyaxonHTTPError(PolyaxonClientException):
    def __init__(self, endpoint, response, message=None, status_code=None):
        super(PolyaxonHTTPError, self).__init__()
        self.endpoint = endpoint
        self.response = response
        self.message = getattr(self, "message", message)
        self.status_code = getattr(self, "status_code", status_code)

    def __str__(self):
        return "{status_code} on {endpoint}.".format(
            status_code=self.status_code, endpoint=self.endpoint
        )


class BadRequestError(PolyaxonHTTPError):
    status_code = 400
    message = "One or more request parameters is incorrect"


class AuthenticationError(PolyaxonHTTPError):
    staticmethod = 401
    message = "Authentication failed. Retry by invoking Polyaxon login."


class AuthorizationError(PolyaxonHTTPError):
    status_code = 403
    message = "You are not authorized to access this resource on Polyaxon."


class NotFoundError(PolyaxonHTTPError):
    status_code = 404
    message = "The resource you are looking for was not found. Check if the name or id is correct."


class OverLimitError(PolyaxonHTTPError):
    status_code = 429
    message = "You are over the allowed limits for this operation. Consider upgrading your account."


class ServerError(PolyaxonHTTPError):
    status_code = 500
    message = "Internal polyaxon server error, please try again later."


class BadGatewayError(PolyaxonHTTPError):
    status_code = 502
    message = "Invalid response from Polyaxon server."


class ServiceUnavailableError(PolyaxonHTTPError):
    status_code = 503
    message = "A problem was encountered, please try again later."


class GatewayTimeoutError(PolyaxonHTTPError):
    status_code = 504
    message = "Polyaxon server took too long to respond."


class SSLHandshakeError(PolyaxonHTTPError):
    status_code = 525


ERRORS_MAPPING = {
    "base": PolyaxonClientException,
    "http": PolyaxonHTTPError,
    400: BadRequestError,
    401: AuthenticationError,
    403: AuthorizationError,
    404: NotFoundError,
    429: OverLimitError,
    500: ServerError,
    502: BadGatewayError,
    503: ServiceUnavailableError,
    504: GatewayTimeoutError,
    525: SSLHandshakeError,
}