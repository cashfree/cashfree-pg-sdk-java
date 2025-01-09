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
 * CustomerDetailsInDisputesEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-09T12:52:07.742309Z[Etc/UTC]")
public class CustomerDetailsInDisputesEntity {
  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customer_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName;

  public static final String SERIALIZED_NAME_CUSTOMER_PHONE = "customer_phone";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PHONE)
  private String customerPhone;

  public static final String SERIALIZED_NAME_CUSTOMER_EMAIL = "customer_email";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_EMAIL)
  private String customerEmail;

  public CustomerDetailsInDisputesEntity() {
  }

  public CustomerDetailsInDisputesEntity customerName(String customerName) {
    
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCustomerName() {
    return customerName;
  }


  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public CustomerDetailsInDisputesEntity customerPhone(String customerPhone) {
    
    this.customerPhone = customerPhone;
    return this;
  }

   /**
   * Get customerPhone
   * @return customerPhone
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCustomerPhone() {
    return customerPhone;
  }


  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }


  public CustomerDetailsInDisputesEntity customerEmail(String customerEmail) {
    
    this.customerEmail = customerEmail;
    return this;
  }

   /**
   * Get customerEmail
   * @return customerEmail
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCustomerEmail() {
    return customerEmail;
  }


  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDetailsInDisputesEntity customerDetailsInDisputesEntity = (CustomerDetailsInDisputesEntity) o;
    return Objects.equals(this.customerName, customerDetailsInDisputesEntity.customerName) &&
        Objects.equals(this.customerPhone, customerDetailsInDisputesEntity.customerPhone) &&
        Objects.equals(this.customerEmail, customerDetailsInDisputesEntity.customerEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerName, customerPhone, customerEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDetailsInDisputesEntity {\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerPhone: ").append(toIndentedString(customerPhone)).append("\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
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
    openapiFields.add("customer_name");
    openapiFields.add("customer_phone");
    openapiFields.add("customer_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerDetailsInDisputesEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customer_name") != null && !jsonObj.get("customer_name").isJsonNull()) && !jsonObj.get("customer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_name").toString()));
      }
      if ((jsonObj.get("customer_phone") != null && !jsonObj.get("customer_phone").isJsonNull()) && !jsonObj.get("customer_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_phone").toString()));
      }
      if ((jsonObj.get("customer_email") != null && !jsonObj.get("customer_email").isJsonNull()) && !jsonObj.get("customer_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_email").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerDetailsInDisputesEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customer_name") != null && !jsonObj.get("customer_name").isJsonNull()) && !jsonObj.get("customer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_name").toString()));
      }
      if ((jsonObj.get("customer_phone") != null && !jsonObj.get("customer_phone").isJsonNull()) && !jsonObj.get("customer_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_phone").toString()));
      }
      if ((jsonObj.get("customer_email") != null && !jsonObj.get("customer_email").isJsonNull()) && !jsonObj.get("customer_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_email").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerDetailsInDisputesEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerDetailsInDisputesEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerDetailsInDisputesEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerDetailsInDisputesEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerDetailsInDisputesEntity>() {
           @Override
           public void write(JsonWriter out, CustomerDetailsInDisputesEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerDetailsInDisputesEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerDetailsInDisputesEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerDetailsInDisputesEntity
  * @throws IOException if the JSON string is invalid with respect to CustomerDetailsInDisputesEntity
  */
  public static CustomerDetailsInDisputesEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerDetailsInDisputesEntity.class);
  }

 /**
  * Convert an instance of CustomerDetailsInDisputesEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

