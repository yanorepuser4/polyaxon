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
 * The version of the OpenAPI document: 1.0.81
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
    V1AccessResource,
    V1AccessResourceFromJSON,
    V1AccessResourceToJSON,
    V1ListAccessResourcesResponse,
    V1ListAccessResourcesResponseFromJSON,
    V1ListAccessResourcesResponseToJSON,
} from '../models';

export interface CreateAccessResourceRequest {
    owner: string;
    body: V1AccessResource;
}

export interface DeleteAccessResourceRequest {
    owner: string;
    uuid: string;
}

export interface GetAccessResourceRequest {
    owner: string;
    uuid: string;
}

export interface ListAccessResourceNamesRequest {
    owner: string;
    offset?: number;
    limit?: number;
    sort?: string;
    query?: string;
}

export interface ListAccessResourcesRequest {
    owner: string;
    offset?: number;
    limit?: number;
    sort?: string;
    query?: string;
}

export interface PatchAccessResourceRequest {
    owner: string;
    accessResourceUuid: string;
    body: V1AccessResource;
}

export interface UpdateAccessResourceRequest {
    owner: string;
    accessResourceUuid: string;
    body: V1AccessResource;
}

/**
 * Polyaxon's typescript client
 */
export class AccessResourcesV1Api extends runtime.BaseAPI {

    /**
     * Create access resource
     */
    async createAccessResourceRaw(requestParameters: CreateAccessResourceRequest): Promise<runtime.ApiResponse<V1AccessResource>> {
        if (requestParameters.owner === null || requestParameters.owner === undefined) {
            throw new runtime.RequiredError('owner','Required parameter requestParameters.owner was null or undefined when calling createAccessResource.');
        }

        if (requestParameters.body === null || requestParameters.body === undefined) {
            throw new runtime.RequiredError('body','Required parameter requestParameters.body was null or undefined when calling createAccessResource.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = this.configuration.apiKey("Authorization"); // ApiKey authentication
        }

        const response = await this.request({
            path: `/api/v1/orgs/{owner}/access_resources`.replace(`{${"owner"}}`, encodeURIComponent(String(requestParameters.owner))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: V1AccessResourceToJSON(requestParameters.body),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => V1AccessResourceFromJSON(jsonValue));
    }

    /**
     * Create access resource
     */
    async createAccessResource(requestParameters: CreateAccessResourceRequest): Promise<V1AccessResource> {
        const response = await this.createAccessResourceRaw(requestParameters);
        return await response.value();
    }

    /**
     * Delete access resource
     */
    async deleteAccessResourceRaw(requestParameters: DeleteAccessResourceRequest): Promise<runtime.ApiResponse<object>> {
        if (requestParameters.owner === null || requestParameters.owner === undefined) {
            throw new runtime.RequiredError('owner','Required parameter requestParameters.owner was null or undefined when calling deleteAccessResource.');
        }

        if (requestParameters.uuid === null || requestParameters.uuid === undefined) {
            throw new runtime.RequiredError('uuid','Required parameter requestParameters.uuid was null or undefined when calling deleteAccessResource.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = this.configuration.apiKey("Authorization"); // ApiKey authentication
        }

        const response = await this.request({
            path: `/api/v1/orgs/{owner}/access_resources/{uuid}`.replace(`{${"owner"}}`, encodeURIComponent(String(requestParameters.owner))).replace(`{${"uuid"}}`, encodeURIComponent(String(requestParameters.uuid))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse<any>(response);
    }

    /**
     * Delete access resource
     */
    async deleteAccessResource(requestParameters: DeleteAccessResourceRequest): Promise<object> {
        const response = await this.deleteAccessResourceRaw(requestParameters);
        return await response.value();
    }

    /**
     * Get access resource
     */
    async getAccessResourceRaw(requestParameters: GetAccessResourceRequest): Promise<runtime.ApiResponse<V1AccessResource>> {
        if (requestParameters.owner === null || requestParameters.owner === undefined) {
            throw new runtime.RequiredError('owner','Required parameter requestParameters.owner was null or undefined when calling getAccessResource.');
        }

        if (requestParameters.uuid === null || requestParameters.uuid === undefined) {
            throw new runtime.RequiredError('uuid','Required parameter requestParameters.uuid was null or undefined when calling getAccessResource.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = this.configuration.apiKey("Authorization"); // ApiKey authentication
        }

        const response = await this.request({
            path: `/api/v1/orgs/{owner}/access_resources/{uuid}`.replace(`{${"owner"}}`, encodeURIComponent(String(requestParameters.owner))).replace(`{${"uuid"}}`, encodeURIComponent(String(requestParameters.uuid))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => V1AccessResourceFromJSON(jsonValue));
    }

    /**
     * Get access resource
     */
    async getAccessResource(requestParameters: GetAccessResourceRequest): Promise<V1AccessResource> {
        const response = await this.getAccessResourceRaw(requestParameters);
        return await response.value();
    }

    /**
     * List access resource names
     */
    async listAccessResourceNamesRaw(requestParameters: ListAccessResourceNamesRequest): Promise<runtime.ApiResponse<V1ListAccessResourcesResponse>> {
        if (requestParameters.owner === null || requestParameters.owner === undefined) {
            throw new runtime.RequiredError('owner','Required parameter requestParameters.owner was null or undefined when calling listAccessResourceNames.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.offset !== undefined) {
            queryParameters['offset'] = requestParameters.offset;
        }

        if (requestParameters.limit !== undefined) {
            queryParameters['limit'] = requestParameters.limit;
        }

        if (requestParameters.sort !== undefined) {
            queryParameters['sort'] = requestParameters.sort;
        }

        if (requestParameters.query !== undefined) {
            queryParameters['query'] = requestParameters.query;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = this.configuration.apiKey("Authorization"); // ApiKey authentication
        }

        const response = await this.request({
            path: `/api/v1/orgs/{owner}/access_resources/names`.replace(`{${"owner"}}`, encodeURIComponent(String(requestParameters.owner))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => V1ListAccessResourcesResponseFromJSON(jsonValue));
    }

    /**
     * List access resource names
     */
    async listAccessResourceNames(requestParameters: ListAccessResourceNamesRequest): Promise<V1ListAccessResourcesResponse> {
        const response = await this.listAccessResourceNamesRaw(requestParameters);
        return await response.value();
    }

    /**
     * List access resources
     */
    async listAccessResourcesRaw(requestParameters: ListAccessResourcesRequest): Promise<runtime.ApiResponse<V1ListAccessResourcesResponse>> {
        if (requestParameters.owner === null || requestParameters.owner === undefined) {
            throw new runtime.RequiredError('owner','Required parameter requestParameters.owner was null or undefined when calling listAccessResources.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.offset !== undefined) {
            queryParameters['offset'] = requestParameters.offset;
        }

        if (requestParameters.limit !== undefined) {
            queryParameters['limit'] = requestParameters.limit;
        }

        if (requestParameters.sort !== undefined) {
            queryParameters['sort'] = requestParameters.sort;
        }

        if (requestParameters.query !== undefined) {
            queryParameters['query'] = requestParameters.query;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = this.configuration.apiKey("Authorization"); // ApiKey authentication
        }

        const response = await this.request({
            path: `/api/v1/orgs/{owner}/access_resources`.replace(`{${"owner"}}`, encodeURIComponent(String(requestParameters.owner))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => V1ListAccessResourcesResponseFromJSON(jsonValue));
    }

    /**
     * List access resources
     */
    async listAccessResources(requestParameters: ListAccessResourcesRequest): Promise<V1ListAccessResourcesResponse> {
        const response = await this.listAccessResourcesRaw(requestParameters);
        return await response.value();
    }

    /**
     * Patch access resource
     */
    async patchAccessResourceRaw(requestParameters: PatchAccessResourceRequest): Promise<runtime.ApiResponse<V1AccessResource>> {
        if (requestParameters.owner === null || requestParameters.owner === undefined) {
            throw new runtime.RequiredError('owner','Required parameter requestParameters.owner was null or undefined when calling patchAccessResource.');
        }

        if (requestParameters.accessResourceUuid === null || requestParameters.accessResourceUuid === undefined) {
            throw new runtime.RequiredError('accessResourceUuid','Required parameter requestParameters.accessResourceUuid was null or undefined when calling patchAccessResource.');
        }

        if (requestParameters.body === null || requestParameters.body === undefined) {
            throw new runtime.RequiredError('body','Required parameter requestParameters.body was null or undefined when calling patchAccessResource.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = this.configuration.apiKey("Authorization"); // ApiKey authentication
        }

        const response = await this.request({
            path: `/api/v1/orgs/{owner}/access_resources/{access_resource.uuid}`.replace(`{${"owner"}}`, encodeURIComponent(String(requestParameters.owner))).replace(`{${"access_resource.uuid"}}`, encodeURIComponent(String(requestParameters.accessResourceUuid))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: V1AccessResourceToJSON(requestParameters.body),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => V1AccessResourceFromJSON(jsonValue));
    }

    /**
     * Patch access resource
     */
    async patchAccessResource(requestParameters: PatchAccessResourceRequest): Promise<V1AccessResource> {
        const response = await this.patchAccessResourceRaw(requestParameters);
        return await response.value();
    }

    /**
     * Update access resource
     */
    async updateAccessResourceRaw(requestParameters: UpdateAccessResourceRequest): Promise<runtime.ApiResponse<V1AccessResource>> {
        if (requestParameters.owner === null || requestParameters.owner === undefined) {
            throw new runtime.RequiredError('owner','Required parameter requestParameters.owner was null or undefined when calling updateAccessResource.');
        }

        if (requestParameters.accessResourceUuid === null || requestParameters.accessResourceUuid === undefined) {
            throw new runtime.RequiredError('accessResourceUuid','Required parameter requestParameters.accessResourceUuid was null or undefined when calling updateAccessResource.');
        }

        if (requestParameters.body === null || requestParameters.body === undefined) {
            throw new runtime.RequiredError('body','Required parameter requestParameters.body was null or undefined when calling updateAccessResource.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = this.configuration.apiKey("Authorization"); // ApiKey authentication
        }

        const response = await this.request({
            path: `/api/v1/orgs/{owner}/access_resources/{access_resource.uuid}`.replace(`{${"owner"}}`, encodeURIComponent(String(requestParameters.owner))).replace(`{${"access_resource.uuid"}}`, encodeURIComponent(String(requestParameters.accessResourceUuid))),
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
            body: V1AccessResourceToJSON(requestParameters.body),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => V1AccessResourceFromJSON(jsonValue));
    }

    /**
     * Update access resource
     */
    async updateAccessResource(requestParameters: UpdateAccessResourceRequest): Promise<V1AccessResource> {
        const response = await this.updateAccessResourceRaw(requestParameters);
        return await response.value();
    }

}