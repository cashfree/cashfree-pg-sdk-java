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
import java.math.BigDecimal;
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
 * The customer details that are necessary. Note that you can pass dummy details if your use case does not require the customer details.
 */
@Schema(description = "The customer details that are necessary. Note that you can pass dummy details if your use case does not require the customer details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T14:04:19.914397Z[Etc/UTC]")
public class CustomerDetails {
  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_CUSTOMER_EMAIL = "customer_email";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_EMAIL)
  private String customerEmail;

  public static final String SERIALIZED_NAME_CUSTOMER_PHONE = "customer_phone";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PHONE)
  private String customerPhone;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customer_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName;

  public static final String SERIALIZED_NAME_CUSTOMER_BANK_ACCOUNT_NUMBER = "customer_bank_account_number";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK_ACCOUNT_NUMBER)
  private String customerBankAccountNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_BANK_IFSC = "customer_bank_ifsc";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK_IFSC)
  private String customerBankIfsc;

  public static final String SERIALIZED_NAME_CUSTOMER_BANK_CODE = "customer_bank_code";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK_CODE)
  private BigDecimal customerBankCode;

  public static final String SERIALIZED_NAME_CUSTOMER_UID = "customer_uid";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_UID)
  private String customerUid;

  public CustomerDetails() {
  }

  public CustomerDetails customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * A unique identifier for the customer. Use alphanumeric values only.
   * @return customerId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "A unique identifier for the customer. Use alphanumeric values only.")
  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public CustomerDetails customerEmail(String customerEmail) {
    
    this.customerEmail = customerEmail;
    return this;
  }

   /**
   * Customer email address.
   * @return customerEmail
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Customer email address.")
  public String getCustomerEmail() {
    return customerEmail;
  }


  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }


  public CustomerDetails customerPhone(String customerPhone) {
    
    this.customerPhone = customerPhone;
    return this;
  }

   /**
   * Customer phone number.
   * @return customerPhone
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Customer phone number.")
  public String getCustomerPhone() {
    return customerPhone;
  }


  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }


  public CustomerDetails customerName(String customerName) {
    
    this.customerName = customerName;
    return this;
  }

   /**
   * Name of the customer.
   * @return customerName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Name of the customer.")
  public String getCustomerName() {
    return customerName;
  }


  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public CustomerDetails customerBankAccountNumber(String customerBankAccountNumber) {
    
    this.customerBankAccountNumber = customerBankAccountNumber;
    return this;
  }

   /**
   * Customer bank account. Required if you want to do a bank account check (TPV)
   * @return customerBankAccountNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Customer bank account. Required if you want to do a bank account check (TPV)")
  public String getCustomerBankAccountNumber() {
    return customerBankAccountNumber;
  }


  public void setCustomerBankAccountNumber(String customerBankAccountNumber) {
    this.customerBankAccountNumber = customerBankAccountNumber;
  }


  public CustomerDetails customerBankIfsc(String customerBankIfsc) {
    
    this.customerBankIfsc = customerBankIfsc;
    return this;
  }

   /**
   * Customer bank IFSC. Required if you want to do a bank account check (TPV)
   * @return customerBankIfsc
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Customer bank IFSC. Required if you want to do a bank account check (TPV)")
  public String getCustomerBankIfsc() {
    return customerBankIfsc;
  }


  public void setCustomerBankIfsc(String customerBankIfsc) {
    this.customerBankIfsc = customerBankIfsc;
  }


  public CustomerDetails customerBankCode(BigDecimal customerBankCode) {
    
    this.customerBankCode = customerBankCode;
    return this;
  }

   /**
   * Customer bank code. Required for net banking payments, if you want to do a bank account check (TPV)
   * @return customerBankCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Customer bank code. Required for net banking payments, if you want to do a bank account check (TPV)")
  public BigDecimal getCustomerBankCode() {
    return customerBankCode;
  }


  public void setCustomerBankCode(BigDecimal customerBankCode) {
    this.customerBankCode = customerBankCode;
  }


  public CustomerDetails customerUid(String customerUid) {
    
    this.customerUid = customerUid;
    return this;
  }

   /**
   * Customer identifier at Cashfree. You will get this when you create/get customer
   * @return customerUid
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Customer identifier at Cashfree. You will get this when you create/get customer")
  public String getCustomerUid() {
    return customerUid;
  }


  public void setCustomerUid(String customerUid) {
    this.customerUid = customerUid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDetails customerDetails = (CustomerDetails) o;
    return Objects.equals(this.customerId, customerDetails.customerId) &&
        Objects.equals(this.customerEmail, customerDetails.customerEmail) &&
        Objects.equals(this.customerPhone, customerDetails.customerPhone) &&
        Objects.equals(this.customerName, customerDetails.customerName) &&
        Objects.equals(this.customerBankAccountNumber, customerDetails.customerBankAccountNumber) &&
        Objects.equals(this.customerBankIfsc, customerDetails.customerBankIfsc) &&
        Objects.equals(this.customerBankCode, customerDetails.customerBankCode) &&
        Objects.equals(this.customerUid, customerDetails.customerUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, customerEmail, customerPhone, customerName, customerBankAccountNumber, customerBankIfsc, customerBankCode, customerUid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDetails {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    customerPhone: ").append(toIndentedString(customerPhone)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerBankAccountNumber: ").append(toIndentedString(customerBankAccountNumber)).append("\n");
    sb.append("    customerBankIfsc: ").append(toIndentedString(customerBankIfsc)).append("\n");
    sb.append("    customerBankCode: ").append(toIndentedString(customerBankCode)).append("\n");
    sb.append("    customerUid: ").append(toIndentedString(customerUid)).append("\n");
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
    openapiFields.add("customer_id");
    openapiFields.add("customer_email");
    openapiFields.add("customer_phone");
    openapiFields.add("customer_name");
    openapiFields.add("customer_bank_account_number");
    openapiFields.add("customer_bank_ifsc");
    openapiFields.add("customer_bank_code");
    openapiFields.add("customer_uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("customer_id");
    openapiRequiredFields.add("customer_phone");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_id").toString()));
      }
      if ((jsonObj.get("customer_email") != null && !jsonObj.get("customer_email").isJsonNull()) && !jsonObj.get("customer_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_email").toString()));
      }
      if (!jsonObj.get("customer_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_phone").toString()));
      }
      if ((jsonObj.get("customer_name") != null && !jsonObj.get("customer_name").isJsonNull()) && !jsonObj.get("customer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_name").toString()));
      }
      if ((jsonObj.get("customer_bank_account_number") != null && !jsonObj.get("customer_bank_account_number").isJsonNull()) && !jsonObj.get("customer_bank_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_account_number").toString()));
      }
      if ((jsonObj.get("customer_bank_ifsc") != null && !jsonObj.get("customer_bank_ifsc").isJsonNull()) && !jsonObj.get("customer_bank_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_ifsc").toString()));
      }
      if ((jsonObj.get("customer_uid") != null && !jsonObj.get("customer_uid").isJsonNull()) && !jsonObj.get("customer_uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_uid").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_id").toString()));
      }
      if ((jsonObj.get("customer_email") != null && !jsonObj.get("customer_email").isJsonNull()) && !jsonObj.get("customer_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_email").toString()));
      }
      if (!jsonObj.get("customer_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_phone").toString()));
      }
      if ((jsonObj.get("customer_name") != null && !jsonObj.get("customer_name").isJsonNull()) && !jsonObj.get("customer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_name").toString()));
      }
      if ((jsonObj.get("customer_bank_account_number") != null && !jsonObj.get("customer_bank_account_number").isJsonNull()) && !jsonObj.get("customer_bank_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_account_number").toString()));
      }
      if ((jsonObj.get("customer_bank_ifsc") != null && !jsonObj.get("customer_bank_ifsc").isJsonNull()) && !jsonObj.get("customer_bank_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_ifsc").toString()));
      }
      if ((jsonObj.get("customer_uid") != null && !jsonObj.get("customer_uid").isJsonNull()) && !jsonObj.get("customer_uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_uid").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerDetails>() {
           @Override
           public void write(JsonWriter out, CustomerDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerDetails
  * @throws IOException if the JSON string is invalid with respect to CustomerDetails
  */
  public static CustomerDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerDetails.class);
  }

 /**
  * Convert an instance of CustomerDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

