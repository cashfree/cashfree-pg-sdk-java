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
import com.cashfree.model.TransferDetailsTagsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
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
 * TransferDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-09T12:52:07.742309Z[Etc/UTC]")
public class TransferDetails {
  public static final String SERIALIZED_NAME_VENDOR_ID = "vendor_id";
  @SerializedName(SERIALIZED_NAME_VENDOR_ID)
  private String vendorId;

  public static final String SERIALIZED_NAME_TRANSFER_FROM = "transfer_from";
  @SerializedName(SERIALIZED_NAME_TRANSFER_FROM)
  private String transferFrom;

  public static final String SERIALIZED_NAME_TRANSFER_TYPE = "transfer_type";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TYPE)
  private String transferType;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transfer_amount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private BigDecimal transferAmount;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<TransferDetailsTagsInner> tags;

  public TransferDetails() {
  }

  public TransferDetails vendorId(String vendorId) {
    
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


  public TransferDetails transferFrom(String transferFrom) {
    
    this.transferFrom = transferFrom;
    return this;
  }

   /**
   * Get transferFrom
   * @return transferFrom
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTransferFrom() {
    return transferFrom;
  }


  public void setTransferFrom(String transferFrom) {
    this.transferFrom = transferFrom;
  }


  public TransferDetails transferType(String transferType) {
    
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTransferType() {
    return transferType;
  }


  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }


  public TransferDetails transferAmount(BigDecimal transferAmount) {
    
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * Get transferAmount
   * @return transferAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getTransferAmount() {
    return transferAmount;
  }


  public void setTransferAmount(BigDecimal transferAmount) {
    this.transferAmount = transferAmount;
  }


  public TransferDetails remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public TransferDetails tags(List<TransferDetailsTagsInner> tags) {
    
    this.tags = tags;
    return this;
  }

  public TransferDetails addTagsItem(TransferDetailsTagsInner tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<TransferDetailsTagsInner> getTags() {
    return tags;
  }


  public void setTags(List<TransferDetailsTagsInner> tags) {
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
    TransferDetails transferDetails = (TransferDetails) o;
    return Objects.equals(this.vendorId, transferDetails.vendorId) &&
        Objects.equals(this.transferFrom, transferDetails.transferFrom) &&
        Objects.equals(this.transferType, transferDetails.transferType) &&
        Objects.equals(this.transferAmount, transferDetails.transferAmount) &&
        Objects.equals(this.remark, transferDetails.remark) &&
        Objects.equals(this.tags, transferDetails.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorId, transferFrom, transferType, transferAmount, remark, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferDetails {\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    transferFrom: ").append(toIndentedString(transferFrom)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
    openapiFields.add("transfer_from");
    openapiFields.add("transfer_type");
    openapiFields.add("transfer_amount");
    openapiFields.add("remark");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransferDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("vendor_id") != null && !jsonObj.get("vendor_id").isJsonNull()) && !jsonObj.get("vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_id").toString()));
      }
      if ((jsonObj.get("transfer_from") != null && !jsonObj.get("transfer_from").isJsonNull()) && !jsonObj.get("transfer_from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_from").toString()));
      }
      if ((jsonObj.get("transfer_type") != null && !jsonObj.get("transfer_type").isJsonNull()) && !jsonObj.get("transfer_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_type").toString()));
      }
      if ((jsonObj.get("remark") != null && !jsonObj.get("remark").isJsonNull()) && !jsonObj.get("remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remark").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            TransferDetailsTagsInner.validateJsonElement(jsonArraytags.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransferDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("vendor_id") != null && !jsonObj.get("vendor_id").isJsonNull()) && !jsonObj.get("vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_id").toString()));
      }
      if ((jsonObj.get("transfer_from") != null && !jsonObj.get("transfer_from").isJsonNull()) && !jsonObj.get("transfer_from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_from").toString()));
      }
      if ((jsonObj.get("transfer_type") != null && !jsonObj.get("transfer_type").isJsonNull()) && !jsonObj.get("transfer_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_type").toString()));
      }
      if ((jsonObj.get("remark") != null && !jsonObj.get("remark").isJsonNull()) && !jsonObj.get("remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remark").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            TransferDetailsTagsInner.validateJsonElement(jsonArraytags.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferDetails>() {
           @Override
           public void write(JsonWriter out, TransferDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransferDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransferDetails
  * @throws IOException if the JSON string is invalid with respect to TransferDetails
  */
  public static TransferDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferDetails.class);
  }

 /**
  * Convert an instance of TransferDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

