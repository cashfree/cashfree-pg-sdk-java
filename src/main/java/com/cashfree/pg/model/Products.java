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
import com.cashfree.pg.model.ProductDetails;
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
 * Use this to set configurations for the products like One Click Checkout, Verify and Pay, if they are enabled for your account
 */
@Schema(description = "Use this to set configurations for the products like One Click Checkout, Verify and Pay, if they are enabled for your account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T13:20:08.871845Z[Etc/UTC]")
public class Products {
  public static final String SERIALIZED_NAME_ONE_CLICK_CHECKOUT = "one_click_checkout";
  @SerializedName(SERIALIZED_NAME_ONE_CLICK_CHECKOUT)
  private ProductDetails oneClickCheckout;

  public static final String SERIALIZED_NAME_VERIFY_PAY = "verify_pay";
  @SerializedName(SERIALIZED_NAME_VERIFY_PAY)
  private ProductDetails verifyPay;

  public Products() {
  }

  public Products oneClickCheckout(ProductDetails oneClickCheckout) {
    
    this.oneClickCheckout = oneClickCheckout;
    return this;
  }

   /**
   * Get oneClickCheckout
   * @return oneClickCheckout
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public ProductDetails getOneClickCheckout() {
    return oneClickCheckout;
  }


  public void setOneClickCheckout(ProductDetails oneClickCheckout) {
    this.oneClickCheckout = oneClickCheckout;
  }


  public Products verifyPay(ProductDetails verifyPay) {
    
    this.verifyPay = verifyPay;
    return this;
  }

   /**
   * Get verifyPay
   * @return verifyPay
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public ProductDetails getVerifyPay() {
    return verifyPay;
  }


  public void setVerifyPay(ProductDetails verifyPay) {
    this.verifyPay = verifyPay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Products products = (Products) o;
    return Objects.equals(this.oneClickCheckout, products.oneClickCheckout) &&
        Objects.equals(this.verifyPay, products.verifyPay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oneClickCheckout, verifyPay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Products {\n");
    sb.append("    oneClickCheckout: ").append(toIndentedString(oneClickCheckout)).append("\n");
    sb.append("    verifyPay: ").append(toIndentedString(verifyPay)).append("\n");
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
    openapiFields.add("one_click_checkout");
    openapiFields.add("verify_pay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Products
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `one_click_checkout`
      if (jsonObj.get("one_click_checkout") != null && !jsonObj.get("one_click_checkout").isJsonNull()) {
        ProductDetails.validateJsonElement(jsonObj.get("one_click_checkout"));
      }
      // validate the optional field `verify_pay`
      if (jsonObj.get("verify_pay") != null && !jsonObj.get("verify_pay").isJsonNull()) {
        ProductDetails.validateJsonElement(jsonObj.get("verify_pay"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Products
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `one_click_checkout`
      if (jsonObj.get("one_click_checkout") != null && !jsonObj.get("one_click_checkout").isJsonNull()) {
        ProductDetails.validateJsonElement(jsonObj.get("one_click_checkout"));
        return true;
      }
      // validate the optional field `verify_pay`
      if (jsonObj.get("verify_pay") != null && !jsonObj.get("verify_pay").isJsonNull()) {
        ProductDetails.validateJsonElement(jsonObj.get("verify_pay"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Products.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Products' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Products> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Products.class));

       return (TypeAdapter<T>) new TypeAdapter<Products>() {
           @Override
           public void write(JsonWriter out, Products value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Products read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Products given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Products
  * @throws IOException if the JSON string is invalid with respect to Products
  */
  public static Products fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Products.class);
  }

 /**
  * Convert an instance of Products to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

