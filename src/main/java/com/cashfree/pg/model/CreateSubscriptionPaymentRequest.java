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
import com.cashfree.pg.model.CreateSubscriptionPaymentRequestPaymentMethod;
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
 * The request to be passed for the create subscription payment API.
 */
@Schema(description = "The request to be passed for the create subscription payment API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-01T11:00:02.685522Z[Etc/UTC]")
public class CreateSubscriptionPaymentRequest {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_SESSION_ID = "subscription_session_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_SESSION_ID)
  private String subscriptionSessionId;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_PAYMENT_AMOUNT = "payment_amount";
  @SerializedName(SERIALIZED_NAME_PAYMENT_AMOUNT)
  private BigDecimal paymentAmount;

  public static final String SERIALIZED_NAME_PAYMENT_SCHEDULE_DATE = "payment_schedule_date";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SCHEDULE_DATE)
  private String paymentScheduleDate;

  public static final String SERIALIZED_NAME_PAYMENT_REMARKS = "payment_remarks";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REMARKS)
  private String paymentRemarks;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "payment_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private String paymentType;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private CreateSubscriptionPaymentRequestPaymentMethod paymentMethod;

  public CreateSubscriptionPaymentRequest() {
  }

  public CreateSubscriptionPaymentRequest subscriptionId(String subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * A unique ID passed by merchant for identifying the subscription.
   * @return subscriptionId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "A unique ID passed by merchant for identifying the subscription.")
  public String getSubscriptionId() {
    return subscriptionId;
  }


  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public CreateSubscriptionPaymentRequest subscriptionSessionId(String subscriptionSessionId) {
    
    this.subscriptionSessionId = subscriptionSessionId;
    return this;
  }

   /**
   * Session ID for the subscription. Required only for Auth.
   * @return subscriptionSessionId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Session ID for the subscription. Required only for Auth.")
  public String getSubscriptionSessionId() {
    return subscriptionSessionId;
  }


  public void setSubscriptionSessionId(String subscriptionSessionId) {
    this.subscriptionSessionId = subscriptionSessionId;
  }


  public CreateSubscriptionPaymentRequest paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * A unique ID passed by merchant for identifying the subscription payment.
   * @return paymentId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "A unique ID passed by merchant for identifying the subscription payment.")
  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public CreateSubscriptionPaymentRequest paymentAmount(BigDecimal paymentAmount) {
    
    this.paymentAmount = paymentAmount;
    return this;
  }

   /**
   * The charge amount of the payment. Required in case of charge.
   * @return paymentAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The charge amount of the payment. Required in case of charge.")
  public BigDecimal getPaymentAmount() {
    return paymentAmount;
  }


  public void setPaymentAmount(BigDecimal paymentAmount) {
    this.paymentAmount = paymentAmount;
  }


  public CreateSubscriptionPaymentRequest paymentScheduleDate(String paymentScheduleDate) {
    
    this.paymentScheduleDate = paymentScheduleDate;
    return this;
  }

   /**
   * The date on which the payment is scheduled to be processed. Required for UPI and CARD payment modes.
   * @return paymentScheduleDate
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The date on which the payment is scheduled to be processed. Required for UPI and CARD payment modes.")
  public String getPaymentScheduleDate() {
    return paymentScheduleDate;
  }


  public void setPaymentScheduleDate(String paymentScheduleDate) {
    this.paymentScheduleDate = paymentScheduleDate;
  }


  public CreateSubscriptionPaymentRequest paymentRemarks(String paymentRemarks) {
    
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


  public CreateSubscriptionPaymentRequest paymentType(String paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Payment type. Can be AUTH or CHARGE.
   * @return paymentType
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Payment type. Can be AUTH or CHARGE.")
  public String getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }


  public CreateSubscriptionPaymentRequest paymentMethod(CreateSubscriptionPaymentRequestPaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CreateSubscriptionPaymentRequestPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(CreateSubscriptionPaymentRequestPaymentMethod paymentMethod) {
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
    CreateSubscriptionPaymentRequest createSubscriptionPaymentRequest = (CreateSubscriptionPaymentRequest) o;
    return Objects.equals(this.subscriptionId, createSubscriptionPaymentRequest.subscriptionId) &&
        Objects.equals(this.subscriptionSessionId, createSubscriptionPaymentRequest.subscriptionSessionId) &&
        Objects.equals(this.paymentId, createSubscriptionPaymentRequest.paymentId) &&
        Objects.equals(this.paymentAmount, createSubscriptionPaymentRequest.paymentAmount) &&
        Objects.equals(this.paymentScheduleDate, createSubscriptionPaymentRequest.paymentScheduleDate) &&
        Objects.equals(this.paymentRemarks, createSubscriptionPaymentRequest.paymentRemarks) &&
        Objects.equals(this.paymentType, createSubscriptionPaymentRequest.paymentType) &&
        Objects.equals(this.paymentMethod, createSubscriptionPaymentRequest.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, subscriptionSessionId, paymentId, paymentAmount, paymentScheduleDate, paymentRemarks, paymentType, paymentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionPaymentRequest {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionSessionId: ").append(toIndentedString(subscriptionSessionId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentScheduleDate: ").append(toIndentedString(paymentScheduleDate)).append("\n");
    sb.append("    paymentRemarks: ").append(toIndentedString(paymentRemarks)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
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
    openapiFields.add("subscription_id");
    openapiFields.add("subscription_session_id");
    openapiFields.add("payment_id");
    openapiFields.add("payment_amount");
    openapiFields.add("payment_schedule_date");
    openapiFields.add("payment_remarks");
    openapiFields.add("payment_type");
    openapiFields.add("payment_method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subscription_id");
    openapiRequiredFields.add("payment_id");
    openapiRequiredFields.add("payment_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionPaymentRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSubscriptionPaymentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      if ((jsonObj.get("subscription_session_id") != null && !jsonObj.get("subscription_session_id").isJsonNull()) && !jsonObj.get("subscription_session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_session_id").toString()));
      }
      if (!jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if ((jsonObj.get("payment_schedule_date") != null && !jsonObj.get("payment_schedule_date").isJsonNull()) && !jsonObj.get("payment_schedule_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_schedule_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_schedule_date").toString()));
      }
      if ((jsonObj.get("payment_remarks") != null && !jsonObj.get("payment_remarks").isJsonNull()) && !jsonObj.get("payment_remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_remarks").toString()));
      }
      if (!jsonObj.get("payment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_type").toString()));
      }
      // validate the optional field `payment_method`
      if (jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) {
        CreateSubscriptionPaymentRequestPaymentMethod.validateJsonElement(jsonObj.get("payment_method"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionPaymentRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSubscriptionPaymentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      if ((jsonObj.get("subscription_session_id") != null && !jsonObj.get("subscription_session_id").isJsonNull()) && !jsonObj.get("subscription_session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_session_id").toString()));
      }
      if (!jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if ((jsonObj.get("payment_schedule_date") != null && !jsonObj.get("payment_schedule_date").isJsonNull()) && !jsonObj.get("payment_schedule_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_schedule_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_schedule_date").toString()));
      }
      if ((jsonObj.get("payment_remarks") != null && !jsonObj.get("payment_remarks").isJsonNull()) && !jsonObj.get("payment_remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_remarks").toString()));
      }
      if (!jsonObj.get("payment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_type").toString()));
      }
      // validate the optional field `payment_method`
      if (jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) {
        CreateSubscriptionPaymentRequestPaymentMethod.validateJsonElement(jsonObj.get("payment_method"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscriptionPaymentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionPaymentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionPaymentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionPaymentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionPaymentRequest>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionPaymentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionPaymentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionPaymentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionPaymentRequest
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionPaymentRequest
  */
  public static CreateSubscriptionPaymentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionPaymentRequest.class);
  }

 /**
  * Convert an instance of CreateSubscriptionPaymentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

