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
import com.cashfree.model.InstrumentWebhookDataEntity;
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
 * InstrumentWebhookData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T10:27:27.461284Z[Etc/UTC]")
public class InstrumentWebhookData {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private InstrumentWebhookDataEntity data;

  public static final String SERIALIZED_NAME_EVENT_TIME = "event_time";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  private String eventTime;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public InstrumentWebhookData() {
  }

  public InstrumentWebhookData data(InstrumentWebhookDataEntity data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public InstrumentWebhookDataEntity getData() {
    return data;
  }


  public void setData(InstrumentWebhookDataEntity data) {
    this.data = data;
  }


  public InstrumentWebhookData eventTime(String eventTime) {
    
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Get eventTime
   * @return eventTime
  **/
  @javax.annotation.Nullable
  @Schema(example = "2021-10-07T19:42:44+05:30", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getEventTime() {
    return eventTime;
  }


  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }


  public InstrumentWebhookData type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @Schema(example = "INSTRUMENT_ACTIVE_WEBHOOK", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentWebhookData instrumentWebhookData = (InstrumentWebhookData) o;
    return Objects.equals(this.data, instrumentWebhookData.data) &&
        Objects.equals(this.eventTime, instrumentWebhookData.eventTime) &&
        Objects.equals(this.type, instrumentWebhookData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, eventTime, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentWebhookData {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("event_time");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InstrumentWebhookData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        InstrumentWebhookDataEntity.validateJsonElement(jsonObj.get("data"));
      }
      if ((jsonObj.get("event_time") != null && !jsonObj.get("event_time").isJsonNull()) && !jsonObj.get("event_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_time").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InstrumentWebhookData
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        InstrumentWebhookDataEntity.validateJsonElement(jsonObj.get("data"));
        return true;
      }
      if ((jsonObj.get("event_time") != null && !jsonObj.get("event_time").isJsonNull()) && !jsonObj.get("event_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_time").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstrumentWebhookData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstrumentWebhookData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstrumentWebhookData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstrumentWebhookData.class));

       return (TypeAdapter<T>) new TypeAdapter<InstrumentWebhookData>() {
           @Override
           public void write(JsonWriter out, InstrumentWebhookData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstrumentWebhookData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstrumentWebhookData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstrumentWebhookData
  * @throws IOException if the JSON string is invalid with respect to InstrumentWebhookData
  */
  public static InstrumentWebhookData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstrumentWebhookData.class);
  }

 /**
  * Convert an instance of InstrumentWebhookData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

