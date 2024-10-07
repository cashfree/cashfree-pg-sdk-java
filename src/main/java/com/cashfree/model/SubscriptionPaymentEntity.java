/*
 * Cashfree Payment Gateway APIs
 * Cashfree's Payment Gateway APIs provide developers with a streamlined pathway to integrate advanced payment processing capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2023-08-01
 * Contact: developers@cashfree.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cashfree.model;

import java.util.Objects;
import com.cashfree.model.AuthorizationDetails;
import com.cashfree.model.SubscriptionPaymentEntityFailureDetails;
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

import com.cashfree.JSON;

/**
 * The response returned in Get, Create or Manage Subscription Payment APIs.
 */
@Schema(description = "The response returned in Get, Create or Manage Subscription Payment APIs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-07T11:53:02.829012Z[Etc/UTC]")
public class SubscriptionPaymentEntity {
  public static final String SERIALIZED_NAME_AUTHORIZATION_DETAILS = "authorization_details";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_DETAILS)
  private AuthorizationDetails authorizationDetails;

  public static final String SERIALIZED_NAME_CF_PAYMENT_ID = "cf_payment_id";
  @SerializedName(SERIALIZED_NAME_CF_PAYMENT_ID)
  private String cfPaymentId;

  public static final String SERIALIZED_NAME_CF_SUBSCRIPTION_ID = "cf_subscription_id";
  @SerializedName(SERIALIZED_NAME_CF_SUBSCRIPTION_ID)
  private String cfSubscriptionId;

  public static final String SERIALIZED_NAME_CF_TXN_ID = "cf_txn_id";
  @SerializedName(SERIALIZED_NAME_CF_TXN_ID)
  private String cfTxnId;

  public static final String SERIALIZED_NAME_CF_ORDER_ID = "cf_order_id";
  @SerializedName(SERIALIZED_NAME_CF_ORDER_ID)
  private String cfOrderId;

  public static final String SERIALIZED_NAME_FAILURE_DETAILS = "failure_details";
  @SerializedName(SERIALIZED_NAME_FAILURE_DETAILS)
  private SubscriptionPaymentEntityFailureDetails failureDetails;

  public static final String SERIALIZED_NAME_PAYMENT_AMOUNT = "payment_amount";
  @SerializedName(SERIALIZED_NAME_PAYMENT_AMOUNT)
  private BigDecimal paymentAmount;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_PAYMENT_INITIATED_DATE = "payment_initiated_date";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INITIATED_DATE)
  private String paymentInitiatedDate;

  public static final String SERIALIZED_NAME_PAYMENT_REMARKS = "payment_remarks";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REMARKS)
  private String paymentRemarks;

  public static final String SERIALIZED_NAME_PAYMENT_SCHEDULE_DATE = "payment_schedule_date";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SCHEDULE_DATE)
  private String paymentScheduleDate;

  public static final String SERIALIZED_NAME_PAYMENT_STATUS = "payment_status";
  @SerializedName(SERIALIZED_NAME_PAYMENT_STATUS)
  private String paymentStatus;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "payment_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private String paymentType;

  public static final String SERIALIZED_NAME_RETRY_ATTEMPTS = "retry_attempts";
  @SerializedName(SERIALIZED_NAME_RETRY_ATTEMPTS)
  private Integer retryAttempts;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public SubscriptionPaymentEntity() {
  }

  public SubscriptionPaymentEntity authorizationDetails(AuthorizationDetails authorizationDetails) {
    
    this.authorizationDetails = authorizationDetails;
    return this;
  }

   /**
   * Get authorizationDetails
   * @return authorizationDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public AuthorizationDetails getAuthorizationDetails() {
    return authorizationDetails;
  }


  public void setAuthorizationDetails(AuthorizationDetails authorizationDetails) {
    this.authorizationDetails = authorizationDetails;
  }


  public SubscriptionPaymentEntity cfPaymentId(String cfPaymentId) {
    
    this.cfPaymentId = cfPaymentId;
    return this;
  }

   /**
   * Cashfree subscription payment reference number
   * @return cfPaymentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Cashfree subscription payment reference number")
  public String getCfPaymentId() {
    return cfPaymentId;
  }


  public void setCfPaymentId(String cfPaymentId) {
    this.cfPaymentId = cfPaymentId;
  }


  public SubscriptionPaymentEntity cfSubscriptionId(String cfSubscriptionId) {
    
    this.cfSubscriptionId = cfSubscriptionId;
    return this;
  }

   /**
   * Cashfree subscription reference number
   * @return cfSubscriptionId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Cashfree subscription reference number")
  public String getCfSubscriptionId() {
    return cfSubscriptionId;
  }


  public void setCfSubscriptionId(String cfSubscriptionId) {
    this.cfSubscriptionId = cfSubscriptionId;
  }


  public SubscriptionPaymentEntity cfTxnId(String cfTxnId) {
    
    this.cfTxnId = cfTxnId;
    return this;
  }

   /**
   * Cashfree subscription payment transaction ID
   * @return cfTxnId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Cashfree subscription payment transaction ID")
  public String getCfTxnId() {
    return cfTxnId;
  }


  public void setCfTxnId(String cfTxnId) {
    this.cfTxnId = cfTxnId;
  }


  public SubscriptionPaymentEntity cfOrderId(String cfOrderId) {
    
    this.cfOrderId = cfOrderId;
    return this;
  }

   /**
   * Cashfree subscription payment order ID
   * @return cfOrderId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Cashfree subscription payment order ID")
  public String getCfOrderId() {
    return cfOrderId;
  }


  public void setCfOrderId(String cfOrderId) {
    this.cfOrderId = cfOrderId;
  }


  public SubscriptionPaymentEntity failureDetails(SubscriptionPaymentEntityFailureDetails failureDetails) {
    
    this.failureDetails = failureDetails;
    return this;
  }

   /**
   * Get failureDetails
   * @return failureDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public SubscriptionPaymentEntityFailureDetails getFailureDetails() {
    return failureDetails;
  }


  public void setFailureDetails(SubscriptionPaymentEntityFailureDetails failureDetails) {
    this.failureDetails = failureDetails;
  }


  public SubscriptionPaymentEntity paymentAmount(BigDecimal paymentAmount) {
    
    this.paymentAmount = paymentAmount;
    return this;
  }

   /**
   * The charge amount of the payment.
   * @return paymentAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The charge amount of the payment.")
  public BigDecimal getPaymentAmount() {
    return paymentAmount;
  }


  public void setPaymentAmount(BigDecimal paymentAmount) {
    this.paymentAmount = paymentAmount;
  }


  public SubscriptionPaymentEntity paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * A unique ID passed by merchant for identifying the transaction.
   * @return paymentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "A unique ID passed by merchant for identifying the transaction.")
  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public SubscriptionPaymentEntity paymentInitiatedDate(String paymentInitiatedDate) {
    
    this.paymentInitiatedDate = paymentInitiatedDate;
    return this;
  }

   /**
   * The date on which the payment was initiated.
   * @return paymentInitiatedDate
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The date on which the payment was initiated.")
  public String getPaymentInitiatedDate() {
    return paymentInitiatedDate;
  }


  public void setPaymentInitiatedDate(String paymentInitiatedDate) {
    this.paymentInitiatedDate = paymentInitiatedDate;
  }


  public SubscriptionPaymentEntity paymentRemarks(String paymentRemarks) {
    
    this.paymentRemarks = paymentRemarks;
    return this;
  }

   /**
   * Payment remarks.
   * @return paymentRemarks
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Payment remarks.")
  public String getPaymentRemarks() {
    return paymentRemarks;
  }


  public void setPaymentRemarks(String paymentRemarks) {
    this.paymentRemarks = paymentRemarks;
  }


  public SubscriptionPaymentEntity paymentScheduleDate(String paymentScheduleDate) {
    
    this.paymentScheduleDate = paymentScheduleDate;
    return this;
  }

   /**
   * The date on which the payment is scheduled to be processed.
   * @return paymentScheduleDate
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The date on which the payment is scheduled to be processed.")
  public String getPaymentScheduleDate() {
    return paymentScheduleDate;
  }


  public void setPaymentScheduleDate(String paymentScheduleDate) {
    this.paymentScheduleDate = paymentScheduleDate;
  }


  public SubscriptionPaymentEntity paymentStatus(String paymentStatus) {
    
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Status of the payment.
   * @return paymentStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Status of the payment.")
  public String getPaymentStatus() {
    return paymentStatus;
  }


  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public SubscriptionPaymentEntity paymentType(String paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Payment type. Can be AUTH or CHARGE.
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Payment type. Can be AUTH or CHARGE.")
  public String getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }


  public SubscriptionPaymentEntity retryAttempts(Integer retryAttempts) {
    
    this.retryAttempts = retryAttempts;
    return this;
  }

   /**
   * Retry attempts.
   * @return retryAttempts
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Retry attempts.")
  public Integer getRetryAttempts() {
    return retryAttempts;
  }


  public void setRetryAttempts(Integer retryAttempts) {
    this.retryAttempts = retryAttempts;
  }


  public SubscriptionPaymentEntity subscriptionId(String subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * A unique ID passed by merchant for identifying the subscription.
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "A unique ID passed by merchant for identifying the subscription.")
  public String getSubscriptionId() {
    return subscriptionId;
  }


  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPaymentEntity subscriptionPaymentEntity = (SubscriptionPaymentEntity) o;
    return Objects.equals(this.authorizationDetails, subscriptionPaymentEntity.authorizationDetails) &&
        Objects.equals(this.cfPaymentId, subscriptionPaymentEntity.cfPaymentId) &&
        Objects.equals(this.cfSubscriptionId, subscriptionPaymentEntity.cfSubscriptionId) &&
        Objects.equals(this.cfTxnId, subscriptionPaymentEntity.cfTxnId) &&
        Objects.equals(this.cfOrderId, subscriptionPaymentEntity.cfOrderId) &&
        Objects.equals(this.failureDetails, subscriptionPaymentEntity.failureDetails) &&
        Objects.equals(this.paymentAmount, subscriptionPaymentEntity.paymentAmount) &&
        Objects.equals(this.paymentId, subscriptionPaymentEntity.paymentId) &&
        Objects.equals(this.paymentInitiatedDate, subscriptionPaymentEntity.paymentInitiatedDate) &&
        Objects.equals(this.paymentRemarks, subscriptionPaymentEntity.paymentRemarks) &&
        Objects.equals(this.paymentScheduleDate, subscriptionPaymentEntity.paymentScheduleDate) &&
        Objects.equals(this.paymentStatus, subscriptionPaymentEntity.paymentStatus) &&
        Objects.equals(this.paymentType, subscriptionPaymentEntity.paymentType) &&
        Objects.equals(this.retryAttempts, subscriptionPaymentEntity.retryAttempts) &&
        Objects.equals(this.subscriptionId, subscriptionPaymentEntity.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationDetails, cfPaymentId, cfSubscriptionId, cfTxnId, cfOrderId, failureDetails, paymentAmount, paymentId, paymentInitiatedDate, paymentRemarks, paymentScheduleDate, paymentStatus, paymentType, retryAttempts, subscriptionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPaymentEntity {\n");
    sb.append("    authorizationDetails: ").append(toIndentedString(authorizationDetails)).append("\n");
    sb.append("    cfPaymentId: ").append(toIndentedString(cfPaymentId)).append("\n");
    sb.append("    cfSubscriptionId: ").append(toIndentedString(cfSubscriptionId)).append("\n");
    sb.append("    cfTxnId: ").append(toIndentedString(cfTxnId)).append("\n");
    sb.append("    cfOrderId: ").append(toIndentedString(cfOrderId)).append("\n");
    sb.append("    failureDetails: ").append(toIndentedString(failureDetails)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    paymentInitiatedDate: ").append(toIndentedString(paymentInitiatedDate)).append("\n");
    sb.append("    paymentRemarks: ").append(toIndentedString(paymentRemarks)).append("\n");
    sb.append("    paymentScheduleDate: ").append(toIndentedString(paymentScheduleDate)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    retryAttempts: ").append(toIndentedString(retryAttempts)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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
    openapiFields.add("authorization_details");
    openapiFields.add("cf_payment_id");
    openapiFields.add("cf_subscription_id");
    openapiFields.add("cf_txn_id");
    openapiFields.add("cf_order_id");
    openapiFields.add("failure_details");
    openapiFields.add("payment_amount");
    openapiFields.add("payment_id");
    openapiFields.add("payment_initiated_date");
    openapiFields.add("payment_remarks");
    openapiFields.add("payment_schedule_date");
    openapiFields.add("payment_status");
    openapiFields.add("payment_type");
    openapiFields.add("retry_attempts");
    openapiFields.add("subscription_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionPaymentEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `authorization_details`
      if (jsonObj.get("authorization_details") != null && !jsonObj.get("authorization_details").isJsonNull()) {
        AuthorizationDetails.validateJsonElement(jsonObj.get("authorization_details"));
      }
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("cf_subscription_id") != null && !jsonObj.get("cf_subscription_id").isJsonNull()) && !jsonObj.get("cf_subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_subscription_id").toString()));
      }
      if ((jsonObj.get("cf_txn_id") != null && !jsonObj.get("cf_txn_id").isJsonNull()) && !jsonObj.get("cf_txn_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_txn_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_txn_id").toString()));
      }
      if ((jsonObj.get("cf_order_id") != null && !jsonObj.get("cf_order_id").isJsonNull()) && !jsonObj.get("cf_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_order_id").toString()));
      }
      // validate the optional field `failure_details`
      if (jsonObj.get("failure_details") != null && !jsonObj.get("failure_details").isJsonNull()) {
        SubscriptionPaymentEntityFailureDetails.validateJsonElement(jsonObj.get("failure_details"));
      }
      if ((jsonObj.get("payment_id") != null && !jsonObj.get("payment_id").isJsonNull()) && !jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if ((jsonObj.get("payment_initiated_date") != null && !jsonObj.get("payment_initiated_date").isJsonNull()) && !jsonObj.get("payment_initiated_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_initiated_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_initiated_date").toString()));
      }
      if ((jsonObj.get("payment_remarks") != null && !jsonObj.get("payment_remarks").isJsonNull()) && !jsonObj.get("payment_remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_remarks").toString()));
      }
      if ((jsonObj.get("payment_schedule_date") != null && !jsonObj.get("payment_schedule_date").isJsonNull()) && !jsonObj.get("payment_schedule_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_schedule_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_schedule_date").toString()));
      }
      if ((jsonObj.get("payment_status") != null && !jsonObj.get("payment_status").isJsonNull()) && !jsonObj.get("payment_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_status").toString()));
      }
      if ((jsonObj.get("payment_type") != null && !jsonObj.get("payment_type").isJsonNull()) && !jsonObj.get("payment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_type").toString()));
      }
      if ((jsonObj.get("subscription_id") != null && !jsonObj.get("subscription_id").isJsonNull()) && !jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionPaymentEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `authorization_details`
      if (jsonObj.get("authorization_details") != null && !jsonObj.get("authorization_details").isJsonNull()) {
        AuthorizationDetails.validateJsonElement(jsonObj.get("authorization_details"));
        return true;
      }
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("cf_subscription_id") != null && !jsonObj.get("cf_subscription_id").isJsonNull()) && !jsonObj.get("cf_subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_subscription_id").toString()));
      }
      if ((jsonObj.get("cf_txn_id") != null && !jsonObj.get("cf_txn_id").isJsonNull()) && !jsonObj.get("cf_txn_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_txn_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_txn_id").toString()));
      }
      if ((jsonObj.get("cf_order_id") != null && !jsonObj.get("cf_order_id").isJsonNull()) && !jsonObj.get("cf_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_order_id").toString()));
      }
      // validate the optional field `failure_details`
      if (jsonObj.get("failure_details") != null && !jsonObj.get("failure_details").isJsonNull()) {
        SubscriptionPaymentEntityFailureDetails.validateJsonElement(jsonObj.get("failure_details"));
        return true;
      }
      if ((jsonObj.get("payment_id") != null && !jsonObj.get("payment_id").isJsonNull()) && !jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if ((jsonObj.get("payment_initiated_date") != null && !jsonObj.get("payment_initiated_date").isJsonNull()) && !jsonObj.get("payment_initiated_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_initiated_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_initiated_date").toString()));
      }
      if ((jsonObj.get("payment_remarks") != null && !jsonObj.get("payment_remarks").isJsonNull()) && !jsonObj.get("payment_remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_remarks").toString()));
      }
      if ((jsonObj.get("payment_schedule_date") != null && !jsonObj.get("payment_schedule_date").isJsonNull()) && !jsonObj.get("payment_schedule_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_schedule_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_schedule_date").toString()));
      }
      if ((jsonObj.get("payment_status") != null && !jsonObj.get("payment_status").isJsonNull()) && !jsonObj.get("payment_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_status").toString()));
      }
      if ((jsonObj.get("payment_type") != null && !jsonObj.get("payment_type").isJsonNull()) && !jsonObj.get("payment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_type").toString()));
      }
      if ((jsonObj.get("subscription_id") != null && !jsonObj.get("subscription_id").isJsonNull()) && !jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionPaymentEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionPaymentEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionPaymentEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionPaymentEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionPaymentEntity>() {
           @Override
           public void write(JsonWriter out, SubscriptionPaymentEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionPaymentEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionPaymentEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionPaymentEntity
  * @throws IOException if the JSON string is invalid with respect to SubscriptionPaymentEntity
  */
  public static SubscriptionPaymentEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionPaymentEntity.class);
  }

 /**
  * Convert an instance of SubscriptionPaymentEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

