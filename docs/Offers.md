# Offers

Method | HTTP request | Description
------------- | ------------- | -------------
[**PGCreateOffer**](Offers.md#PGCreateOffer) | **Post** /offers | Create Offer
[**PGFetchOffer**](Offers.md#PGFetchOffer) | **Get** /offers/{offer_id} | Get Offer by ID



## PGCreateOffer

> PGCreateOffer(x_api_version: string, CreateOfferRequest: CreateOfferRequest, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<OfferEntity, any>>

Create Offer ([Docs](https://docs.cashfree.com/reference/pgcreateoffer))


### Example

```java
// Import classes:

import com.cashfree.*;
import com.cashfree.model.Card;
import com.cashfree.model.CashbackDetails;
import com.cashfree.model.DiscountDetails;
import com.cashfree.model.OfferDetails;
import com.cashfree.model.OfferMeta;
import com.cashfree.model.OfferTnc;
import com.cashfree.model.OfferValidations;
import com.cashfree.model.OfferValidationsPaymentMethod;
import com.cashfree.model.OrderMeta;
import com.cashfree.models.*;
import com.cashfree.model.CreateOfferRequest;

public class Example {

  public static void main(String[] args) {

    Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
    Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
    Cashfree.XEnvironment = Cashfree.SANDBOX;

    Cashfree cashfree = new Cashfree();

    String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
    CreateOfferRequest createOfferRequest = new CreateOfferRequest();
    OfferMeta offerMeta = new OfferMeta();
    offerMeta.setOfferTitle("Test Offer");
    offerMeta.setOfferCode("CFTESTOFFER");
    offerMeta.setOfferDescription("Offer Description");
    offerMeta.setOfferStartTime("2023-03-21T08:09:51");
    offerMeta.setOfferEndTime("2024-03-21T08:09:51");
    OfferTnc offerTnc = new OfferTnc();
    offerTnc.setOfferTncType("text");
    offerTnc.getOfferTncValue("Terms and Condition of the Offer");
    OfferDetails offerDetails = new OfferDetails();
    CashbackDetails cashbackDetails = new CashbackDetails();
    cashbackDetails.setCashbackType("percentage");
    cashbackDetails.setCashbackValue(10);
    cashbackDetails.setMaxCashbackAmount(10);
    DiscountDetails discountDetails = new DiscountDetails();
    discountDetails.setDiscountType("flat");
    discountDetails.setDiscountValue(10);
    discountDetails.setMaxDiscountAmount(10);
    offerDetails.setCashbackDetails(cashbackDetails);
    offerDetails.setDiscountDetails(discountDetails);
    offerDetails.setOfferType("DISCOUNT_AND_CASHBACK");
    OfferValidations offerValidations = new OfferValidations();
    OfferValidationsPaymentMethod paymentMethod = new OfferValidationsPaymentMethod();
    Card card = new Card();
    card.setCardCvv("cc");
    card.setCardBankName("hdfc bank");
    paymentMethod.setActualInstance(card);
    offerValidations.setPaymentMethod(paymentMethod);
    offerValidations.setMaxAllowed(100);
    offerValidations.setMinAmount(15);
    createOfferRequest.setOfferDetails(offerDetails);
    createOfferRequest.setOfferMeta(offerMeta);
    createOfferRequest.setOfferTnc(offerTnc);
    createOfferRequest.setOfferValidations(offerValidations);// CreateOfferRequest | Request body to create an offer at Cashfree
    String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
    UUID xIdempotencyKey = UUID.fromString(
        "47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
    try {
      OfferEntity result = cashfree.PGCreateOffer(xApiVersion, createOfferRequest, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#PGCreateOffer");
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
| **createOfferRequest** | [**CreateOfferRequest**](CreateOfferRequest.md)| Request body to create an offer at Cashfree | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

## CreateOfferRequest

create offer backend request object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**offerMeta** | [**OfferMeta**](OfferMeta.md) |  |  |
|**offerTnc** | [**OfferTnc**](OfferTnc.md) |  |  |
|**offerDetails** | [**OfferDetails**](OfferDetails.md) |  |  |
|**offerValidations** | [**OfferValidations**](OfferValidations.md) |  |  |



## OfferMeta

Offer meta details object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**offerTitle** | **String** | Title for the Offer. |  |
|**offerDescription** | **String** | Description for the Offer. |  |
|**offerCode** | **String** | Unique identifier for the Offer. |  |
|**offerStartTime** | **String** | Start Time for the Offer |  |
|**offerEndTime** | **String** | Expiry Time for the Offer |  |



## OfferTnc

Offer terms and condition object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**offerTncType** | [**OfferTncTypeEnum**](#OfferTncTypeEnum) | TnC Type for the Offer. It can be either &#x60;text&#x60; or &#x60;link&#x60; |  |
|**offerTncValue** | **String** | TnC for the Offer. |  |



## Enum: OfferTncTypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| LINK | &quot;link&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




## OfferDetails

Offer details and type

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**offerType** | [**OfferTypeEnum**](#OfferTypeEnum) | Offer Type for the Offer. |  |
|**discountDetails** | [**DiscountDetails**](DiscountDetails.md) |  |  [optional] |
|**cashbackDetails** | [**CashbackDetails**](CashbackDetails.md) |  |  [optional] |



## Enum: OfferTypeEnum

| Name | Value |
|---- | -----|
| DISCOUNT | &quot;DISCOUNT&quot; |
| CASHBACK | &quot;CASHBACK&quot; |
| DISCOUNT_AND_CASHBACK | &quot;DISCOUNT_AND_CASHBACK&quot; |
| NO_COST_EMI | &quot;NO_COST_EMI&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




## OfferValidations

Offer validation object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**minAmount** | **BigDecimal** | Minimum Amount for Offer to be Applicable |  [optional] |
|**maxAllowed** | **BigDecimal** | Maximum Amount for Offer to be Applicable |  |
|**paymentMethod** | [**OfferValidationsPaymentMethod**](OfferValidationsPaymentMethod.md) |  |  |



## OfferValidationsPaymentMethod


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**all** | **Object** | All offers applicable |  |
|**card** | [**CardOffer**](CardOffer.md) |  |  |
|**netbanking** | [**OfferNBNetbanking**](OfferNBNetbanking.md) |  |  |
|**app** | [**WalletOffer**](WalletOffer.md) |  |  |
|**upi** | **Object** |  |  |
|**paylater** | [**PaylaterOffer**](PaylaterOffer.md) |  |  |
|**emi** | [**EMIOffer**](EMIOffer.md) |  |  |

### Response
```json
{
  "offer_id": "d2b430fb-1afe-455a-af31-66d00377b29a",
  "offer_status": "active",
  "offer_meta": {
    "offer_title": "some title",
    "offer_description": "some offer description",
    "offer_code": "CFTESTOFFER",
    "offer_start_time": "2023-03-21T08:09:51Z",
    "offer_end_time": "2023-03-29T08:09:51Z"
  },
  "offer_tnc": {
    "offer_tnc_type": "text",
    "offer_tnc_value": "TnC for the Offer."
  },
  "offer_details": {
    "offer_type": "DISCOUNT_AND_CASHBACK",
    "discount_details": {
      "discount_type": "flat",
      "discount_value": "10",
      "max_discount_amount": "10"
    },
    "cashback_details": {
      "cashback_type": "percentage",
      "cashback_value": "20",
      "max_cashback_amount": "150"
    }
  },
  "offer_validations": {
    "min_amount": 10,
    "payment_method": {
      "wallet": {
        "issuer": "paytm"
      }
    },
    "max_allowed": 2
  }
}
```


## PGFetchOffer

> PGFetchOffer(x_api_version: string, offer_id: string, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<OfferEntity, any>>

Get Offer by ID ([Docs](https://docs.cashfree.com/reference/pgfetchoffer))



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
        String offerId = "d2b430fb-1afe-455a-af31-66d00377b29a"; // String | The offer ID for which you want to view the offer details.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            OfferEntity result = cashfree.PGFetchOffer(xApiVersion, offerId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OffersApi#PGFetchOffer");
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
| **offerId** | **String**| The offer ID for which you want to view the offer details. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |



### Response
```json
{
  "offer_id": "d2b430fb-1afe-455a-af31-66d00377b29a",
  "offer_status": "active",
  "offer_meta": {
    "offer_title": "some title",
    "offer_description": "some offer description",
    "offer_code": "CFTESTOFFER",
    "offer_start_time": "2023-03-21T08:09:51Z",
    "offer_end_time": "2023-03-29T08:09:51Z"
  },
  "offer_tnc": {
    "offer_tnc_type": "text",
    "offer_tnc_value": "TnC for the Offer."
  },
  "offer_details": {
    "offer_type": "DISCOUNT_AND_CASHBACK",
    "discount_details": {
      "discount_type": "flat",
      "discount_value": "10",
      "max_discount_amount": "10"
    },
    "cashback_details": {
      "cashback_type": "percentage",
      "cashback_value": "20",
      "max_cashback_amount": "150"
    }
  },
  "offer_validations": {
    "min_amount": 10,
    "payment_method": {
      "wallet": {
        "issuer": "paytm"
      }
    },
    "max_allowed": 2
  }
}
```