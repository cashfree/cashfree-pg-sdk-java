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
 * Request body to create a subscription refund.
 */
@Schema(description = "Request body to create a subscription refund.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-24T05:12:29.162122Z[Etc/UTC]")
public class CreateSubscriptionRefundRequest {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_REFUND_ID = "refund_id";
  @SerializedName(SERIALIZED_NAME_REFUND_ID)
  private String refundId;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private BigDecimal refundAmount;

  public static final String SERIALIZED_NAME_REFUND_NOTE = "refund_note";
  @SerializedName(SERIALIZED_NAME_REFUND_NOTE)
  private String refundNote;

  public static final String SERIALIZED_NAME_REFUND_SPEED = "refund_speed";
  @SerializedName(SERIALIZED_NAME_REFUND_SPEED)
  private String refundSpeed;

  public CreateSubscriptionRefundRequest() {
  }

  public CreateSubscriptionRefundRequest subscriptionId(String subscriptionId) {
    
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


  public CreateSubscriptionRefundRequest paymentId(String paymentId) {
    
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


  public CreateSubscriptionRefundRequest refundId(String refundId) {
    
    this.refundId = refundId;
    return this;
  }

   /**
   * A unique ID passed by merchant for identifying the refund.
   * @return refundId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "A unique ID passed by merchant for identifying the refund.")
  public String getRefundId() {
    return refundId;
  }


  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }


  public CreateSubscriptionRefundRequest refundAmount(BigDecimal refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * The amount to be refunded. Can be partial or full amount of the payment.
   * @return refundAmount
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "The amount to be refunded. Can be partial or full amount of the payment.")
  public BigDecimal getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(BigDecimal refundAmount) {
    this.refundAmount = refundAmount;
  }


  public CreateSubscriptionRefundRequest refundNote(String refundNote) {
    
    this.refundNote = refundNote;
    return this;
  }

   /**
   * Refund note.
   * @return refundNote
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Refund note.")
  public String getRefundNote() {
    return refundNote;
  }


  public void setRefundNote(String refundNote) {
    this.refundNote = refundNote;
  }


  public CreateSubscriptionRefundRequest refundSpeed(String refundSpeed) {
    
    this.refundSpeed = refundSpeed;
    return this;
  }

   /**
   * Refund speed. Can be INSTANT or STANDARD. UPI supports only STANDARD refunds, Enach and Pnach supports only INSTANT refunds.
   * @return refundSpeed
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Refund speed. Can be INSTANT or STANDARD. UPI supports only STANDARD refunds, Enach and Pnach supports only INSTANT refunds.")
  public String getRefundSpeed() {
    return refundSpeed;
  }


  public void setRefundSpeed(String refundSpeed) {
    this.refundSpeed = refundSpeed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubscriptionRefundRequest createSubscriptionRefundRequest = (CreateSubscriptionRefundRequest) o;
    return Objects.equals(this.subscriptionId, createSubscriptionRefundRequest.subscriptionId) &&
        Objects.equals(this.paymentId, createSubscriptionRefundRequest.paymentId) &&
        Objects.equals(this.refundId, createSubscriptionRefundRequest.refundId) &&
        Objects.equals(this.refundAmount, createSubscriptionRefundRequest.refundAmount) &&
        Objects.equals(this.refundNote, createSubscriptionRefundRequest.refundNote) &&
        Objects.equals(this.refundSpeed, createSubscriptionRefundRequest.refundSpeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, paymentId, refundId, refundAmount, refundNote, refundSpeed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionRefundRequest {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    refundNote: ").append(toIndentedString(refundNote)).append("\n");
    sb.append("    refundSpeed: ").append(toIndentedString(refundSpeed)).append("\n");
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
    openapiFields.add("payment_id");
    openapiFields.add("refund_id");
    openapiFields.add("refund_amount");
    openapiFields.add("refund_note");
    openapiFields.add("refund_speed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subscription_id");
    openapiRequiredFields.add("refund_id");
    openapiRequiredFields.add("refund_amount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionRefundRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSubscriptionRefundRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      if ((jsonObj.get("payment_id") != null && !jsonObj.get("payment_id").isJsonNull()) && !jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if (!jsonObj.get("refund_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_id").toString()));
      }
      if ((jsonObj.get("refund_note") != null && !jsonObj.get("refund_note").isJsonNull()) && !jsonObj.get("refund_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_note").toString()));
      }
      if ((jsonObj.get("refund_speed") != null && !jsonObj.get("refund_speed").isJsonNull()) && !jsonObj.get("refund_speed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_speed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_speed").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionRefundRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSubscriptionRefundRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      if ((jsonObj.get("payment_id") != null && !jsonObj.get("payment_id").isJsonNull()) && !jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if (!jsonObj.get("refund_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_id").toString()));
      }
      if ((jsonObj.get("refund_note") != null && !jsonObj.get("refund_note").isJsonNull()) && !jsonObj.get("refund_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_note").toString()));
      }
      if ((jsonObj.get("refund_speed") != null && !jsonObj.get("refund_speed").isJsonNull()) && !jsonObj.get("refund_speed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_speed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_speed").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscriptionRefundRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionRefundRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionRefundRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionRefundRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionRefundRequest>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionRefundRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionRefundRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionRefundRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionRefundRequest
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionRefundRequest
  */
  public static CreateSubscriptionRefundRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionRefundRequest.class);
  }

 /**
  * Convert an instance of CreateSubscriptionRefundRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

