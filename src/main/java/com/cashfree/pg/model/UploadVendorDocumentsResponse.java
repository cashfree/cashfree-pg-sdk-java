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
 * Upload Vendor Document
 */
@Schema(description = "Upload Vendor Document")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T14:00:34.323462Z[Etc/UTC]")
public class UploadVendorDocumentsResponse {
  public static final String SERIALIZED_NAME_VENDOR_ID = "vendor_id";
  @SerializedName(SERIALIZED_NAME_VENDOR_ID)
  private String vendorId;

  public static final String SERIALIZED_NAME_DOC_TYPE = "doc_type";
  @SerializedName(SERIALIZED_NAME_DOC_TYPE)
  private String docType;

  public static final String SERIALIZED_NAME_DOC_VALUE = "doc_value";
  @SerializedName(SERIALIZED_NAME_DOC_VALUE)
  private String docValue;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_REMARKS = "remarks";
  @SerializedName(SERIALIZED_NAME_REMARKS)
  private String remarks;

  public UploadVendorDocumentsResponse() {
  }

  public UploadVendorDocumentsResponse vendorId(String vendorId) {
    
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


  public UploadVendorDocumentsResponse docType(String docType) {
    
    this.docType = docType;
    return this;
  }

   /**
   * Get docType
   * @return docType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getDocType() {
    return docType;
  }


  public void setDocType(String docType) {
    this.docType = docType;
  }


  public UploadVendorDocumentsResponse docValue(String docValue) {
    
    this.docValue = docValue;
    return this;
  }

   /**
   * Get docValue
   * @return docValue
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getDocValue() {
    return docValue;
  }


  public void setDocValue(String docValue) {
    this.docValue = docValue;
  }


  public UploadVendorDocumentsResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public UploadVendorDocumentsResponse remarks(String remarks) {
    
    this.remarks = remarks;
    return this;
  }

   /**
   * Get remarks
   * @return remarks
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
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
    UploadVendorDocumentsResponse uploadVendorDocumentsResponse = (UploadVendorDocumentsResponse) o;
    return Objects.equals(this.vendorId, uploadVendorDocumentsResponse.vendorId) &&
        Objects.equals(this.docType, uploadVendorDocumentsResponse.docType) &&
        Objects.equals(this.docValue, uploadVendorDocumentsResponse.docValue) &&
        Objects.equals(this.status, uploadVendorDocumentsResponse.status) &&
        Objects.equals(this.remarks, uploadVendorDocumentsResponse.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorId, docType, docValue, status, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadVendorDocumentsResponse {\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    docValue: ").append(toIndentedString(docValue)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("doc_type");
    openapiFields.add("doc_value");
    openapiFields.add("status");
    openapiFields.add("remarks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UploadVendorDocumentsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("vendor_id") != null && !jsonObj.get("vendor_id").isJsonNull()) && !jsonObj.get("vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_id").toString()));
      }
      if ((jsonObj.get("doc_type") != null && !jsonObj.get("doc_type").isJsonNull()) && !jsonObj.get("doc_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_type").toString()));
      }
      if ((jsonObj.get("doc_value") != null && !jsonObj.get("doc_value").isJsonNull()) && !jsonObj.get("doc_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_value").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("remarks") != null && !jsonObj.get("remarks").isJsonNull()) && !jsonObj.get("remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remarks").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UploadVendorDocumentsResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("vendor_id") != null && !jsonObj.get("vendor_id").isJsonNull()) && !jsonObj.get("vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_id").toString()));
      }
      if ((jsonObj.get("doc_type") != null && !jsonObj.get("doc_type").isJsonNull()) && !jsonObj.get("doc_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_type").toString()));
      }
      if ((jsonObj.get("doc_value") != null && !jsonObj.get("doc_value").isJsonNull()) && !jsonObj.get("doc_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_value").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
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
       if (!UploadVendorDocumentsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadVendorDocumentsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadVendorDocumentsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadVendorDocumentsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadVendorDocumentsResponse>() {
           @Override
           public void write(JsonWriter out, UploadVendorDocumentsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadVendorDocumentsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UploadVendorDocumentsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadVendorDocumentsResponse
  * @throws IOException if the JSON string is invalid with respect to UploadVendorDocumentsResponse
  */
  public static UploadVendorDocumentsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadVendorDocumentsResponse.class);
  }

 /**
  * Convert an instance of UploadVendorDocumentsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

