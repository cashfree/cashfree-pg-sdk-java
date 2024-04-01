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
 * Request body to upload terminal documents.
 */
@Schema(description = "Request body to upload terminal documents.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T10:13:36.975496Z[Etc/UTC]")
public class UploadTerminalDocs {
  public static final String SERIALIZED_NAME_DOC_TYPE = "doc_type";
  @SerializedName(SERIALIZED_NAME_DOC_TYPE)
  private String docType;

  public static final String SERIALIZED_NAME_DOC_VALUE = "doc_value";
  @SerializedName(SERIALIZED_NAME_DOC_VALUE)
  private String docValue;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String _file;

  public UploadTerminalDocs() {
  }

  public UploadTerminalDocs docType(String docType) {
    
    this.docType = docType;
    return this;
  }

   /**
   * Mention the document type you are uploading. Possible values - ADDRESSPROOF, PHOTOGRAPH.
   * @return docType
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Mention the document type you are uploading. Possible values - ADDRESSPROOF, PHOTOGRAPH.")
  public String getDocType() {
    return docType;
  }


  public void setDocType(String docType) {
    this.docType = docType;
  }


  public UploadTerminalDocs docValue(String docValue) {
    
    this.docValue = docValue;
    return this;
  }

   /**
   * Enter the display name of the uploaded file.
   * @return docValue
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Enter the display name of the uploaded file.")
  public String getDocValue() {
    return docValue;
  }


  public void setDocValue(String docValue) {
    this.docValue = docValue;
  }


  public UploadTerminalDocs _file(String _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * Select the document that should be uploaded or provide the path of that file. You cannot upload a file that is more than 2MB in size.
   * @return _file
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Select the document that should be uploaded or provide the path of that file. You cannot upload a file that is more than 2MB in size.")
  public String getFile() {
    return _file;
  }


  public void setFile(String _file) {
    this._file = _file;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadTerminalDocs uploadTerminalDocs = (UploadTerminalDocs) o;
    return Objects.equals(this.docType, uploadTerminalDocs.docType) &&
        Objects.equals(this.docValue, uploadTerminalDocs.docValue) &&
        Objects.equals(this._file, uploadTerminalDocs._file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docType, docValue, _file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadTerminalDocs {\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    docValue: ").append(toIndentedString(docValue)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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
    openapiFields.add("doc_type");
    openapiFields.add("doc_value");
    openapiFields.add("file");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("doc_type");
    openapiRequiredFields.add("doc_value");
    openapiRequiredFields.add("file");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UploadTerminalDocs
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UploadTerminalDocs.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("doc_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_type").toString()));
      }
      if (!jsonObj.get("doc_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_value").toString()));
      }
      if (!jsonObj.get("file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UploadTerminalDocs
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UploadTerminalDocs.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("doc_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_type").toString()));
      }
      if (!jsonObj.get("doc_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_value").toString()));
      }
      if (!jsonObj.get("file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadTerminalDocs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadTerminalDocs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadTerminalDocs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadTerminalDocs.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadTerminalDocs>() {
           @Override
           public void write(JsonWriter out, UploadTerminalDocs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadTerminalDocs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UploadTerminalDocs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadTerminalDocs
  * @throws IOException if the JSON string is invalid with respect to UploadTerminalDocs
  */
  public static UploadTerminalDocs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadTerminalDocs.class);
  }

 /**
  * Convert an instance of UploadTerminalDocs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

