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
import com.cashfree.pg.model.SubscriptionPaymentEntityFailureDetails;
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
 * The response returned is Create Subscription Auth or Charge APIs.
 */
@Schema(description = "The response returned is Create Subscription Auth or Charge APIs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T14:00:34.323462Z[Etc/UTC]")
public class CreateSubscriptionPaymentResponse {
  public static final String SERIALIZED_NAME_CF_PAYMENT_ID = "cf_payment_id";
  @SerializedName(SERIALIZED_NAME_CF_PAYMENT_ID)
  private String cfPaymentId;

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

  public static final String SERIALIZED_NAME_PAYMENT_STATUS = "payment_status";
  @SerializedName(SERIALIZED_NAME_PAYMENT_STATUS)
  private String paymentStatus;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "payment_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private String paymentType;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public CreateSubscriptionPaymentResponse() {
  }

  public CreateSubscriptionPaymentResponse cfPaymentId(String cfPaymentId) {
    
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


  public CreateSubscriptionPaymentResponse failureDetails(SubscriptionPaymentEntityFailureDetails failureDetails) {
    
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


  public CreateSubscriptionPaymentResponse paymentAmount(BigDecimal paymentAmount) {
    
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


  public CreateSubscriptionPaymentResponse paymentId(String paymentId) {
    
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


  public CreateSubscriptionPaymentResponse paymentInitiatedDate(String paymentInitiatedDate) {
    
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


  public CreateSubscriptionPaymentResponse paymentStatus(String paymentStatus) {
    
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


  public CreateSubscriptionPaymentResponse paymentType(String paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Payment type. Can be AUTH or CHARGE.
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @Schema(example = "CHARGE", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Payment type. Can be AUTH or CHARGE.")
  public String getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }


  public CreateSubscriptionPaymentResponse subscriptionId(String subscriptionId) {
    
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


  public CreateSubscriptionPaymentResponse data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Contains a payload for auth app links in case of AUTH. For charge, the payload is empty.
   * @return data
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Contains a payload for auth app links in case of AUTH. For charge, the payload is empty.")
  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }


  public CreateSubscriptionPaymentResponse paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Payment method used for the authorization.
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Payment method used for the authorization.")
  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubscriptionPaymentResponse createSubscriptionPaymentResponse = (CreateSubscriptionPaymentResponse) o;
    return Objects.equals(this.cfPaymentId, createSubscriptionPaymentResponse.cfPaymentId) &&
        Objects.equals(this.failureDetails, createSubscriptionPaymentResponse.failureDetails) &&
        Objects.equals(this.paymentAmount, createSubscriptionPaymentResponse.paymentAmount) &&
        Objects.equals(this.paymentId, createSubscriptionPaymentResponse.paymentId) &&
        Objects.equals(this.paymentInitiatedDate, createSubscriptionPaymentResponse.paymentInitiatedDate) &&
        Objects.equals(this.paymentStatus, createSubscriptionPaymentResponse.paymentStatus) &&
        Objects.equals(this.paymentType, createSubscriptionPaymentResponse.paymentType) &&
        Objects.equals(this.subscriptionId, createSubscriptionPaymentResponse.subscriptionId) &&
        Objects.equals(this.data, createSubscriptionPaymentResponse.data) &&
        Objects.equals(this.paymentMethod, createSubscriptionPaymentResponse.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfPaymentId, failureDetails, paymentAmount, paymentId, paymentInitiatedDate, paymentStatus, paymentType, subscriptionId, data, paymentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionPaymentResponse {\n");
    sb.append("    cfPaymentId: ").append(toIndentedString(cfPaymentId)).append("\n");
    sb.append("    failureDetails: ").append(toIndentedString(failureDetails)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    paymentInitiatedDate: ").append(toIndentedString(paymentInitiatedDate)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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
    openapiFields.add("failure_details");
    openapiFields.add("payment_amount");
    openapiFields.add("payment_id");
    openapiFields.add("payment_initiated_date");
    openapiFields.add("payment_status");
    openapiFields.add("payment_type");
    openapiFields.add("subscription_id");
    openapiFields.add("data");
    openapiFields.add("payment_method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionPaymentResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
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
      if ((jsonObj.get("payment_status") != null && !jsonObj.get("payment_status").isJsonNull()) && !jsonObj.get("payment_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_status").toString()));
      }
      if ((jsonObj.get("payment_type") != null && !jsonObj.get("payment_type").isJsonNull()) && !jsonObj.get("payment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_type").toString()));
      }
      if ((jsonObj.get("subscription_id") != null && !jsonObj.get("subscription_id").isJsonNull()) && !jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      if ((jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionPaymentResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
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
      if ((jsonObj.get("payment_status") != null && !jsonObj.get("payment_status").isJsonNull()) && !jsonObj.get("payment_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_status").toString()));
      }
      if ((jsonObj.get("payment_type") != null && !jsonObj.get("payment_type").isJsonNull()) && !jsonObj.get("payment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_type").toString()));
      }
      if ((jsonObj.get("subscription_id") != null && !jsonObj.get("subscription_id").isJsonNull()) && !jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      if ((jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscriptionPaymentResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionPaymentResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionPaymentResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionPaymentResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionPaymentResponse>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionPaymentResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionPaymentResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionPaymentResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionPaymentResponse
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionPaymentResponse
  */
  public static CreateSubscriptionPaymentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionPaymentResponse.class);
  }

 /**
  * Convert an instance of CreateSubscriptionPaymentResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

