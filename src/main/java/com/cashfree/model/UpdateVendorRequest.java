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
import com.cashfree.model.BankDetails;
import com.cashfree.model.KycDetails;
import com.cashfree.model.UpiDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
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
 * Update Vendor Request
 */
@Schema(description = "Update Vendor Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T08:43:25.672141Z[Etc/UTC]")
public class UpdateVendorRequest {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_VERIFY_ACCOUNT = "verify_account";
  @SerializedName(SERIALIZED_NAME_VERIFY_ACCOUNT)
  private Boolean verifyAccount;

  public static final String SERIALIZED_NAME_DASHBOARD_ACCESS = "dashboard_access";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_ACCESS)
  private Boolean dashboardAccess;

  public static final String SERIALIZED_NAME_SCHEDULE_OPTION = "schedule_option";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_OPTION)
  private BigDecimal scheduleOption;

  public static final String SERIALIZED_NAME_BANK = "bank";
  @SerializedName(SERIALIZED_NAME_BANK)
  private List<BankDetails> bank;

  public static final String SERIALIZED_NAME_UPI = "upi";
  @SerializedName(SERIALIZED_NAME_UPI)
  private List<UpiDetails> upi;

  public static final String SERIALIZED_NAME_KYC_DETAILS = "kyc_details";
  @SerializedName(SERIALIZED_NAME_KYC_DETAILS)
  private List<KycDetails> kycDetails = new ArrayList<>();

  public UpdateVendorRequest() {
  }

  public UpdateVendorRequest status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Specify the status of vendor that should be updated. Possible values: ACTIVE,BLOCKED, DELETED
   * @return status
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Specify the status of vendor that should be updated. Possible values: ACTIVE,BLOCKED, DELETED")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public UpdateVendorRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specify the name of the vendor to be updated. Name should not have any special character except . / - &amp;
   * @return name
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Specify the name of the vendor to be updated. Name should not have any special character except . / - &")
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateVendorRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Specify the vendor email ID that should be updated. String in email ID format (Ex:johndoe_1@cashfree.com) should contain @ and dot (.)
   * @return email
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Specify the vendor email ID that should be updated. String in email ID format (Ex:johndoe_1@cashfree.com) should contain @ and dot (.)")
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateVendorRequest phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Specify the beneficiaries phone number to be updated. Phone number registered in India (only digits, 8 - 12 characters after excluding +91).
   * @return phone
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Specify the beneficiaries phone number to be updated. Phone number registered in India (only digits, 8 - 12 characters after excluding +91).")
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public UpdateVendorRequest verifyAccount(Boolean verifyAccount) {
    
    this.verifyAccount = verifyAccount;
    return this;
  }

   /**
   * Specify if the vendor bank account details should be verified. Possible values: true or false
   * @return verifyAccount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Specify if the vendor bank account details should be verified. Possible values: true or false")
  public Boolean getVerifyAccount() {
    return verifyAccount;
  }


  public void setVerifyAccount(Boolean verifyAccount) {
    this.verifyAccount = verifyAccount;
  }


  public UpdateVendorRequest dashboardAccess(Boolean dashboardAccess) {
    
    this.dashboardAccess = dashboardAccess;
    return this;
  }

   /**
   * Update if the vendor will have dashboard access or not. Possible values are: true or false
   * @return dashboardAccess
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Update if the vendor will have dashboard access or not. Possible values are: true or false")
  public Boolean getDashboardAccess() {
    return dashboardAccess;
  }


  public void setDashboardAccess(Boolean dashboardAccess) {
    this.dashboardAccess = dashboardAccess;
  }


  public UpdateVendorRequest scheduleOption(BigDecimal scheduleOption) {
    
    this.scheduleOption = scheduleOption;
    return this;
  }

   /**
   * Specify the settlement cycle to be updated. View the settlement cycle details from the \&quot;Settlement Cycles Supported\&quot; table.  If no schedule option is configured, the settlement cycle ID \&quot;1\&quot; will be in effect. Select \&quot;8\&quot; or \&quot;9\&quot; if you want to schedule instant vendor settlements.
   * @return scheduleOption
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Specify the settlement cycle to be updated. View the settlement cycle details from the \"Settlement Cycles Supported\" table.  If no schedule option is configured, the settlement cycle ID \"1\" will be in effect. Select \"8\" or \"9\" if you want to schedule instant vendor settlements.")
  public BigDecimal getScheduleOption() {
    return scheduleOption;
  }


  public void setScheduleOption(BigDecimal scheduleOption) {
    this.scheduleOption = scheduleOption;
  }


  public UpdateVendorRequest bank(List<BankDetails> bank) {
    
    this.bank = bank;
    return this;
  }

  public UpdateVendorRequest addBankItem(BankDetails bankItem) {
    if (this.bank == null) {
      this.bank = new ArrayList<>();
    }
    this.bank.add(bankItem);
    return this;
  }

   /**
   * Specify the vendor bank account details to be updated.
   * @return bank
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Specify the vendor bank account details to be updated.")
  public List<BankDetails> getBank() {
    return bank;
  }


  public void setBank(List<BankDetails> bank) {
    this.bank = bank;
  }


  public UpdateVendorRequest upi(List<UpiDetails> upi) {
    
    this.upi = upi;
    return this;
  }

  public UpdateVendorRequest addUpiItem(UpiDetails upiItem) {
    if (this.upi == null) {
      this.upi = new ArrayList<>();
    }
    this.upi.add(upiItem);
    return this;
  }

   /**
   * Updated beneficiary upi vpa. Alphanumeric, dot (.), hyphen (-), at sign (@), and underscore allowed (100 character limit). Note: underscore and dot (.) gets accepted before and after @, but hyphen (-) is only accepted before @ sign.
   * @return upi
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Updated beneficiary upi vpa. Alphanumeric, dot (.), hyphen (-), at sign (@), and underscore allowed (100 character limit). Note: underscore and dot (.) gets accepted before and after @, but hyphen (-) is only accepted before @ sign.")
  public List<UpiDetails> getUpi() {
    return upi;
  }


  public void setUpi(List<UpiDetails> upi) {
    this.upi = upi;
  }


  public UpdateVendorRequest kycDetails(List<KycDetails> kycDetails) {
    
    this.kycDetails = kycDetails;
    return this;
  }

  public UpdateVendorRequest addKycDetailsItem(KycDetails kycDetailsItem) {
    if (this.kycDetails == null) {
      this.kycDetails = new ArrayList<>();
    }
    this.kycDetails.add(kycDetailsItem);
    return this;
  }

   /**
   * Specify the kyc details that should be updated.
   * @return kycDetails
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Specify the kyc details that should be updated.")
  public List<KycDetails> getKycDetails() {
    return kycDetails;
  }


  public void setKycDetails(List<KycDetails> kycDetails) {
    this.kycDetails = kycDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVendorRequest updateVendorRequest = (UpdateVendorRequest) o;
    return Objects.equals(this.status, updateVendorRequest.status) &&
        Objects.equals(this.name, updateVendorRequest.name) &&
        Objects.equals(this.email, updateVendorRequest.email) &&
        Objects.equals(this.phone, updateVendorRequest.phone) &&
        Objects.equals(this.verifyAccount, updateVendorRequest.verifyAccount) &&
        Objects.equals(this.dashboardAccess, updateVendorRequest.dashboardAccess) &&
        Objects.equals(this.scheduleOption, updateVendorRequest.scheduleOption) &&
        Objects.equals(this.bank, updateVendorRequest.bank) &&
        Objects.equals(this.upi, updateVendorRequest.upi) &&
        Objects.equals(this.kycDetails, updateVendorRequest.kycDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, name, email, phone, verifyAccount, dashboardAccess, scheduleOption, bank, upi, kycDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVendorRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    verifyAccount: ").append(toIndentedString(verifyAccount)).append("\n");
    sb.append("    dashboardAccess: ").append(toIndentedString(dashboardAccess)).append("\n");
    sb.append("    scheduleOption: ").append(toIndentedString(scheduleOption)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    upi: ").append(toIndentedString(upi)).append("\n");
    sb.append("    kycDetails: ").append(toIndentedString(kycDetails)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("verify_account");
    openapiFields.add("dashboard_access");
    openapiFields.add("schedule_option");
    openapiFields.add("bank");
    openapiFields.add("upi");
    openapiFields.add("kyc_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("phone");
    openapiRequiredFields.add("schedule_option");
    openapiRequiredFields.add("kyc_details");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateVendorRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateVendorRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (jsonObj.get("bank") != null && !jsonObj.get("bank").isJsonNull()) {
        JsonArray jsonArraybank = jsonObj.getAsJsonArray("bank");
        if (jsonArraybank != null) {
          // ensure the json data is an array
          if (!jsonObj.get("bank").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `bank` to be an array in the JSON string but got `%s`", jsonObj.get("bank").toString()));
          }

          // validate the optional field `bank` (array)
          for (int i = 0; i < jsonArraybank.size(); i++) {
            BankDetails.validateJsonElement(jsonArraybank.get(i));
          };
        }
      }
      if (jsonObj.get("upi") != null && !jsonObj.get("upi").isJsonNull()) {
        JsonArray jsonArrayupi = jsonObj.getAsJsonArray("upi");
        if (jsonArrayupi != null) {
          // ensure the json data is an array
          if (!jsonObj.get("upi").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `upi` to be an array in the JSON string but got `%s`", jsonObj.get("upi").toString()));
          }

          // validate the optional field `upi` (array)
          for (int i = 0; i < jsonArrayupi.size(); i++) {
            UpiDetails.validateJsonElement(jsonArrayupi.get(i));
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("kyc_details").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `kyc_details` to be an array in the JSON string but got `%s`", jsonObj.get("kyc_details").toString()));
      }

      JsonArray jsonArraykycDetails = jsonObj.getAsJsonArray("kyc_details");
      // validate the required field `kyc_details` (array)
      for (int i = 0; i < jsonArraykycDetails.size(); i++) {
        KycDetails.validateJsonElement(jsonArraykycDetails.get(i));
      };
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateVendorRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateVendorRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (jsonObj.get("bank") != null && !jsonObj.get("bank").isJsonNull()) {
        JsonArray jsonArraybank = jsonObj.getAsJsonArray("bank");
        if (jsonArraybank != null) {
          // ensure the json data is an array
          if (!jsonObj.get("bank").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `bank` to be an array in the JSON string but got `%s`", jsonObj.get("bank").toString()));
          }

          // validate the optional field `bank` (array)
          for (int i = 0; i < jsonArraybank.size(); i++) {
            BankDetails.validateJsonElement(jsonArraybank.get(i));
          };
        }
      }
      if (jsonObj.get("upi") != null && !jsonObj.get("upi").isJsonNull()) {
        JsonArray jsonArrayupi = jsonObj.getAsJsonArray("upi");
        if (jsonArrayupi != null) {
          // ensure the json data is an array
          if (!jsonObj.get("upi").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `upi` to be an array in the JSON string but got `%s`", jsonObj.get("upi").toString()));
          }

          // validate the optional field `upi` (array)
          for (int i = 0; i < jsonArrayupi.size(); i++) {
            UpiDetails.validateJsonElement(jsonArrayupi.get(i));
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("kyc_details").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `kyc_details` to be an array in the JSON string but got `%s`", jsonObj.get("kyc_details").toString()));
      }

      JsonArray jsonArraykycDetails = jsonObj.getAsJsonArray("kyc_details");
      // validate the required field `kyc_details` (array)
      for (int i = 0; i < jsonArraykycDetails.size(); i++) {
        KycDetails.validateJsonElement(jsonArraykycDetails.get(i));
      };
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateVendorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateVendorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateVendorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateVendorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateVendorRequest>() {
           @Override
           public void write(JsonWriter out, UpdateVendorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateVendorRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateVendorRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateVendorRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateVendorRequest
  */
  public static UpdateVendorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateVendorRequest.class);
  }

 /**
  * Convert an instance of UpdateVendorRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

