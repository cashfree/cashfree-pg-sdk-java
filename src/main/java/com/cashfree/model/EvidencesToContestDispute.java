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
 * EvidencesToContestDispute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-09T12:02:51.543385Z[Etc/UTC]")
public class EvidencesToContestDispute {
  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "document_type";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_DOCUMENT_DESCRIPTION = "document_description";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_DESCRIPTION)
  private String documentDescription;

  public EvidencesToContestDispute() {
  }

  public EvidencesToContestDispute documentType(String documentType) {
    
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


  public EvidencesToContestDispute documentDescription(String documentDescription) {
    
    this.documentDescription = documentDescription;
    return this;
  }

   /**
   * Get documentDescription
   * @return documentDescription
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getDocumentDescription() {
    return documentDescription;
  }


  public void setDocumentDescription(String documentDescription) {
    this.documentDescription = documentDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvidencesToContestDispute evidencesToContestDispute = (EvidencesToContestDispute) o;
    return Objects.equals(this.documentType, evidencesToContestDispute.documentType) &&
        Objects.equals(this.documentDescription, evidencesToContestDispute.documentDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentType, documentDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidencesToContestDispute {\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentDescription: ").append(toIndentedString(documentDescription)).append("\n");
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
    openapiFields.add("document_type");
    openapiFields.add("document_description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EvidencesToContestDispute
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("document_type") != null && !jsonObj.get("document_type").isJsonNull()) && !jsonObj.get("document_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_type").toString()));
      }
      if ((jsonObj.get("document_description") != null && !jsonObj.get("document_description").isJsonNull()) && !jsonObj.get("document_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_description").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EvidencesToContestDispute
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("document_type") != null && !jsonObj.get("document_type").isJsonNull()) && !jsonObj.get("document_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_type").toString()));
      }
      if ((jsonObj.get("document_description") != null && !jsonObj.get("document_description").isJsonNull()) && !jsonObj.get("document_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_description").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EvidencesToContestDispute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EvidencesToContestDispute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EvidencesToContestDispute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EvidencesToContestDispute.class));

       return (TypeAdapter<T>) new TypeAdapter<EvidencesToContestDispute>() {
           @Override
           public void write(JsonWriter out, EvidencesToContestDispute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EvidencesToContestDispute read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EvidencesToContestDispute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EvidencesToContestDispute
  * @throws IOException if the JSON string is invalid with respect to EvidencesToContestDispute
  */
  public static EvidencesToContestDispute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EvidencesToContestDispute.class);
  }

 /**
  * Convert an instance of EvidencesToContestDispute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

