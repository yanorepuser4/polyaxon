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

import { exists, mapValues } from '../runtime';
import {
    V1Optimization,
    V1OptimizationFromJSON,
    V1OptimizationFromJSONTyped,
    V1OptimizationToJSON,
} from './';

/**
 * 
 * @export
 * @interface V1OptimizationMetric
 */
export interface V1OptimizationMetric {
    /**
     * 
     * @type {string}
     * @memberof V1OptimizationMetric
     */
    name?: string;
    /**
     * 
     * @type {V1Optimization}
     * @memberof V1OptimizationMetric
     */
    optimization?: V1Optimization;
}

export function V1OptimizationMetricFromJSON(json: any): V1OptimizationMetric {
    return V1OptimizationMetricFromJSONTyped(json, false);
}

export function V1OptimizationMetricFromJSONTyped(json: any, ignoreDiscriminator: boolean): V1OptimizationMetric {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'name': !exists(json, 'name') ? undefined : json['name'],
        'optimization': !exists(json, 'optimization') ? undefined : V1OptimizationFromJSON(json['optimization']),
    };
}

export function V1OptimizationMetricToJSON(value?: V1OptimizationMetric | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'name': value.name,
        'optimization': V1OptimizationToJSON(value.optimization),
    };
}

