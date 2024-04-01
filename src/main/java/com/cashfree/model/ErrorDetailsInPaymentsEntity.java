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
 * The error details are present only for failed payments
 */
@Schema(description = "The error details are present only for failed payments")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T10:13:36.975496Z[Etc/UTC]")
public class ErrorDetailsInPaymentsEntity {
  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_DESCRIPTION = "error_description";
  @SerializedName(SERIALIZED_NAME_ERROR_DESCRIPTION)
  private String errorDescription;

  public static final String SERIALIZED_NAME_ERROR_REASON = "error_reason";
  @SerializedName(SERIALIZED_NAME_ERROR_REASON)
  private String errorReason;

  public static final String SERIALIZED_NAME_ERROR_SOURCE = "error_source";
  @SerializedName(SERIALIZED_NAME_ERROR_SOURCE)
  private String errorSource;

  public static final String SERIALIZED_NAME_ERROR_CODE_RAW = "error_code_raw";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE_RAW)
  private String errorCodeRaw;

  public static final String SERIALIZED_NAME_ERROR_DESCRIPTION_RAW = "error_description_raw";
  @SerializedName(SERIALIZED_NAME_ERROR_DESCRIPTION_RAW)
  private String errorDescriptionRaw;

  public static final String SERIALIZED_NAME_ERROR_SUBCODE_RAW = "error_subcode_raw";
  @SerializedName(SERIALIZED_NAME_ERROR_SUBCODE_RAW)
  private String errorSubcodeRaw;

  public ErrorDetailsInPaymentsEntity() {
  }

  public ErrorDetailsInPaymentsEntity errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public ErrorDetailsInPaymentsEntity errorDescription(String errorDescription) {
    
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Get errorDescription
   * @return errorDescription
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getErrorDescription() {
    return errorDescription;
  }


  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  public ErrorDetailsInPaymentsEntity errorReason(String errorReason) {
    
    this.errorReason = errorReason;
    return this;
  }

   /**
   * Get errorReason
   * @return errorReason
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getErrorReason() {
    return errorReason;
  }


  public void setErrorReason(String errorReason) {
    this.errorReason = errorReason;
  }


  public ErrorDetailsInPaymentsEntity errorSource(String errorSource) {
    
    this.errorSource = errorSource;
    return this;
  }

   /**
   * Get errorSource
   * @return errorSource
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getErrorSource() {
    return errorSource;
  }


  public void setErrorSource(String errorSource) {
    this.errorSource = errorSource;
  }


  public ErrorDetailsInPaymentsEntity errorCodeRaw(String errorCodeRaw) {
    
    this.errorCodeRaw = errorCodeRaw;
    return this;
  }

   /**
   * Get errorCodeRaw
   * @return errorCodeRaw
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getErrorCodeRaw() {
    return errorCodeRaw;
  }


  public void setErrorCodeRaw(String errorCodeRaw) {
    this.errorCodeRaw = errorCodeRaw;
  }


  public ErrorDetailsInPaymentsEntity errorDescriptionRaw(String errorDescriptionRaw) {
    
    this.errorDescriptionRaw = errorDescriptionRaw;
    return this;
  }

   /**
   * Get errorDescriptionRaw
   * @return errorDescriptionRaw
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getErrorDescriptionRaw() {
    return errorDescriptionRaw;
  }


  public void setErrorDescriptionRaw(String errorDescriptionRaw) {
    this.errorDescriptionRaw = errorDescriptionRaw;
  }


  public ErrorDetailsInPaymentsEntity errorSubcodeRaw(String errorSubcodeRaw) {
    
    this.errorSubcodeRaw = errorSubcodeRaw;
    return this;
  }

   /**
   * Get errorSubcodeRaw
   * @return errorSubcodeRaw
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getErrorSubcodeRaw() {
    return errorSubcodeRaw;
  }


  public void setErrorSubcodeRaw(String errorSubcodeRaw) {
    this.errorSubcodeRaw = errorSubcodeRaw;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetailsInPaymentsEntity errorDetailsInPaymentsEntity = (ErrorDetailsInPaymentsEntity) o;
    return Objects.equals(this.errorCode, errorDetailsInPaymentsEntity.errorCode) &&
        Objects.equals(this.errorDescription, errorDetailsInPaymentsEntity.errorDescription) &&
        Objects.equals(this.errorReason, errorDetailsInPaymentsEntity.errorReason) &&
        Objects.equals(this.errorSource, errorDetailsInPaymentsEntity.errorSource) &&
        Objects.equals(this.errorCodeRaw, errorDetailsInPaymentsEntity.errorCodeRaw) &&
        Objects.equals(this.errorDescriptionRaw, errorDetailsInPaymentsEntity.errorDescriptionRaw) &&
        Objects.equals(this.errorSubcodeRaw, errorDetailsInPaymentsEntity.errorSubcodeRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorDescription, errorReason, errorSource, errorCodeRaw, errorDescriptionRaw, errorSubcodeRaw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetailsInPaymentsEntity {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
    sb.append("    errorSource: ").append(toIndentedString(errorSource)).append("\n");
    sb.append("    errorCodeRaw: ").append(toIndentedString(errorCodeRaw)).append("\n");
    sb.append("    errorDescriptionRaw: ").append(toIndentedString(errorDescriptionRaw)).append("\n");
    sb.append("    errorSubcodeRaw: ").append(toIndentedString(errorSubcodeRaw)).append("\n");
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
    openapiFields.add("error_code");
    openapiFields.add("error_description");
    openapiFields.add("error_reason");
    openapiFields.add("error_source");
    openapiFields.add("error_code_raw");
    openapiFields.add("error_description_raw");
    openapiFields.add("error_subcode_raw");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ErrorDetailsInPaymentsEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("error_code") != null && !jsonObj.get("error_code").isJsonNull()) && !jsonObj.get("error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_code").toString()));
      }
      if ((jsonObj.get("error_description") != null && !jsonObj.get("error_description").isJsonNull()) && !jsonObj.get("error_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_description").toString()));
      }
      if ((jsonObj.get("error_reason") != null && !jsonObj.get("error_reason").isJsonNull()) && !jsonObj.get("error_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_reason").toString()));
      }
      if ((jsonObj.get("error_source") != null && !jsonObj.get("error_source").isJsonNull()) && !jsonObj.get("error_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_source").toString()));
      }
      if ((jsonObj.get("error_code_raw") != null && !jsonObj.get("error_code_raw").isJsonNull()) && !jsonObj.get("error_code_raw").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_code_raw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_code_raw").toString()));
      }
      if ((jsonObj.get("error_description_raw") != null && !jsonObj.get("error_description_raw").isJsonNull()) && !jsonObj.get("error_description_raw").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_description_raw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_description_raw").toString()));
      }
      if ((jsonObj.get("error_subcode_raw") != null && !jsonObj.get("error_subcode_raw").isJsonNull()) && !jsonObj.get("error_subcode_raw").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_subcode_raw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_subcode_raw").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ErrorDetailsInPaymentsEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("error_code") != null && !jsonObj.get("error_code").isJsonNull()) && !jsonObj.get("error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_code").toString()));
      }
      if ((jsonObj.get("error_description") != null && !jsonObj.get("error_description").isJsonNull()) && !jsonObj.get("error_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_description").toString()));
      }
      if ((jsonObj.get("error_reason") != null && !jsonObj.get("error_reason").isJsonNull()) && !jsonObj.get("error_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_reason").toString()));
      }
      if ((jsonObj.get("error_source") != null && !jsonObj.get("error_source").isJsonNull()) && !jsonObj.get("error_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_source").toString()));
      }
      if ((jsonObj.get("error_code_raw") != null && !jsonObj.get("error_code_raw").isJsonNull()) && !jsonObj.get("error_code_raw").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_code_raw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_code_raw").toString()));
      }
      if ((jsonObj.get("error_description_raw") != null && !jsonObj.get("error_description_raw").isJsonNull()) && !jsonObj.get("error_description_raw").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_description_raw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_description_raw").toString()));
      }
      if ((jsonObj.get("error_subcode_raw") != null && !jsonObj.get("error_subcode_raw").isJsonNull()) && !jsonObj.get("error_subcode_raw").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_subcode_raw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_subcode_raw").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ErrorDetailsInPaymentsEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ErrorDetailsInPaymentsEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ErrorDetailsInPaymentsEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ErrorDetailsInPaymentsEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<ErrorDetailsInPaymentsEntity>() {
           @Override
           public void write(JsonWriter out, ErrorDetailsInPaymentsEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ErrorDetailsInPaymentsEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ErrorDetailsInPaymentsEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ErrorDetailsInPaymentsEntity
  * @throws IOException if the JSON string is invalid with respect to ErrorDetailsInPaymentsEntity
  */
  public static ErrorDetailsInPaymentsEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ErrorDetailsInPaymentsEntity.class);
  }

 /**
  * Convert an instance of ErrorDetailsInPaymentsEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

