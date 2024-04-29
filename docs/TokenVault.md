# TokenVault

Method | HTTP request | Description
------------- | ------------- | -------------
[**PGCustomerDeleteInstrument**](TokenVault.md#PGCustomerDeleteInstrument) | **Delete** /customers/{customer_id}/instruments/{instrument_id} | Delete Saved Card Instrument
[**PGCustomerFetchInstrument**](TokenVault.md#PGCustomerFetchInstrument) | **Get** /customers/{customer_id}/instruments/{instrument_id} | Fetch Specific Saved Card Instrument
[**PGCustomerFetchInstruments**](TokenVault.md#PGCustomerFetchInstruments) | **Get** /customers/{customer_id}/instruments | Fetch All Saved Card Instrument
[**PGCustomerInstrumentsFetchCryptogram**](TokenVault.md#PGCustomerInstrumentsFetchCryptogram) | **Get** /customers/{customer_id}/instruments/{instrument_id}/cryptogram | Fetch cryptogram for a saved card instrument



## PGCustomerDeleteInstrument

> PGCustomerDeleteInstrument(x_api_version: string, customer_id: string, instrument_id: string, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<InstrumentEntity, any>>

Delete Saved Card Instrument ([Docs](https://docs.cashfree.com/reference/pgcustomerdeleteinstrument))

## PGCustomerDeleteInstrument

> InstrumentEntity PGCustomerDeleteInstrument(xApiVersion, customerId, instrumentId, xRequestId, xIdempotencyKey)

Delete Saved Card Instrument

Use this API to delete a saved card instrument for a customer_id and instrument_id

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
        String customerId = "siddhesh_desai"; // String | Your Customer ID that you had sent during create order API `POST/orders`
        String instrumentId = "54deabb4-ba45-4a60-9e6a-9c016fe7ab10"; // String | The instrument_id which needs to be deleted
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            InstrumentEntity result = cashfree.PGCustomerDeleteInstrument(xApiVersion, customerId, instrumentId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenVaultApi#PGCustomerDeleteInstrument");
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
| **customerId** | **String**| Your Customer ID that you had sent during create order API &#x60;POST/orders&#x60; | |
| **instrumentId** | **String**| The instrument_id which needs to be deleted | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Response

```json
{
  "customer_id": "siddhesh_desai",
  "afa_reference": "740324562",
  "instrument_id": "54deabb4-ba45-4a60-9e6a-9c016fe7ab10",
  "instrument_type": "card",
  "instrument_uid": "0d8f70838cc5af8b1cd2bc0fe71278551fd3f1101e40020d89ad22ceba4f933c",
  "instrument_display": "xxxxxxxxxxxx4375",
  "instrument_status": "ACTIVE",
  "created_at": "2021-11-11 16:57:57",
  "instrument_meta": {
    "card_network": "VISA",
    "card_bank_name": "HDFC Bank Limited",
    "card_country": "IN",
    "card_type": "DEBIT_CARD",
    "card_token_details": {
      "par": "somepar",
      "expiry_month": "12",
      "expiry_year": "23"
    }
  }
}
```

## PGCustomerFetchInstrument

> PGCustomerFetchInstrument(x_api_version: string, customer_id: string, instrument_id: string, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<InstrumentEntity, any>>

Fetch Specific Saved Card Instrument ([Docs](https://docs.cashfree.com/reference/pgcustomerfetchinstrument))



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
        String customerId = "siddhesh_desai"; // String | Your Customer ID that you had sent during create order API `POST/orders`
        String instrumentId = "54deabb4-ba45-4a60-9e6a-9c016fe7ab10"; // String | The instrument_id of the saved instrument which needs to be queried
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            InstrumentEntity result = cashfree.PGCustomerFetchInstrument(xApiVersion, customerId, instrumentId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenVaultApi#PGCustomerFetchInstrument");
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
| **customerId** | **String**| Your Customer ID that you had sent during create order API &#x60;POST/orders&#x60; | |
| **instrumentId** | **String**| The instrument_id of the saved instrument which needs to be queried | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Response
```json
{
  "customer_id": "siddhesh_desai",
  "afa_reference": "740324562",
  "instrument_id": "54deabb4-ba45-4a60-9e6a-9c016fe7ab10",
  "instrument_type": "card",
  "instrument_uid": "0d8f70838cc5af8b1cd2bc0fe71278551fd3f1101e40020d89ad22ceba4f933c",
  "instrument_display": "xxxxxxxxxxxx4375",
  "instrument_status": "ACTIVE",
  "created_at": "2021-11-11 16:57:57",
  "instrument_meta": {
    "card_network": "VISA",
    "card_bank_name": "HDFC Bank Limited",
    "card_country": "IN",
    "card_type": "DEBIT_CARD",
    "card_token_details": {
      "par": "somepar",
      "expiry_month": "12",
      "expiry_year": "23"
    }
  }
}
```

## PGCustomerFetchInstruments

> PGCustomerFetchInstruments(x_api_version: string, customer_id: string, instrument_type: PGCustomerFetchInstrumentsInstrumentTypeEnum, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<InstrumentEntity[], any>>

Fetch All Saved Card Instrument ([Docs](https://docs.cashfree.com/reference/pgcustomerfetchinstruments))

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
        String customerId = "siddhesh_desai"; // String | Your Customer ID that you had sent during create order API `POST/orders`
        String instrumentType = "card"; // String | Payment mode or type of saved instrument 
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            List<InstrumentEntity> result = cashfree.PGCustomerFetchInstruments(xApiVersion, customerId, instrumentType, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenVaultApi#PGCustomerFetchInstruments");
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
| **customerId** | **String**| Your Customer ID that you had sent during create order API &#x60;POST/orders&#x60; | |
| **instrumentType** | **String**| Payment mode or type of saved instrument  | [enum: card] |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Response
```json
[
  {
  "customer_id": "siddhesh_desai",
  "afa_reference": "740324562",
  "instrument_id": "54deabb4-ba45-4a60-9e6a-9c016fe7ab10",
  "instrument_type": "card",
  "instrument_uid": "0d8f70838cc5af8b1cd2bc0fe71278551fd3f1101e40020d89ad22ceba4f933c",
  "instrument_display": "xxxxxxxxxxxx4375",
  "instrument_status": "ACTIVE",
  "created_at": "2021-11-11 16:57:57",
  "instrument_meta": {
    "card_network": "VISA",
    "card_bank_name": "HDFC Bank Limited",
    "card_country": "IN",
    "card_type": "DEBIT_CARD",
    "card_token_details": {
      "par": "somepar",
      "expiry_month": "12",
      "expiry_year": "23"
    }
  }
}
]
```


## PGCustomerInstrumentsFetchCryptogram

> PGCustomerInstrumentsFetchCryptogram(x_api_version: string, customer_id: string, instrument_id: string, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<CryptogramEntity, any>>

Fetch cryptogram for a saved card instrument ([Docs](https://docs.cashfree.com/reference/pgcustomerinstrumentsfetchcryptogram))



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
        String customerId = "your-customer-id"; // String | Your Customer ID that you had sent during create order API `POST/orders`
        String instrumentId = "54deabb4-ba45-4a60-9e6a-9c016fe7ab10"; // String | The instrument_id of the saved card instrument which needs to be queried
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            CryptogramEntity result = cashfree.PGCustomerInstrumentsFetchCryptogram(xApiVersion, customerId, instrumentId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenVaultApi#PGCustomerInstrumentsFetchCryptogram");
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
| **customerId** | **String**| Your Customer ID that you had sent during create order API &#x60;POST/orders&#x60; | |
| **instrumentId** | **String**| The instrument_id of the saved card instrument which needs to be queried | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Response

```json
{
  "instrument_id": "54deabb4-ba45-4a60-9e6a-9c016fe7ab10",
  "token_requestor_id": "22457512314",
  "card_number": "4491365621601472",
  "card_expiry_mm": "06",
  "card_expiry_yy": "2025",
  "cryptogram": "AQBBBBBBZatIlaIAmWKSghwBBBB=",
  "card_display": "1234"
}
```
