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
 * Get/Create Subscription Payment Refund Response
 */
@Schema(description = "Get/Create Subscription Payment Refund Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-17T14:57:47.426649Z[Etc/UTC]")
public class SubscriptionPaymentRefundEntity {
  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_CF_PAYMENT_ID = "cf_payment_id";
  @SerializedName(SERIALIZED_NAME_CF_PAYMENT_ID)
  private String cfPaymentId;

  public static final String SERIALIZED_NAME_REFUND_ID = "refund_id";
  @SerializedName(SERIALIZED_NAME_REFUND_ID)
  private String refundId;

  public static final String SERIALIZED_NAME_CF_REFUND_ID = "cf_refund_id";
  @SerializedName(SERIALIZED_NAME_CF_REFUND_ID)
  private String cfRefundId;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private BigDecimal refundAmount;

  public static final String SERIALIZED_NAME_REFUND_NOTE = "refund_note";
  @SerializedName(SERIALIZED_NAME_REFUND_NOTE)
  private String refundNote;

  public static final String SERIALIZED_NAME_REFUND_SPEED = "refund_speed";
  @SerializedName(SERIALIZED_NAME_REFUND_SPEED)
  private String refundSpeed;

  public static final String SERIALIZED_NAME_REFUND_STATUS = "refund_status";
  @SerializedName(SERIALIZED_NAME_REFUND_STATUS)
  private String refundStatus;

  public SubscriptionPaymentRefundEntity() {
  }

  public SubscriptionPaymentRefundEntity paymentId(String paymentId) {
    
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


  public SubscriptionPaymentRefundEntity cfPaymentId(String cfPaymentId) {
    
    this.cfPaymentId = cfPaymentId;
    return this;
  }

   /**
   * Cashfree subscription payment reference number.
   * @return cfPaymentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Cashfree subscription payment reference number.")
  public String getCfPaymentId() {
    return cfPaymentId;
  }


  public void setCfPaymentId(String cfPaymentId) {
    this.cfPaymentId = cfPaymentId;
  }


  public SubscriptionPaymentRefundEntity refundId(String refundId) {
    
    this.refundId = refundId;
    return this;
  }

   /**
   * A unique ID passed by merchant for identifying the refund.
   * @return refundId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "A unique ID passed by merchant for identifying the refund.")
  public String getRefundId() {
    return refundId;
  }


  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }


  public SubscriptionPaymentRefundEntity cfRefundId(String cfRefundId) {
    
    this.cfRefundId = cfRefundId;
    return this;
  }

   /**
   * Cashfree subscription payment refund reference number.
   * @return cfRefundId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Cashfree subscription payment refund reference number.")
  public String getCfRefundId() {
    return cfRefundId;
  }


  public void setCfRefundId(String cfRefundId) {
    this.cfRefundId = cfRefundId;
  }


  public SubscriptionPaymentRefundEntity refundAmount(BigDecimal refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * The refund amount.
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The refund amount.")
  public BigDecimal getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(BigDecimal refundAmount) {
    this.refundAmount = refundAmount;
  }


  public SubscriptionPaymentRefundEntity refundNote(String refundNote) {
    
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


  public SubscriptionPaymentRefundEntity refundSpeed(String refundSpeed) {
    
    this.refundSpeed = refundSpeed;
    return this;
  }

   /**
   * Refund speed. Can be INSTANT or NORMAL.
   * @return refundSpeed
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Refund speed. Can be INSTANT or NORMAL.")
  public String getRefundSpeed() {
    return refundSpeed;
  }


  public void setRefundSpeed(String refundSpeed) {
    this.refundSpeed = refundSpeed;
  }


  public SubscriptionPaymentRefundEntity refundStatus(String refundStatus) {
    
    this.refundStatus = refundStatus;
    return this;
  }

   /**
   * Status of the refund.
   * @return refundStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Status of the refund.")
  public String getRefundStatus() {
    return refundStatus;
  }


  public void setRefundStatus(String refundStatus) {
    this.refundStatus = refundStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPaymentRefundEntity subscriptionPaymentRefundEntity = (SubscriptionPaymentRefundEntity) o;
    return Objects.equals(this.paymentId, subscriptionPaymentRefundEntity.paymentId) &&
        Objects.equals(this.cfPaymentId, subscriptionPaymentRefundEntity.cfPaymentId) &&
        Objects.equals(this.refundId, subscriptionPaymentRefundEntity.refundId) &&
        Objects.equals(this.cfRefundId, subscriptionPaymentRefundEntity.cfRefundId) &&
        Objects.equals(this.refundAmount, subscriptionPaymentRefundEntity.refundAmount) &&
        Objects.equals(this.refundNote, subscriptionPaymentRefundEntity.refundNote) &&
        Objects.equals(this.refundSpeed, subscriptionPaymentRefundEntity.refundSpeed) &&
        Objects.equals(this.refundStatus, subscriptionPaymentRefundEntity.refundStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, cfPaymentId, refundId, cfRefundId, refundAmount, refundNote, refundSpeed, refundStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPaymentRefundEntity {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    cfPaymentId: ").append(toIndentedString(cfPaymentId)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    cfRefundId: ").append(toIndentedString(cfRefundId)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    refundNote: ").append(toIndentedString(refundNote)).append("\n");
    sb.append("    refundSpeed: ").append(toIndentedString(refundSpeed)).append("\n");
    sb.append("    refundStatus: ").append(toIndentedString(refundStatus)).append("\n");
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
    openapiFields.add("payment_id");
    openapiFields.add("cf_payment_id");
    openapiFields.add("refund_id");
    openapiFields.add("cf_refund_id");
    openapiFields.add("refund_amount");
    openapiFields.add("refund_note");
    openapiFields.add("refund_speed");
    openapiFields.add("refund_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionPaymentRefundEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("payment_id") != null && !jsonObj.get("payment_id").isJsonNull()) && !jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("refund_id") != null && !jsonObj.get("refund_id").isJsonNull()) && !jsonObj.get("refund_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_id").toString()));
      }
      if ((jsonObj.get("cf_refund_id") != null && !jsonObj.get("cf_refund_id").isJsonNull()) && !jsonObj.get("cf_refund_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_refund_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_refund_id").toString()));
      }
      if ((jsonObj.get("refund_note") != null && !jsonObj.get("refund_note").isJsonNull()) && !jsonObj.get("refund_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_note").toString()));
      }
      if ((jsonObj.get("refund_speed") != null && !jsonObj.get("refund_speed").isJsonNull()) && !jsonObj.get("refund_speed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_speed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_speed").toString()));
      }
      if ((jsonObj.get("refund_status") != null && !jsonObj.get("refund_status").isJsonNull()) && !jsonObj.get("refund_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_status").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionPaymentRefundEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("payment_id") != null && !jsonObj.get("payment_id").isJsonNull()) && !jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("refund_id") != null && !jsonObj.get("refund_id").isJsonNull()) && !jsonObj.get("refund_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_id").toString()));
      }
      if ((jsonObj.get("cf_refund_id") != null && !jsonObj.get("cf_refund_id").isJsonNull()) && !jsonObj.get("cf_refund_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_refund_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_refund_id").toString()));
      }
      if ((jsonObj.get("refund_note") != null && !jsonObj.get("refund_note").isJsonNull()) && !jsonObj.get("refund_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_note").toString()));
      }
      if ((jsonObj.get("refund_speed") != null && !jsonObj.get("refund_speed").isJsonNull()) && !jsonObj.get("refund_speed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_speed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_speed").toString()));
      }
      if ((jsonObj.get("refund_status") != null && !jsonObj.get("refund_status").isJsonNull()) && !jsonObj.get("refund_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_status").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionPaymentRefundEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionPaymentRefundEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionPaymentRefundEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionPaymentRefundEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionPaymentRefundEntity>() {
           @Override
           public void write(JsonWriter out, SubscriptionPaymentRefundEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionPaymentRefundEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionPaymentRefundEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionPaymentRefundEntity
  * @throws IOException if the JSON string is invalid with respect to SubscriptionPaymentRefundEntity
  */
  public static SubscriptionPaymentRefundEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionPaymentRefundEntity.class);
  }

 /**
  * Convert an instance of SubscriptionPaymentRefundEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

