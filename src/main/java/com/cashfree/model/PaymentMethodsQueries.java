/*
 * Cashfree Payment Gateway APIs
 * Cashfree's Payment Gateway APIs provide developers with a streamlined pathway to integrate advanced payment processing capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2022-09-01
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
 * Payment Method Query Object
 */
@Schema(description = "Payment Method Query Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-09T14:02:06.288163Z[Etc/UTC]")
public class PaymentMethodsQueries {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public PaymentMethodsQueries() {
  }

  public PaymentMethodsQueries amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount of the order.
   * minimum: 1
   * @return amount
  **/
  @javax.annotation.Nullable
  @Schema(example = "100", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Amount of the order.")
  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public PaymentMethodsQueries orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * OrderId of the order. Either of &#x60;order_id&#x60; or &#x60;order_amount&#x60; is mandatory.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @Schema(example = "order_413462PK1RI1IwYB1X69LgzUQWiSxYDF", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "OrderId of the order. Either of `order_id` or `order_amount` is mandatory.")
  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodsQueries paymentMethodsQueries = (PaymentMethodsQueries) o;
    return Objects.equals(this.amount, paymentMethodsQueries.amount) &&
        Objects.equals(this.orderId, paymentMethodsQueries.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, orderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodsQueries {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("order_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodsQueries
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodsQueries.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodsQueries' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodsQueries> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodsQueries.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodsQueries>() {
           @Override
           public void write(JsonWriter out, PaymentMethodsQueries value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodsQueries read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodsQueries given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodsQueries
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodsQueries
  */
  public static PaymentMethodsQueries fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodsQueries.class);
  }

 /**
  * Convert an instance of PaymentMethodsQueries to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

