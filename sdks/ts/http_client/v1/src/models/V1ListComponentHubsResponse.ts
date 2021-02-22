// Copyright 2018-2021 Polyaxon, Inc.
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
 * The version of the OpenAPI document: 1.6.0
 * Contact: contact@polyaxon.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    V1ComponentHub,
    V1ComponentHubFromJSON,
    V1ComponentHubFromJSONTyped,
    V1ComponentHubToJSON,
} from './';

/**
 * 
 * @export
 * @interface V1ListComponentHubsResponse
 */
export interface V1ListComponentHubsResponse {
    /**
     * 
     * @type {number}
     * @memberof V1ListComponentHubsResponse
     */
    count?: number;
    /**
     * 
     * @type {Array<V1ComponentHub>}
     * @memberof V1ListComponentHubsResponse
     */
    results?: Array<V1ComponentHub>;
    /**
     * 
     * @type {string}
     * @memberof V1ListComponentHubsResponse
     */
    previous?: string;
    /**
     * 
     * @type {string}
     * @memberof V1ListComponentHubsResponse
     */
    next?: string;
}

export function V1ListComponentHubsResponseFromJSON(json: any): V1ListComponentHubsResponse {
    return V1ListComponentHubsResponseFromJSONTyped(json, false);
}

export function V1ListComponentHubsResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): V1ListComponentHubsResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'count': !exists(json, 'count') ? undefined : json['count'],
        'results': !exists(json, 'results') ? undefined : ((json['results'] as Array<any>).map(V1ComponentHubFromJSON)),
        'previous': !exists(json, 'previous') ? undefined : json['previous'],
        'next': !exists(json, 'next') ? undefined : json['next'],
    };
}

export function V1ListComponentHubsResponseToJSON(value?: V1ListComponentHubsResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'count': value.count,
        'results': value.results === undefined ? undefined : ((value.results as Array<any>).map(V1ComponentHubToJSON)),
        'previous': value.previous,
        'next': value.next,
    };
}


