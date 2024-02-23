# SoftPosApi

All URIs are relative to *https://sandbox.cashfree.com/pg*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**SposCreateTerminal**](SoftPosApi.md#SposCreateTerminal) | **POST** /terminal | Create Terminal |
| [**SposCreateTerminalTransaction**](SoftPosApi.md#SposCreateTerminalTransaction) | **POST** /terminal/transactions | Create Terminal Transaction |
| [**SposFetchTerminal**](SoftPosApi.md#SposFetchTerminal) | **GET** /terminal/{terminal_phone_no} | Get Terminal Status using Phone Number |
| [**SposFetchTerminalQRCodes**](SoftPosApi.md#SposFetchTerminalQRCodes) | **GET** /terminal/qrcodes | Fetch Terminal QR Codes |
| [**SposUpdateTerminal**](SoftPosApi.md#SposUpdateTerminal) | **PATCH** /terminal/{cf_terminal_id} | Update Terminal |
| [**SposUpdateTerminalStatus**](SoftPosApi.md#SposUpdateTerminalStatus) | **PATCH** /terminal/{cf_terminal_id}/status | Update Terminal Sttus |
| [**SposUploadTerminalDocs**](SoftPosApi.md#SposUploadTerminalDocs) | **POST** /terminal/{cf_terminal_id}/docs | Upload Terminal Docs |



## SposCreateTerminal

> TerminalEntity SposCreateTerminal(xApiVersion, createTerminalRequest, xRequestId, xIdempotencyKey)

Create Terminal

Use this API to create new terminals to use softPOS.

### Example

```java
// Import classes:
import com.cashfree.*;
import com.cashfree.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
        CreateTerminalRequest createTerminalRequest = new CreateTerminalRequest(); // CreateTerminalRequest | Request Body to Create Terminal for SPOS
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            TerminalEntity result = cashfree.SposCreateTerminal(xApiVersion, createTerminalRequest, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftPosApi#SposCreateTerminal");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2023-08-01] |
| **createTerminalRequest** | [**CreateTerminalRequest**](CreateTerminalRequest.md)| Request Body to Create Terminal for SPOS | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Return type

[**TerminalEntity**](TerminalEntity.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Terminal created |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **400** | Bad request error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **401** | Authentication Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **404** | Resource Not found |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **409** | Resource already present |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **422** | Idempotency error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **429** | Rate Limit Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **500** | API related Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |


## SposCreateTerminalTransaction

> TerminalTransactionEntity SposCreateTerminalTransaction(xApiVersion, createTerminalTransactionRequest, xRequestId, xIdempotencyKey)

Create Terminal Transaction

Use this API to create a new terminal transaction. To use this API you should first create an order using the Create Order API. Also, you need to enter the terminal details while creating the order and pass the same terminal information while creating a transaction using the below mentioned API.

### Example

```java
// Import classes:
import com.cashfree.*;
import com.cashfree.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
        CreateTerminalTransactionRequest createTerminalTransactionRequest = new CreateTerminalTransactionRequest(); // CreateTerminalTransactionRequest | Request body to create a terminal transaction
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            TerminalTransactionEntity result = cashfree.SposCreateTerminalTransaction(xApiVersion, createTerminalTransactionRequest, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftPosApi#SposCreateTerminalTransaction");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2023-08-01] |
| **createTerminalTransactionRequest** | [**CreateTerminalTransactionRequest**](CreateTerminalTransactionRequest.md)| Request body to create a terminal transaction | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Return type

[**TerminalTransactionEntity**](TerminalTransactionEntity.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Terminal Transaction created |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **400** | Bad request error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **401** | Authentication Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **404** | Resource Not found |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **409** | Resource already present |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **422** | Idempotency error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **429** | Rate Limit Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **500** | API related Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |


## SposFetchTerminal

> TerminalEntity SposFetchTerminal(xApiVersion, terminalPhoneNo, xRequestId, xIdempotencyKey)

Get Terminal Status using Phone Number

Use this API to view all details of a terminal.

### Example

```java
// Import classes:
import com.cashfree.*;
import com.cashfree.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
        String terminalPhoneNo = "6309291183"; // String | The terminal for which you want to view the order details.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            TerminalEntity result = cashfree.SposFetchTerminal(xApiVersion, terminalPhoneNo, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftPosApi#SposFetchTerminal");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2023-08-01] |
| **terminalPhoneNo** | **String**| The terminal for which you want to view the order details. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Return type

[**TerminalEntity**](TerminalEntity.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **400** | Bad request error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **401** | Authentication Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **404** | Resource Not found |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **409** | Resource already present |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **422** | Idempotency error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **429** | Rate Limit Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **500** | API related Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |


## SposFetchTerminalQRCodes

> List&lt;FetchTerminalQRCodesEntity&gt; SposFetchTerminalQRCodes(xApiVersion, terminalPhoneNo, cfTerminalId, xRequestId, xIdempotencyKey)

Fetch Terminal QR Codes

You can fetch all the StaticQRs corresponding to given terminal id or phone number. Provide either the terminal_phone_no or terminal_id in the request.

### Example

```java
// Import classes:
import com.cashfree.*;
import com.cashfree.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
        String terminalPhoneNo = "9876543214"; // String | Phone number assigned to the terminal. Required if you are not providing the cf_terminal_id in the request.
        String cfTerminalId = "123344"; // String | Cashfree terminal id for which you want to get staticQRs. Required if you are not providing the terminal_phone_number in the request.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            List<FetchTerminalQRCodesEntity> result = cashfree.SposFetchTerminalQRCodes(xApiVersion, terminalPhoneNo, cfTerminalId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftPosApi#SposFetchTerminalQRCodes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2023-08-01] |
| **terminalPhoneNo** | **String**| Phone number assigned to the terminal. Required if you are not providing the cf_terminal_id in the request. | |
| **cfTerminalId** | **String**| Cashfree terminal id for which you want to get staticQRs. Required if you are not providing the terminal_phone_number in the request. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Return type

[**List&lt;FetchTerminalQRCodesEntity&gt;**](FetchTerminalQRCodesEntity.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetched Terminal QR Codes |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **400** | Bad request error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **401** | Authentication Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **404** | Resource Not found |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **409** | Resource already present |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **422** | Idempotency error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **429** | Rate Limit Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **500** | API related Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |


## SposUpdateTerminal

> List&lt;UpdateTerminalEntity&gt; SposUpdateTerminal(xApiVersion, cfTerminalId, updateTerminalRequest, xRequestId, xIdempotencyKey)

Update Terminal

Use this API to update the terminal details. Email, Phone Number, and Terminal Meta are updatable for \&quot;Storefront\&quot;. Only account status change is possible in case of \&quot;Agent\&quot;.

### Example

```java
// Import classes:
import com.cashfree.*;
import com.cashfree.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
        String cfTerminalId = "123344"; // String | Provide the Cashfree terminal ID for which the details have to be updated.
        UpdateTerminalRequest updateTerminalRequest = new UpdateTerminalRequest(); // UpdateTerminalRequest | Request Body to update terminal for SPOS.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            List<UpdateTerminalEntity> result = cashfree.SposUpdateTerminal(xApiVersion, cfTerminalId, updateTerminalRequest, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftPosApi#SposUpdateTerminal");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2023-08-01] |
| **cfTerminalId** | **String**| Provide the Cashfree terminal ID for which the details have to be updated. | |
| **updateTerminalRequest** | [**UpdateTerminalRequest**](UpdateTerminalRequest.md)| Request Body to update terminal for SPOS. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Return type

[**List&lt;UpdateTerminalEntity&gt;**](UpdateTerminalEntity.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated Terminal |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **400** | Bad request error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **401** | Authentication Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **404** | Resource Not found |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **409** | Resource already present |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **422** | Idempotency error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **429** | Rate Limit Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **500** | API related Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |


## SposUpdateTerminalStatus

> List&lt;UpdateTerminalEntity&gt; SposUpdateTerminalStatus(xApiVersion, cfTerminalId, updateTerminalStatusRequest, xRequestId, xIdempotencyKey)

Update Terminal Sttus

Use this API to update the terminal status.

### Example

```java
// Import classes:
import com.cashfree.*;
import com.cashfree.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
        String cfTerminalId = "123344"; // String | Provide the Cashfree terminal ID for which the details have to be updated.
        UpdateTerminalStatusRequest updateTerminalStatusRequest = new UpdateTerminalStatusRequest(); // UpdateTerminalStatusRequest | Request Body to update terminal status for SPOS.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            List<UpdateTerminalEntity> result = cashfree.SposUpdateTerminalStatus(xApiVersion, cfTerminalId, updateTerminalStatusRequest, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftPosApi#SposUpdateTerminalStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2023-08-01] |
| **cfTerminalId** | **String**| Provide the Cashfree terminal ID for which the details have to be updated. | |
| **updateTerminalStatusRequest** | [**UpdateTerminalStatusRequest**](UpdateTerminalStatusRequest.md)| Request Body to update terminal status for SPOS. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Return type

[**List&lt;UpdateTerminalEntity&gt;**](UpdateTerminalEntity.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated Terminal Status |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **400** | Bad request error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **401** | Authentication Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **404** | Resource Not found |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **409** | Resource already present |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **422** | Idempotency error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **429** | Rate Limit Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **500** | API related Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |


## SposUploadTerminalDocs

> List&lt;UploadTerminalDocsEntity&gt; SposUploadTerminalDocs(xApiVersion, cfTerminalId, uploadTerminalDocs, xRequestId, xIdempotencyKey)

Upload Terminal Docs

Use this API to upload the terminal documents.

### Example

```java
// Import classes:
import com.cashfree.*;
import com.cashfree.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
        String cfTerminalId = "123344"; // String | Provide the Cashfree terminal ID for which the details have to be updated.
        UploadTerminalDocs uploadTerminalDocs = new UploadTerminalDocs(); // UploadTerminalDocs | Request Body to update terminal documents for SPOS.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            List<UploadTerminalDocsEntity> result = cashfree.SposUploadTerminalDocs(xApiVersion, cfTerminalId, uploadTerminalDocs, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoftPosApi#SposUploadTerminalDocs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2023-08-01] |
| **cfTerminalId** | **String**| Provide the Cashfree terminal ID for which the details have to be updated. | |
| **uploadTerminalDocs** | [**UploadTerminalDocs**](UploadTerminalDocs.md)| Request Body to update terminal documents for SPOS. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Return type

[**List&lt;UploadTerminalDocsEntity&gt;**](UploadTerminalDocsEntity.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload Terminal Docs |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **400** | Bad request error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **401** | Authentication Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **404** | Resource Not found |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **409** | Resource already present |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **422** | Idempotency error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **429** | Rate Limit Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **500** | API related Error |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |

