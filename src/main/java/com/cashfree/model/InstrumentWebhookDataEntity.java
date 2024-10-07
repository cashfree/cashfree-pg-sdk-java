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
import com.cashfree.model.InstrumentEntity;
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
 * data entity in webhook
 */
@Schema(description = "data entity in webhook")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-07T11:53:02.829012Z[Etc/UTC]")
public class InstrumentWebhookDataEntity {
  public static final String SERIALIZED_NAME_INSTRUMENT = "instrument";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT)
  private InstrumentEntity instrument;

  public InstrumentWebhookDataEntity() {
  }

  public InstrumentWebhookDataEntity instrument(InstrumentEntity instrument) {
    
    this.instrument = instrument;
    return this;
  }

   /**
   * Get instrument
   * @return instrument
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public InstrumentEntity getInstrument() {
    return instrument;
  }


  public void setInstrument(InstrumentEntity instrument) {
    this.instrument = instrument;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentWebhookDataEntity instrumentWebhookDataEntity = (InstrumentWebhookDataEntity) o;
    return Objects.equals(this.instrument, instrumentWebhookDataEntity.instrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentWebhookDataEntity {\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
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
    openapiFields.add("instrument");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InstrumentWebhookDataEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `instrument`
      if (jsonObj.get("instrument") != null && !jsonObj.get("instrument").isJsonNull()) {
        InstrumentEntity.validateJsonElement(jsonObj.get("instrument"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InstrumentWebhookDataEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `instrument`
      if (jsonObj.get("instrument") != null && !jsonObj.get("instrument").isJsonNull()) {
        InstrumentEntity.validateJsonElement(jsonObj.get("instrument"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstrumentWebhookDataEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstrumentWebhookDataEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstrumentWebhookDataEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstrumentWebhookDataEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<InstrumentWebhookDataEntity>() {
           @Override
           public void write(JsonWriter out, InstrumentWebhookDataEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstrumentWebhookDataEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstrumentWebhookDataEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstrumentWebhookDataEntity
  * @throws IOException if the JSON string is invalid with respect to InstrumentWebhookDataEntity
  */
  public static InstrumentWebhookDataEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstrumentWebhookDataEntity.class);
  }

 /**
  * Convert an instance of InstrumentWebhookDataEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

