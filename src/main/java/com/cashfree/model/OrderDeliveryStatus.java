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
 * Order delivery Status associated with order.
 */
@Schema(description = "Order delivery Status associated with order.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-09T12:52:07.742309Z[Etc/UTC]")
public class OrderDeliveryStatus {
  /**
   * Delivery status of order
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    AWAITING_PICKUP("AWAITING_PICKUP"),
    
    CANCELLED("CANCELLED"),
    
    SELF_FULFILLED("SELF_FULFILLED"),
    
    PICKED_UP("PICKED_UP"),
    
    SHIPPED("SHIPPED"),
    
    IN_TRANSIT("IN_TRANSIT"),
    
    DELAY_COURIER_COMPANY_ISSUES("DELAY_COURIER_COMPANY_ISSUES"),
    
    DELAY_INCORRECT_ADDRESS("DELAY_INCORRECT_ADDRESS"),
    
    DELAY_SELLER_ISSUES("DELAY_SELLER_ISSUES"),
    
    REACHED_DESTINATION_HUB("REACHED_DESTINATION_HUB"),
    
    OUT_FOR_DELIVERY("OUT_FOR_DELIVERY"),
    
    DELIVERED("DELIVERED"),
    
    POTENTIAL_RTO_DELIVERY_ATTEMPTED("POTENTIAL_RTO_DELIVERY_ATTEMPTED"),
    
    RTO("RTO"),
    
    LOST("LOST"),
    
    DAMAGED("DAMAGED"),
    
    UNTRACKABLE_404("UNTRACKABLE_404"),
    
    MANUAL_INTERVENTION_BROKEN_URL("MANUAL_INTERVENTION_BROKEN_URL"),
    
    ASSOCIATED_WITH_RETURN_PICKUP("ASSOCIATED_WITH_RETURN_PICKUP"),
    
    UNSERVICEABLE("UNSERVICEABLE"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public OrderDeliveryStatus() {
  }

  public OrderDeliveryStatus status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Delivery status of order
   * @return status
  **/
  @javax.annotation.Nonnull
  @Schema(example = "CANCELLED", requiredMode = Schema.RequiredMode.REQUIRED, description = "Delivery status of order")
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public OrderDeliveryStatus reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Reason of provided order delivery status. This is optional field.
   * @return reason
  **/
  @javax.annotation.Nullable
  @Schema(example = "cancelled due to wrong address", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Reason of provided order delivery status. This is optional field.")
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDeliveryStatus orderDeliveryStatus = (OrderDeliveryStatus) o;
    return Objects.equals(this.status, orderDeliveryStatus.status) &&
        Objects.equals(this.reason, orderDeliveryStatus.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDeliveryStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDeliveryStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderDeliveryStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDeliveryStatus
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderDeliveryStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDeliveryStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDeliveryStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDeliveryStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDeliveryStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDeliveryStatus>() {
           @Override
           public void write(JsonWriter out, OrderDeliveryStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDeliveryStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDeliveryStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDeliveryStatus
  * @throws IOException if the JSON string is invalid with respect to OrderDeliveryStatus
  */
  public static OrderDeliveryStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDeliveryStatus.class);
  }

 /**
  * Convert an instance of OrderDeliveryStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
