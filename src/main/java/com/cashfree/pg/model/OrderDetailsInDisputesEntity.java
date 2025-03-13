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
 * OrderDetailsInDisputesEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T09:38:52.601894Z[Etc/UTC]")
public class OrderDetailsInDisputesEntity {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ORDER_CURRENCY = "order_currency";
  @SerializedName(SERIALIZED_NAME_ORDER_CURRENCY)
  private String orderCurrency;

  public static final String SERIALIZED_NAME_ORDER_AMOUNT = "order_amount";
  @SerializedName(SERIALIZED_NAME_ORDER_AMOUNT)
  private BigDecimal orderAmount;

  public static final String SERIALIZED_NAME_CF_PAYMENT_ID = "cf_payment_id";
  @SerializedName(SERIALIZED_NAME_CF_PAYMENT_ID)
  private String cfPaymentId;

  public static final String SERIALIZED_NAME_PAYMENT_CURRENCY = "payment_currency";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CURRENCY)
  private String paymentCurrency;

  public static final String SERIALIZED_NAME_PAYMENT_AMOUNT = "payment_amount";
  @SerializedName(SERIALIZED_NAME_PAYMENT_AMOUNT)
  private BigDecimal paymentAmount;

  public OrderDetailsInDisputesEntity() {
  }

  public OrderDetailsInDisputesEntity orderId(String orderId) {
    
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


  public OrderDetailsInDisputesEntity orderCurrency(String orderCurrency) {
    
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


  public OrderDetailsInDisputesEntity orderAmount(BigDecimal orderAmount) {
    
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * Get orderAmount
   * @return orderAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getOrderAmount() {
    return orderAmount;
  }


  public void setOrderAmount(BigDecimal orderAmount) {
    this.orderAmount = orderAmount;
  }


  public OrderDetailsInDisputesEntity cfPaymentId(String cfPaymentId) {
    
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


  public OrderDetailsInDisputesEntity paymentCurrency(String paymentCurrency) {
    
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


  public OrderDetailsInDisputesEntity paymentAmount(BigDecimal paymentAmount) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailsInDisputesEntity orderDetailsInDisputesEntity = (OrderDetailsInDisputesEntity) o;
    return Objects.equals(this.orderId, orderDetailsInDisputesEntity.orderId) &&
        Objects.equals(this.orderCurrency, orderDetailsInDisputesEntity.orderCurrency) &&
        Objects.equals(this.orderAmount, orderDetailsInDisputesEntity.orderAmount) &&
        Objects.equals(this.cfPaymentId, orderDetailsInDisputesEntity.cfPaymentId) &&
        Objects.equals(this.paymentCurrency, orderDetailsInDisputesEntity.paymentCurrency) &&
        Objects.equals(this.paymentAmount, orderDetailsInDisputesEntity.paymentAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, orderCurrency, orderAmount, cfPaymentId, paymentCurrency, paymentAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailsInDisputesEntity {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderCurrency: ").append(toIndentedString(orderCurrency)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    cfPaymentId: ").append(toIndentedString(cfPaymentId)).append("\n");
    sb.append("    paymentCurrency: ").append(toIndentedString(paymentCurrency)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
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
    openapiFields.add("order_id");
    openapiFields.add("order_currency");
    openapiFields.add("order_amount");
    openapiFields.add("cf_payment_id");
    openapiFields.add("payment_currency");
    openapiFields.add("payment_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailsInDisputesEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("order_currency") != null && !jsonObj.get("order_currency").isJsonNull()) && !jsonObj.get("order_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_currency").toString()));
      }
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("payment_currency") != null && !jsonObj.get("payment_currency").isJsonNull()) && !jsonObj.get("payment_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_currency").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailsInDisputesEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("order_currency") != null && !jsonObj.get("order_currency").isJsonNull()) && !jsonObj.get("order_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_currency").toString()));
      }
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("payment_currency") != null && !jsonObj.get("payment_currency").isJsonNull()) && !jsonObj.get("payment_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_currency").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailsInDisputesEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailsInDisputesEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailsInDisputesEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailsInDisputesEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailsInDisputesEntity>() {
           @Override
           public void write(JsonWriter out, OrderDetailsInDisputesEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailsInDisputesEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailsInDisputesEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailsInDisputesEntity
  * @throws IOException if the JSON string is invalid with respect to OrderDetailsInDisputesEntity
  */
  public static OrderDetailsInDisputesEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailsInDisputesEntity.class);
  }

 /**
  * Convert an instance of OrderDetailsInDisputesEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

