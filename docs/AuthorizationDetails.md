

# AuthorizationDetails

Details of the authorization done for the subscription. Returned in Get subscription and payments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorizationAmount** | **BigDecimal** | Authorization amount for the auth payment. Please note that authorization_amount will always be 0 for ENACH. |  [optional] |
|**authorizationAmountRefund** | **Boolean** | Indicates whether the authorization amount should be refunded to the customer automatically. Merchants can use this field to specify if the authorized funds should be returned to the customer after authorization of the subscription. |  [optional] |
|**authorizationReference** | **String** | Authorization reference. UMN for UPI, UMRN for EMandate/Physical Mandate and Enrollment ID for cards. |  [optional] |
|**authorizationTime** | **String** | Authorization time. Cashfree stores timestamps in IST. |  [optional] |
|**authorizationStatus** | **String** | Status of the authorization. |  [optional] |
|**paymentId** | **String** | A unique ID passed by merchant for identifying the transaction. |  [optional] |
|**paymentGroup** | **String** | Payment group used for the authorization. |  [optional] |
|**paymentMethod** | [**AuthorizationDetailsPaymentMethod**](AuthorizationDetailsPaymentMethod.md) |  |  [optional] |



