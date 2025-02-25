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
import com.cashfree.model.OrderDeliveryStatus;
import com.cashfree.model.ShipmentDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Request Body to Update extended data related to order
 */
@Schema(description = "Request Body to Update extended data related to order")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-25T11:57:22.771207Z[Etc/UTC]")
public class UpdateOrderExtendedRequest {
  public static final String SERIALIZED_NAME_SHIPMENT_DETAILS = "shipment_details";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DETAILS)
  private List<ShipmentDetails> shipmentDetails = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORDER_DELIVERY_STATUS = "order_delivery_status";
  @SerializedName(SERIALIZED_NAME_ORDER_DELIVERY_STATUS)
  private OrderDeliveryStatus orderDeliveryStatus;

  public UpdateOrderExtendedRequest() {
  }

  public UpdateOrderExtendedRequest shipmentDetails(List<ShipmentDetails> shipmentDetails) {
    
    this.shipmentDetails = shipmentDetails;
    return this;
  }

  public UpdateOrderExtendedRequest addShipmentDetailsItem(ShipmentDetails shipmentDetailsItem) {
    if (this.shipmentDetails == null) {
      this.shipmentDetails = new ArrayList<>();
    }
    this.shipmentDetails.add(shipmentDetailsItem);
    return this;
  }

   /**
   * Shipment details, such as the tracking company, tracking number, and tracking URLs, associated with the shipping of an order. Either &#x60;shipment_details&#x60; or &#x60;order_delivery_status&#x60; is required.
   * @return shipmentDetails
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Shipment details, such as the tracking company, tracking number, and tracking URLs, associated with the shipping of an order. Either `shipment_details` or `order_delivery_status` is required.")
  public List<ShipmentDetails> getShipmentDetails() {
    return shipmentDetails;
  }


  public void setShipmentDetails(List<ShipmentDetails> shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
  }


  public UpdateOrderExtendedRequest orderDeliveryStatus(OrderDeliveryStatus orderDeliveryStatus) {
    
    this.orderDeliveryStatus = orderDeliveryStatus;
    return this;
  }

   /**
   * Get orderDeliveryStatus
   * @return orderDeliveryStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public OrderDeliveryStatus getOrderDeliveryStatus() {
    return orderDeliveryStatus;
  }


  public void setOrderDeliveryStatus(OrderDeliveryStatus orderDeliveryStatus) {
    this.orderDeliveryStatus = orderDeliveryStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrderExtendedRequest updateOrderExtendedRequest = (UpdateOrderExtendedRequest) o;
    return Objects.equals(this.shipmentDetails, updateOrderExtendedRequest.shipmentDetails) &&
        Objects.equals(this.orderDeliveryStatus, updateOrderExtendedRequest.orderDeliveryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentDetails, orderDeliveryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderExtendedRequest {\n");
    sb.append("    shipmentDetails: ").append(toIndentedString(shipmentDetails)).append("\n");
    sb.append("    orderDeliveryStatus: ").append(toIndentedString(orderDeliveryStatus)).append("\n");
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
    openapiFields.add("shipment_details");
    openapiFields.add("order_delivery_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("shipment_details");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateOrderExtendedRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateOrderExtendedRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("shipment_details").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipment_details` to be an array in the JSON string but got `%s`", jsonObj.get("shipment_details").toString()));
      }

      JsonArray jsonArrayshipmentDetails = jsonObj.getAsJsonArray("shipment_details");
      // validate the required field `shipment_details` (array)
      for (int i = 0; i < jsonArrayshipmentDetails.size(); i++) {
        ShipmentDetails.validateJsonElement(jsonArrayshipmentDetails.get(i));
      };
      // validate the optional field `order_delivery_status`
      if (jsonObj.get("order_delivery_status") != null && !jsonObj.get("order_delivery_status").isJsonNull()) {
        OrderDeliveryStatus.validateJsonElement(jsonObj.get("order_delivery_status"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateOrderExtendedRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateOrderExtendedRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("shipment_details").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipment_details` to be an array in the JSON string but got `%s`", jsonObj.get("shipment_details").toString()));
      }

      JsonArray jsonArrayshipmentDetails = jsonObj.getAsJsonArray("shipment_details");
      // validate the required field `shipment_details` (array)
      for (int i = 0; i < jsonArrayshipmentDetails.size(); i++) {
        ShipmentDetails.validateJsonElement(jsonArrayshipmentDetails.get(i));
      };
      // validate the optional field `order_delivery_status`
      if (jsonObj.get("order_delivery_status") != null && !jsonObj.get("order_delivery_status").isJsonNull()) {
        OrderDeliveryStatus.validateJsonElement(jsonObj.get("order_delivery_status"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateOrderExtendedRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateOrderExtendedRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateOrderExtendedRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateOrderExtendedRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateOrderExtendedRequest>() {
           @Override
           public void write(JsonWriter out, UpdateOrderExtendedRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateOrderExtendedRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateOrderExtendedRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateOrderExtendedRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateOrderExtendedRequest
  */
  public static UpdateOrderExtendedRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateOrderExtendedRequest.class);
  }

 /**
  * Convert an instance of UpdateOrderExtendedRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

