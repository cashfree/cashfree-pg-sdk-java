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
 * Create Vendor Request
 */
@Schema(description = "Create Vendor Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-11T13:19:53.679604Z[Etc/UTC]")
public class CreateVendorRequest {
  public static final String SERIALIZED_NAME_VENDOR_ID = "vendor_id";
  @SerializedName(SERIALIZED_NAME_VENDOR_ID)
  private String vendorId;

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

  public CreateVendorRequest() {
  }

  public CreateVendorRequest vendorId(String vendorId) {
    
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Specify the unique Vendor ID to identify the beneficiary. Alphanumeric and underscore (_) allowed.
   * @return vendorId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Specify the unique Vendor ID to identify the beneficiary. Alphanumeric and underscore (_) allowed.")
  public String getVendorId() {
    return vendorId;
  }


  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }


  public CreateVendorRequest status(String status) {
    
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


  public CreateVendorRequest name(String name) {
    
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


  public CreateVendorRequest email(String email) {
    
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


  public CreateVendorRequest phone(String phone) {
    
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


  public CreateVendorRequest verifyAccount(Boolean verifyAccount) {
    
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


  public CreateVendorRequest dashboardAccess(Boolean dashboardAccess) {
    
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


  public CreateVendorRequest scheduleOption(BigDecimal scheduleOption) {
    
    this.scheduleOption = scheduleOption;
    return this;
  }

   /**
   * Specify the settlement cycle to be updated. View the settlement cycle details from the \&quot;Settlement Cycles Supported\&quot; table.  If no schedule option is configured, the settlement cycle ID \&quot;1\&quot; will be in effect. Select \&quot;8\&quot; or \&quot;9\&quot; if you want to schedule instant vendor settlements.
   * @return scheduleOption
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Specify the settlement cycle to be updated. View the settlement cycle details from the \"Settlement Cycles Supported\" table.  If no schedule option is configured, the settlement cycle ID \"1\" will be in effect. Select \"8\" or \"9\" if you want to schedule instant vendor settlements.")
  public BigDecimal getScheduleOption() {
    return scheduleOption;
  }


  public void setScheduleOption(BigDecimal scheduleOption) {
    this.scheduleOption = scheduleOption;
  }


  public CreateVendorRequest bank(List<BankDetails> bank) {
    
    this.bank = bank;
    return this;
  }

  public CreateVendorRequest addBankItem(BankDetails bankItem) {
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


  public CreateVendorRequest upi(List<UpiDetails> upi) {
    
    this.upi = upi;
    return this;
  }

  public CreateVendorRequest addUpiItem(UpiDetails upiItem) {
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


  public CreateVendorRequest kycDetails(List<KycDetails> kycDetails) {
    
    this.kycDetails = kycDetails;
    return this;
  }

  public CreateVendorRequest addKycDetailsItem(KycDetails kycDetailsItem) {
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
    CreateVendorRequest createVendorRequest = (CreateVendorRequest) o;
    return Objects.equals(this.vendorId, createVendorRequest.vendorId) &&
        Objects.equals(this.status, createVendorRequest.status) &&
        Objects.equals(this.name, createVendorRequest.name) &&
        Objects.equals(this.email, createVendorRequest.email) &&
        Objects.equals(this.phone, createVendorRequest.phone) &&
        Objects.equals(this.verifyAccount, createVendorRequest.verifyAccount) &&
        Objects.equals(this.dashboardAccess, createVendorRequest.dashboardAccess) &&
        Objects.equals(this.scheduleOption, createVendorRequest.scheduleOption) &&
        Objects.equals(this.bank, createVendorRequest.bank) &&
        Objects.equals(this.upi, createVendorRequest.upi) &&
        Objects.equals(this.kycDetails, createVendorRequest.kycDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorId, status, name, email, phone, verifyAccount, dashboardAccess, scheduleOption, bank, upi, kycDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVendorRequest {\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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
    openapiFields.add("vendor_id");
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
    openapiRequiredFields.add("vendor_id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("phone");
    openapiRequiredFields.add("kyc_details");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateVendorRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateVendorRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_id").toString()));
      }
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
  * @throws IOException if the JSON Element is invalid with respect to CreateVendorRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateVendorRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_id").toString()));
      }
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
       if (!CreateVendorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateVendorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateVendorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateVendorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateVendorRequest>() {
           @Override
           public void write(JsonWriter out, CreateVendorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateVendorRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateVendorRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateVendorRequest
  * @throws IOException if the JSON string is invalid with respect to CreateVendorRequest
  */
  public static CreateVendorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateVendorRequest.class);
  }

 /**
  * Convert an instance of CreateVendorRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

