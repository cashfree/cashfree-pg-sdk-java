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

import com.cashfree.pg.JSON;

/**
 * ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner {
  public static final String SERIALIZED_NAME_MERCHANT_VENDOR_ID = "merchant_vendor_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_VENDOR_ID)
  private String merchantVendorId;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private BigDecimal percentage;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner() {
  }

  public ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner merchantVendorId(String merchantVendorId) {
    
    this.merchantVendorId = merchantVendorId;
    return this;
  }

   /**
   * Get merchantVendorId
   * @return merchantVendorId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getMerchantVendorId() {
    return merchantVendorId;
  }


  public void setMerchantVendorId(String merchantVendorId) {
    this.merchantVendorId = merchantVendorId;
  }


  public ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner percentage(BigDecimal percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getPercentage() {
    return percentage;
  }


  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }


  public ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner tags(Object tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Object getTags() {
    return tags;
  }


  public void setTags(Object tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner esOrderReconResponseDataInnerOrderSplitsInnerSplitInner = (ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner) o;
    return Objects.equals(this.merchantVendorId, esOrderReconResponseDataInnerOrderSplitsInnerSplitInner.merchantVendorId) &&
        Objects.equals(this.percentage, esOrderReconResponseDataInnerOrderSplitsInnerSplitInner.percentage) &&
        Objects.equals(this.tags, esOrderReconResponseDataInnerOrderSplitsInnerSplitInner.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantVendorId, percentage, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner {\n");
    sb.append("    merchantVendorId: ").append(toIndentedString(merchantVendorId)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("merchant_vendor_id");
    openapiFields.add("percentage");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("merchant_vendor_id") != null && !jsonObj.get("merchant_vendor_id").isJsonNull()) && !jsonObj.get("merchant_vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_vendor_id").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("merchant_vendor_id") != null && !jsonObj.get("merchant_vendor_id").isJsonNull()) && !jsonObj.get("merchant_vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_vendor_id").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner>() {
           @Override
           public void write(JsonWriter out, ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner
  * @throws IOException if the JSON string is invalid with respect to ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner
  */
  public static ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner.class);
  }

 /**
  * Convert an instance of ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

