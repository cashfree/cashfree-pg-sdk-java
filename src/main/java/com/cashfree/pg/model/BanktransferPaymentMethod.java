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
import com.cashfree.pg.model.Banktransfer;
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
 * banktransfer payment method
 */
@Schema(description = "banktransfer payment method")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T14:04:19.914397Z[Etc/UTC]")
public class BanktransferPaymentMethod {
  public static final String SERIALIZED_NAME_BANKTRANSFER = "banktransfer";
  @SerializedName(SERIALIZED_NAME_BANKTRANSFER)
  private Banktransfer banktransfer;

  public BanktransferPaymentMethod() {
  }

  public BanktransferPaymentMethod banktransfer(Banktransfer banktransfer) {
    
    this.banktransfer = banktransfer;
    return this;
  }

   /**
   * Get banktransfer
   * @return banktransfer
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public Banktransfer getBanktransfer() {
    return banktransfer;
  }


  public void setBanktransfer(Banktransfer banktransfer) {
    this.banktransfer = banktransfer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BanktransferPaymentMethod banktransferPaymentMethod = (BanktransferPaymentMethod) o;
    return Objects.equals(this.banktransfer, banktransferPaymentMethod.banktransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(banktransfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BanktransferPaymentMethod {\n");
    sb.append("    banktransfer: ").append(toIndentedString(banktransfer)).append("\n");
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
    openapiFields.add("banktransfer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("banktransfer");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BanktransferPaymentMethod
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BanktransferPaymentMethod.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `banktransfer`
      Banktransfer.validateJsonElement(jsonObj.get("banktransfer"));
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BanktransferPaymentMethod
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BanktransferPaymentMethod.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `banktransfer`
      Banktransfer.validateJsonElement(jsonObj.get("banktransfer"));
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BanktransferPaymentMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BanktransferPaymentMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BanktransferPaymentMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BanktransferPaymentMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<BanktransferPaymentMethod>() {
           @Override
           public void write(JsonWriter out, BanktransferPaymentMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BanktransferPaymentMethod read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BanktransferPaymentMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BanktransferPaymentMethod
  * @throws IOException if the JSON string is invalid with respect to BanktransferPaymentMethod
  */
  public static BanktransferPaymentMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BanktransferPaymentMethod.class);
  }

 /**
  * Convert an instance of BanktransferPaymentMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

