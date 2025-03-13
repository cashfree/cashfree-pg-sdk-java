

# OrderMetaPaymentMethodsFiltersMethods

Allowed payment modes for this order. credit_card, debit_card, netbanking, paylater, etc are the values that can be passed to this parameter.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | It accepts value of \&quot;ALLOW\&quot; and allows only those modes present in it&#39;s neighbouring parameter \&quot;values\&quot; |  [optional] |
|**values** | **List&lt;String&gt;** | The accepted entries for this paramter are \&quot;debit_card, credit_card, prepaid_card, upi, wallet, netbanking, banktransfer, paylater, paypal, debit_card_emi, credit_card_emi, upi_credit_card, upi_ppi, cardless_emi, account_based_payment, corporate_credit_card, sbc_debit_card, sbc_emandate, sbc_upi, sbc_credit_card\&quot; |  [optional] |



