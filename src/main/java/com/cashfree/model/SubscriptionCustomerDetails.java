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
 * Subscription customer details.
 */
@Schema(description = "Subscription customer details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T09:00:37.237094Z[Etc/UTC]")
public class SubscriptionCustomerDetails {
  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customer_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName;

  public static final String SERIALIZED_NAME_CUSTOMER_EMAIL = "customer_email";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_EMAIL)
  private String customerEmail;

  public static final String SERIALIZED_NAME_CUSTOMER_PHONE = "customer_phone";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PHONE)
  private String customerPhone;

  public static final String SERIALIZED_NAME_CUSTOMER_BANK_ACCOUNT_HOLDER_NAME = "customer_bank_account_holder_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK_ACCOUNT_HOLDER_NAME)
  private String customerBankAccountHolderName;

  public static final String SERIALIZED_NAME_CUSTOMER_BANK_ACCOUNT_NUMBER = "customer_bank_account_number";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK_ACCOUNT_NUMBER)
  private String customerBankAccountNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_BANK_IFSC = "customer_bank_ifsc";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK_IFSC)
  private String customerBankIfsc;

  public static final String SERIALIZED_NAME_CUSTOMER_BANK_CODE = "customer_bank_code";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK_CODE)
  private String customerBankCode;

  public static final String SERIALIZED_NAME_CUSTOMER_BANK_ACCOUNT_TYPE = "customer_bank_account_type";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK_ACCOUNT_TYPE)
  private String customerBankAccountType;

  public SubscriptionCustomerDetails() {
  }

  public SubscriptionCustomerDetails customerName(String customerName) {
    
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


  public SubscriptionCustomerDetails customerEmail(String customerEmail) {
    
    this.customerEmail = customerEmail;
    return this;
  }

   /**
   * Email of the customer.
   * @return customerEmail
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Email of the customer.")
  public String getCustomerEmail() {
    return customerEmail;
  }


  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }


  public SubscriptionCustomerDetails customerPhone(String customerPhone) {
    
    this.customerPhone = customerPhone;
    return this;
  }

   /**
   * Phone number of the customer.
   * @return customerPhone
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Phone number of the customer.")
  public String getCustomerPhone() {
    return customerPhone;
  }


  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }


  public SubscriptionCustomerDetails customerBankAccountHolderName(String customerBankAccountHolderName) {
    
    this.customerBankAccountHolderName = customerBankAccountHolderName;
    return this;
  }

   /**
   * Bank holder name of the customer.
   * @return customerBankAccountHolderName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Bank holder name of the customer.")
  public String getCustomerBankAccountHolderName() {
    return customerBankAccountHolderName;
  }


  public void setCustomerBankAccountHolderName(String customerBankAccountHolderName) {
    this.customerBankAccountHolderName = customerBankAccountHolderName;
  }


  public SubscriptionCustomerDetails customerBankAccountNumber(String customerBankAccountNumber) {
    
    this.customerBankAccountNumber = customerBankAccountNumber;
    return this;
  }

   /**
   * Bank account number of the customer.
   * @return customerBankAccountNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Bank account number of the customer.")
  public String getCustomerBankAccountNumber() {
    return customerBankAccountNumber;
  }


  public void setCustomerBankAccountNumber(String customerBankAccountNumber) {
    this.customerBankAccountNumber = customerBankAccountNumber;
  }


  public SubscriptionCustomerDetails customerBankIfsc(String customerBankIfsc) {
    
    this.customerBankIfsc = customerBankIfsc;
    return this;
  }

   /**
   * IFSC code of the customer.
   * @return customerBankIfsc
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "IFSC code of the customer.")
  public String getCustomerBankIfsc() {
    return customerBankIfsc;
  }


  public void setCustomerBankIfsc(String customerBankIfsc) {
    this.customerBankIfsc = customerBankIfsc;
  }


  public SubscriptionCustomerDetails customerBankCode(String customerBankCode) {
    
    this.customerBankCode = customerBankCode;
    return this;
  }

   /**
   * Bank code of the customer.
   * @return customerBankCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Bank code of the customer.")
  public String getCustomerBankCode() {
    return customerBankCode;
  }


  public void setCustomerBankCode(String customerBankCode) {
    this.customerBankCode = customerBankCode;
  }


  public SubscriptionCustomerDetails customerBankAccountType(String customerBankAccountType) {
    
    this.customerBankAccountType = customerBankAccountType;
    return this;
  }

   /**
   * Bank account type of the customer.
   * @return customerBankAccountType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Bank account type of the customer.")
  public String getCustomerBankAccountType() {
    return customerBankAccountType;
  }


  public void setCustomerBankAccountType(String customerBankAccountType) {
    this.customerBankAccountType = customerBankAccountType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionCustomerDetails subscriptionCustomerDetails = (SubscriptionCustomerDetails) o;
    return Objects.equals(this.customerName, subscriptionCustomerDetails.customerName) &&
        Objects.equals(this.customerEmail, subscriptionCustomerDetails.customerEmail) &&
        Objects.equals(this.customerPhone, subscriptionCustomerDetails.customerPhone) &&
        Objects.equals(this.customerBankAccountHolderName, subscriptionCustomerDetails.customerBankAccountHolderName) &&
        Objects.equals(this.customerBankAccountNumber, subscriptionCustomerDetails.customerBankAccountNumber) &&
        Objects.equals(this.customerBankIfsc, subscriptionCustomerDetails.customerBankIfsc) &&
        Objects.equals(this.customerBankCode, subscriptionCustomerDetails.customerBankCode) &&
        Objects.equals(this.customerBankAccountType, subscriptionCustomerDetails.customerBankAccountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerName, customerEmail, customerPhone, customerBankAccountHolderName, customerBankAccountNumber, customerBankIfsc, customerBankCode, customerBankAccountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionCustomerDetails {\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    customerPhone: ").append(toIndentedString(customerPhone)).append("\n");
    sb.append("    customerBankAccountHolderName: ").append(toIndentedString(customerBankAccountHolderName)).append("\n");
    sb.append("    customerBankAccountNumber: ").append(toIndentedString(customerBankAccountNumber)).append("\n");
    sb.append("    customerBankIfsc: ").append(toIndentedString(customerBankIfsc)).append("\n");
    sb.append("    customerBankCode: ").append(toIndentedString(customerBankCode)).append("\n");
    sb.append("    customerBankAccountType: ").append(toIndentedString(customerBankAccountType)).append("\n");
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
    openapiFields.add("customer_email");
    openapiFields.add("customer_phone");
    openapiFields.add("customer_bank_account_holder_name");
    openapiFields.add("customer_bank_account_number");
    openapiFields.add("customer_bank_ifsc");
    openapiFields.add("customer_bank_code");
    openapiFields.add("customer_bank_account_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("customer_email");
    openapiRequiredFields.add("customer_phone");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionCustomerDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubscriptionCustomerDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customer_name") != null && !jsonObj.get("customer_name").isJsonNull()) && !jsonObj.get("customer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_name").toString()));
      }
      if (!jsonObj.get("customer_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_email").toString()));
      }
      if (!jsonObj.get("customer_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_phone").toString()));
      }
      if ((jsonObj.get("customer_bank_account_holder_name") != null && !jsonObj.get("customer_bank_account_holder_name").isJsonNull()) && !jsonObj.get("customer_bank_account_holder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_account_holder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_account_holder_name").toString()));
      }
      if ((jsonObj.get("customer_bank_account_number") != null && !jsonObj.get("customer_bank_account_number").isJsonNull()) && !jsonObj.get("customer_bank_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_account_number").toString()));
      }
      if ((jsonObj.get("customer_bank_ifsc") != null && !jsonObj.get("customer_bank_ifsc").isJsonNull()) && !jsonObj.get("customer_bank_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_ifsc").toString()));
      }
      if ((jsonObj.get("customer_bank_code") != null && !jsonObj.get("customer_bank_code").isJsonNull()) && !jsonObj.get("customer_bank_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_code").toString()));
      }
      if ((jsonObj.get("customer_bank_account_type") != null && !jsonObj.get("customer_bank_account_type").isJsonNull()) && !jsonObj.get("customer_bank_account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_account_type").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionCustomerDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubscriptionCustomerDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customer_name") != null && !jsonObj.get("customer_name").isJsonNull()) && !jsonObj.get("customer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_name").toString()));
      }
      if (!jsonObj.get("customer_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_email").toString()));
      }
      if (!jsonObj.get("customer_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_phone").toString()));
      }
      if ((jsonObj.get("customer_bank_account_holder_name") != null && !jsonObj.get("customer_bank_account_holder_name").isJsonNull()) && !jsonObj.get("customer_bank_account_holder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_account_holder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_account_holder_name").toString()));
      }
      if ((jsonObj.get("customer_bank_account_number") != null && !jsonObj.get("customer_bank_account_number").isJsonNull()) && !jsonObj.get("customer_bank_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_account_number").toString()));
      }
      if ((jsonObj.get("customer_bank_ifsc") != null && !jsonObj.get("customer_bank_ifsc").isJsonNull()) && !jsonObj.get("customer_bank_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_ifsc").toString()));
      }
      if ((jsonObj.get("customer_bank_code") != null && !jsonObj.get("customer_bank_code").isJsonNull()) && !jsonObj.get("customer_bank_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_code").toString()));
      }
      if ((jsonObj.get("customer_bank_account_type") != null && !jsonObj.get("customer_bank_account_type").isJsonNull()) && !jsonObj.get("customer_bank_account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_account_type").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionCustomerDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionCustomerDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionCustomerDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionCustomerDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionCustomerDetails>() {
           @Override
           public void write(JsonWriter out, SubscriptionCustomerDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionCustomerDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionCustomerDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionCustomerDetails
  * @throws IOException if the JSON string is invalid with respect to SubscriptionCustomerDetails
  */
  public static SubscriptionCustomerDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionCustomerDetails.class);
  }

 /**
  * Convert an instance of SubscriptionCustomerDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

