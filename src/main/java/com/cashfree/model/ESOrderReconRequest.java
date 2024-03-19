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
import com.cashfree.model.ESOrderReconRequestFilters;
import com.cashfree.model.ESOrderReconRequestPagination;
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
 * ES Order Recon Request
 */
@Schema(description = "ES Order Recon Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T12:21:26.755700Z[Etc/UTC]")
public class ESOrderReconRequest {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private ESOrderReconRequestFilters filters;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private ESOrderReconRequestPagination pagination;

  public ESOrderReconRequest() {
  }

  public ESOrderReconRequest filters(ESOrderReconRequestFilters filters) {
    
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public ESOrderReconRequestFilters getFilters() {
    return filters;
  }


  public void setFilters(ESOrderReconRequestFilters filters) {
    this.filters = filters;
  }


  public ESOrderReconRequest pagination(ESOrderReconRequestPagination pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public ESOrderReconRequestPagination getPagination() {
    return pagination;
  }


  public void setPagination(ESOrderReconRequestPagination pagination) {
    this.pagination = pagination;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ESOrderReconRequest esOrderReconRequest = (ESOrderReconRequest) o;
    return Objects.equals(this.filters, esOrderReconRequest.filters) &&
        Objects.equals(this.pagination, esOrderReconRequest.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESOrderReconRequest {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
    openapiFields.add("filters");
    openapiFields.add("pagination");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("filters");
    openapiRequiredFields.add("pagination");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ESOrderReconRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ESOrderReconRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `filters`
      ESOrderReconRequestFilters.validateJsonElement(jsonObj.get("filters"));
      // validate the required field `pagination`
      ESOrderReconRequestPagination.validateJsonElement(jsonObj.get("pagination"));
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ESOrderReconRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ESOrderReconRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `filters`
      ESOrderReconRequestFilters.validateJsonElement(jsonObj.get("filters"));
      // validate the required field `pagination`
      ESOrderReconRequestPagination.validateJsonElement(jsonObj.get("pagination"));
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ESOrderReconRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ESOrderReconRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ESOrderReconRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ESOrderReconRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ESOrderReconRequest>() {
           @Override
           public void write(JsonWriter out, ESOrderReconRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ESOrderReconRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ESOrderReconRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ESOrderReconRequest
  * @throws IOException if the JSON string is invalid with respect to ESOrderReconRequest
  */
  public static ESOrderReconRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ESOrderReconRequest.class);
  }

 /**
  * Convert an instance of ESOrderReconRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

