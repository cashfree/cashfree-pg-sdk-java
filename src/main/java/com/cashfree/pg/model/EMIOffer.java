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

import com.cashfree.pg.JSON;

/**
 * EMIOffer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class EMIOffer {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_TENURES = "tenures";
  @SerializedName(SERIALIZED_NAME_TENURES)
  private List<Integer> tenures = new ArrayList<>();

  public EMIOffer() {
  }

  public EMIOffer type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of emi offer. Possible values are &#x60;credit_card_emi&#x60;, &#x60;debit_card_emi&#x60;, &#x60;cardless_emi&#x60;
   * @return type
  **/
  @javax.annotation.Nonnull
  @Schema(example = "cardless_emi", requiredMode = Schema.RequiredMode.REQUIRED, description = "Type of emi offer. Possible values are `credit_card_emi`, `debit_card_emi`, `cardless_emi`")
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public EMIOffer issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Bank Name
   * @return issuer
  **/
  @javax.annotation.Nonnull
  @Schema(example = "hdfc bank", requiredMode = Schema.RequiredMode.REQUIRED, description = "Bank Name")
  public String getIssuer() {
    return issuer;
  }


  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public EMIOffer tenures(List<Integer> tenures) {
    
    this.tenures = tenures;
    return this;
  }

  public EMIOffer addTenuresItem(Integer tenuresItem) {
    if (this.tenures == null) {
      this.tenures = new ArrayList<>();
    }
    this.tenures.add(tenuresItem);
    return this;
  }

   /**
   * Get tenures
   * @return tenures
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public List<Integer> getTenures() {
    return tenures;
  }


  public void setTenures(List<Integer> tenures) {
    this.tenures = tenures;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMIOffer emIOffer = (EMIOffer) o;
    return Objects.equals(this.type, emIOffer.type) &&
        Objects.equals(this.issuer, emIOffer.issuer) &&
        Objects.equals(this.tenures, emIOffer.tenures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, issuer, tenures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMIOffer {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    tenures: ").append(toIndentedString(tenures)).append("\n");
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
    openapiFields.add("issuer");
    openapiFields.add("tenures");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("issuer");
    openapiRequiredFields.add("tenures");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMIOffer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EMIOffer.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tenures") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tenures").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenures` to be an array in the JSON string but got `%s`", jsonObj.get("tenures").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMIOffer
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EMIOffer.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tenures") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tenures").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenures` to be an array in the JSON string but got `%s`", jsonObj.get("tenures").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMIOffer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMIOffer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMIOffer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMIOffer.class));

       return (TypeAdapter<T>) new TypeAdapter<EMIOffer>() {
           @Override
           public void write(JsonWriter out, EMIOffer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMIOffer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMIOffer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMIOffer
  * @throws IOException if the JSON string is invalid with respect to EMIOffer
  */
  public static EMIOffer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMIOffer.class);
  }

 /**
  * Convert an instance of EMIOffer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

