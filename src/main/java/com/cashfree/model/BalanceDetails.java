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
 * BalanceDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T10:13:36.975496Z[Etc/UTC]")
public class BalanceDetails {
  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private BigDecimal merchantId;

  public static final String SERIALIZED_NAME_VENDOR_ID = "vendor_id";
  @SerializedName(SERIALIZED_NAME_VENDOR_ID)
  private String vendorId;

  public static final String SERIALIZED_NAME_MERCHANT_UNSETTLED = "merchant_unsettled";
  @SerializedName(SERIALIZED_NAME_MERCHANT_UNSETTLED)
  private BigDecimal merchantUnsettled;

  public static final String SERIALIZED_NAME_VENDOR_UNSETTLED = "vendor_unsettled";
  @SerializedName(SERIALIZED_NAME_VENDOR_UNSETTLED)
  private BigDecimal vendorUnsettled;

  public BalanceDetails() {
  }

  public BalanceDetails merchantId(BigDecimal merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(BigDecimal merchantId) {
    this.merchantId = merchantId;
  }


  public BalanceDetails vendorId(String vendorId) {
    
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Get vendorId
   * @return vendorId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getVendorId() {
    return vendorId;
  }


  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }


  public BalanceDetails merchantUnsettled(BigDecimal merchantUnsettled) {
    
    this.merchantUnsettled = merchantUnsettled;
    return this;
  }

   /**
   * Get merchantUnsettled
   * @return merchantUnsettled
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getMerchantUnsettled() {
    return merchantUnsettled;
  }


  public void setMerchantUnsettled(BigDecimal merchantUnsettled) {
    this.merchantUnsettled = merchantUnsettled;
  }


  public BalanceDetails vendorUnsettled(BigDecimal vendorUnsettled) {
    
    this.vendorUnsettled = vendorUnsettled;
    return this;
  }

   /**
   * Get vendorUnsettled
   * @return vendorUnsettled
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getVendorUnsettled() {
    return vendorUnsettled;
  }


  public void setVendorUnsettled(BigDecimal vendorUnsettled) {
    this.vendorUnsettled = vendorUnsettled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceDetails balanceDetails = (BalanceDetails) o;
    return Objects.equals(this.merchantId, balanceDetails.merchantId) &&
        Objects.equals(this.vendorId, balanceDetails.vendorId) &&
        Objects.equals(this.merchantUnsettled, balanceDetails.merchantUnsettled) &&
        Objects.equals(this.vendorUnsettled, balanceDetails.vendorUnsettled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, vendorId, merchantUnsettled, vendorUnsettled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceDetails {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    merchantUnsettled: ").append(toIndentedString(merchantUnsettled)).append("\n");
    sb.append("    vendorUnsettled: ").append(toIndentedString(vendorUnsettled)).append("\n");
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
    openapiFields.add("merchant_id");
    openapiFields.add("vendor_id");
    openapiFields.add("merchant_unsettled");
    openapiFields.add("vendor_unsettled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BalanceDetails
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
  * @throws IOException if the JSON Element is invalid with respect to BalanceDetails
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
       if (!BalanceDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BalanceDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BalanceDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BalanceDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<BalanceDetails>() {
           @Override
           public void write(JsonWriter out, BalanceDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BalanceDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BalanceDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BalanceDetails
  * @throws IOException if the JSON string is invalid with respect to BalanceDetails
  */
  public static BalanceDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BalanceDetails.class);
  }

 /**
  * Convert an instance of BalanceDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
