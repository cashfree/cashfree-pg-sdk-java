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
import java.util.HashMap;
import java.util.Map;

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
 * SplitAfterPaymentRequestSplitInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T13:25:41.657534Z[Etc/UTC]")
public class SplitAfterPaymentRequestSplitInner {
  public static final String SERIALIZED_NAME_VENDOR_ID = "vendor_id";
  @SerializedName(SERIALIZED_NAME_VENDOR_ID)
  private String vendorId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private BigDecimal percentage;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = new HashMap<>();

  public SplitAfterPaymentRequestSplitInner() {
  }

  public SplitAfterPaymentRequestSplitInner vendorId(String vendorId) {
    
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Specify the merchant vendor ID to split the payment.
   * @return vendorId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Specify the merchant vendor ID to split the payment.")
  public String getVendorId() {
    return vendorId;
  }


  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }


  public SplitAfterPaymentRequestSplitInner amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Specify the amount to be split to the vendor.
   * @return amount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Specify the amount to be split to the vendor.")
  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public SplitAfterPaymentRequestSplitInner percentage(BigDecimal percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Specify the percentage of amount to be split.
   * @return percentage
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Specify the percentage of amount to be split.")
  public BigDecimal getPercentage() {
    return percentage;
  }


  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }


  public SplitAfterPaymentRequestSplitInner tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public SplitAfterPaymentRequestSplitInner putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Custom Tags in thr form of {\&quot;key\&quot;:\&quot;value\&quot;} which can be passed for an order. A maximum of 10 tags can be added
   * @return tags
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Custom Tags in thr form of {\"key\":\"value\"} which can be passed for an order. A maximum of 10 tags can be added")
  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
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
    SplitAfterPaymentRequestSplitInner splitAfterPaymentRequestSplitInner = (SplitAfterPaymentRequestSplitInner) o;
    return Objects.equals(this.vendorId, splitAfterPaymentRequestSplitInner.vendorId) &&
        Objects.equals(this.amount, splitAfterPaymentRequestSplitInner.amount) &&
        Objects.equals(this.percentage, splitAfterPaymentRequestSplitInner.percentage) &&
        Objects.equals(this.tags, splitAfterPaymentRequestSplitInner.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorId, amount, percentage, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitAfterPaymentRequestSplitInner {\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("vendor_id");
    openapiFields.add("amount");
    openapiFields.add("percentage");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SplitAfterPaymentRequestSplitInner
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
  * @throws IOException if the JSON Element is invalid with respect to SplitAfterPaymentRequestSplitInner
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
       if (!SplitAfterPaymentRequestSplitInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SplitAfterPaymentRequestSplitInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SplitAfterPaymentRequestSplitInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SplitAfterPaymentRequestSplitInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SplitAfterPaymentRequestSplitInner>() {
           @Override
           public void write(JsonWriter out, SplitAfterPaymentRequestSplitInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SplitAfterPaymentRequestSplitInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SplitAfterPaymentRequestSplitInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SplitAfterPaymentRequestSplitInner
  * @throws IOException if the JSON string is invalid with respect to SplitAfterPaymentRequestSplitInner
  */
  public static SplitAfterPaymentRequestSplitInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SplitAfterPaymentRequestSplitInner.class);
  }

 /**
  * Convert an instance of SplitAfterPaymentRequestSplitInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

