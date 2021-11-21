/*
 * Patient - Warenwirtschaft (Basis)
 * Synchronisation der Patienten mit der Warenwirtschaft
 *
 * OpenAPI spec version: 1.0.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Region;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegionApi {
    private ApiClient apiClient;

    public RegionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RegionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getRegion
     * @param albertaApiKey  (required)
     * @param _id eindeutige id der Region (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRegionCall(String albertaApiKey, String _id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/region/{_id}"
            .replaceAll("\\{" + "_id" + "\\}", apiClient.escapeString(_id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (albertaApiKey != null)
        localVarHeaderParams.put("Alberta-Api-Key", apiClient.parameterToString(albertaApiKey));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRegionValidateBeforeCall(String albertaApiKey, String _id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'albertaApiKey' is set
        if (albertaApiKey == null) {
            throw new ApiException("Missing the required parameter 'albertaApiKey' when calling getRegion(Async)");
        }
        // verify the required parameter '_id' is set
        if (_id == null) {
            throw new ApiException("Missing the required parameter '_id' when calling getRegion(Async)");
        }
        
        com.squareup.okhttp.Call call = getRegionCall(albertaApiKey, _id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Daten einer einzelnen Region abrufen
     * Szenario - das WaWi fragt bei Alberta nach, wie die Daten der Region mit der angegebenen Id sind
     * @param albertaApiKey  (required)
     * @param _id eindeutige id der Region (required)
     * @return Region
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Region getRegion(String albertaApiKey, String _id) throws ApiException {
        ApiResponse<Region> resp = getRegionWithHttpInfo(albertaApiKey, _id);
        return resp.getData();
    }

    /**
     * Daten einer einzelnen Region abrufen
     * Szenario - das WaWi fragt bei Alberta nach, wie die Daten der Region mit der angegebenen Id sind
     * @param albertaApiKey  (required)
     * @param _id eindeutige id der Region (required)
     * @return ApiResponse&lt;Region&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Region> getRegionWithHttpInfo(String albertaApiKey, String _id) throws ApiException {
        com.squareup.okhttp.Call call = getRegionValidateBeforeCall(albertaApiKey, _id, null, null);
        Type localVarReturnType = new TypeToken<Region>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Daten einer einzelnen Region abrufen (asynchronously)
     * Szenario - das WaWi fragt bei Alberta nach, wie die Daten der Region mit der angegebenen Id sind
     * @param albertaApiKey  (required)
     * @param _id eindeutige id der Region (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRegionAsync(String albertaApiKey, String _id, final ApiCallback<Region> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRegionValidateBeforeCall(albertaApiKey, _id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Region>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
