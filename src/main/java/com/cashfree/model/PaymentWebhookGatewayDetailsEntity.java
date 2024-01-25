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
 * payment gatewat details present in the webhook response
 */
@Schema(description = "payment gatewat details present in the webhook response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-25T10:57:28.709198Z[Etc/UTC]")
public class PaymentWebhookGatewayDetailsEntity {
  public static final String SERIALIZED_NAME_GATEWAY_NAME = "gateway_name";
  @SerializedName(SERIALIZED_NAME_GATEWAY_NAME)
  private String gatewayName;

  public static final String SERIALIZED_NAME_GATEWAY_ORDER_ID = "gateway_order_id";
  @SerializedName(SERIALIZED_NAME_GATEWAY_ORDER_ID)
  private String gatewayOrderId;

  public static final String SERIALIZED_NAME_GATEWAY_PAYMENT_ID = "gateway_payment_id";
  @SerializedName(SERIALIZED_NAME_GATEWAY_PAYMENT_ID)
  private String gatewayPaymentId;

  public static final String SERIALIZED_NAME_GATEWAY_STATUS_CODE = "gateway_status_code";
  @SerializedName(SERIALIZED_NAME_GATEWAY_STATUS_CODE)
  private String gatewayStatusCode;

  public static final String SERIALIZED_NAME_GATEWAY_SETTLEMENT = "gateway_settlement";
  @SerializedName(SERIALIZED_NAME_GATEWAY_SETTLEMENT)
  private String gatewaySettlement;

  public PaymentWebhookGatewayDetailsEntity() {
  }

  public PaymentWebhookGatewayDetailsEntity gatewayName(String gatewayName) {
    
    this.gatewayName = gatewayName;
    return this;
  }

   /**
   * Get gatewayName
   * @return gatewayName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getGatewayName() {
    return gatewayName;
  }


  public void setGatewayName(String gatewayName) {
    this.gatewayName = gatewayName;
  }


  public PaymentWebhookGatewayDetailsEntity gatewayOrderId(String gatewayOrderId) {
    
    this.gatewayOrderId = gatewayOrderId;
    return this;
  }

   /**
   * Get gatewayOrderId
   * @return gatewayOrderId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getGatewayOrderId() {
    return gatewayOrderId;
  }


  public void setGatewayOrderId(String gatewayOrderId) {
    this.gatewayOrderId = gatewayOrderId;
  }


  public PaymentWebhookGatewayDetailsEntity gatewayPaymentId(String gatewayPaymentId) {
    
    this.gatewayPaymentId = gatewayPaymentId;
    return this;
  }

   /**
   * Get gatewayPaymentId
   * @return gatewayPaymentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getGatewayPaymentId() {
    return gatewayPaymentId;
  }


  public void setGatewayPaymentId(String gatewayPaymentId) {
    this.gatewayPaymentId = gatewayPaymentId;
  }


  public PaymentWebhookGatewayDetailsEntity gatewayStatusCode(String gatewayStatusCode) {
    
    this.gatewayStatusCode = gatewayStatusCode;
    return this;
  }

   /**
   * Get gatewayStatusCode
   * @return gatewayStatusCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getGatewayStatusCode() {
    return gatewayStatusCode;
  }


  public void setGatewayStatusCode(String gatewayStatusCode) {
    this.gatewayStatusCode = gatewayStatusCode;
  }


  public PaymentWebhookGatewayDetailsEntity gatewaySettlement(String gatewaySettlement) {
    
    this.gatewaySettlement = gatewaySettlement;
    return this;
  }

   /**
   * Get gatewaySettlement
   * @return gatewaySettlement
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getGatewaySettlement() {
    return gatewaySettlement;
  }


  public void setGatewaySettlement(String gatewaySettlement) {
    this.gatewaySettlement = gatewaySettlement;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentWebhookGatewayDetailsEntity paymentWebhookGatewayDetailsEntity = (PaymentWebhookGatewayDetailsEntity) o;
    return Objects.equals(this.gatewayName, paymentWebhookGatewayDetailsEntity.gatewayName) &&
        Objects.equals(this.gatewayOrderId, paymentWebhookGatewayDetailsEntity.gatewayOrderId) &&
        Objects.equals(this.gatewayPaymentId, paymentWebhookGatewayDetailsEntity.gatewayPaymentId) &&
        Objects.equals(this.gatewayStatusCode, paymentWebhookGatewayDetailsEntity.gatewayStatusCode) &&
        Objects.equals(this.gatewaySettlement, paymentWebhookGatewayDetailsEntity.gatewaySettlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayName, gatewayOrderId, gatewayPaymentId, gatewayStatusCode, gatewaySettlement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentWebhookGatewayDetailsEntity {\n");
    sb.append("    gatewayName: ").append(toIndentedString(gatewayName)).append("\n");
    sb.append("    gatewayOrderId: ").append(toIndentedString(gatewayOrderId)).append("\n");
    sb.append("    gatewayPaymentId: ").append(toIndentedString(gatewayPaymentId)).append("\n");
    sb.append("    gatewayStatusCode: ").append(toIndentedString(gatewayStatusCode)).append("\n");
    sb.append("    gatewaySettlement: ").append(toIndentedString(gatewaySettlement)).append("\n");
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
    openapiFields.add("gateway_name");
    openapiFields.add("gateway_order_id");
    openapiFields.add("gateway_payment_id");
    openapiFields.add("gateway_status_code");
    openapiFields.add("gateway_settlement");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentWebhookGatewayDetailsEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("gateway_name") != null && !jsonObj.get("gateway_name").isJsonNull()) && !jsonObj.get("gateway_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_name").toString()));
      }
      if ((jsonObj.get("gateway_order_id") != null && !jsonObj.get("gateway_order_id").isJsonNull()) && !jsonObj.get("gateway_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_order_id").toString()));
      }
      if ((jsonObj.get("gateway_payment_id") != null && !jsonObj.get("gateway_payment_id").isJsonNull()) && !jsonObj.get("gateway_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_payment_id").toString()));
      }
      if ((jsonObj.get("gateway_status_code") != null && !jsonObj.get("gateway_status_code").isJsonNull()) && !jsonObj.get("gateway_status_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_status_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_status_code").toString()));
      }
      if ((jsonObj.get("gateway_settlement") != null && !jsonObj.get("gateway_settlement").isJsonNull()) && !jsonObj.get("gateway_settlement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_settlement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_settlement").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentWebhookGatewayDetailsEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("gateway_name") != null && !jsonObj.get("gateway_name").isJsonNull()) && !jsonObj.get("gateway_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_name").toString()));
      }
      if ((jsonObj.get("gateway_order_id") != null && !jsonObj.get("gateway_order_id").isJsonNull()) && !jsonObj.get("gateway_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_order_id").toString()));
      }
      if ((jsonObj.get("gateway_payment_id") != null && !jsonObj.get("gateway_payment_id").isJsonNull()) && !jsonObj.get("gateway_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_payment_id").toString()));
      }
      if ((jsonObj.get("gateway_status_code") != null && !jsonObj.get("gateway_status_code").isJsonNull()) && !jsonObj.get("gateway_status_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_status_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_status_code").toString()));
      }
      if ((jsonObj.get("gateway_settlement") != null && !jsonObj.get("gateway_settlement").isJsonNull()) && !jsonObj.get("gateway_settlement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_settlement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_settlement").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentWebhookGatewayDetailsEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentWebhookGatewayDetailsEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentWebhookGatewayDetailsEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentWebhookGatewayDetailsEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentWebhookGatewayDetailsEntity>() {
           @Override
           public void write(JsonWriter out, PaymentWebhookGatewayDetailsEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentWebhookGatewayDetailsEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentWebhookGatewayDetailsEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentWebhookGatewayDetailsEntity
  * @throws IOException if the JSON string is invalid with respect to PaymentWebhookGatewayDetailsEntity
  */
  public static PaymentWebhookGatewayDetailsEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentWebhookGatewayDetailsEntity.class);
  }

 /**
  * Convert an instance of PaymentWebhookGatewayDetailsEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

