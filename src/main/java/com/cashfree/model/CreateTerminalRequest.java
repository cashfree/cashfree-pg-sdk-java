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
import com.cashfree.model.CreateTerminalRequestTerminalMeta;
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
 * Request body to create a terminal
 */
@Schema(description = "Request body to create a terminal")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-25T11:57:22.771207Z[Etc/UTC]")
public class CreateTerminalRequest {
  public static final String SERIALIZED_NAME_TERMINAL_ID = "terminal_id";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ID)
  private String terminalId;

  public static final String SERIALIZED_NAME_TERMINAL_PHONE_NO = "terminal_phone_no";
  @SerializedName(SERIALIZED_NAME_TERMINAL_PHONE_NO)
  private String terminalPhoneNo;

  public static final String SERIALIZED_NAME_TERMINAL_NAME = "terminal_name";
  @SerializedName(SERIALIZED_NAME_TERMINAL_NAME)
  private String terminalName;

  public static final String SERIALIZED_NAME_TERMINAL_ADDRESS = "terminal_address";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ADDRESS)
  private String terminalAddress;

  public static final String SERIALIZED_NAME_TERMINAL_EMAIL = "terminal_email";
  @SerializedName(SERIALIZED_NAME_TERMINAL_EMAIL)
  private String terminalEmail;

  public static final String SERIALIZED_NAME_TERMINAL_NOTE = "terminal_note";
  @SerializedName(SERIALIZED_NAME_TERMINAL_NOTE)
  private String terminalNote;

  public static final String SERIALIZED_NAME_TERMINAL_TYPE = "terminal_type";
  @SerializedName(SERIALIZED_NAME_TERMINAL_TYPE)
  private String terminalType;

  public static final String SERIALIZED_NAME_TERMINAL_META = "terminal_meta";
  @SerializedName(SERIALIZED_NAME_TERMINAL_META)
  private CreateTerminalRequestTerminalMeta terminalMeta;

  public CreateTerminalRequest() {
  }

  public CreateTerminalRequest terminalId(String terminalId) {
    
    this.terminalId = terminalId;
    return this;
  }

   /**
   * merchant’s internal terminal id
   * @return terminalId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "merchant’s internal terminal id")
  public String getTerminalId() {
    return terminalId;
  }


  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }


  public CreateTerminalRequest terminalPhoneNo(String terminalPhoneNo) {
    
    this.terminalPhoneNo = terminalPhoneNo;
    return this;
  }

   /**
   * phone number assigned to the terminal
   * @return terminalPhoneNo
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "phone number assigned to the terminal")
  public String getTerminalPhoneNo() {
    return terminalPhoneNo;
  }


  public void setTerminalPhoneNo(String terminalPhoneNo) {
    this.terminalPhoneNo = terminalPhoneNo;
  }


  public CreateTerminalRequest terminalName(String terminalName) {
    
    this.terminalName = terminalName;
    return this;
  }

   /**
   * terminal name to be assigned by merchants
   * @return terminalName
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "terminal name to be assigned by merchants")
  public String getTerminalName() {
    return terminalName;
  }


  public void setTerminalName(String terminalName) {
    this.terminalName = terminalName;
  }


  public CreateTerminalRequest terminalAddress(String terminalAddress) {
    
    this.terminalAddress = terminalAddress;
    return this;
  }

   /**
   * address of the terminal. required for STOREFRONT
   * @return terminalAddress
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "address of the terminal. required for STOREFRONT")
  public String getTerminalAddress() {
    return terminalAddress;
  }


  public void setTerminalAddress(String terminalAddress) {
    this.terminalAddress = terminalAddress;
  }


  public CreateTerminalRequest terminalEmail(String terminalEmail) {
    
    this.terminalEmail = terminalEmail;
    return this;
  }

   /**
   * terminal email ID of the AGENT/STOREFRONT assigned by merchants.
   * @return terminalEmail
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "terminal email ID of the AGENT/STOREFRONT assigned by merchants.")
  public String getTerminalEmail() {
    return terminalEmail;
  }


  public void setTerminalEmail(String terminalEmail) {
    this.terminalEmail = terminalEmail;
  }


  public CreateTerminalRequest terminalNote(String terminalNote) {
    
    this.terminalNote = terminalNote;
    return this;
  }

   /**
   * additional note for terminal
   * @return terminalNote
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "additional note for terminal")
  public String getTerminalNote() {
    return terminalNote;
  }


  public void setTerminalNote(String terminalNote) {
    this.terminalNote = terminalNote;
  }


  public CreateTerminalRequest terminalType(String terminalType) {
    
    this.terminalType = terminalType;
    return this;
  }

   /**
   * mention the terminal type. possible values - AGENT, STOREFRONT.
   * @return terminalType
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "mention the terminal type. possible values - AGENT, STOREFRONT.")
  public String getTerminalType() {
    return terminalType;
  }


  public void setTerminalType(String terminalType) {
    this.terminalType = terminalType;
  }


  public CreateTerminalRequest terminalMeta(CreateTerminalRequestTerminalMeta terminalMeta) {
    
    this.terminalMeta = terminalMeta;
    return this;
  }

   /**
   * Get terminalMeta
   * @return terminalMeta
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CreateTerminalRequestTerminalMeta getTerminalMeta() {
    return terminalMeta;
  }


  public void setTerminalMeta(CreateTerminalRequestTerminalMeta terminalMeta) {
    this.terminalMeta = terminalMeta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTerminalRequest createTerminalRequest = (CreateTerminalRequest) o;
    return Objects.equals(this.terminalId, createTerminalRequest.terminalId) &&
        Objects.equals(this.terminalPhoneNo, createTerminalRequest.terminalPhoneNo) &&
        Objects.equals(this.terminalName, createTerminalRequest.terminalName) &&
        Objects.equals(this.terminalAddress, createTerminalRequest.terminalAddress) &&
        Objects.equals(this.terminalEmail, createTerminalRequest.terminalEmail) &&
        Objects.equals(this.terminalNote, createTerminalRequest.terminalNote) &&
        Objects.equals(this.terminalType, createTerminalRequest.terminalType) &&
        Objects.equals(this.terminalMeta, createTerminalRequest.terminalMeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminalId, terminalPhoneNo, terminalName, terminalAddress, terminalEmail, terminalNote, terminalType, terminalMeta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTerminalRequest {\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    terminalPhoneNo: ").append(toIndentedString(terminalPhoneNo)).append("\n");
    sb.append("    terminalName: ").append(toIndentedString(terminalName)).append("\n");
    sb.append("    terminalAddress: ").append(toIndentedString(terminalAddress)).append("\n");
    sb.append("    terminalEmail: ").append(toIndentedString(terminalEmail)).append("\n");
    sb.append("    terminalNote: ").append(toIndentedString(terminalNote)).append("\n");
    sb.append("    terminalType: ").append(toIndentedString(terminalType)).append("\n");
    sb.append("    terminalMeta: ").append(toIndentedString(terminalMeta)).append("\n");
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
    openapiFields.add("terminal_id");
    openapiFields.add("terminal_phone_no");
    openapiFields.add("terminal_name");
    openapiFields.add("terminal_address");
    openapiFields.add("terminal_email");
    openapiFields.add("terminal_note");
    openapiFields.add("terminal_type");
    openapiFields.add("terminal_meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("terminal_id");
    openapiRequiredFields.add("terminal_phone_no");
    openapiRequiredFields.add("terminal_name");
    openapiRequiredFields.add("terminal_email");
    openapiRequiredFields.add("terminal_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTerminalRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTerminalRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_id").toString()));
      }
      if (!jsonObj.get("terminal_phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_phone_no").toString()));
      }
      if (!jsonObj.get("terminal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_name").toString()));
      }
      if ((jsonObj.get("terminal_address") != null && !jsonObj.get("terminal_address").isJsonNull()) && !jsonObj.get("terminal_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_address").toString()));
      }
      if (!jsonObj.get("terminal_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_email").toString()));
      }
      if ((jsonObj.get("terminal_note") != null && !jsonObj.get("terminal_note").isJsonNull()) && !jsonObj.get("terminal_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_note").toString()));
      }
      if (!jsonObj.get("terminal_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_type").toString()));
      }
      // validate the optional field `terminal_meta`
      if (jsonObj.get("terminal_meta") != null && !jsonObj.get("terminal_meta").isJsonNull()) {
        CreateTerminalRequestTerminalMeta.validateJsonElement(jsonObj.get("terminal_meta"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTerminalRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTerminalRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_id").toString()));
      }
      if (!jsonObj.get("terminal_phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_phone_no").toString()));
      }
      if (!jsonObj.get("terminal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_name").toString()));
      }
      if ((jsonObj.get("terminal_address") != null && !jsonObj.get("terminal_address").isJsonNull()) && !jsonObj.get("terminal_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_address").toString()));
      }
      if (!jsonObj.get("terminal_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_email").toString()));
      }
      if ((jsonObj.get("terminal_note") != null && !jsonObj.get("terminal_note").isJsonNull()) && !jsonObj.get("terminal_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_note").toString()));
      }
      if (!jsonObj.get("terminal_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_type").toString()));
      }
      // validate the optional field `terminal_meta`
      if (jsonObj.get("terminal_meta") != null && !jsonObj.get("terminal_meta").isJsonNull()) {
        CreateTerminalRequestTerminalMeta.validateJsonElement(jsonObj.get("terminal_meta"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTerminalRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTerminalRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTerminalRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTerminalRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTerminalRequest>() {
           @Override
           public void write(JsonWriter out, CreateTerminalRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTerminalRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTerminalRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTerminalRequest
  * @throws IOException if the JSON string is invalid with respect to CreateTerminalRequest
  */
  public static CreateTerminalRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTerminalRequest.class);
  }

 /**
  * Convert an instance of CreateTerminalRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

