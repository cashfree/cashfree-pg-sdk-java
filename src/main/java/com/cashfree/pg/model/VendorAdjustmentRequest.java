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
 * Vendor Adjustment Request Body
 */
@Schema(description = "Vendor Adjustment Request Body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class VendorAdjustmentRequest {
  public static final String SERIALIZED_NAME_VENDOR_ID = "vendor_id";
  @SerializedName(SERIALIZED_NAME_VENDOR_ID)
  private String vendorId;

  public static final String SERIALIZED_NAME_ADJUSTMENT_ID = "adjustment_id";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_ID)
  private Long adjustmentId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_REMARKS = "remarks";
  @SerializedName(SERIALIZED_NAME_REMARKS)
  private String remarks;

  public VendorAdjustmentRequest() {
  }

  public VendorAdjustmentRequest vendorId(String vendorId) {
    
    this.vendorId = vendorId;
    return this;
  }

   /**
   * The unique identifier of the vendor to whom the adjustment is applied
   * @return vendorId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "The unique identifier of the vendor to whom the adjustment is applied")
  public String getVendorId() {
    return vendorId;
  }


  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }


  public VendorAdjustmentRequest adjustmentId(Long adjustmentId) {
    
    this.adjustmentId = adjustmentId;
    return this;
  }

   /**
   * The unique identifier for the adjustment transaction.
   * @return adjustmentId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "The unique identifier for the adjustment transaction.")
  public Long getAdjustmentId() {
    return adjustmentId;
  }


  public void setAdjustmentId(Long adjustmentId) {
    this.adjustmentId = adjustmentId;
  }


  public VendorAdjustmentRequest amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The adjustment amount to be applied.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "The adjustment amount to be applied.")
  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public VendorAdjustmentRequest type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of adjustment. Possible values: CREDIT, DEBIT.
   * @return type
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "The type of adjustment. Possible values: CREDIT, DEBIT.")
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public VendorAdjustmentRequest remarks(String remarks) {
    
    this.remarks = remarks;
    return this;
  }

   /**
   * Remarks for the adjustment transaction, if any.
   * @return remarks
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Remarks for the adjustment transaction, if any.")
  public String getRemarks() {
    return remarks;
  }


  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorAdjustmentRequest vendorAdjustmentRequest = (VendorAdjustmentRequest) o;
    return Objects.equals(this.vendorId, vendorAdjustmentRequest.vendorId) &&
        Objects.equals(this.adjustmentId, vendorAdjustmentRequest.adjustmentId) &&
        Objects.equals(this.amount, vendorAdjustmentRequest.amount) &&
        Objects.equals(this.type, vendorAdjustmentRequest.type) &&
        Objects.equals(this.remarks, vendorAdjustmentRequest.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorId, adjustmentId, amount, type, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorAdjustmentRequest {\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    adjustmentId: ").append(toIndentedString(adjustmentId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
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
    openapiFields.add("adjustment_id");
    openapiFields.add("amount");
    openapiFields.add("type");
    openapiFields.add("remarks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vendor_id");
    openapiRequiredFields.add("adjustment_id");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VendorAdjustmentRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VendorAdjustmentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("remarks") != null && !jsonObj.get("remarks").isJsonNull()) && !jsonObj.get("remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remarks").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VendorAdjustmentRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VendorAdjustmentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("remarks") != null && !jsonObj.get("remarks").isJsonNull()) && !jsonObj.get("remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remarks").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VendorAdjustmentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VendorAdjustmentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VendorAdjustmentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VendorAdjustmentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<VendorAdjustmentRequest>() {
           @Override
           public void write(JsonWriter out, VendorAdjustmentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VendorAdjustmentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VendorAdjustmentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VendorAdjustmentRequest
  * @throws IOException if the JSON string is invalid with respect to VendorAdjustmentRequest
  */
  public static VendorAdjustmentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VendorAdjustmentRequest.class);
  }

 /**
  * Convert an instance of VendorAdjustmentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

