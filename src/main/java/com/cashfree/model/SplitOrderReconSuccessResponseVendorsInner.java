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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
 * SplitOrderReconSuccessResponseVendorsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-25T11:57:22.771207Z[Etc/UTC]")
public class SplitOrderReconSuccessResponseVendorsInner {
  public static final String SERIALIZED_NAME_VENDOR_ID = "vendor_id";
  @SerializedName(SERIALIZED_NAME_VENDOR_ID)
  private String vendorId;

  public static final String SERIALIZED_NAME_SETTLEMENT_ID = "settlement_id";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_ID)
  private Long settlementId;

  public static final String SERIALIZED_NAME_SETTLEMENT_AMOUNT = "settlement_amount";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_AMOUNT)
  private BigDecimal settlementAmount;

  public static final String SERIALIZED_NAME_SETTLEMENT_ELIGIBILITY_DATE = "settlement_eligibility_date";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_ELIGIBILITY_DATE)
  private OffsetDateTime settlementEligibilityDate;

  public SplitOrderReconSuccessResponseVendorsInner() {
  }

  public SplitOrderReconSuccessResponseVendorsInner vendorId(String vendorId) {
    
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Unique identifier for the vendor.
   * @return vendorId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Unique identifier for the vendor.")
  public String getVendorId() {
    return vendorId;
  }


  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }


  public SplitOrderReconSuccessResponseVendorsInner settlementId(Long settlementId) {
    
    this.settlementId = settlementId;
    return this;
  }

   /**
   * Settlement ID associated with the vendor.
   * @return settlementId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Settlement ID associated with the vendor.")
  public Long getSettlementId() {
    return settlementId;
  }


  public void setSettlementId(Long settlementId) {
    this.settlementId = settlementId;
  }


  public SplitOrderReconSuccessResponseVendorsInner settlementAmount(BigDecimal settlementAmount) {
    
    this.settlementAmount = settlementAmount;
    return this;
  }

   /**
   * Settlement amount allocated to the vendor.
   * @return settlementAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Settlement amount allocated to the vendor.")
  public BigDecimal getSettlementAmount() {
    return settlementAmount;
  }


  public void setSettlementAmount(BigDecimal settlementAmount) {
    this.settlementAmount = settlementAmount;
  }


  public SplitOrderReconSuccessResponseVendorsInner settlementEligibilityDate(OffsetDateTime settlementEligibilityDate) {
    
    this.settlementEligibilityDate = settlementEligibilityDate;
    return this;
  }

   /**
   * Date and time when the vendor is eligible for the settlement.
   * @return settlementEligibilityDate
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Date and time when the vendor is eligible for the settlement.")
  public OffsetDateTime getSettlementEligibilityDate() {
    return settlementEligibilityDate;
  }


  public void setSettlementEligibilityDate(OffsetDateTime settlementEligibilityDate) {
    this.settlementEligibilityDate = settlementEligibilityDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitOrderReconSuccessResponseVendorsInner splitOrderReconSuccessResponseVendorsInner = (SplitOrderReconSuccessResponseVendorsInner) o;
    return Objects.equals(this.vendorId, splitOrderReconSuccessResponseVendorsInner.vendorId) &&
        Objects.equals(this.settlementId, splitOrderReconSuccessResponseVendorsInner.settlementId) &&
        Objects.equals(this.settlementAmount, splitOrderReconSuccessResponseVendorsInner.settlementAmount) &&
        Objects.equals(this.settlementEligibilityDate, splitOrderReconSuccessResponseVendorsInner.settlementEligibilityDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorId, settlementId, settlementAmount, settlementEligibilityDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitOrderReconSuccessResponseVendorsInner {\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    settlementId: ").append(toIndentedString(settlementId)).append("\n");
    sb.append("    settlementAmount: ").append(toIndentedString(settlementAmount)).append("\n");
    sb.append("    settlementEligibilityDate: ").append(toIndentedString(settlementEligibilityDate)).append("\n");
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
    openapiFields.add("vendor_id");
    openapiFields.add("settlement_id");
    openapiFields.add("settlement_amount");
    openapiFields.add("settlement_eligibility_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SplitOrderReconSuccessResponseVendorsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("vendor_id") != null && !jsonObj.get("vendor_id").isJsonNull()) && !jsonObj.get("vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_id").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SplitOrderReconSuccessResponseVendorsInner
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("vendor_id") != null && !jsonObj.get("vendor_id").isJsonNull()) && !jsonObj.get("vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_id").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SplitOrderReconSuccessResponseVendorsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SplitOrderReconSuccessResponseVendorsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SplitOrderReconSuccessResponseVendorsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SplitOrderReconSuccessResponseVendorsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SplitOrderReconSuccessResponseVendorsInner>() {
           @Override
           public void write(JsonWriter out, SplitOrderReconSuccessResponseVendorsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SplitOrderReconSuccessResponseVendorsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SplitOrderReconSuccessResponseVendorsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SplitOrderReconSuccessResponseVendorsInner
  * @throws IOException if the JSON string is invalid with respect to SplitOrderReconSuccessResponseVendorsInner
  */
  public static SplitOrderReconSuccessResponseVendorsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SplitOrderReconSuccessResponseVendorsInner.class);
  }

 /**
  * Convert an instance of SplitOrderReconSuccessResponseVendorsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

