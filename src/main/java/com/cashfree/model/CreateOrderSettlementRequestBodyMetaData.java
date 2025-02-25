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
import java.time.LocalDate;
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
 * CreateOrderSettlementRequestBodyMetaData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-25T11:57:22.771207Z[Etc/UTC]")
public class CreateOrderSettlementRequestBodyMetaData {
  public static final String SERIALIZED_NAME_CBRIKS_ID = "cbriks_id";
  @SerializedName(SERIALIZED_NAME_CBRIKS_ID)
  private String cbriksId;

  public static final String SERIALIZED_NAME_SETTLEMENT_DATE = "settlement_date";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_DATE)
  private LocalDate settlementDate;

  public CreateOrderSettlementRequestBodyMetaData() {
  }

  public CreateOrderSettlementRequestBodyMetaData cbriksId(String cbriksId) {
    
    this.cbriksId = cbriksId;
    return this;
  }

   /**
   * Meta data cbricks ID to be used for reporting purpose.
   * @return cbriksId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Meta data cbricks ID to be used for reporting purpose.")
  public String getCbriksId() {
    return cbriksId;
  }


  public void setCbriksId(String cbriksId) {
    this.cbriksId = cbriksId;
  }


  public CreateOrderSettlementRequestBodyMetaData settlementDate(LocalDate settlementDate) {
    
    this.settlementDate = settlementDate;
    return this;
  }

   /**
   * Requested Settlement Date.
   * @return settlementDate
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Requested Settlement Date.")
  public LocalDate getSettlementDate() {
    return settlementDate;
  }


  public void setSettlementDate(LocalDate settlementDate) {
    this.settlementDate = settlementDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderSettlementRequestBodyMetaData createOrderSettlementRequestBodyMetaData = (CreateOrderSettlementRequestBodyMetaData) o;
    return Objects.equals(this.cbriksId, createOrderSettlementRequestBodyMetaData.cbriksId) &&
        Objects.equals(this.settlementDate, createOrderSettlementRequestBodyMetaData.settlementDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cbriksId, settlementDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderSettlementRequestBodyMetaData {\n");
    sb.append("    cbriksId: ").append(toIndentedString(cbriksId)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
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
    openapiFields.add("cbriks_id");
    openapiFields.add("settlement_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateOrderSettlementRequestBodyMetaData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cbriks_id") != null && !jsonObj.get("cbriks_id").isJsonNull()) && !jsonObj.get("cbriks_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cbriks_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cbriks_id").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateOrderSettlementRequestBodyMetaData
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cbriks_id") != null && !jsonObj.get("cbriks_id").isJsonNull()) && !jsonObj.get("cbriks_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cbriks_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cbriks_id").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOrderSettlementRequestBodyMetaData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOrderSettlementRequestBodyMetaData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOrderSettlementRequestBodyMetaData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOrderSettlementRequestBodyMetaData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOrderSettlementRequestBodyMetaData>() {
           @Override
           public void write(JsonWriter out, CreateOrderSettlementRequestBodyMetaData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOrderSettlementRequestBodyMetaData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateOrderSettlementRequestBodyMetaData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateOrderSettlementRequestBodyMetaData
  * @throws IOException if the JSON string is invalid with respect to CreateOrderSettlementRequestBodyMetaData
  */
  public static CreateOrderSettlementRequestBodyMetaData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOrderSettlementRequestBodyMetaData.class);
  }

 /**
  * Convert an instance of CreateOrderSettlementRequestBodyMetaData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

