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
/**
 * 
 * @export
 * @interface V1AuthType
 */
export interface V1AuthType {
    /**
     * 
     * @type {string}
     * @memberof V1AuthType
     */
    user?: string;
    /**
     * 
     * @type {string}
     * @memberof V1AuthType
     */
    password?: string;
}

export function V1AuthTypeFromJSON(json: any): V1AuthType {
    return V1AuthTypeFromJSONTyped(json, false);
}

export function V1AuthTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): V1AuthType {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'user': !exists(json, 'user') ? undefined : json['user'],
        'password': !exists(json, 'password') ? undefined : json['password'],
    };
}

export function V1AuthTypeToJSON(value?: V1AuthType | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'user': value.user,
        'password': value.password,
    };
}


