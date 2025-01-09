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
 * EvidenceSubmittedToContestDispute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-09T12:52:07.742309Z[Etc/UTC]")
public class EvidenceSubmittedToContestDispute {
  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private Integer documentId;

  public static final String SERIALIZED_NAME_DOCUMENT_NAME = "documentName";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NAME)
  private String documentName;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "downloadUrl";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl;

  public EvidenceSubmittedToContestDispute() {
  }

  public EvidenceSubmittedToContestDispute documentId(Integer documentId) {
    
    this.documentId = documentId;
    return this;
  }

   /**
   * Get documentId
   * @return documentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Integer getDocumentId() {
    return documentId;
  }


  public void setDocumentId(Integer documentId) {
    this.documentId = documentId;
  }


  public EvidenceSubmittedToContestDispute documentName(String documentName) {
    
    this.documentName = documentName;
    return this;
  }

   /**
   * Get documentName
   * @return documentName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getDocumentName() {
    return documentName;
  }


  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }


  public EvidenceSubmittedToContestDispute documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getDocumentType() {
    return documentType;
  }


  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public EvidenceSubmittedToContestDispute downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvidenceSubmittedToContestDispute evidenceSubmittedToContestDispute = (EvidenceSubmittedToContestDispute) o;
    return Objects.equals(this.documentId, evidenceSubmittedToContestDispute.documentId) &&
        Objects.equals(this.documentName, evidenceSubmittedToContestDispute.documentName) &&
        Objects.equals(this.documentType, evidenceSubmittedToContestDispute.documentType) &&
        Objects.equals(this.downloadUrl, evidenceSubmittedToContestDispute.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, documentName, documentType, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidenceSubmittedToContestDispute {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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
    openapiFields.add("documentId");
    openapiFields.add("documentName");
    openapiFields.add("documentType");
    openapiFields.add("downloadUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EvidenceSubmittedToContestDispute
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("documentName") != null && !jsonObj.get("documentName").isJsonNull()) && !jsonObj.get("documentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentName").toString()));
      }
      if ((jsonObj.get("documentType") != null && !jsonObj.get("documentType").isJsonNull()) && !jsonObj.get("documentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentType").toString()));
      }
      if ((jsonObj.get("downloadUrl") != null && !jsonObj.get("downloadUrl").isJsonNull()) && !jsonObj.get("downloadUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `downloadUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("downloadUrl").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EvidenceSubmittedToContestDispute
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("documentName") != null && !jsonObj.get("documentName").isJsonNull()) && !jsonObj.get("documentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentName").toString()));
      }
      if ((jsonObj.get("documentType") != null && !jsonObj.get("documentType").isJsonNull()) && !jsonObj.get("documentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentType").toString()));
      }
      if ((jsonObj.get("downloadUrl") != null && !jsonObj.get("downloadUrl").isJsonNull()) && !jsonObj.get("downloadUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `downloadUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("downloadUrl").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EvidenceSubmittedToContestDispute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EvidenceSubmittedToContestDispute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EvidenceSubmittedToContestDispute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EvidenceSubmittedToContestDispute.class));

       return (TypeAdapter<T>) new TypeAdapter<EvidenceSubmittedToContestDispute>() {
           @Override
           public void write(JsonWriter out, EvidenceSubmittedToContestDispute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EvidenceSubmittedToContestDispute read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EvidenceSubmittedToContestDispute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EvidenceSubmittedToContestDispute
  * @throws IOException if the JSON string is invalid with respect to EvidenceSubmittedToContestDispute
  */
  public static EvidenceSubmittedToContestDispute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EvidenceSubmittedToContestDispute.class);
  }

 /**
  * Convert an instance of EvidenceSubmittedToContestDispute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

