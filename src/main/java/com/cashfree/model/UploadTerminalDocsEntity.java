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
 * Upload the terminal documents.
 */
@Schema(description = "Upload the terminal documents.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T10:54:45.822625Z[Etc/UTC]")
public class UploadTerminalDocsEntity {
  public static final String SERIALIZED_NAME_CF_TERMINAL_ID = "cf_terminal_id";
  @SerializedName(SERIALIZED_NAME_CF_TERMINAL_ID)
  private Integer cfTerminalId;

  public static final String SERIALIZED_NAME_DOC_TYPE = "doc_type";
  @SerializedName(SERIALIZED_NAME_DOC_TYPE)
  private String docType;

  public static final String SERIALIZED_NAME_DOC_VALUE = "doc_value";
  @SerializedName(SERIALIZED_NAME_DOC_VALUE)
  private String docValue;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public UploadTerminalDocsEntity() {
  }

  public UploadTerminalDocsEntity cfTerminalId(Integer cfTerminalId) {
    
    this.cfTerminalId = cfTerminalId;
    return this;
  }

   /**
   * Get cfTerminalId
   * @return cfTerminalId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Integer getCfTerminalId() {
    return cfTerminalId;
  }


  public void setCfTerminalId(Integer cfTerminalId) {
    this.cfTerminalId = cfTerminalId;
  }


  public UploadTerminalDocsEntity docType(String docType) {
    
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


  public UploadTerminalDocsEntity docValue(String docValue) {
    
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


  public UploadTerminalDocsEntity status(String status) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadTerminalDocsEntity uploadTerminalDocsEntity = (UploadTerminalDocsEntity) o;
    return Objects.equals(this.cfTerminalId, uploadTerminalDocsEntity.cfTerminalId) &&
        Objects.equals(this.docType, uploadTerminalDocsEntity.docType) &&
        Objects.equals(this.docValue, uploadTerminalDocsEntity.docValue) &&
        Objects.equals(this.status, uploadTerminalDocsEntity.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfTerminalId, docType, docValue, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadTerminalDocsEntity {\n");
    sb.append("    cfTerminalId: ").append(toIndentedString(cfTerminalId)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    docValue: ").append(toIndentedString(docValue)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("cf_terminal_id");
    openapiFields.add("doc_type");
    openapiFields.add("doc_value");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UploadTerminalDocsEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("doc_type") != null && !jsonObj.get("doc_type").isJsonNull()) && !jsonObj.get("doc_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_type").toString()));
      }
      if ((jsonObj.get("doc_value") != null && !jsonObj.get("doc_value").isJsonNull()) && !jsonObj.get("doc_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_value").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UploadTerminalDocsEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("doc_type") != null && !jsonObj.get("doc_type").isJsonNull()) && !jsonObj.get("doc_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_type").toString()));
      }
      if ((jsonObj.get("doc_value") != null && !jsonObj.get("doc_value").isJsonNull()) && !jsonObj.get("doc_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_value").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadTerminalDocsEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadTerminalDocsEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadTerminalDocsEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadTerminalDocsEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadTerminalDocsEntity>() {
           @Override
           public void write(JsonWriter out, UploadTerminalDocsEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadTerminalDocsEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UploadTerminalDocsEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadTerminalDocsEntity
  * @throws IOException if the JSON string is invalid with respect to UploadTerminalDocsEntity
  */
  public static UploadTerminalDocsEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadTerminalDocsEntity.class);
  }

 /**
  * Convert an instance of UploadTerminalDocsEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

