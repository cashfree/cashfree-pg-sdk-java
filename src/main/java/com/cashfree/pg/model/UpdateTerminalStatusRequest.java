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
 * Request body to update terminal status.
 */
@Schema(description = "Request body to update terminal status.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T14:04:19.914397Z[Etc/UTC]")
public class UpdateTerminalStatusRequest {
  public static final String SERIALIZED_NAME_TERMINAL_STATUS = "terminal_status";
  @SerializedName(SERIALIZED_NAME_TERMINAL_STATUS)
  private String terminalStatus;

  public UpdateTerminalStatusRequest() {
  }

  public UpdateTerminalStatusRequest terminalStatus(String terminalStatus) {
    
    this.terminalStatus = terminalStatus;
    return this;
  }

   /**
   * Status of the terminal to be updated. possible values - ACTIVE, INACTIVE.
   * @return terminalStatus
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Status of the terminal to be updated. possible values - ACTIVE, INACTIVE.")
  public String getTerminalStatus() {
    return terminalStatus;
  }


  public void setTerminalStatus(String terminalStatus) {
    this.terminalStatus = terminalStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTerminalStatusRequest updateTerminalStatusRequest = (UpdateTerminalStatusRequest) o;
    return Objects.equals(this.terminalStatus, updateTerminalStatusRequest.terminalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTerminalStatusRequest {\n");
    sb.append("    terminalStatus: ").append(toIndentedString(terminalStatus)).append("\n");
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
    openapiFields.add("terminal_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("terminal_status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateTerminalStatusRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateTerminalStatusRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("terminal_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_status").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateTerminalStatusRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateTerminalStatusRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("terminal_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_status").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTerminalStatusRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTerminalStatusRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTerminalStatusRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTerminalStatusRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTerminalStatusRequest>() {
           @Override
           public void write(JsonWriter out, UpdateTerminalStatusRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateTerminalStatusRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateTerminalStatusRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateTerminalStatusRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateTerminalStatusRequest
  */
  public static UpdateTerminalStatusRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTerminalStatusRequest.class);
  }

 /**
  * Convert an instance of UpdateTerminalStatusRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

