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
import com.cashfree.model.SettlementEntity;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-12T08:35:35.237610Z[Etc/UTC]")
public class SettlementWebhookDataEntity {
  public static final String SERIALIZED_NAME_SETTLEMENT = "settlement";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT)
  private SettlementEntity settlement;

  public SettlementWebhookDataEntity() {
  }

  public SettlementWebhookDataEntity settlement(SettlementEntity settlement) {
    
    this.settlement = settlement;
    return this;
  }

   /**
   * Get settlement
   * @return settlement
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public SettlementEntity getSettlement() {
    return settlement;
  }


  public void setSettlement(SettlementEntity settlement) {
    this.settlement = settlement;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementWebhookDataEntity settlementWebhookDataEntity = (SettlementWebhookDataEntity) o;
    return Objects.equals(this.settlement, settlementWebhookDataEntity.settlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementWebhookDataEntity {\n");
    sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
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
    openapiFields.add("settlement");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SettlementWebhookDataEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `settlement`
      if (jsonObj.get("settlement") != null && !jsonObj.get("settlement").isJsonNull()) {
        SettlementEntity.validateJsonElement(jsonObj.get("settlement"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SettlementWebhookDataEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `settlement`
      if (jsonObj.get("settlement") != null && !jsonObj.get("settlement").isJsonNull()) {
        SettlementEntity.validateJsonElement(jsonObj.get("settlement"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettlementWebhookDataEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettlementWebhookDataEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettlementWebhookDataEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettlementWebhookDataEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<SettlementWebhookDataEntity>() {
           @Override
           public void write(JsonWriter out, SettlementWebhookDataEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettlementWebhookDataEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SettlementWebhookDataEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettlementWebhookDataEntity
  * @throws IOException if the JSON string is invalid with respect to SettlementWebhookDataEntity
  */
  public static SettlementWebhookDataEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettlementWebhookDataEntity.class);
  }

 /**
  * Convert an instance of SettlementWebhookDataEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

