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
 * Specify either the Settlement ID, Settlement UTR, or start date and end date to fetch the settlement details.
 */
@Schema(description = "Specify either the Settlement ID, Settlement UTR, or start date and end date to fetch the settlement details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T08:54:48.139104Z[Etc/UTC]")
public class SettlementFetchReconRequestFilters {
  public static final String SERIALIZED_NAME_CF_SETTLEMENT_IDS = "cf_settlement_ids";
  @SerializedName(SERIALIZED_NAME_CF_SETTLEMENT_IDS)
  private List<Integer> cfSettlementIds;

  public static final String SERIALIZED_NAME_SETTLEMENT_UTRS = "settlement_utrs";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_UTRS)
  private List<String> settlementUtrs;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public SettlementFetchReconRequestFilters() {
  }

  public SettlementFetchReconRequestFilters cfSettlementIds(List<Integer> cfSettlementIds) {
    
    this.cfSettlementIds = cfSettlementIds;
    return this;
  }

  public SettlementFetchReconRequestFilters addCfSettlementIdsItem(Integer cfSettlementIdsItem) {
    if (this.cfSettlementIds == null) {
      this.cfSettlementIds = new ArrayList<>();
    }
    this.cfSettlementIds.add(cfSettlementIdsItem);
    return this;
  }

   /**
   * List of settlement IDs for which you want the settlement reconciliation details.
   * @return cfSettlementIds
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "List of settlement IDs for which you want the settlement reconciliation details.")
  public List<Integer> getCfSettlementIds() {
    return cfSettlementIds;
  }


  public void setCfSettlementIds(List<Integer> cfSettlementIds) {
    this.cfSettlementIds = cfSettlementIds;
  }


  public SettlementFetchReconRequestFilters settlementUtrs(List<String> settlementUtrs) {
    
    this.settlementUtrs = settlementUtrs;
    return this;
  }

  public SettlementFetchReconRequestFilters addSettlementUtrsItem(String settlementUtrsItem) {
    if (this.settlementUtrs == null) {
      this.settlementUtrs = new ArrayList<>();
    }
    this.settlementUtrs.add(settlementUtrsItem);
    return this;
  }

   /**
   * List of settlement UTRs for which you want the settlement reconciliation details.
   * @return settlementUtrs
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "List of settlement UTRs for which you want the settlement reconciliation details.")
  public List<String> getSettlementUtrs() {
    return settlementUtrs;
  }


  public void setSettlementUtrs(List<String> settlementUtrs) {
    this.settlementUtrs = settlementUtrs;
  }


  public SettlementFetchReconRequestFilters startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Specify the start date from when you want the settlement reconciliation details.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Specify the start date from when you want the settlement reconciliation details.")
  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public SettlementFetchReconRequestFilters endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Specify the end date till when you want the settlement reconciliation details.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Specify the end date till when you want the settlement reconciliation details.")
  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementFetchReconRequestFilters settlementFetchReconRequestFilters = (SettlementFetchReconRequestFilters) o;
    return Objects.equals(this.cfSettlementIds, settlementFetchReconRequestFilters.cfSettlementIds) &&
        Objects.equals(this.settlementUtrs, settlementFetchReconRequestFilters.settlementUtrs) &&
        Objects.equals(this.startDate, settlementFetchReconRequestFilters.startDate) &&
        Objects.equals(this.endDate, settlementFetchReconRequestFilters.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfSettlementIds, settlementUtrs, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementFetchReconRequestFilters {\n");
    sb.append("    cfSettlementIds: ").append(toIndentedString(cfSettlementIds)).append("\n");
    sb.append("    settlementUtrs: ").append(toIndentedString(settlementUtrs)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("cf_settlement_ids");
    openapiFields.add("settlement_utrs");
    openapiFields.add("start_date");
    openapiFields.add("end_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SettlementFetchReconRequestFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("cf_settlement_ids") != null && !jsonObj.get("cf_settlement_ids").isJsonNull() && !jsonObj.get("cf_settlement_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_settlement_ids` to be an array in the JSON string but got `%s`", jsonObj.get("cf_settlement_ids").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("settlement_utrs") != null && !jsonObj.get("settlement_utrs").isJsonNull() && !jsonObj.get("settlement_utrs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_utrs` to be an array in the JSON string but got `%s`", jsonObj.get("settlement_utrs").toString()));
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettlementFetchReconRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettlementFetchReconRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettlementFetchReconRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettlementFetchReconRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<SettlementFetchReconRequestFilters>() {
           @Override
           public void write(JsonWriter out, SettlementFetchReconRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettlementFetchReconRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SettlementFetchReconRequestFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettlementFetchReconRequestFilters
  * @throws IOException if the JSON string is invalid with respect to SettlementFetchReconRequestFilters
  */
  public static SettlementFetchReconRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettlementFetchReconRequestFilters.class);
  }

 /**
  * Convert an instance of SettlementFetchReconRequestFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

