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
 * Paylater Entity
 */
@Schema(description = "Paylater Entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-25T10:45:34.954572Z[Etc/UTC]")
public class PaylaterEntity {
  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public PaylaterEntity() {
  }

  public PaylaterEntity paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @Schema(example = "olapostpaid", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaylaterEntity paylaterEntity = (PaylaterEntity) o;
    return Objects.equals(this.paymentMethod, paylaterEntity.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaylaterEntity {\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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
    openapiFields.add("payment_method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaylaterEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaylaterEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaylaterEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaylaterEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaylaterEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaylaterEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<PaylaterEntity>() {
           @Override
           public void write(JsonWriter out, PaylaterEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaylaterEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaylaterEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaylaterEntity
  * @throws IOException if the JSON string is invalid with respect to PaylaterEntity
  */
  public static PaylaterEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaylaterEntity.class);
  }

 /**
  * Convert an instance of PaylaterEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

