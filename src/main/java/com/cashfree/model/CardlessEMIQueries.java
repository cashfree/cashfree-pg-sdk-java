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
import com.cashfree.model.CustomerDetailsCardlessEMI;
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
 * cardless EMI query object
 */
@Schema(description = "cardless EMI query object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-25T10:57:28.709198Z[Etc/UTC]")
public class CardlessEMIQueries {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CUSTOMER_DETAILS = "customer_details";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DETAILS)
  private CustomerDetailsCardlessEMI customerDetails;

  public CardlessEMIQueries() {
  }

  public CardlessEMIQueries orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * OrderId of the order. Either of &#x60;order_id&#x60; or &#x60;amount&#x60; is mandatory.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @Schema(example = "orderYB1X69LgzUQWiSxYDF", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "OrderId of the order. Either of `order_id` or `amount` is mandatory.")
  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public CardlessEMIQueries amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount of the order. OrderId of the order. Either of &#x60;order_id&#x60; or &#x60;amount&#x60; is mandatory.
   * minimum: 1
   * @return amount
  **/
  @javax.annotation.Nullable
  @Schema(example = "100", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Amount of the order. OrderId of the order. Either of `order_id` or `amount` is mandatory.")
  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public CardlessEMIQueries customerDetails(CustomerDetailsCardlessEMI customerDetails) {
    
    this.customerDetails = customerDetails;
    return this;
  }

   /**
   * Get customerDetails
   * @return customerDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CustomerDetailsCardlessEMI getCustomerDetails() {
    return customerDetails;
  }


  public void setCustomerDetails(CustomerDetailsCardlessEMI customerDetails) {
    this.customerDetails = customerDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardlessEMIQueries cardlessEMIQueries = (CardlessEMIQueries) o;
    return Objects.equals(this.orderId, cardlessEMIQueries.orderId) &&
        Objects.equals(this.amount, cardlessEMIQueries.amount) &&
        Objects.equals(this.customerDetails, cardlessEMIQueries.customerDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, amount, customerDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardlessEMIQueries {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("customer_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CardlessEMIQueries
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      // validate the optional field `customer_details`
      if (jsonObj.get("customer_details") != null && !jsonObj.get("customer_details").isJsonNull()) {
        CustomerDetailsCardlessEMI.validateJsonElement(jsonObj.get("customer_details"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CardlessEMIQueries
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      // validate the optional field `customer_details`
      if (jsonObj.get("customer_details") != null && !jsonObj.get("customer_details").isJsonNull()) {
        CustomerDetailsCardlessEMI.validateJsonElement(jsonObj.get("customer_details"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardlessEMIQueries.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardlessEMIQueries' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardlessEMIQueries> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardlessEMIQueries.class));

       return (TypeAdapter<T>) new TypeAdapter<CardlessEMIQueries>() {
           @Override
           public void write(JsonWriter out, CardlessEMIQueries value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardlessEMIQueries read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardlessEMIQueries given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardlessEMIQueries
  * @throws IOException if the JSON string is invalid with respect to CardlessEMIQueries
  */
  public static CardlessEMIQueries fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardlessEMIQueries.class);
  }

 /**
  * Convert an instance of CardlessEMIQueries to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

