/*
 * Cashfree Payment Gateway APIs
 * Cashfree's Payment Gateway APIs provide developers with a streamlined pathway to integrate advanced payment processing capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2022-09-01
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
 * Netbanking payment method request body
 */
@Schema(description = "Netbanking payment method request body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-25T09:46:48.718492Z[Etc/UTC]")
public class Netbanking {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_NETBANKING_BANK_CODE = "netbanking_bank_code";
  @SerializedName(SERIALIZED_NAME_NETBANKING_BANK_CODE)
  private Integer netbankingBankCode;

  public static final String SERIALIZED_NAME_NETBANKING_BANK_NAME = "netbanking_bank_name";
  @SerializedName(SERIALIZED_NAME_NETBANKING_BANK_NAME)
  private String netbankingBankName;

  public Netbanking() {
  }

  public Netbanking channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * The channel for netbanking will always be &#x60;link&#x60;
   * @return channel
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "The channel for netbanking will always be `link`")
  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public Netbanking netbankingBankCode(Integer netbankingBankCode) {
    
    this.netbankingBankCode = netbankingBankCode;
    return this;
  }

   /**
   * Bank code
   * @return netbankingBankCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Bank code")
  public Integer getNetbankingBankCode() {
    return netbankingBankCode;
  }


  public void setNetbankingBankCode(Integer netbankingBankCode) {
    this.netbankingBankCode = netbankingBankCode;
  }


  public Netbanking netbankingBankName(String netbankingBankName) {
    
    this.netbankingBankName = netbankingBankName;
    return this;
  }

   /**
   * String code for bank
   * @return netbankingBankName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "String code for bank")
  public String getNetbankingBankName() {
    return netbankingBankName;
  }


  public void setNetbankingBankName(String netbankingBankName) {
    this.netbankingBankName = netbankingBankName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Netbanking netbanking = (Netbanking) o;
    return Objects.equals(this.channel, netbanking.channel) &&
        Objects.equals(this.netbankingBankCode, netbanking.netbankingBankCode) &&
        Objects.equals(this.netbankingBankName, netbanking.netbankingBankName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, netbankingBankCode, netbankingBankName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Netbanking {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    netbankingBankCode: ").append(toIndentedString(netbankingBankCode)).append("\n");
    sb.append("    netbankingBankName: ").append(toIndentedString(netbankingBankName)).append("\n");
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
    openapiFields.add("channel");
    openapiFields.add("netbanking_bank_code");
    openapiFields.add("netbanking_bank_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Netbanking
  */
  public static boolean validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Netbanking.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("netbanking_bank_name") != null && !jsonObj.get("netbanking_bank_name").isJsonNull()) && !jsonObj.get("netbanking_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netbanking_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netbanking_bank_name").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Netbanking.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Netbanking' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Netbanking> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Netbanking.class));

       return (TypeAdapter<T>) new TypeAdapter<Netbanking>() {
           @Override
           public void write(JsonWriter out, Netbanking value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Netbanking read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Netbanking given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Netbanking
  * @throws IOException if the JSON string is invalid with respect to Netbanking
  */
  public static Netbanking fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Netbanking.class);
  }

 /**
  * Convert an instance of Netbanking to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

