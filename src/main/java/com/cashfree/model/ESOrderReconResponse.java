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
import com.cashfree.model.ESOrderReconResponseDataInner;
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
 * ES Order Recon Response
 */
@Schema(description = "ES Order Recon Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-25T11:57:22.771207Z[Etc/UTC]")
public class ESOrderReconResponse {
  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private String cursor;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ESOrderReconResponseDataInner> data;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public ESOrderReconResponse() {
  }

  public ESOrderReconResponse cursor(String cursor) {
    
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCursor() {
    return cursor;
  }


  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  public ESOrderReconResponse data(List<ESOrderReconResponseDataInner> data) {
    
    this.data = data;
    return this;
  }

  public ESOrderReconResponse addDataItem(ESOrderReconResponseDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<ESOrderReconResponseDataInner> getData() {
    return data;
  }


  public void setData(List<ESOrderReconResponseDataInner> data) {
    this.data = data;
  }


  public ESOrderReconResponse limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ESOrderReconResponse esOrderReconResponse = (ESOrderReconResponse) o;
    return Objects.equals(this.cursor, esOrderReconResponse.cursor) &&
        Objects.equals(this.data, esOrderReconResponse.data) &&
        Objects.equals(this.limit, esOrderReconResponse.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, data, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESOrderReconResponse {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
    openapiFields.add("cursor");
    openapiFields.add("data");
    openapiFields.add("limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ESOrderReconResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cursor") != null && !jsonObj.get("cursor").isJsonNull()) && !jsonObj.get("cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cursor").toString()));
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            ESOrderReconResponseDataInner.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ESOrderReconResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cursor") != null && !jsonObj.get("cursor").isJsonNull()) && !jsonObj.get("cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cursor").toString()));
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            ESOrderReconResponseDataInner.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ESOrderReconResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ESOrderReconResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ESOrderReconResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ESOrderReconResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ESOrderReconResponse>() {
           @Override
           public void write(JsonWriter out, ESOrderReconResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ESOrderReconResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ESOrderReconResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ESOrderReconResponse
  * @throws IOException if the JSON string is invalid with respect to ESOrderReconResponse
  */
  public static ESOrderReconResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ESOrderReconResponse.class);
  }

 /**
  * Convert an instance of ESOrderReconResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

