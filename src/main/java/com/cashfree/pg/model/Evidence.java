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
 * Evidence
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T09:38:52.601894Z[Etc/UTC]")
public class Evidence {
  public static final String SERIALIZED_NAME_DOCUMENT_ID = "document_id";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private Integer documentId;

  public static final String SERIALIZED_NAME_DOCUMENT_NAME = "document_name";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NAME)
  private String documentName;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "document_type";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public Evidence() {
  }

  public Evidence documentId(Integer documentId) {
    
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


  public Evidence documentName(String documentName) {
    
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


  public Evidence documentType(String documentType) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evidence evidence = (Evidence) o;
    return Objects.equals(this.documentId, evidence.documentId) &&
        Objects.equals(this.documentName, evidence.documentName) &&
        Objects.equals(this.documentType, evidence.documentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, documentName, documentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evidence {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
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
    openapiFields.add("document_id");
    openapiFields.add("document_name");
    openapiFields.add("document_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Evidence
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("document_name") != null && !jsonObj.get("document_name").isJsonNull()) && !jsonObj.get("document_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_name").toString()));
      }
      if ((jsonObj.get("document_type") != null && !jsonObj.get("document_type").isJsonNull()) && !jsonObj.get("document_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_type").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Evidence
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("document_name") != null && !jsonObj.get("document_name").isJsonNull()) && !jsonObj.get("document_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_name").toString()));
      }
      if ((jsonObj.get("document_type") != null && !jsonObj.get("document_type").isJsonNull()) && !jsonObj.get("document_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_type").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Evidence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Evidence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Evidence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Evidence.class));

       return (TypeAdapter<T>) new TypeAdapter<Evidence>() {
           @Override
           public void write(JsonWriter out, Evidence value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Evidence read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Evidence given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Evidence
  * @throws IOException if the JSON string is invalid with respect to Evidence
  */
  public static Evidence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Evidence.class);
  }

 /**
  * Convert an instance of Evidence to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

