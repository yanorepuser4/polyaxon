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
 *
 */

import ApiClient from '../ApiClient';
import V1CleanPodPolicy from './V1CleanPodPolicy';
import V1KFReplica from './V1KFReplica';

/**
 * The V1MPIJob model module.
 * @module model/V1MPIJob
 * @version 1.1.9
 */
class V1MPIJob {
    /**
     * Constructs a new <code>V1MPIJob</code>.
     * @alias module:model/V1MPIJob
     */
    constructor() { 
        
        V1MPIJob.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>V1MPIJob</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/V1MPIJob} obj Optional instance to populate.
     * @return {module:model/V1MPIJob} The populated <code>V1MPIJob</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new V1MPIJob();

            if (data.hasOwnProperty('kind')) {
                obj['kind'] = ApiClient.convertToType(data['kind'], 'String');
            }
            if (data.hasOwnProperty('cleanPodPolicy')) {
                obj['cleanPodPolicy'] = V1CleanPodPolicy.constructFromObject(data['cleanPodPolicy']);
            }
            if (data.hasOwnProperty('slots_per_worker')) {
                obj['slots_per_worker'] = ApiClient.convertToType(data['slots_per_worker'], 'Number');
            }
            if (data.hasOwnProperty('launcher')) {
                obj['launcher'] = V1KFReplica.constructFromObject(data['launcher']);
            }
            if (data.hasOwnProperty('worker')) {
                obj['worker'] = V1KFReplica.constructFromObject(data['worker']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} kind
 * @default 'mpi_job'
 */
V1MPIJob.prototype['kind'] = 'mpi_job';

/**
 * @member {module:model/V1CleanPodPolicy} cleanPodPolicy
 */
V1MPIJob.prototype['cleanPodPolicy'] = undefined;

/**
 * @member {Number} slots_per_worker
 */
V1MPIJob.prototype['slots_per_worker'] = undefined;

/**
 * @member {module:model/V1KFReplica} launcher
 */
V1MPIJob.prototype['launcher'] = undefined;

/**
 * @member {module:model/V1KFReplica} worker
 */
V1MPIJob.prototype['worker'] = undefined;






export default V1MPIJob;

