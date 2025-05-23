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
 * Request to terminate an active order at Cashfree
 */
@Schema(description = "Request to terminate an active order at Cashfree")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class TerminateOrderRequest {
  public static final String SERIALIZED_NAME_ORDER_STATUS = "order_status";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private String orderStatus;

  public TerminateOrderRequest() {
  }

  public TerminateOrderRequest orderStatus(String orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * To terminate an order, pass order_status as \&quot;TERMINATED\&quot;. Please note, order might not be terminated - confirm with the order_status in response. \&quot;TERMINATION_REQUESTED\&quot; states that the request is recieved and we are working on it. If the order terminates successfully, status will change to \&quot;TERMINATED\&quot;. Incase there&#39;s any active transaction which moved to success - order might not get terminated.
   * @return orderStatus
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "To terminate an order, pass order_status as \"TERMINATED\". Please note, order might not be terminated - confirm with the order_status in response. \"TERMINATION_REQUESTED\" states that the request is recieved and we are working on it. If the order terminates successfully, status will change to \"TERMINATED\". Incase there's any active transaction which moved to success - order might not get terminated.")
  public String getOrderStatus() {
    return orderStatus;
  }


  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminateOrderRequest terminateOrderRequest = (TerminateOrderRequest) o;
    return Objects.equals(this.orderStatus, terminateOrderRequest.orderStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminateOrderRequest {\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
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
    openapiFields.add("order_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("order_status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TerminateOrderRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TerminateOrderRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("order_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_status").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TerminateOrderRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TerminateOrderRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("order_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_status").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerminateOrderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerminateOrderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerminateOrderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerminateOrderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TerminateOrderRequest>() {
           @Override
           public void write(JsonWriter out, TerminateOrderRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerminateOrderRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TerminateOrderRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TerminateOrderRequest
  * @throws IOException if the JSON string is invalid with respect to TerminateOrderRequest
  */
  public static TerminateOrderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerminateOrderRequest.class);
  }

 /**
  * Convert an instance of TerminateOrderRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

