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
 * The complete update order extended data entity
 */
@Schema(description = "The complete update order extended data entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-25T11:57:22.771207Z[Etc/UTC]")
public class UpdateOrderExtendedDataEntity {
  public static final String SERIALIZED_NAME_CF_ORDER_ID = "cf_order_id";
  @SerializedName(SERIALIZED_NAME_CF_ORDER_ID)
  private String cfOrderId;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_SHIPMENT_DETAILS = "shipment_details";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DETAILS)
  private List<ShipmentDetails> shipmentDetails;

  public static final String SERIALIZED_NAME_ORDER_DELIVERY_STATUS = "order_delivery_status";
  @SerializedName(SERIALIZED_NAME_ORDER_DELIVERY_STATUS)
  private OrderDeliveryStatus orderDeliveryStatus;

  public UpdateOrderExtendedDataEntity() {
  }

  public UpdateOrderExtendedDataEntity cfOrderId(String cfOrderId) {
    
    this.cfOrderId = cfOrderId;
    return this;
  }

   /**
   * unique id generated by cashfree for your order
   * @return cfOrderId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "unique id generated by cashfree for your order")
  public String getCfOrderId() {
    return cfOrderId;
  }


  public void setCfOrderId(String cfOrderId) {
    this.cfOrderId = cfOrderId;
  }


  public UpdateOrderExtendedDataEntity orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * order_id sent during the api request
   * @return orderId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "order_id sent during the api request")
  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public UpdateOrderExtendedDataEntity shipmentDetails(List<ShipmentDetails> shipmentDetails) {
    
    this.shipmentDetails = shipmentDetails;
    return this;
  }

  public UpdateOrderExtendedDataEntity addShipmentDetailsItem(ShipmentDetails shipmentDetailsItem) {
    if (this.shipmentDetails == null) {
      this.shipmentDetails = new ArrayList<>();
    }
    this.shipmentDetails.add(shipmentDetailsItem);
    return this;
  }

   /**
   * Get shipmentDetails
   * @return shipmentDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<ShipmentDetails> getShipmentDetails() {
    return shipmentDetails;
  }


  public void setShipmentDetails(List<ShipmentDetails> shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
  }


  public UpdateOrderExtendedDataEntity orderDeliveryStatus(OrderDeliveryStatus orderDeliveryStatus) {
    
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
    UpdateOrderExtendedDataEntity updateOrderExtendedDataEntity = (UpdateOrderExtendedDataEntity) o;
    return Objects.equals(this.cfOrderId, updateOrderExtendedDataEntity.cfOrderId) &&
        Objects.equals(this.orderId, updateOrderExtendedDataEntity.orderId) &&
        Objects.equals(this.shipmentDetails, updateOrderExtendedDataEntity.shipmentDetails) &&
        Objects.equals(this.orderDeliveryStatus, updateOrderExtendedDataEntity.orderDeliveryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfOrderId, orderId, shipmentDetails, orderDeliveryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderExtendedDataEntity {\n");
    sb.append("    cfOrderId: ").append(toIndentedString(cfOrderId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
    openapiFields.add("cf_order_id");
    openapiFields.add("order_id");
    openapiFields.add("shipment_details");
    openapiFields.add("order_delivery_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateOrderExtendedDataEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_order_id") != null && !jsonObj.get("cf_order_id").isJsonNull()) && !jsonObj.get("cf_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_order_id").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if (jsonObj.get("shipment_details") != null && !jsonObj.get("shipment_details").isJsonNull()) {
        JsonArray jsonArrayshipmentDetails = jsonObj.getAsJsonArray("shipment_details");
        if (jsonArrayshipmentDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shipment_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shipment_details` to be an array in the JSON string but got `%s`", jsonObj.get("shipment_details").toString()));
          }

          // validate the optional field `shipment_details` (array)
          for (int i = 0; i < jsonArrayshipmentDetails.size(); i++) {
            ShipmentDetails.validateJsonElement(jsonArrayshipmentDetails.get(i));
          };
        }
      }
      // validate the optional field `order_delivery_status`
      if (jsonObj.get("order_delivery_status") != null && !jsonObj.get("order_delivery_status").isJsonNull()) {
        OrderDeliveryStatus.validateJsonElement(jsonObj.get("order_delivery_status"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateOrderExtendedDataEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_order_id") != null && !jsonObj.get("cf_order_id").isJsonNull()) && !jsonObj.get("cf_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_order_id").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if (jsonObj.get("shipment_details") != null && !jsonObj.get("shipment_details").isJsonNull()) {
        JsonArray jsonArrayshipmentDetails = jsonObj.getAsJsonArray("shipment_details");
        if (jsonArrayshipmentDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shipment_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shipment_details` to be an array in the JSON string but got `%s`", jsonObj.get("shipment_details").toString()));
          }

          // validate the optional field `shipment_details` (array)
          for (int i = 0; i < jsonArrayshipmentDetails.size(); i++) {
            ShipmentDetails.validateJsonElement(jsonArrayshipmentDetails.get(i));
          };
        }
      }
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
       if (!UpdateOrderExtendedDataEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateOrderExtendedDataEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateOrderExtendedDataEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateOrderExtendedDataEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateOrderExtendedDataEntity>() {
           @Override
           public void write(JsonWriter out, UpdateOrderExtendedDataEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateOrderExtendedDataEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateOrderExtendedDataEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateOrderExtendedDataEntity
  * @throws IOException if the JSON string is invalid with respect to UpdateOrderExtendedDataEntity
  */
  public static UpdateOrderExtendedDataEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateOrderExtendedDataEntity.class);
  }

 /**
  * Convert an instance of UpdateOrderExtendedDataEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

