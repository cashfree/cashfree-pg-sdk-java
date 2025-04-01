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

import com.cashfree.pg.JSON;

/**
 * Provide the filter object details.
 */
@Schema(description = "Provide the filter object details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-01T11:33:46.250709Z[Etc/UTC]")
public class ESOrderReconRequestFilters {
  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_ORDER_IDS = "order_ids";
  @SerializedName(SERIALIZED_NAME_ORDER_IDS)
  private List<String> orderIds;

  public ESOrderReconRequestFilters() {
  }

  public ESOrderReconRequestFilters startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Specify the start data from which you want to get the recon data.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Specify the start data from which you want to get the recon data.")
  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public ESOrderReconRequestFilters endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Specify the end data till which you want to get the recon data.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Specify the end data till which you want to get the recon data.")
  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public ESOrderReconRequestFilters orderIds(List<String> orderIds) {
    
    this.orderIds = orderIds;
    return this;
  }

  public ESOrderReconRequestFilters addOrderIdsItem(String orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * Please provide list of order ids for which you want to get the recon data.
   * @return orderIds
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Please provide list of order ids for which you want to get the recon data.")
  public List<String> getOrderIds() {
    return orderIds;
  }


  public void setOrderIds(List<String> orderIds) {
    this.orderIds = orderIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ESOrderReconRequestFilters esOrderReconRequestFilters = (ESOrderReconRequestFilters) o;
    return Objects.equals(this.startDate, esOrderReconRequestFilters.startDate) &&
        Objects.equals(this.endDate, esOrderReconRequestFilters.endDate) &&
        Objects.equals(this.orderIds, esOrderReconRequestFilters.orderIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, orderIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESOrderReconRequestFilters {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
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
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("order_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ESOrderReconRequestFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("order_ids") != null && !jsonObj.get("order_ids").isJsonNull() && !jsonObj.get("order_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_ids` to be an array in the JSON string but got `%s`", jsonObj.get("order_ids").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ESOrderReconRequestFilters
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("order_ids") != null && !jsonObj.get("order_ids").isJsonNull() && !jsonObj.get("order_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_ids` to be an array in the JSON string but got `%s`", jsonObj.get("order_ids").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ESOrderReconRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ESOrderReconRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ESOrderReconRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ESOrderReconRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<ESOrderReconRequestFilters>() {
           @Override
           public void write(JsonWriter out, ESOrderReconRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ESOrderReconRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ESOrderReconRequestFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ESOrderReconRequestFilters
  * @throws IOException if the JSON string is invalid with respect to ESOrderReconRequestFilters
  */
  public static ESOrderReconRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ESOrderReconRequestFilters.class);
  }

 /**
  * Convert an instance of ESOrderReconRequestFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

