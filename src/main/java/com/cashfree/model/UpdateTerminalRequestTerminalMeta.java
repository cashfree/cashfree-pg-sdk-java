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
 * Terminal metadata.
 */
@Schema(description = "Terminal metadata.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T13:33:59.432802Z[Etc/UTC]")
public class UpdateTerminalRequestTerminalMeta {
  public static final String SERIALIZED_NAME_TERMINAL_OPERATOR = "terminal_operator";
  @SerializedName(SERIALIZED_NAME_TERMINAL_OPERATOR)
  private String terminalOperator;

  public UpdateTerminalRequestTerminalMeta() {
  }

  public UpdateTerminalRequestTerminalMeta terminalOperator(String terminalOperator) {
    
    this.terminalOperator = terminalOperator;
    return this;
  }

   /**
   * Name of the operator for the storefront.
   * @return terminalOperator
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Name of the operator for the storefront.")
  public String getTerminalOperator() {
    return terminalOperator;
  }


  public void setTerminalOperator(String terminalOperator) {
    this.terminalOperator = terminalOperator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTerminalRequestTerminalMeta updateTerminalRequestTerminalMeta = (UpdateTerminalRequestTerminalMeta) o;
    return Objects.equals(this.terminalOperator, updateTerminalRequestTerminalMeta.terminalOperator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminalOperator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTerminalRequestTerminalMeta {\n");
    sb.append("    terminalOperator: ").append(toIndentedString(terminalOperator)).append("\n");
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
    openapiFields.add("terminal_operator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateTerminalRequestTerminalMeta
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("terminal_operator") != null && !jsonObj.get("terminal_operator").isJsonNull()) && !jsonObj.get("terminal_operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_operator").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateTerminalRequestTerminalMeta
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("terminal_operator") != null && !jsonObj.get("terminal_operator").isJsonNull()) && !jsonObj.get("terminal_operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_operator").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTerminalRequestTerminalMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTerminalRequestTerminalMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTerminalRequestTerminalMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTerminalRequestTerminalMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTerminalRequestTerminalMeta>() {
           @Override
           public void write(JsonWriter out, UpdateTerminalRequestTerminalMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateTerminalRequestTerminalMeta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateTerminalRequestTerminalMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateTerminalRequestTerminalMeta
  * @throws IOException if the JSON string is invalid with respect to UpdateTerminalRequestTerminalMeta
  */
  public static UpdateTerminalRequestTerminalMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTerminalRequestTerminalMeta.class);
  }

 /**
  * Convert an instance of UpdateTerminalRequestTerminalMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

