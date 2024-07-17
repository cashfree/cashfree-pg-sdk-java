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
import com.cashfree.model.EligibilityMethodItemEntityDetailsAvailableHandlesInner;
import com.cashfree.model.SubscriptionBankDetails;
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
 * EligibilityMethodItemEntityDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T08:49:56.545492Z[Etc/UTC]")
public class EligibilityMethodItemEntityDetails {
  public static final String SERIALIZED_NAME_ACCOUNT_TYPES = "account_types";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPES)
  private List<String> accountTypes;

  public static final String SERIALIZED_NAME_FREQUENT_BANK_DETAILS = "frequent_bank_details";
  @SerializedName(SERIALIZED_NAME_FREQUENT_BANK_DETAILS)
  private List<SubscriptionBankDetails> frequentBankDetails;

  public static final String SERIALIZED_NAME_ALL_BANK_DETAILS = "all_bank_details";
  @SerializedName(SERIALIZED_NAME_ALL_BANK_DETAILS)
  private List<SubscriptionBankDetails> allBankDetails;

  public static final String SERIALIZED_NAME_AVAILABLE_HANDLES = "available_handles";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_HANDLES)
  private List<EligibilityMethodItemEntityDetailsAvailableHandlesInner> availableHandles;

  public static final String SERIALIZED_NAME_ALLOWED_CARD_TYPES = "allowed_card_types";
  @SerializedName(SERIALIZED_NAME_ALLOWED_CARD_TYPES)
  private List<String> allowedCardTypes;

  public EligibilityMethodItemEntityDetails() {
  }

  public EligibilityMethodItemEntityDetails accountTypes(List<String> accountTypes) {
    
    this.accountTypes = accountTypes;
    return this;
  }

  public EligibilityMethodItemEntityDetails addAccountTypesItem(String accountTypesItem) {
    if (this.accountTypes == null) {
      this.accountTypes = new ArrayList<>();
    }
    this.accountTypes.add(accountTypesItem);
    return this;
  }

   /**
   * List of account types associated with the payment method. (e.g. SAVINGS or CURRENT)
   * @return accountTypes
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "List of account types associated with the payment method. (e.g. SAVINGS or CURRENT)")
  public List<String> getAccountTypes() {
    return accountTypes;
  }


  public void setAccountTypes(List<String> accountTypes) {
    this.accountTypes = accountTypes;
  }


  public EligibilityMethodItemEntityDetails frequentBankDetails(List<SubscriptionBankDetails> frequentBankDetails) {
    
    this.frequentBankDetails = frequentBankDetails;
    return this;
  }

  public EligibilityMethodItemEntityDetails addFrequentBankDetailsItem(SubscriptionBankDetails frequentBankDetailsItem) {
    if (this.frequentBankDetails == null) {
      this.frequentBankDetails = new ArrayList<>();
    }
    this.frequentBankDetails.add(frequentBankDetailsItem);
    return this;
  }

   /**
   * List of the most frequently used banks.
   * @return frequentBankDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "List of the most frequently used banks.")
  public List<SubscriptionBankDetails> getFrequentBankDetails() {
    return frequentBankDetails;
  }


  public void setFrequentBankDetails(List<SubscriptionBankDetails> frequentBankDetails) {
    this.frequentBankDetails = frequentBankDetails;
  }


  public EligibilityMethodItemEntityDetails allBankDetails(List<SubscriptionBankDetails> allBankDetails) {
    
    this.allBankDetails = allBankDetails;
    return this;
  }

  public EligibilityMethodItemEntityDetails addAllBankDetailsItem(SubscriptionBankDetails allBankDetailsItem) {
    if (this.allBankDetails == null) {
      this.allBankDetails = new ArrayList<>();
    }
    this.allBankDetails.add(allBankDetailsItem);
    return this;
  }

   /**
   * Details about all banks associated with the payment method.
   * @return allBankDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Details about all banks associated with the payment method.")
  public List<SubscriptionBankDetails> getAllBankDetails() {
    return allBankDetails;
  }


  public void setAllBankDetails(List<SubscriptionBankDetails> allBankDetails) {
    this.allBankDetails = allBankDetails;
  }


  public EligibilityMethodItemEntityDetails availableHandles(List<EligibilityMethodItemEntityDetailsAvailableHandlesInner> availableHandles) {
    
    this.availableHandles = availableHandles;
    return this;
  }

  public EligibilityMethodItemEntityDetails addAvailableHandlesItem(EligibilityMethodItemEntityDetailsAvailableHandlesInner availableHandlesItem) {
    if (this.availableHandles == null) {
      this.availableHandles = new ArrayList<>();
    }
    this.availableHandles.add(availableHandlesItem);
    return this;
  }

   /**
   * List of supported VPA handles.
   * @return availableHandles
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "List of supported VPA handles.")
  public List<EligibilityMethodItemEntityDetailsAvailableHandlesInner> getAvailableHandles() {
    return availableHandles;
  }


  public void setAvailableHandles(List<EligibilityMethodItemEntityDetailsAvailableHandlesInner> availableHandles) {
    this.availableHandles = availableHandles;
  }


  public EligibilityMethodItemEntityDetails allowedCardTypes(List<String> allowedCardTypes) {
    
    this.allowedCardTypes = allowedCardTypes;
    return this;
  }

  public EligibilityMethodItemEntityDetails addAllowedCardTypesItem(String allowedCardTypesItem) {
    if (this.allowedCardTypes == null) {
      this.allowedCardTypes = new ArrayList<>();
    }
    this.allowedCardTypes.add(allowedCardTypesItem);
    return this;
  }

   /**
   * List of allowed card types. (e.g. DEBIT_CARD, CREDIT_CARD)
   * @return allowedCardTypes
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "List of allowed card types. (e.g. DEBIT_CARD, CREDIT_CARD)")
  public List<String> getAllowedCardTypes() {
    return allowedCardTypes;
  }


  public void setAllowedCardTypes(List<String> allowedCardTypes) {
    this.allowedCardTypes = allowedCardTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EligibilityMethodItemEntityDetails eligibilityMethodItemEntityDetails = (EligibilityMethodItemEntityDetails) o;
    return Objects.equals(this.accountTypes, eligibilityMethodItemEntityDetails.accountTypes) &&
        Objects.equals(this.frequentBankDetails, eligibilityMethodItemEntityDetails.frequentBankDetails) &&
        Objects.equals(this.allBankDetails, eligibilityMethodItemEntityDetails.allBankDetails) &&
        Objects.equals(this.availableHandles, eligibilityMethodItemEntityDetails.availableHandles) &&
        Objects.equals(this.allowedCardTypes, eligibilityMethodItemEntityDetails.allowedCardTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountTypes, frequentBankDetails, allBankDetails, availableHandles, allowedCardTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityMethodItemEntityDetails {\n");
    sb.append("    accountTypes: ").append(toIndentedString(accountTypes)).append("\n");
    sb.append("    frequentBankDetails: ").append(toIndentedString(frequentBankDetails)).append("\n");
    sb.append("    allBankDetails: ").append(toIndentedString(allBankDetails)).append("\n");
    sb.append("    availableHandles: ").append(toIndentedString(availableHandles)).append("\n");
    sb.append("    allowedCardTypes: ").append(toIndentedString(allowedCardTypes)).append("\n");
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
    openapiFields.add("account_types");
    openapiFields.add("frequent_bank_details");
    openapiFields.add("all_bank_details");
    openapiFields.add("available_handles");
    openapiFields.add("allowed_card_types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EligibilityMethodItemEntityDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("account_types") != null && !jsonObj.get("account_types").isJsonNull() && !jsonObj.get("account_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_types` to be an array in the JSON string but got `%s`", jsonObj.get("account_types").toString()));
      }
      if (jsonObj.get("frequent_bank_details") != null && !jsonObj.get("frequent_bank_details").isJsonNull()) {
        JsonArray jsonArrayfrequentBankDetails = jsonObj.getAsJsonArray("frequent_bank_details");
        if (jsonArrayfrequentBankDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("frequent_bank_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `frequent_bank_details` to be an array in the JSON string but got `%s`", jsonObj.get("frequent_bank_details").toString()));
          }

          // validate the optional field `frequent_bank_details` (array)
          for (int i = 0; i < jsonArrayfrequentBankDetails.size(); i++) {
            SubscriptionBankDetails.validateJsonElement(jsonArrayfrequentBankDetails.get(i));
          };
        }
      }
      if (jsonObj.get("all_bank_details") != null && !jsonObj.get("all_bank_details").isJsonNull()) {
        JsonArray jsonArrayallBankDetails = jsonObj.getAsJsonArray("all_bank_details");
        if (jsonArrayallBankDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("all_bank_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `all_bank_details` to be an array in the JSON string but got `%s`", jsonObj.get("all_bank_details").toString()));
          }

          // validate the optional field `all_bank_details` (array)
          for (int i = 0; i < jsonArrayallBankDetails.size(); i++) {
            SubscriptionBankDetails.validateJsonElement(jsonArrayallBankDetails.get(i));
          };
        }
      }
      if (jsonObj.get("available_handles") != null && !jsonObj.get("available_handles").isJsonNull()) {
        JsonArray jsonArrayavailableHandles = jsonObj.getAsJsonArray("available_handles");
        if (jsonArrayavailableHandles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("available_handles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `available_handles` to be an array in the JSON string but got `%s`", jsonObj.get("available_handles").toString()));
          }

          // validate the optional field `available_handles` (array)
          for (int i = 0; i < jsonArrayavailableHandles.size(); i++) {
            EligibilityMethodItemEntityDetailsAvailableHandlesInner.validateJsonElement(jsonArrayavailableHandles.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_card_types") != null && !jsonObj.get("allowed_card_types").isJsonNull() && !jsonObj.get("allowed_card_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_card_types` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_card_types").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EligibilityMethodItemEntityDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("account_types") != null && !jsonObj.get("account_types").isJsonNull() && !jsonObj.get("account_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_types` to be an array in the JSON string but got `%s`", jsonObj.get("account_types").toString()));
      }
      if (jsonObj.get("frequent_bank_details") != null && !jsonObj.get("frequent_bank_details").isJsonNull()) {
        JsonArray jsonArrayfrequentBankDetails = jsonObj.getAsJsonArray("frequent_bank_details");
        if (jsonArrayfrequentBankDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("frequent_bank_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `frequent_bank_details` to be an array in the JSON string but got `%s`", jsonObj.get("frequent_bank_details").toString()));
          }

          // validate the optional field `frequent_bank_details` (array)
          for (int i = 0; i < jsonArrayfrequentBankDetails.size(); i++) {
            SubscriptionBankDetails.validateJsonElement(jsonArrayfrequentBankDetails.get(i));
          };
        }
      }
      if (jsonObj.get("all_bank_details") != null && !jsonObj.get("all_bank_details").isJsonNull()) {
        JsonArray jsonArrayallBankDetails = jsonObj.getAsJsonArray("all_bank_details");
        if (jsonArrayallBankDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("all_bank_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `all_bank_details` to be an array in the JSON string but got `%s`", jsonObj.get("all_bank_details").toString()));
          }

          // validate the optional field `all_bank_details` (array)
          for (int i = 0; i < jsonArrayallBankDetails.size(); i++) {
            SubscriptionBankDetails.validateJsonElement(jsonArrayallBankDetails.get(i));
          };
        }
      }
      if (jsonObj.get("available_handles") != null && !jsonObj.get("available_handles").isJsonNull()) {
        JsonArray jsonArrayavailableHandles = jsonObj.getAsJsonArray("available_handles");
        if (jsonArrayavailableHandles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("available_handles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `available_handles` to be an array in the JSON string but got `%s`", jsonObj.get("available_handles").toString()));
          }

          // validate the optional field `available_handles` (array)
          for (int i = 0; i < jsonArrayavailableHandles.size(); i++) {
            EligibilityMethodItemEntityDetailsAvailableHandlesInner.validateJsonElement(jsonArrayavailableHandles.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_card_types") != null && !jsonObj.get("allowed_card_types").isJsonNull() && !jsonObj.get("allowed_card_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_card_types` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_card_types").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EligibilityMethodItemEntityDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EligibilityMethodItemEntityDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EligibilityMethodItemEntityDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EligibilityMethodItemEntityDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<EligibilityMethodItemEntityDetails>() {
           @Override
           public void write(JsonWriter out, EligibilityMethodItemEntityDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EligibilityMethodItemEntityDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EligibilityMethodItemEntityDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EligibilityMethodItemEntityDetails
  * @throws IOException if the JSON string is invalid with respect to EligibilityMethodItemEntityDetails
  */
  public static EligibilityMethodItemEntityDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EligibilityMethodItemEntityDetails.class);
  }

 /**
  * Convert an instance of EligibilityMethodItemEntityDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

