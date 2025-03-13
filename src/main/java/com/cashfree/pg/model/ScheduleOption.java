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
 * ScheduleOption
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T09:56:44.464357Z[Etc/UTC]")
public class ScheduleOption {
  public static final String SERIALIZED_NAME_SETTLEMENT_SCHEDULE_MESSAGE = "settlement_schedule_message";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_SCHEDULE_MESSAGE)
  private String settlementScheduleMessage;

  public static final String SERIALIZED_NAME_SCHEDULE_ID = "schedule_id";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_ID)
  private BigDecimal scheduleId;

  public static final String SERIALIZED_NAME_MERCHANT_DEFAULT = "merchant_default";
  @SerializedName(SERIALIZED_NAME_MERCHANT_DEFAULT)
  private Boolean merchantDefault;

  public ScheduleOption() {
  }

  public ScheduleOption settlementScheduleMessage(String settlementScheduleMessage) {
    
    this.settlementScheduleMessage = settlementScheduleMessage;
    return this;
  }

   /**
   * Get settlementScheduleMessage
   * @return settlementScheduleMessage
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getSettlementScheduleMessage() {
    return settlementScheduleMessage;
  }


  public void setSettlementScheduleMessage(String settlementScheduleMessage) {
    this.settlementScheduleMessage = settlementScheduleMessage;
  }


  public ScheduleOption scheduleId(BigDecimal scheduleId) {
    
    this.scheduleId = scheduleId;
    return this;
  }

   /**
   * Get scheduleId
   * @return scheduleId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getScheduleId() {
    return scheduleId;
  }


  public void setScheduleId(BigDecimal scheduleId) {
    this.scheduleId = scheduleId;
  }


  public ScheduleOption merchantDefault(Boolean merchantDefault) {
    
    this.merchantDefault = merchantDefault;
    return this;
  }

   /**
   * Get merchantDefault
   * @return merchantDefault
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Boolean getMerchantDefault() {
    return merchantDefault;
  }


  public void setMerchantDefault(Boolean merchantDefault) {
    this.merchantDefault = merchantDefault;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleOption scheduleOption = (ScheduleOption) o;
    return Objects.equals(this.settlementScheduleMessage, scheduleOption.settlementScheduleMessage) &&
        Objects.equals(this.scheduleId, scheduleOption.scheduleId) &&
        Objects.equals(this.merchantDefault, scheduleOption.merchantDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlementScheduleMessage, scheduleId, merchantDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleOption {\n");
    sb.append("    settlementScheduleMessage: ").append(toIndentedString(settlementScheduleMessage)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    merchantDefault: ").append(toIndentedString(merchantDefault)).append("\n");
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
    openapiFields.add("settlement_schedule_message");
    openapiFields.add("schedule_id");
    openapiFields.add("merchant_default");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ScheduleOption
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("settlement_schedule_message") != null && !jsonObj.get("settlement_schedule_message").isJsonNull()) && !jsonObj.get("settlement_schedule_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_schedule_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_schedule_message").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ScheduleOption
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("settlement_schedule_message") != null && !jsonObj.get("settlement_schedule_message").isJsonNull()) && !jsonObj.get("settlement_schedule_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_schedule_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_schedule_message").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScheduleOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScheduleOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScheduleOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScheduleOption.class));

       return (TypeAdapter<T>) new TypeAdapter<ScheduleOption>() {
           @Override
           public void write(JsonWriter out, ScheduleOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScheduleOption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScheduleOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScheduleOption
  * @throws IOException if the JSON string is invalid with respect to ScheduleOption
  */
  public static ScheduleOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScheduleOption.class);
  }

 /**
  * Convert an instance of ScheduleOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

