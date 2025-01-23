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
import com.cashfree.pg.model.SplitOrderReconSuccessResponseSettlement;
import com.cashfree.pg.model.SplitOrderReconSuccessResponseVendorsInner;
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
 * Split Order Reconciliation Request Body
 */
@Schema(description = "Split Order Reconciliation Request Body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T14:04:19.914397Z[Etc/UTC]")
public class SplitOrderReconSuccessResponse {
  public static final String SERIALIZED_NAME_SETTLEMENT = "settlement";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT)
  private SplitOrderReconSuccessResponseSettlement settlement;

  public static final String SERIALIZED_NAME_REFUNDS = "refunds";
  @SerializedName(SERIALIZED_NAME_REFUNDS)
  private List<Object> refunds;

  public static final String SERIALIZED_NAME_VENDORS = "vendors";
  @SerializedName(SERIALIZED_NAME_VENDORS)
  private List<SplitOrderReconSuccessResponseVendorsInner> vendors;

  public SplitOrderReconSuccessResponse() {
  }

  public SplitOrderReconSuccessResponse settlement(SplitOrderReconSuccessResponseSettlement settlement) {
    
    this.settlement = settlement;
    return this;
  }

   /**
   * Get settlement
   * @return settlement
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public SplitOrderReconSuccessResponseSettlement getSettlement() {
    return settlement;
  }


  public void setSettlement(SplitOrderReconSuccessResponseSettlement settlement) {
    this.settlement = settlement;
  }


  public SplitOrderReconSuccessResponse refunds(List<Object> refunds) {
    
    this.refunds = refunds;
    return this;
  }

  public SplitOrderReconSuccessResponse addRefundsItem(Object refundsItem) {
    if (this.refunds == null) {
      this.refunds = new ArrayList<>();
    }
    this.refunds.add(refundsItem);
    return this;
  }

   /**
   * List of refunds associated with the order, if any.
   * @return refunds
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "List of refunds associated with the order, if any.")
  public List<Object> getRefunds() {
    return refunds;
  }


  public void setRefunds(List<Object> refunds) {
    this.refunds = refunds;
  }


  public SplitOrderReconSuccessResponse vendors(List<SplitOrderReconSuccessResponseVendorsInner> vendors) {
    
    this.vendors = vendors;
    return this;
  }

  public SplitOrderReconSuccessResponse addVendorsItem(SplitOrderReconSuccessResponseVendorsInner vendorsItem) {
    if (this.vendors == null) {
      this.vendors = new ArrayList<>();
    }
    this.vendors.add(vendorsItem);
    return this;
  }

   /**
   * List of vendor settlements associated with the split settlement.
   * @return vendors
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "List of vendor settlements associated with the split settlement.")
  public List<SplitOrderReconSuccessResponseVendorsInner> getVendors() {
    return vendors;
  }


  public void setVendors(List<SplitOrderReconSuccessResponseVendorsInner> vendors) {
    this.vendors = vendors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitOrderReconSuccessResponse splitOrderReconSuccessResponse = (SplitOrderReconSuccessResponse) o;
    return Objects.equals(this.settlement, splitOrderReconSuccessResponse.settlement) &&
        Objects.equals(this.refunds, splitOrderReconSuccessResponse.refunds) &&
        Objects.equals(this.vendors, splitOrderReconSuccessResponse.vendors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlement, refunds, vendors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitOrderReconSuccessResponse {\n");
    sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
    sb.append("    vendors: ").append(toIndentedString(vendors)).append("\n");
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
    openapiFields.add("refunds");
    openapiFields.add("vendors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SplitOrderReconSuccessResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `settlement`
      if (jsonObj.get("settlement") != null && !jsonObj.get("settlement").isJsonNull()) {
        SplitOrderReconSuccessResponseSettlement.validateJsonElement(jsonObj.get("settlement"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("refunds") != null && !jsonObj.get("refunds").isJsonNull() && !jsonObj.get("refunds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `refunds` to be an array in the JSON string but got `%s`", jsonObj.get("refunds").toString()));
      }
      if (jsonObj.get("vendors") != null && !jsonObj.get("vendors").isJsonNull()) {
        JsonArray jsonArrayvendors = jsonObj.getAsJsonArray("vendors");
        if (jsonArrayvendors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vendors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vendors` to be an array in the JSON string but got `%s`", jsonObj.get("vendors").toString()));
          }

          // validate the optional field `vendors` (array)
          for (int i = 0; i < jsonArrayvendors.size(); i++) {
            SplitOrderReconSuccessResponseVendorsInner.validateJsonElement(jsonArrayvendors.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SplitOrderReconSuccessResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `settlement`
      if (jsonObj.get("settlement") != null && !jsonObj.get("settlement").isJsonNull()) {
        SplitOrderReconSuccessResponseSettlement.validateJsonElement(jsonObj.get("settlement"));
        return true;
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("refunds") != null && !jsonObj.get("refunds").isJsonNull() && !jsonObj.get("refunds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `refunds` to be an array in the JSON string but got `%s`", jsonObj.get("refunds").toString()));
      }
      if (jsonObj.get("vendors") != null && !jsonObj.get("vendors").isJsonNull()) {
        JsonArray jsonArrayvendors = jsonObj.getAsJsonArray("vendors");
        if (jsonArrayvendors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vendors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vendors` to be an array in the JSON string but got `%s`", jsonObj.get("vendors").toString()));
          }

          // validate the optional field `vendors` (array)
          for (int i = 0; i < jsonArrayvendors.size(); i++) {
            SplitOrderReconSuccessResponseVendorsInner.validateJsonElement(jsonArrayvendors.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SplitOrderReconSuccessResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SplitOrderReconSuccessResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SplitOrderReconSuccessResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SplitOrderReconSuccessResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SplitOrderReconSuccessResponse>() {
           @Override
           public void write(JsonWriter out, SplitOrderReconSuccessResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SplitOrderReconSuccessResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SplitOrderReconSuccessResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SplitOrderReconSuccessResponse
  * @throws IOException if the JSON string is invalid with respect to SplitOrderReconSuccessResponse
  */
  public static SplitOrderReconSuccessResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SplitOrderReconSuccessResponse.class);
  }

 /**
  * Convert an instance of SplitOrderReconSuccessResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

