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
 * Allowed card issuing bank for the order
 */
@Schema(description = "Allowed card issuing bank for the order")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T09:56:44.464357Z[Etc/UTC]")
public class OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List values = null;

  public OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank() {
  }

  public OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * It accepts value of \&quot;ALLOW\&quot; and allows only those issuing bank present in it&#39;s neighbouring parameter \&quot;values\&quot;
   * @return action
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It accepts value of \"ALLOW\" and allows only those issuing bank present in it's neighbouring parameter \"values\"")
  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank values(List values) {
    
    this.values = values;
    return this;
  }

   /**
   * List of card issuing bank to be allowed for the order
   * @return values
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "List of card issuing bank to be allowed for the order")
  public List getValues() {
    return values;
  }


  public void setValues(List values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank orderMetaPaymentMethodsFiltersFiltersCardIssuingBank = (OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank) o;
    return Objects.equals(this.action, orderMetaPaymentMethodsFiltersFiltersCardIssuingBank.action) &&
        Objects.equals(this.values, orderMetaPaymentMethodsFiltersFiltersCardIssuingBank.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank>() {
           @Override
           public void write(JsonWriter out, OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank
  * @throws IOException if the JSON string is invalid with respect to OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank
  */
  public static OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank.class);
  }

 /**
  * Convert an instance of OrderMetaPaymentMethodsFiltersFiltersCardIssuingBank to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

