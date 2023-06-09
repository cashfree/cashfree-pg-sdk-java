/*
 * New Payment Gateway APIs
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2022-01-01
 * Contact: nextgenapi@cashfree.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.cashfree.pg.api;


import com.cashfree.pg.ApiCallback;
import com.cashfree.pg.ApiClient;
import com.cashfree.pg.ApiException;
import com.cashfree.pg.ApiResponse;
import com.cashfree.pg.Configuration;
import com.cashfree.pg.Pair;
import com.cashfree.pg.model.CFSettlementsEntity;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SettlementsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SettlementsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SettlementsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getsettlements
     *
     * @param xClientId (required)
     * @param xClientSecret (required)
     * @param orderId (required)
     * @param xApiVersion (optional, default to 2022-01-01)
     * @param xIdempotencyReplayed (optional, default to false)
     * @param xIdempotencyKey (optional)
     * @param xRequestId (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *    <table border="1"> <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  </td></tr>
     * <tr><td> 0 </td><td> Any bad or invalid request will lead to following error object </td><td>  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call getsettlementsCall(
            String xClientId,
            String xClientSecret,
            String orderId,
            String xApiVersion,
            Boolean xIdempotencyReplayed,
            String xIdempotencyKey,
            String xRequestId,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/orders/{order_id}/settlements"
                        .replace(
                                "{" + "order_id" + "}",
                                localVarApiClient.escapeString(orderId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xClientId != null) {
            localVarHeaderParams.put("x-client-id", localVarApiClient.parameterToString(xClientId));
        }

        if (xClientSecret != null) {
            localVarHeaderParams.put(
                    "x-client-secret", localVarApiClient.parameterToString(xClientSecret));
        }

        if (xApiVersion != null) {
            localVarHeaderParams.put(
                    "x-api-version", localVarApiClient.parameterToString(xApiVersion));
        }

        if (xIdempotencyReplayed != null) {
            localVarHeaderParams.put(
                    "x-idempotency-replayed",
                    localVarApiClient.parameterToString(xIdempotencyReplayed));
        }

        if (xIdempotencyKey != null) {
            localVarHeaderParams.put(
                    "x-idempotency-key", localVarApiClient.parameterToString(xIdempotencyKey));
        }

        if (xRequestId != null) {
            localVarHeaderParams.put(
                    "x-request-id", localVarApiClient.parameterToString(xRequestId));
        }

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "GET",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getsettlementsValidateBeforeCall(
            String xClientId,
            String xClientSecret,
            String orderId,
            String xApiVersion,
            Boolean xIdempotencyReplayed,
            String xIdempotencyKey,
            String xRequestId,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'xClientId' is set
        if (xClientId == null) {
            throw new ApiException(
                    "Missing the required parameter 'xClientId' when calling"
                            + " getsettlements(Async)");
        }

        // verify the required parameter 'xClientSecret' is set
        if (xClientSecret == null) {
            throw new ApiException(
                    "Missing the required parameter 'xClientSecret' when calling"
                            + " getsettlements(Async)");
        }

        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException(
                    "Missing the required parameter 'orderId' when calling getsettlements(Async)");
        }

        return getsettlementsCall(
                xClientId,
                xClientSecret,
                orderId,
                xApiVersion,
                xIdempotencyReplayed,
                xIdempotencyKey,
                xRequestId,
                _callback);
    }

    /**
     * Get Settlements Use this API to view all the settlements of a particular order.
     *
     * @param xClientId (required)
     * @param xClientSecret (required)
     * @param orderId (required)
     * @param xApiVersion (optional, default to 2022-01-01)
     * @param xIdempotencyReplayed (optional, default to false)
     * @param xIdempotencyKey (optional)
     * @param xRequestId (optional)
     * @return CFSettlementsEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *    <table border="1"> <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  </td></tr>
     * <tr><td> 0 </td><td> Any bad or invalid request will lead to following error object </td><td>  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  </td></tr>
     * </table>
     */
    public CFSettlementsEntity getsettlements(
            String xClientId,
            String xClientSecret,
            String orderId,
            String xApiVersion,
            Boolean xIdempotencyReplayed,
            String xIdempotencyKey,
            String xRequestId)
            throws ApiException {
        ApiResponse<CFSettlementsEntity> localVarResp =
                getsettlementsWithHttpInfo(
                        xClientId,
                        xClientSecret,
                        orderId,
                        xApiVersion,
                        xIdempotencyReplayed,
                        xIdempotencyKey,
                        xRequestId);
        return localVarResp.getData();
    }

    /**
     * Get Settlements Use this API to view all the settlements of a particular order.
     *
     * @param xClientId (required)
     * @param xClientSecret (required)
     * @param orderId (required)
     * @param xApiVersion (optional, default to 2022-01-01)
     * @param xIdempotencyReplayed (optional, default to false)
     * @param xIdempotencyKey (optional)
     * @param xRequestId (optional)
     * @return ApiResponse&lt;CFSettlementsEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *    <table border="1"> <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  </td></tr>
     * <tr><td> 0 </td><td> Any bad or invalid request will lead to following error object </td><td>  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  </td></tr>
     * </table>
     */
    public ApiResponse<CFSettlementsEntity> getsettlementsWithHttpInfo(
            String xClientId,
            String xClientSecret,
            String orderId,
            String xApiVersion,
            Boolean xIdempotencyReplayed,
            String xIdempotencyKey,
            String xRequestId)
            throws ApiException {
        okhttp3.Call localVarCall =
                getsettlementsValidateBeforeCall(
                        xClientId,
                        xClientSecret,
                        orderId,
                        xApiVersion,
                        xIdempotencyReplayed,
                        xIdempotencyKey,
                        xRequestId,
                        null);
        Type localVarReturnType = new TypeToken<CFSettlementsEntity>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Settlements (asynchronously) Use this API to view all the settlements of a particular
     * order.
     *
     * @param xClientId (required)
     * @param xClientSecret (required)
     * @param orderId (required)
     * @param xApiVersion (optional, default to 2022-01-01)
     * @param xIdempotencyReplayed (optional, default to false)
     * @param xIdempotencyKey (optional)
     * @param xRequestId (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *    <table border="1"> <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  </td></tr>
     * <tr><td> 0 </td><td> Any bad or invalid request will lead to following error object </td><td>  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call getsettlementsAsync(
            String xClientId,
            String xClientSecret,
            String orderId,
            String xApiVersion,
            Boolean xIdempotencyReplayed,
            String xIdempotencyKey,
            String xRequestId,
            final ApiCallback<CFSettlementsEntity> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getsettlementsValidateBeforeCall(
                        xClientId,
                        xClientSecret,
                        orderId,
                        xApiVersion,
                        xIdempotencyReplayed,
                        xIdempotencyKey,
                        xRequestId,
                        _callback);
        Type localVarReturnType = new TypeToken<CFSettlementsEntity>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
