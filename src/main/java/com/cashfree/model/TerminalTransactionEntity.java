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
 * Create terminal response object
 */
@Schema(description = "Create terminal response object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-09T12:52:07.742309Z[Etc/UTC]")
public class TerminalTransactionEntity {
  public static final String SERIALIZED_NAME_CF_PAYMENT_ID = "cf_payment_id";
  @SerializedName(SERIALIZED_NAME_CF_PAYMENT_ID)
  private String cfPaymentId;

  public static final String SERIALIZED_NAME_PAYMENT_AMOUNT = "payment_amount";
  @SerializedName(SERIALIZED_NAME_PAYMENT_AMOUNT)
  private Integer paymentAmount;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_PAYMENT_URL = "payment_url";
  @SerializedName(SERIALIZED_NAME_PAYMENT_URL)
  private String paymentUrl;

  public static final String SERIALIZED_NAME_QRCODE = "qrcode";
  @SerializedName(SERIALIZED_NAME_QRCODE)
  private String qrcode;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private String timeout;

  public TerminalTransactionEntity() {
  }

  public TerminalTransactionEntity cfPaymentId(String cfPaymentId) {
    
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


  public TerminalTransactionEntity paymentAmount(Integer paymentAmount) {
    
    this.paymentAmount = paymentAmount;
    return this;
  }

   /**
   * Get paymentAmount
   * @return paymentAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Integer getPaymentAmount() {
    return paymentAmount;
  }


  public void setPaymentAmount(Integer paymentAmount) {
    this.paymentAmount = paymentAmount;
  }


  public TerminalTransactionEntity paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public TerminalTransactionEntity paymentUrl(String paymentUrl) {
    
    this.paymentUrl = paymentUrl;
    return this;
  }

   /**
   * Get paymentUrl
   * @return paymentUrl
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getPaymentUrl() {
    return paymentUrl;
  }


  public void setPaymentUrl(String paymentUrl) {
    this.paymentUrl = paymentUrl;
  }


  public TerminalTransactionEntity qrcode(String qrcode) {
    
    this.qrcode = qrcode;
    return this;
  }

   /**
   * Get qrcode
   * @return qrcode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getQrcode() {
    return qrcode;
  }


  public void setQrcode(String qrcode) {
    this.qrcode = qrcode;
  }


  public TerminalTransactionEntity timeout(String timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTimeout() {
    return timeout;
  }


  public void setTimeout(String timeout) {
    this.timeout = timeout;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalTransactionEntity terminalTransactionEntity = (TerminalTransactionEntity) o;
    return Objects.equals(this.cfPaymentId, terminalTransactionEntity.cfPaymentId) &&
        Objects.equals(this.paymentAmount, terminalTransactionEntity.paymentAmount) &&
        Objects.equals(this.paymentMethod, terminalTransactionEntity.paymentMethod) &&
        Objects.equals(this.paymentUrl, terminalTransactionEntity.paymentUrl) &&
        Objects.equals(this.qrcode, terminalTransactionEntity.qrcode) &&
        Objects.equals(this.timeout, terminalTransactionEntity.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfPaymentId, paymentAmount, paymentMethod, paymentUrl, qrcode, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalTransactionEntity {\n");
    sb.append("    cfPaymentId: ").append(toIndentedString(cfPaymentId)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentUrl: ").append(toIndentedString(paymentUrl)).append("\n");
    sb.append("    qrcode: ").append(toIndentedString(qrcode)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
    openapiFields.add("payment_amount");
    openapiFields.add("payment_method");
    openapiFields.add("payment_url");
    openapiFields.add("qrcode");
    openapiFields.add("timeout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TerminalTransactionEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
      if ((jsonObj.get("payment_url") != null && !jsonObj.get("payment_url").isJsonNull()) && !jsonObj.get("payment_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_url").toString()));
      }
      if ((jsonObj.get("qrcode") != null && !jsonObj.get("qrcode").isJsonNull()) && !jsonObj.get("qrcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qrcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qrcode").toString()));
      }
      if ((jsonObj.get("timeout") != null && !jsonObj.get("timeout").isJsonNull()) && !jsonObj.get("timeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeout").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TerminalTransactionEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
      if ((jsonObj.get("payment_url") != null && !jsonObj.get("payment_url").isJsonNull()) && !jsonObj.get("payment_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_url").toString()));
      }
      if ((jsonObj.get("qrcode") != null && !jsonObj.get("qrcode").isJsonNull()) && !jsonObj.get("qrcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qrcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qrcode").toString()));
      }
      if ((jsonObj.get("timeout") != null && !jsonObj.get("timeout").isJsonNull()) && !jsonObj.get("timeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeout").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerminalTransactionEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerminalTransactionEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerminalTransactionEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerminalTransactionEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<TerminalTransactionEntity>() {
           @Override
           public void write(JsonWriter out, TerminalTransactionEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerminalTransactionEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TerminalTransactionEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TerminalTransactionEntity
  * @throws IOException if the JSON string is invalid with respect to TerminalTransactionEntity
  */
  public static TerminalTransactionEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerminalTransactionEntity.class);
  }

 /**
  * Convert an instance of TerminalTransactionEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

