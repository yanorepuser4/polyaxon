// Copyright 2018-2020 Polyaxon, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/* tslint:disable */
/* eslint-disable */
/**
 * Polyaxon SDKs and REST API specification.
 * Polyaxon SDKs and REST API specification.
 *
 * The version of the OpenAPI document: 1.1.9
 * Contact: contact@polyaxon.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import {
    RuntimeError,
    RuntimeErrorFromJSON,
    RuntimeErrorToJSON,
    V1Auth,
    V1AuthFromJSON,
    V1AuthToJSON,
    V1Credentials,
    V1CredentialsFromJSON,
    V1CredentialsToJSON,
    V1PasswordChange,
    V1PasswordChangeFromJSON,
    V1PasswordChangeToJSON,
    V1UserEmail,
    V1UserEmailFromJSON,
    V1UserEmailToJSON,
    V1UserSingup,
    V1UserSingupFromJSON,
    V1UserSingupToJSON,
} from '../models';

export interface ChangePasswordRequest {
    body: V1PasswordChange;
}

export interface LoginRequest {
    body: V1Credentials;
}

export interface ResetPasswordRequest {
    body: V1UserEmail;
}

export interface ResetPasswordConfirmRequest {
    body: V1PasswordChange;
}

export interface SignupRequest {
    body: V1UserSingup;
}

/**
 * 
 */
export class AuthV1Api extends runtime.BaseAPI {

    /**
     * Change password
     */
    async changePasswordRaw(requestParameters: ChangePasswordRequest): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.body === null || requestParameters.body === undefined) {
            throw new runtime.RequiredError('body','Required parameter requestParameters.body was null or undefined when calling changePassword.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = this.configuration.apiKey("Authorization"); // ApiKey authentication
        }

        const response = await this.request({
            path: `/api/v1/auth/change-password`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: V1PasswordChangeToJSON(requestParameters.body),
        });

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Change password
     */
    async changePassword(requestParameters: ChangePasswordRequest): Promise<void> {
        await this.changePasswordRaw(requestParameters);
    }

    /**
     * Login
     */
    async loginRaw(requestParameters: LoginRequest): Promise<runtime.ApiResponse<V1Auth>> {
        if (requestParameters.body === null || requestParameters.body === undefined) {
            throw new runtime.RequiredError('body','Required parameter requestParameters.body was null or undefined when calling login.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = this.configuration.apiKey("Authorization"); // ApiKey authentication
        }

        const response = await this.request({
            path: `/api/v1/auth/token`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: V1CredentialsToJSON(requestParameters.body),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => V1AuthFromJSON(jsonValue));
    }

    /**
     * Login
     */
    async login(requestParameters: LoginRequest): Promise<V1Auth> {
        const response = await this.loginRaw(requestParameters);
        return await response.value();
    }

    /**
     * Reset password
     */
    async resetPasswordRaw(requestParameters: ResetPasswordRequest): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.body === null || requestParameters.body === undefined) {
            throw new runtime.RequiredError('body','Required parameter requestParameters.body was null or undefined when calling resetPassword.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = this.configuration.apiKey("Authorization"); // ApiKey authentication
        }

        const response = await this.request({
            path: `/api/v1/auth/reset-password`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: V1UserEmailToJSON(requestParameters.body),
        });

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Reset password
     */
    async resetPassword(requestParameters: ResetPasswordRequest): Promise<void> {
        await this.resetPasswordRaw(requestParameters);
    }

    /**
     * Reset password confirm
     */
    async resetPasswordConfirmRaw(requestParameters: ResetPasswordConfirmRequest): Promise<runtime.ApiResponse<V1Auth>> {
        if (requestParameters.body === null || requestParameters.body === undefined) {
            throw new runtime.RequiredError('body','Required parameter requestParameters.body was null or undefined when calling resetPasswordConfirm.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = this.configuration.apiKey("Authorization"); // ApiKey authentication
        }

        const response = await this.request({
            path: `/api/v1/auth/reset-password-confirm`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: V1PasswordChangeToJSON(requestParameters.body),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => V1AuthFromJSON(jsonValue));
    }

    /**
     * Reset password confirm
     */
    async resetPasswordConfirm(requestParameters: ResetPasswordConfirmRequest): Promise<V1Auth> {
        const response = await this.resetPasswordConfirmRaw(requestParameters);
        return await response.value();
    }

    /**
     * Signup
     */
    async signupRaw(requestParameters: SignupRequest): Promise<runtime.ApiResponse<V1Auth>> {
        if (requestParameters.body === null || requestParameters.body === undefined) {
            throw new runtime.RequiredError('body','Required parameter requestParameters.body was null or undefined when calling signup.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = this.configuration.apiKey("Authorization"); // ApiKey authentication
        }

        const response = await this.request({
            path: `/api/v1/auth/signup`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: V1UserSingupToJSON(requestParameters.body),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => V1AuthFromJSON(jsonValue));
    }

    /**
     * Signup
     */
    async signup(requestParameters: SignupRequest): Promise<V1Auth> {
        const response = await this.signupRaw(requestParameters);
        return await response.value();
    }

}
