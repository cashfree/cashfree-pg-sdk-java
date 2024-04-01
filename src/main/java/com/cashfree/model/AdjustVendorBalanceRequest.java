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
 * Adjust Vendor Balance Request
 */
@Schema(description = "Adjust Vendor Balance Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T10:13:36.975496Z[Etc/UTC]")
public class AdjustVendorBalanceRequest {
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
  private Object tags;

  public AdjustVendorBalanceRequest() {
  }

  public AdjustVendorBalanceRequest transferFrom(String transferFrom) {
    
    this.transferFrom = transferFrom;
    return this;
  }

   /**
   * Mention to whom you want to transfer the on demand balance. Possible values - MERCHANT, VENDOR.
   * @return transferFrom
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Mention to whom you want to transfer the on demand balance. Possible values - MERCHANT, VENDOR.")
  public String getTransferFrom() {
    return transferFrom;
  }


  public void setTransferFrom(String transferFrom) {
    this.transferFrom = transferFrom;
  }


  public AdjustVendorBalanceRequest transferType(String transferType) {
    
    this.transferType = transferType;
    return this;
  }

   /**
   * Mention the type of transfer. Possible values: ON_DEMAND.
   * @return transferType
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Mention the type of transfer. Possible values: ON_DEMAND.")
  public String getTransferType() {
    return transferType;
  }


  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }


  public AdjustVendorBalanceRequest transferAmount(BigDecimal transferAmount) {
    
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * Mention the on demand transfer amount.
   * @return transferAmount
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Mention the on demand transfer amount.")
  public BigDecimal getTransferAmount() {
    return transferAmount;
  }


  public void setTransferAmount(BigDecimal transferAmount) {
    this.transferAmount = transferAmount;
  }


  public AdjustVendorBalanceRequest remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * Mention remarks if any for the on demand transfer.
   * @return remark
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Mention remarks if any for the on demand transfer.")
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public AdjustVendorBalanceRequest tags(Object tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Provide additional data fields using tags.
   * @return tags
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Provide additional data fields using tags.")
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
    AdjustVendorBalanceRequest adjustVendorBalanceRequest = (AdjustVendorBalanceRequest) o;
    return Objects.equals(this.transferFrom, adjustVendorBalanceRequest.transferFrom) &&
        Objects.equals(this.transferType, adjustVendorBalanceRequest.transferType) &&
        Objects.equals(this.transferAmount, adjustVendorBalanceRequest.transferAmount) &&
        Objects.equals(this.remark, adjustVendorBalanceRequest.remark) &&
        Objects.equals(this.tags, adjustVendorBalanceRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferFrom, transferType, transferAmount, remark, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustVendorBalanceRequest {\n");
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
    openapiFields.add("transfer_from");
    openapiFields.add("transfer_type");
    openapiFields.add("transfer_amount");
    openapiFields.add("remark");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("transfer_from");
    openapiRequiredFields.add("transfer_type");
    openapiRequiredFields.add("transfer_amount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdjustVendorBalanceRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdjustVendorBalanceRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("transfer_from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_from").toString()));
      }
      if (!jsonObj.get("transfer_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_type").toString()));
      }
      if ((jsonObj.get("remark") != null && !jsonObj.get("remark").isJsonNull()) && !jsonObj.get("remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remark").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdjustVendorBalanceRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdjustVendorBalanceRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("transfer_from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_from").toString()));
      }
      if (!jsonObj.get("transfer_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_type").toString()));
      }
      if ((jsonObj.get("remark") != null && !jsonObj.get("remark").isJsonNull()) && !jsonObj.get("remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remark").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdjustVendorBalanceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdjustVendorBalanceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdjustVendorBalanceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdjustVendorBalanceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AdjustVendorBalanceRequest>() {
           @Override
           public void write(JsonWriter out, AdjustVendorBalanceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdjustVendorBalanceRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdjustVendorBalanceRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdjustVendorBalanceRequest
  * @throws IOException if the JSON string is invalid with respect to AdjustVendorBalanceRequest
  */
  public static AdjustVendorBalanceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdjustVendorBalanceRequest.class);
  }

 /**
  * Convert an instance of AdjustVendorBalanceRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
