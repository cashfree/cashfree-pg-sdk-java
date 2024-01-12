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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * CardOffer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-12T09:50:28.064254Z[Etc/UTC]")
public class CardOffer {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private List<String> type = new ArrayList<>();

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_SCHEME_NAME = "scheme_name";
  @SerializedName(SERIALIZED_NAME_SCHEME_NAME)
  private List<String> schemeName = new ArrayList<>();

  public CardOffer() {
  }

  public CardOffer type(List<String> type) {
    
    this.type = type;
    return this;
  }

  public CardOffer addTypeItem(String typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<>();
    }
    this.type.add(typeItem);
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public List<String> getType() {
    return type;
  }


  public void setType(List<String> type) {
    this.type = type;
  }


  public CardOffer bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * Bank Name of Card.
   * @return bankName
  **/
  @javax.annotation.Nonnull
  @Schema(example = "hdfc bank", requiredMode = Schema.RequiredMode.REQUIRED, description = "Bank Name of Card.")
  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public CardOffer schemeName(List<String> schemeName) {
    
    this.schemeName = schemeName;
    return this;
  }

  public CardOffer addSchemeNameItem(String schemeNameItem) {
    if (this.schemeName == null) {
      this.schemeName = new ArrayList<>();
    }
    this.schemeName.add(schemeNameItem);
    return this;
  }

   /**
   * Get schemeName
   * @return schemeName
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public List<String> getSchemeName() {
    return schemeName;
  }


  public void setSchemeName(List<String> schemeName) {
    this.schemeName = schemeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardOffer cardOffer = (CardOffer) o;
    return Objects.equals(this.type, cardOffer.type) &&
        Objects.equals(this.bankName, cardOffer.bankName) &&
        Objects.equals(this.schemeName, cardOffer.schemeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, bankName, schemeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardOffer {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("bank_name");
    openapiFields.add("scheme_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("bank_name");
    openapiRequiredFields.add("scheme_name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CardOffer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CardOffer.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("type") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be an array in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_name").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("scheme_name") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("scheme_name").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheme_name` to be an array in the JSON string but got `%s`", jsonObj.get("scheme_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardOffer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardOffer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardOffer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardOffer.class));

       return (TypeAdapter<T>) new TypeAdapter<CardOffer>() {
           @Override
           public void write(JsonWriter out, CardOffer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardOffer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardOffer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardOffer
  * @throws IOException if the JSON string is invalid with respect to CardOffer
  */
  public static CardOffer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardOffer.class);
  }

 /**
  * Convert an instance of CardOffer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

