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

/*
 * Polyaxon SDKs and REST API specification.
 * Polyaxon SDKs and REST API specification.
 *
 * OpenAPI spec version: 1.0.75
 * Contact: contact@polyaxon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.10
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/V1Bayes', 'model/V1GridSearch', 'model/V1Hyperband', 'model/V1Hyperopt', 'model/V1Iterative', 'model/V1Mapping', 'model/V1RandomSearch'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./V1Bayes'), require('./V1GridSearch'), require('./V1Hyperband'), require('./V1Hyperopt'), require('./V1Iterative'), require('./V1Mapping'), require('./V1RandomSearch'));
  } else {
    // Browser globals (root is window)
    if (!root.PolyaxonSdk) {
      root.PolyaxonSdk = {};
    }
    root.PolyaxonSdk.V1Parallel = factory(root.PolyaxonSdk.ApiClient, root.PolyaxonSdk.V1Bayes, root.PolyaxonSdk.V1GridSearch, root.PolyaxonSdk.V1Hyperband, root.PolyaxonSdk.V1Hyperopt, root.PolyaxonSdk.V1Iterative, root.PolyaxonSdk.V1Mapping, root.PolyaxonSdk.V1RandomSearch);
  }
}(this, function(ApiClient, V1Bayes, V1GridSearch, V1Hyperband, V1Hyperopt, V1Iterative, V1Mapping, V1RandomSearch) {
  'use strict';

  /**
   * The V1Parallel model module.
   * @module model/V1Parallel
   * @version 1.0.75
   */

  /**
   * Constructs a new <code>V1Parallel</code>.
   * @alias module:model/V1Parallel
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>V1Parallel</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/V1Parallel} obj Optional instance to populate.
   * @return {module:model/V1Parallel} The populated <code>V1Parallel</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('random'))
        obj.random = V1RandomSearch.constructFromObject(data['random']);
      if (data.hasOwnProperty('grid'))
        obj.grid = V1GridSearch.constructFromObject(data['grid']);
      if (data.hasOwnProperty('hyperband'))
        obj.hyperband = V1Hyperband.constructFromObject(data['hyperband']);
      if (data.hasOwnProperty('bayes'))
        obj.bayes = V1Bayes.constructFromObject(data['bayes']);
      if (data.hasOwnProperty('hyperopt'))
        obj.hyperopt = V1Hyperopt.constructFromObject(data['hyperopt']);
      if (data.hasOwnProperty('iterative'))
        obj.iterative = V1Iterative.constructFromObject(data['iterative']);
      if (data.hasOwnProperty('mapping'))
        obj.mapping = V1Mapping.constructFromObject(data['mapping']);
    }
    return obj;
  }

  /**
   * @member {module:model/V1RandomSearch} random
   */
  exports.prototype.random = undefined;

  /**
   * @member {module:model/V1GridSearch} grid
   */
  exports.prototype.grid = undefined;

  /**
   * @member {module:model/V1Hyperband} hyperband
   */
  exports.prototype.hyperband = undefined;

  /**
   * @member {module:model/V1Bayes} bayes
   */
  exports.prototype.bayes = undefined;

  /**
   * @member {module:model/V1Hyperopt} hyperopt
   */
  exports.prototype.hyperopt = undefined;

  /**
   * @member {module:model/V1Iterative} iterative
   */
  exports.prototype.iterative = undefined;

  /**
   * @member {module:model/V1Mapping} mapping
   */
  exports.prototype.mapping = undefined;

  return exports;

}));