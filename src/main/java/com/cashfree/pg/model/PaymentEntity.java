/*
 * Cashfree Payment Gateway APIs
 * Cashfree's Payment Gateway APIs provide developers with a streamlined pathway to integrate advanced payment processing capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2025-01-01
 * Contact: developers@cashfree.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cashfree.pg.model;

import java.util.Objects;
import com.cashfree.pg.model.AuthorizationInPaymentsEntity;
import com.cashfree.pg.model.ErrorDetailsInPaymentsEntity;
import com.cashfree.pg.model.InternationalPaymentEntity;
import com.cashfree.pg.model.PaymentEntityPaymentMethod;
import com.cashfree.pg.model.PaymentEntityPaymentSurcharge;
import com.cashfree.pg.model.PaymentGatewayDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cashfree.pg.JSON;

/**
 * payment entity full object
 */
@Schema(description = "payment entity full object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T09:38:52.601894Z[Etc/UTC]")
public class PaymentEntity {
  public static final String SERIALIZED_NAME_CF_PAYMENT_ID = "cf_payment_id";
  @SerializedName(SERIALIZED_NAME_CF_PAYMENT_ID)
  private String cfPaymentId;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private String entity;

  public static final String SERIALIZED_NAME_ERROR_DETAILS = "error_details";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAILS)
  private ErrorDetailsInPaymentsEntity errorDetails;

  public static final String SERIALIZED_NAME_IS_CAPTURED = "is_captured";
  @SerializedName(SERIALIZED_NAME_IS_CAPTURED)
  private Boolean isCaptured;

  public static final String SERIALIZED_NAME_ORDER_AMOUNT = "order_amount";
  @SerializedName(SERIALIZED_NAME_ORDER_AMOUNT)
  private BigDecimal orderAmount;

  public static final String SERIALIZED_NAME_PAYMENT_GROUP = "payment_group";
  @SerializedName(SERIALIZED_NAME_PAYMENT_GROUP)
  private String paymentGroup;

  public static final String SERIALIZED_NAME_PAYMENT_CURRENCY = "payment_currency";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CURRENCY)
  private String paymentCurrency;

  public static final String SERIALIZED_NAME_PAYMENT_AMOUNT = "payment_amount";
  @SerializedName(SERIALIZED_NAME_PAYMENT_AMOUNT)
  private BigDecimal paymentAmount;

  public static final String SERIALIZED_NAME_PAYMENT_TIME = "payment_time";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TIME)
  private String paymentTime;

  public static final String SERIALIZED_NAME_PAYMENT_COMPLETION_TIME = "payment_completion_time";
  @SerializedName(SERIALIZED_NAME_PAYMENT_COMPLETION_TIME)
  private String paymentCompletionTime;

  /**
   * The transaction status can be one of  [\&quot;SUCCESS\&quot;, \&quot;NOT_ATTEMPTED\&quot;, \&quot;FAILED\&quot;, \&quot;USER_DROPPED\&quot;, \&quot;VOID\&quot;, \&quot;CANCELLED\&quot;, \&quot;PENDING\&quot;]
   */
  @JsonAdapter(PaymentStatusEnum.Adapter.class)
  public enum PaymentStatusEnum {
    SUCCESS("SUCCESS"),
    
    NOT_ATTEMPTED("NOT_ATTEMPTED"),
    
    FAILED("FAILED"),
    
    USER_DROPPED("USER_DROPPED"),
    
    VOID("VOID"),
    
    CANCELLED("CANCELLED"),
    
    PENDING("PENDING"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    PaymentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentStatusEnum fromValue(String value) {
      for (PaymentStatusEnum b : PaymentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<PaymentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_STATUS = "payment_status";
  @SerializedName(SERIALIZED_NAME_PAYMENT_STATUS)
  private PaymentStatusEnum paymentStatus;

  public static final String SERIALIZED_NAME_PAYMENT_MESSAGE = "payment_message";
  @SerializedName(SERIALIZED_NAME_PAYMENT_MESSAGE)
  private String paymentMessage;

  public static final String SERIALIZED_NAME_BANK_REFERENCE = "bank_reference";
  @SerializedName(SERIALIZED_NAME_BANK_REFERENCE)
  private String bankReference;

  public static final String SERIALIZED_NAME_AUTH_ID = "auth_id";
  @SerializedName(SERIALIZED_NAME_AUTH_ID)
  private String authId;

  public static final String SERIALIZED_NAME_ORDER_CURRENCY = "order_currency";
  @SerializedName(SERIALIZED_NAME_ORDER_CURRENCY)
  private String orderCurrency;

  public static final String SERIALIZED_NAME_AUTHORIZATION = "authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private AuthorizationInPaymentsEntity authorization;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentEntityPaymentMethod paymentMethod;

  public static final String SERIALIZED_NAME_INTERNATIONAL_PAYMENT = "international_payment";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL_PAYMENT)
  private InternationalPaymentEntity internationalPayment;

  public static final String SERIALIZED_NAME_PAYMENT_GATEWAY_DETAILS = "payment_gateway_details";
  @SerializedName(SERIALIZED_NAME_PAYMENT_GATEWAY_DETAILS)
  private PaymentGatewayDetails paymentGatewayDetails;

  public static final String SERIALIZED_NAME_PAYMENT_SURCHARGE = "payment_surcharge";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SURCHARGE)
  private PaymentEntityPaymentSurcharge paymentSurcharge;

  public PaymentEntity() {
  }

  public PaymentEntity cfPaymentId(String cfPaymentId) {
    
    this.cfPaymentId = cfPaymentId;
    return this;
  }

   /**
   * Get cfPaymentId
   * @return cfPaymentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCfPaymentId() {
    return cfPaymentId;
  }


  public void setCfPaymentId(String cfPaymentId) {
    this.cfPaymentId = cfPaymentId;
  }


  public PaymentEntity orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public PaymentEntity entity(String entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getEntity() {
    return entity;
  }


  public void setEntity(String entity) {
    this.entity = entity;
  }


  public PaymentEntity errorDetails(ErrorDetailsInPaymentsEntity errorDetails) {
    
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public ErrorDetailsInPaymentsEntity getErrorDetails() {
    return errorDetails;
  }


  public void setErrorDetails(ErrorDetailsInPaymentsEntity errorDetails) {
    this.errorDetails = errorDetails;
  }


  public PaymentEntity isCaptured(Boolean isCaptured) {
    
    this.isCaptured = isCaptured;
    return this;
  }

   /**
   * Get isCaptured
   * @return isCaptured
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Boolean getIsCaptured() {
    return isCaptured;
  }


  public void setIsCaptured(Boolean isCaptured) {
    this.isCaptured = isCaptured;
  }


  public PaymentEntity orderAmount(BigDecimal orderAmount) {
    
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * Order amount can be different from payment amount if you collect service fee from the customer
   * @return orderAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Order amount can be different from payment amount if you collect service fee from the customer")
  public BigDecimal getOrderAmount() {
    return orderAmount;
  }


  public void setOrderAmount(BigDecimal orderAmount) {
    this.orderAmount = orderAmount;
  }


  public PaymentEntity paymentGroup(String paymentGroup) {
    
    this.paymentGroup = paymentGroup;
    return this;
  }

   /**
   * Type of payment group. One of [&#39;prepaid_card&#39;, &#39;upi_ppi_offline&#39;, &#39;cash&#39;, &#39;upi_credit_card&#39;, &#39;paypal&#39;, &#39;net_banking&#39;, &#39;cardless_emi&#39;, &#39;credit_card&#39;, &#39;bank_transfer&#39;, &#39;pay_later&#39;, &#39;debit_card_emi&#39;, &#39;debit_card&#39;, &#39;wallet&#39;, &#39;upi_ppi&#39;, &#39;upi&#39;, &#39;credit_card_emi&#39;]
   * @return paymentGroup
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Type of payment group. One of ['prepaid_card', 'upi_ppi_offline', 'cash', 'upi_credit_card', 'paypal', 'net_banking', 'cardless_emi', 'credit_card', 'bank_transfer', 'pay_later', 'debit_card_emi', 'debit_card', 'wallet', 'upi_ppi', 'upi', 'credit_card_emi']")
  public String getPaymentGroup() {
    return paymentGroup;
  }


  public void setPaymentGroup(String paymentGroup) {
    this.paymentGroup = paymentGroup;
  }


  public PaymentEntity paymentCurrency(String paymentCurrency) {
    
    this.paymentCurrency = paymentCurrency;
    return this;
  }

   /**
   * Get paymentCurrency
   * @return paymentCurrency
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getPaymentCurrency() {
    return paymentCurrency;
  }


  public void setPaymentCurrency(String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
  }


  public PaymentEntity paymentAmount(BigDecimal paymentAmount) {
    
    this.paymentAmount = paymentAmount;
    return this;
  }

   /**
   * Get paymentAmount
   * @return paymentAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getPaymentAmount() {
    return paymentAmount;
  }


  public void setPaymentAmount(BigDecimal paymentAmount) {
    this.paymentAmount = paymentAmount;
  }


  public PaymentEntity paymentTime(String paymentTime) {
    
    this.paymentTime = paymentTime;
    return this;
  }

   /**
   * This is the time when the payment was initiated
   * @return paymentTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "This is the time when the payment was initiated")
  public String getPaymentTime() {
    return paymentTime;
  }


  public void setPaymentTime(String paymentTime) {
    this.paymentTime = paymentTime;
  }


  public PaymentEntity paymentCompletionTime(String paymentCompletionTime) {
    
    this.paymentCompletionTime = paymentCompletionTime;
    return this;
  }

   /**
   * This is the time when the payment reaches its terminal state
   * @return paymentCompletionTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "This is the time when the payment reaches its terminal state")
  public String getPaymentCompletionTime() {
    return paymentCompletionTime;
  }


  public void setPaymentCompletionTime(String paymentCompletionTime) {
    this.paymentCompletionTime = paymentCompletionTime;
  }


  public PaymentEntity paymentStatus(PaymentStatusEnum paymentStatus) {
    
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * The transaction status can be one of  [\&quot;SUCCESS\&quot;, \&quot;NOT_ATTEMPTED\&quot;, \&quot;FAILED\&quot;, \&quot;USER_DROPPED\&quot;, \&quot;VOID\&quot;, \&quot;CANCELLED\&quot;, \&quot;PENDING\&quot;]
   * @return paymentStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The transaction status can be one of  [\"SUCCESS\", \"NOT_ATTEMPTED\", \"FAILED\", \"USER_DROPPED\", \"VOID\", \"CANCELLED\", \"PENDING\"]")
  public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
  }


  public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public PaymentEntity paymentMessage(String paymentMessage) {
    
    this.paymentMessage = paymentMessage;
    return this;
  }

   /**
   * Get paymentMessage
   * @return paymentMessage
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getPaymentMessage() {
    return paymentMessage;
  }


  public void setPaymentMessage(String paymentMessage) {
    this.paymentMessage = paymentMessage;
  }


  public PaymentEntity bankReference(String bankReference) {
    
    this.bankReference = bankReference;
    return this;
  }

   /**
   * Get bankReference
   * @return bankReference
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getBankReference() {
    return bankReference;
  }


  public void setBankReference(String bankReference) {
    this.bankReference = bankReference;
  }


  public PaymentEntity authId(String authId) {
    
    this.authId = authId;
    return this;
  }

   /**
   * Get authId
   * @return authId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getAuthId() {
    return authId;
  }


  public void setAuthId(String authId) {
    this.authId = authId;
  }


  public PaymentEntity orderCurrency(String orderCurrency) {
    
    this.orderCurrency = orderCurrency;
    return this;
  }

   /**
   * Get orderCurrency
   * @return orderCurrency
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getOrderCurrency() {
    return orderCurrency;
  }


  public void setOrderCurrency(String orderCurrency) {
    this.orderCurrency = orderCurrency;
  }


  public PaymentEntity authorization(AuthorizationInPaymentsEntity authorization) {
    
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public AuthorizationInPaymentsEntity getAuthorization() {
    return authorization;
  }


  public void setAuthorization(AuthorizationInPaymentsEntity authorization) {
    this.authorization = authorization;
  }


  public PaymentEntity paymentMethod(PaymentEntityPaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentEntityPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(PaymentEntityPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PaymentEntity internationalPayment(InternationalPaymentEntity internationalPayment) {
    
    this.internationalPayment = internationalPayment;
    return this;
  }

   /**
   * Get internationalPayment
   * @return internationalPayment
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public InternationalPaymentEntity getInternationalPayment() {
    return internationalPayment;
  }


  public void setInternationalPayment(InternationalPaymentEntity internationalPayment) {
    this.internationalPayment = internationalPayment;
  }


  public PaymentEntity paymentGatewayDetails(PaymentGatewayDetails paymentGatewayDetails) {
    
    this.paymentGatewayDetails = paymentGatewayDetails;
    return this;
  }

   /**
   * Get paymentGatewayDetails
   * @return paymentGatewayDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentGatewayDetails getPaymentGatewayDetails() {
    return paymentGatewayDetails;
  }


  public void setPaymentGatewayDetails(PaymentGatewayDetails paymentGatewayDetails) {
    this.paymentGatewayDetails = paymentGatewayDetails;
  }


  public PaymentEntity paymentSurcharge(PaymentEntityPaymentSurcharge paymentSurcharge) {
    
    this.paymentSurcharge = paymentSurcharge;
    return this;
  }

   /**
   * Get paymentSurcharge
   * @return paymentSurcharge
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentEntityPaymentSurcharge getPaymentSurcharge() {
    return paymentSurcharge;
  }


  public void setPaymentSurcharge(PaymentEntityPaymentSurcharge paymentSurcharge) {
    this.paymentSurcharge = paymentSurcharge;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentEntity paymentEntity = (PaymentEntity) o;
    return Objects.equals(this.cfPaymentId, paymentEntity.cfPaymentId) &&
        Objects.equals(this.orderId, paymentEntity.orderId) &&
        Objects.equals(this.entity, paymentEntity.entity) &&
        Objects.equals(this.errorDetails, paymentEntity.errorDetails) &&
        Objects.equals(this.isCaptured, paymentEntity.isCaptured) &&
        Objects.equals(this.orderAmount, paymentEntity.orderAmount) &&
        Objects.equals(this.paymentGroup, paymentEntity.paymentGroup) &&
        Objects.equals(this.paymentCurrency, paymentEntity.paymentCurrency) &&
        Objects.equals(this.paymentAmount, paymentEntity.paymentAmount) &&
        Objects.equals(this.paymentTime, paymentEntity.paymentTime) &&
        Objects.equals(this.paymentCompletionTime, paymentEntity.paymentCompletionTime) &&
        Objects.equals(this.paymentStatus, paymentEntity.paymentStatus) &&
        Objects.equals(this.paymentMessage, paymentEntity.paymentMessage) &&
        Objects.equals(this.bankReference, paymentEntity.bankReference) &&
        Objects.equals(this.authId, paymentEntity.authId) &&
        Objects.equals(this.orderCurrency, paymentEntity.orderCurrency) &&
        Objects.equals(this.authorization, paymentEntity.authorization) &&
        Objects.equals(this.paymentMethod, paymentEntity.paymentMethod) &&
        Objects.equals(this.internationalPayment, paymentEntity.internationalPayment) &&
        Objects.equals(this.paymentGatewayDetails, paymentEntity.paymentGatewayDetails) &&
        Objects.equals(this.paymentSurcharge, paymentEntity.paymentSurcharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfPaymentId, orderId, entity, errorDetails, isCaptured, orderAmount, paymentGroup, paymentCurrency, paymentAmount, paymentTime, paymentCompletionTime, paymentStatus, paymentMessage, bankReference, authId, orderCurrency, authorization, paymentMethod, internationalPayment, paymentGatewayDetails, paymentSurcharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentEntity {\n");
    sb.append("    cfPaymentId: ").append(toIndentedString(cfPaymentId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    isCaptured: ").append(toIndentedString(isCaptured)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    paymentGroup: ").append(toIndentedString(paymentGroup)).append("\n");
    sb.append("    paymentCurrency: ").append(toIndentedString(paymentCurrency)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentTime: ").append(toIndentedString(paymentTime)).append("\n");
    sb.append("    paymentCompletionTime: ").append(toIndentedString(paymentCompletionTime)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    paymentMessage: ").append(toIndentedString(paymentMessage)).append("\n");
    sb.append("    bankReference: ").append(toIndentedString(bankReference)).append("\n");
    sb.append("    authId: ").append(toIndentedString(authId)).append("\n");
    sb.append("    orderCurrency: ").append(toIndentedString(orderCurrency)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    internationalPayment: ").append(toIndentedString(internationalPayment)).append("\n");
    sb.append("    paymentGatewayDetails: ").append(toIndentedString(paymentGatewayDetails)).append("\n");
    sb.append("    paymentSurcharge: ").append(toIndentedString(paymentSurcharge)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("cf_payment_id");
    openapiFields.add("order_id");
    openapiFields.add("entity");
    openapiFields.add("error_details");
    openapiFields.add("is_captured");
    openapiFields.add("order_amount");
    openapiFields.add("payment_group");
    openapiFields.add("payment_currency");
    openapiFields.add("payment_amount");
    openapiFields.add("payment_time");
    openapiFields.add("payment_completion_time");
    openapiFields.add("payment_status");
    openapiFields.add("payment_message");
    openapiFields.add("bank_reference");
    openapiFields.add("auth_id");
    openapiFields.add("order_currency");
    openapiFields.add("authorization");
    openapiFields.add("payment_method");
    openapiFields.add("international_payment");
    openapiFields.add("payment_gateway_details");
    openapiFields.add("payment_surcharge");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) && !jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      // validate the optional field `error_details`
      if (jsonObj.get("error_details") != null && !jsonObj.get("error_details").isJsonNull()) {
        ErrorDetailsInPaymentsEntity.validateJsonElement(jsonObj.get("error_details"));
      }
      if ((jsonObj.get("payment_group") != null && !jsonObj.get("payment_group").isJsonNull()) && !jsonObj.get("payment_group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_group").toString()));
      }
      if ((jsonObj.get("payment_currency") != null && !jsonObj.get("payment_currency").isJsonNull()) && !jsonObj.get("payment_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_currency").toString()));
      }
      if ((jsonObj.get("payment_time") != null && !jsonObj.get("payment_time").isJsonNull()) && !jsonObj.get("payment_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_time").toString()));
      }
      if ((jsonObj.get("payment_completion_time") != null && !jsonObj.get("payment_completion_time").isJsonNull()) && !jsonObj.get("payment_completion_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_completion_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_completion_time").toString()));
      }
      if ((jsonObj.get("payment_status") != null && !jsonObj.get("payment_status").isJsonNull()) && !jsonObj.get("payment_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_status").toString()));
      }
      if ((jsonObj.get("payment_message") != null && !jsonObj.get("payment_message").isJsonNull()) && !jsonObj.get("payment_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_message").toString()));
      }
      if ((jsonObj.get("bank_reference") != null && !jsonObj.get("bank_reference").isJsonNull()) && !jsonObj.get("bank_reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_reference").toString()));
      }
      if ((jsonObj.get("auth_id") != null && !jsonObj.get("auth_id").isJsonNull()) && !jsonObj.get("auth_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_id").toString()));
      }
      if ((jsonObj.get("order_currency") != null && !jsonObj.get("order_currency").isJsonNull()) && !jsonObj.get("order_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_currency").toString()));
      }
      // validate the optional field `authorization`
      if (jsonObj.get("authorization") != null && !jsonObj.get("authorization").isJsonNull()) {
        AuthorizationInPaymentsEntity.validateJsonElement(jsonObj.get("authorization"));
      }
      // validate the optional field `payment_method`
      if (jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) {
        PaymentEntityPaymentMethod.validateJsonElement(jsonObj.get("payment_method"));
      }
      // validate the optional field `international_payment`
      if (jsonObj.get("international_payment") != null && !jsonObj.get("international_payment").isJsonNull()) {
        InternationalPaymentEntity.validateJsonElement(jsonObj.get("international_payment"));
      }
      // validate the optional field `payment_gateway_details`
      if (jsonObj.get("payment_gateway_details") != null && !jsonObj.get("payment_gateway_details").isJsonNull()) {
        PaymentGatewayDetails.validateJsonElement(jsonObj.get("payment_gateway_details"));
      }
      // validate the optional field `payment_surcharge`
      if (jsonObj.get("payment_surcharge") != null && !jsonObj.get("payment_surcharge").isJsonNull()) {
        PaymentEntityPaymentSurcharge.validateJsonElement(jsonObj.get("payment_surcharge"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) && !jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      // validate the optional field `error_details`
      if (jsonObj.get("error_details") != null && !jsonObj.get("error_details").isJsonNull()) {
        ErrorDetailsInPaymentsEntity.validateJsonElement(jsonObj.get("error_details"));
        return true;
      }
      if ((jsonObj.get("payment_group") != null && !jsonObj.get("payment_group").isJsonNull()) && !jsonObj.get("payment_group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_group").toString()));
      }
      if ((jsonObj.get("payment_currency") != null && !jsonObj.get("payment_currency").isJsonNull()) && !jsonObj.get("payment_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_currency").toString()));
      }
      if ((jsonObj.get("payment_time") != null && !jsonObj.get("payment_time").isJsonNull()) && !jsonObj.get("payment_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_time").toString()));
      }
      if ((jsonObj.get("payment_completion_time") != null && !jsonObj.get("payment_completion_time").isJsonNull()) && !jsonObj.get("payment_completion_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_completion_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_completion_time").toString()));
      }
      if ((jsonObj.get("payment_status") != null && !jsonObj.get("payment_status").isJsonNull()) && !jsonObj.get("payment_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_status").toString()));
      }
      if ((jsonObj.get("payment_message") != null && !jsonObj.get("payment_message").isJsonNull()) && !jsonObj.get("payment_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_message").toString()));
      }
      if ((jsonObj.get("bank_reference") != null && !jsonObj.get("bank_reference").isJsonNull()) && !jsonObj.get("bank_reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_reference").toString()));
      }
      if ((jsonObj.get("auth_id") != null && !jsonObj.get("auth_id").isJsonNull()) && !jsonObj.get("auth_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_id").toString()));
      }
      if ((jsonObj.get("order_currency") != null && !jsonObj.get("order_currency").isJsonNull()) && !jsonObj.get("order_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_currency").toString()));
      }
      // validate the optional field `authorization`
      if (jsonObj.get("authorization") != null && !jsonObj.get("authorization").isJsonNull()) {
        AuthorizationInPaymentsEntity.validateJsonElement(jsonObj.get("authorization"));
        return true;
      }
      // validate the optional field `payment_method`
      if (jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) {
        PaymentEntityPaymentMethod.validateJsonElement(jsonObj.get("payment_method"));
        return true;
      }
      // validate the optional field `international_payment`
      if (jsonObj.get("international_payment") != null && !jsonObj.get("international_payment").isJsonNull()) {
        InternationalPaymentEntity.validateJsonElement(jsonObj.get("international_payment"));
        return true;
      }
      // validate the optional field `payment_gateway_details`
      if (jsonObj.get("payment_gateway_details") != null && !jsonObj.get("payment_gateway_details").isJsonNull()) {
        PaymentGatewayDetails.validateJsonElement(jsonObj.get("payment_gateway_details"));
        return true;
      }
      // validate the optional field `payment_surcharge`
      if (jsonObj.get("payment_surcharge") != null && !jsonObj.get("payment_surcharge").isJsonNull()) {
        PaymentEntityPaymentSurcharge.validateJsonElement(jsonObj.get("payment_surcharge"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentEntity>() {
           @Override
           public void write(JsonWriter out, PaymentEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentEntity
  * @throws IOException if the JSON string is invalid with respect to PaymentEntity
  */
  public static PaymentEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentEntity.class);
  }

 /**
  * Convert an instance of PaymentEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

