/*
 * Cashfree Payment Gateway APIs
 * Cashfree's Payment Gateway APIs provide developers with a streamlined pathway to integrate advanced payment processing capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2022-09-01
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
 * To fetch the next set of settlements, pass the cursor received in the response to the next API call.   To receive the data for the first time, pass the cursor as null.   Limit would be number of settlements that you want to receive.
 */
@Schema(description = "To fetch the next set of settlements, pass the cursor received in the response to the next API call.   To receive the data for the first time, pass the cursor as null.   Limit would be number of settlements that you want to receive.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-10T12:29:43.681871Z[Etc/UTC]")
public class FetchSettlementsRequestPagination {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private String cursor;

  public FetchSettlementsRequestPagination() {
  }

  public FetchSettlementsRequestPagination limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The number of settlements you want to fetch. Maximum limit is 1000, default value is 10.
   * @return limit
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "The number of settlements you want to fetch. Maximum limit is 1000, default value is 10.")
  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public FetchSettlementsRequestPagination cursor(String cursor) {
    
    this.cursor = cursor;
    return this;
  }

   /**
   * Specifies from where the next set of settlement details should be fetched.
   * @return cursor
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Specifies from where the next set of settlement details should be fetched.")
  public String getCursor() {
    return cursor;
  }


  public void setCursor(String cursor) {
    this.cursor = cursor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchSettlementsRequestPagination fetchSettlementsRequestPagination = (FetchSettlementsRequestPagination) o;
    return Objects.equals(this.limit, fetchSettlementsRequestPagination.limit) &&
        Objects.equals(this.cursor, fetchSettlementsRequestPagination.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchSettlementsRequestPagination {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("cursor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("limit");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FetchSettlementsRequestPagination
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FetchSettlementsRequestPagination.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cursor") != null && !jsonObj.get("cursor").isJsonNull()) && !jsonObj.get("cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cursor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FetchSettlementsRequestPagination.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FetchSettlementsRequestPagination' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FetchSettlementsRequestPagination> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FetchSettlementsRequestPagination.class));

       return (TypeAdapter<T>) new TypeAdapter<FetchSettlementsRequestPagination>() {
           @Override
           public void write(JsonWriter out, FetchSettlementsRequestPagination value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FetchSettlementsRequestPagination read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FetchSettlementsRequestPagination given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FetchSettlementsRequestPagination
  * @throws IOException if the JSON string is invalid with respect to FetchSettlementsRequestPagination
  */
  public static FetchSettlementsRequestPagination fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FetchSettlementsRequestPagination.class);
  }

 /**
  * Convert an instance of FetchSettlementsRequestPagination to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

