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

/*
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


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.RuntimeError;
import org.openapitools.client.model.V1Compatibility;
import org.openapitools.client.model.V1Installation;
import org.openapitools.client.model.V1LogHandler;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VersionsV1Api {
    private ApiClient localVarApiClient;

    public VersionsV1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public VersionsV1Api(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getCompatibility
     * @param uuid UUid (required)
     * @param version Version (required)
     * @param service Service (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCompatibilityCall(String uuid, String version, String service, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/compatibility/{uuid}/{version}/{service}"
            .replaceAll("\\{" + "uuid" + "\\}", localVarApiClient.escapeString(uuid.toString()))
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll("\\{" + "service" + "\\}", localVarApiClient.escapeString(service.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCompatibilityValidateBeforeCall(String uuid, String version, String service, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getCompatibility(Async)");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getCompatibility(Async)");
        }
        
        // verify the required parameter 'service' is set
        if (service == null) {
            throw new ApiException("Missing the required parameter 'service' when calling getCompatibility(Async)");
        }
        

        okhttp3.Call localVarCall = getCompatibilityCall(uuid, version, service, _callback);
        return localVarCall;

    }

    /**
     * Get compatibility versions
     * 
     * @param uuid UUid (required)
     * @param version Version (required)
     * @param service Service (required)
     * @return V1Compatibility
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public V1Compatibility getCompatibility(String uuid, String version, String service) throws ApiException {
        ApiResponse<V1Compatibility> localVarResp = getCompatibilityWithHttpInfo(uuid, version, service);
        return localVarResp.getData();
    }

    /**
     * Get compatibility versions
     * 
     * @param uuid UUid (required)
     * @param version Version (required)
     * @param service Service (required)
     * @return ApiResponse&lt;V1Compatibility&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1Compatibility> getCompatibilityWithHttpInfo(String uuid, String version, String service) throws ApiException {
        okhttp3.Call localVarCall = getCompatibilityValidateBeforeCall(uuid, version, service, null);
        Type localVarReturnType = new TypeToken<V1Compatibility>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get compatibility versions (asynchronously)
     * 
     * @param uuid UUid (required)
     * @param version Version (required)
     * @param service Service (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCompatibilityAsync(String uuid, String version, String service, final ApiCallback<V1Compatibility> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCompatibilityValidateBeforeCall(uuid, version, service, _callback);
        Type localVarReturnType = new TypeToken<V1Compatibility>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getInstallation
     * @param auth auth. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInstallationCall(Boolean auth, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/installation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (auth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("auth", auth));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInstallationValidateBeforeCall(Boolean auth, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getInstallationCall(auth, _callback);
        return localVarCall;

    }

    /**
     * Get installation versions
     * 
     * @param auth auth. (optional)
     * @return V1Installation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public V1Installation getInstallation(Boolean auth) throws ApiException {
        ApiResponse<V1Installation> localVarResp = getInstallationWithHttpInfo(auth);
        return localVarResp.getData();
    }

    /**
     * Get installation versions
     * 
     * @param auth auth. (optional)
     * @return ApiResponse&lt;V1Installation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1Installation> getInstallationWithHttpInfo(Boolean auth) throws ApiException {
        okhttp3.Call localVarCall = getInstallationValidateBeforeCall(auth, null);
        Type localVarReturnType = new TypeToken<V1Installation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get installation versions (asynchronously)
     * 
     * @param auth auth. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInstallationAsync(Boolean auth, final ApiCallback<V1Installation> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInstallationValidateBeforeCall(auth, _callback);
        Type localVarReturnType = new TypeToken<V1Installation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getLogHandler
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLogHandlerCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/log_handler";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLogHandlerValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getLogHandlerCall(_callback);
        return localVarCall;

    }

    /**
     * Get log handler versions
     * 
     * @return V1LogHandler
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public V1LogHandler getLogHandler() throws ApiException {
        ApiResponse<V1LogHandler> localVarResp = getLogHandlerWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get log handler versions
     * 
     * @return ApiResponse&lt;V1LogHandler&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1LogHandler> getLogHandlerWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getLogHandlerValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<V1LogHandler>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get log handler versions (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You don&#39;t have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLogHandlerAsync(final ApiCallback<V1LogHandler> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLogHandlerValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<V1LogHandler>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
