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
import com.cashfree.model.UpdateTerminalRequestTerminalMeta;
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
 * Request body to update terminal details.
 */
@Schema(description = "Request body to update terminal details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-12T08:35:35.237610Z[Etc/UTC]")
public class UpdateTerminalRequest {
  public static final String SERIALIZED_NAME_TERMINAL_EMAIL = "terminal_email";
  @SerializedName(SERIALIZED_NAME_TERMINAL_EMAIL)
  private String terminalEmail;

  public static final String SERIALIZED_NAME_TERMINAL_PHONE_NO = "terminal_phone_no";
  @SerializedName(SERIALIZED_NAME_TERMINAL_PHONE_NO)
  private String terminalPhoneNo;

  public static final String SERIALIZED_NAME_TERMINAL_META = "terminal_meta";
  @SerializedName(SERIALIZED_NAME_TERMINAL_META)
  private UpdateTerminalRequestTerminalMeta terminalMeta;

  public static final String SERIALIZED_NAME_TERMINAL_TYPE = "terminal_type";
  @SerializedName(SERIALIZED_NAME_TERMINAL_TYPE)
  private String terminalType;

  public UpdateTerminalRequest() {
  }

  public UpdateTerminalRequest terminalEmail(String terminalEmail) {
    
    this.terminalEmail = terminalEmail;
    return this;
  }

   /**
   * Mention the updated email ID of the terminal.
   * @return terminalEmail
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Mention the updated email ID of the terminal.")
  public String getTerminalEmail() {
    return terminalEmail;
  }


  public void setTerminalEmail(String terminalEmail) {
    this.terminalEmail = terminalEmail;
  }


  public UpdateTerminalRequest terminalPhoneNo(String terminalPhoneNo) {
    
    this.terminalPhoneNo = terminalPhoneNo;
    return this;
  }

   /**
   * Terminal phone number to be updated.
   * @return terminalPhoneNo
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Terminal phone number to be updated.")
  public String getTerminalPhoneNo() {
    return terminalPhoneNo;
  }


  public void setTerminalPhoneNo(String terminalPhoneNo) {
    this.terminalPhoneNo = terminalPhoneNo;
  }


  public UpdateTerminalRequest terminalMeta(UpdateTerminalRequestTerminalMeta terminalMeta) {
    
    this.terminalMeta = terminalMeta;
    return this;
  }

   /**
   * Get terminalMeta
   * @return terminalMeta
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public UpdateTerminalRequestTerminalMeta getTerminalMeta() {
    return terminalMeta;
  }


  public void setTerminalMeta(UpdateTerminalRequestTerminalMeta terminalMeta) {
    this.terminalMeta = terminalMeta;
  }


  public UpdateTerminalRequest terminalType(String terminalType) {
    
    this.terminalType = terminalType;
    return this;
  }

   /**
   * Mention the terminal type to be updated. Possible values - AGENT, STOREFRONT.
   * @return terminalType
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Mention the terminal type to be updated. Possible values - AGENT, STOREFRONT.")
  public String getTerminalType() {
    return terminalType;
  }


  public void setTerminalType(String terminalType) {
    this.terminalType = terminalType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTerminalRequest updateTerminalRequest = (UpdateTerminalRequest) o;
    return Objects.equals(this.terminalEmail, updateTerminalRequest.terminalEmail) &&
        Objects.equals(this.terminalPhoneNo, updateTerminalRequest.terminalPhoneNo) &&
        Objects.equals(this.terminalMeta, updateTerminalRequest.terminalMeta) &&
        Objects.equals(this.terminalType, updateTerminalRequest.terminalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminalEmail, terminalPhoneNo, terminalMeta, terminalType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTerminalRequest {\n");
    sb.append("    terminalEmail: ").append(toIndentedString(terminalEmail)).append("\n");
    sb.append("    terminalPhoneNo: ").append(toIndentedString(terminalPhoneNo)).append("\n");
    sb.append("    terminalMeta: ").append(toIndentedString(terminalMeta)).append("\n");
    sb.append("    terminalType: ").append(toIndentedString(terminalType)).append("\n");
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
    openapiFields.add("terminal_email");
    openapiFields.add("terminal_phone_no");
    openapiFields.add("terminal_meta");
    openapiFields.add("terminal_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("terminal_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateTerminalRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateTerminalRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("terminal_email") != null && !jsonObj.get("terminal_email").isJsonNull()) && !jsonObj.get("terminal_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_email").toString()));
      }
      if ((jsonObj.get("terminal_phone_no") != null && !jsonObj.get("terminal_phone_no").isJsonNull()) && !jsonObj.get("terminal_phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_phone_no").toString()));
      }
      // validate the optional field `terminal_meta`
      if (jsonObj.get("terminal_meta") != null && !jsonObj.get("terminal_meta").isJsonNull()) {
        UpdateTerminalRequestTerminalMeta.validateJsonElement(jsonObj.get("terminal_meta"));
      }
      if (!jsonObj.get("terminal_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_type").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateTerminalRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateTerminalRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("terminal_email") != null && !jsonObj.get("terminal_email").isJsonNull()) && !jsonObj.get("terminal_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_email").toString()));
      }
      if ((jsonObj.get("terminal_phone_no") != null && !jsonObj.get("terminal_phone_no").isJsonNull()) && !jsonObj.get("terminal_phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_phone_no").toString()));
      }
      // validate the optional field `terminal_meta`
      if (jsonObj.get("terminal_meta") != null && !jsonObj.get("terminal_meta").isJsonNull()) {
        UpdateTerminalRequestTerminalMeta.validateJsonElement(jsonObj.get("terminal_meta"));
        return true;
      }
      if (!jsonObj.get("terminal_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_type").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTerminalRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTerminalRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTerminalRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTerminalRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTerminalRequest>() {
           @Override
           public void write(JsonWriter out, UpdateTerminalRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateTerminalRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateTerminalRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateTerminalRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateTerminalRequest
  */
  public static UpdateTerminalRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTerminalRequest.class);
  }

 /**
  * Convert an instance of UpdateTerminalRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

