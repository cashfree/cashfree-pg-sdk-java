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
import com.cashfree.pg.model.BankDetails;
import com.cashfree.pg.model.KycDetails;
import com.cashfree.pg.model.ScheduleOption;
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

import com.cashfree.pg.JSON;

/**
 * Create Vendor Response
 */
@Schema(description = "Create Vendor Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class CreateVendorResponse {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_BANK = "bank";
  @SerializedName(SERIALIZED_NAME_BANK)
  private List<BankDetails> bank;

  public static final String SERIALIZED_NAME_UPI = "upi";
  @SerializedName(SERIALIZED_NAME_UPI)
  private String upi;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private BigDecimal phone;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VENDOR_ID = "vendor_id";
  @SerializedName(SERIALIZED_NAME_VENDOR_ID)
  private String vendorId;

  public static final String SERIALIZED_NAME_SCHEDULE_OPTION = "schedule_option";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_OPTION)
  private List<ScheduleOption> scheduleOption;

  public static final String SERIALIZED_NAME_KYC_DETAILS = "kyc_details";
  @SerializedName(SERIALIZED_NAME_KYC_DETAILS)
  private List<KycDetails> kycDetails;

  public static final String SERIALIZED_NAME_DASHBOARD_ACCESS = "dashboard_access";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_ACCESS)
  private Boolean dashboardAccess;

  public static final String SERIALIZED_NAME_BANK_DETAILS = "bank_details";
  @SerializedName(SERIALIZED_NAME_BANK_DETAILS)
  private String bankDetails;

  public CreateVendorResponse() {
  }

  public CreateVendorResponse email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CreateVendorResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CreateVendorResponse bank(List<BankDetails> bank) {
    
    this.bank = bank;
    return this;
  }

  public CreateVendorResponse addBankItem(BankDetails bankItem) {
    if (this.bank == null) {
      this.bank = new ArrayList<>();
    }
    this.bank.add(bankItem);
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<BankDetails> getBank() {
    return bank;
  }


  public void setBank(List<BankDetails> bank) {
    this.bank = bank;
  }


  public CreateVendorResponse upi(String upi) {
    
    this.upi = upi;
    return this;
  }

   /**
   * Get upi
   * @return upi
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getUpi() {
    return upi;
  }


  public void setUpi(String upi) {
    this.upi = upi;
  }


  public CreateVendorResponse phone(BigDecimal phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getPhone() {
    return phone;
  }


  public void setPhone(BigDecimal phone) {
    this.phone = phone;
  }


  public CreateVendorResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateVendorResponse vendorId(String vendorId) {
    
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Get vendorId
   * @return vendorId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getVendorId() {
    return vendorId;
  }


  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }


  public CreateVendorResponse scheduleOption(List<ScheduleOption> scheduleOption) {
    
    this.scheduleOption = scheduleOption;
    return this;
  }

  public CreateVendorResponse addScheduleOptionItem(ScheduleOption scheduleOptionItem) {
    if (this.scheduleOption == null) {
      this.scheduleOption = new ArrayList<>();
    }
    this.scheduleOption.add(scheduleOptionItem);
    return this;
  }

   /**
   * Get scheduleOption
   * @return scheduleOption
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<ScheduleOption> getScheduleOption() {
    return scheduleOption;
  }


  public void setScheduleOption(List<ScheduleOption> scheduleOption) {
    this.scheduleOption = scheduleOption;
  }


  public CreateVendorResponse kycDetails(List<KycDetails> kycDetails) {
    
    this.kycDetails = kycDetails;
    return this;
  }

  public CreateVendorResponse addKycDetailsItem(KycDetails kycDetailsItem) {
    if (this.kycDetails == null) {
      this.kycDetails = new ArrayList<>();
    }
    this.kycDetails.add(kycDetailsItem);
    return this;
  }

   /**
   * Get kycDetails
   * @return kycDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<KycDetails> getKycDetails() {
    return kycDetails;
  }


  public void setKycDetails(List<KycDetails> kycDetails) {
    this.kycDetails = kycDetails;
  }


  public CreateVendorResponse dashboardAccess(Boolean dashboardAccess) {
    
    this.dashboardAccess = dashboardAccess;
    return this;
  }

   /**
   * Get dashboardAccess
   * @return dashboardAccess
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Boolean getDashboardAccess() {
    return dashboardAccess;
  }


  public void setDashboardAccess(Boolean dashboardAccess) {
    this.dashboardAccess = dashboardAccess;
  }


  public CreateVendorResponse bankDetails(String bankDetails) {
    
    this.bankDetails = bankDetails;
    return this;
  }

   /**
   * Get bankDetails
   * @return bankDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getBankDetails() {
    return bankDetails;
  }


  public void setBankDetails(String bankDetails) {
    this.bankDetails = bankDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVendorResponse createVendorResponse = (CreateVendorResponse) o;
    return Objects.equals(this.email, createVendorResponse.email) &&
        Objects.equals(this.status, createVendorResponse.status) &&
        Objects.equals(this.bank, createVendorResponse.bank) &&
        Objects.equals(this.upi, createVendorResponse.upi) &&
        Objects.equals(this.phone, createVendorResponse.phone) &&
        Objects.equals(this.name, createVendorResponse.name) &&
        Objects.equals(this.vendorId, createVendorResponse.vendorId) &&
        Objects.equals(this.scheduleOption, createVendorResponse.scheduleOption) &&
        Objects.equals(this.kycDetails, createVendorResponse.kycDetails) &&
        Objects.equals(this.dashboardAccess, createVendorResponse.dashboardAccess) &&
        Objects.equals(this.bankDetails, createVendorResponse.bankDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, status, bank, upi, phone, name, vendorId, scheduleOption, kycDetails, dashboardAccess, bankDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVendorResponse {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    upi: ").append(toIndentedString(upi)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    scheduleOption: ").append(toIndentedString(scheduleOption)).append("\n");
    sb.append("    kycDetails: ").append(toIndentedString(kycDetails)).append("\n");
    sb.append("    dashboardAccess: ").append(toIndentedString(dashboardAccess)).append("\n");
    sb.append("    bankDetails: ").append(toIndentedString(bankDetails)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("status");
    openapiFields.add("bank");
    openapiFields.add("upi");
    openapiFields.add("phone");
    openapiFields.add("name");
    openapiFields.add("vendor_id");
    openapiFields.add("schedule_option");
    openapiFields.add("kyc_details");
    openapiFields.add("dashboard_access");
    openapiFields.add("bank_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateVendorResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
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
      if ((jsonObj.get("upi") != null && !jsonObj.get("upi").isJsonNull()) && !jsonObj.get("upi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("vendor_id") != null && !jsonObj.get("vendor_id").isJsonNull()) && !jsonObj.get("vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_id").toString()));
      }
      if (jsonObj.get("schedule_option") != null && !jsonObj.get("schedule_option").isJsonNull()) {
        JsonArray jsonArrayscheduleOption = jsonObj.getAsJsonArray("schedule_option");
        if (jsonArrayscheduleOption != null) {
          // ensure the json data is an array
          if (!jsonObj.get("schedule_option").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `schedule_option` to be an array in the JSON string but got `%s`", jsonObj.get("schedule_option").toString()));
          }

          // validate the optional field `schedule_option` (array)
          for (int i = 0; i < jsonArrayscheduleOption.size(); i++) {
            ScheduleOption.validateJsonElement(jsonArrayscheduleOption.get(i));
          };
        }
      }
      if (jsonObj.get("kyc_details") != null && !jsonObj.get("kyc_details").isJsonNull()) {
        JsonArray jsonArraykycDetails = jsonObj.getAsJsonArray("kyc_details");
        if (jsonArraykycDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("kyc_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `kyc_details` to be an array in the JSON string but got `%s`", jsonObj.get("kyc_details").toString()));
          }

          // validate the optional field `kyc_details` (array)
          for (int i = 0; i < jsonArraykycDetails.size(); i++) {
            KycDetails.validateJsonElement(jsonArraykycDetails.get(i));
          };
        }
      }
      if ((jsonObj.get("bank_details") != null && !jsonObj.get("bank_details").isJsonNull()) && !jsonObj.get("bank_details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_details").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateVendorResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
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
      if ((jsonObj.get("upi") != null && !jsonObj.get("upi").isJsonNull()) && !jsonObj.get("upi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("vendor_id") != null && !jsonObj.get("vendor_id").isJsonNull()) && !jsonObj.get("vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_id").toString()));
      }
      if (jsonObj.get("schedule_option") != null && !jsonObj.get("schedule_option").isJsonNull()) {
        JsonArray jsonArrayscheduleOption = jsonObj.getAsJsonArray("schedule_option");
        if (jsonArrayscheduleOption != null) {
          // ensure the json data is an array
          if (!jsonObj.get("schedule_option").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `schedule_option` to be an array in the JSON string but got `%s`", jsonObj.get("schedule_option").toString()));
          }

          // validate the optional field `schedule_option` (array)
          for (int i = 0; i < jsonArrayscheduleOption.size(); i++) {
            ScheduleOption.validateJsonElement(jsonArrayscheduleOption.get(i));
          };
        }
      }
      if (jsonObj.get("kyc_details") != null && !jsonObj.get("kyc_details").isJsonNull()) {
        JsonArray jsonArraykycDetails = jsonObj.getAsJsonArray("kyc_details");
        if (jsonArraykycDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("kyc_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `kyc_details` to be an array in the JSON string but got `%s`", jsonObj.get("kyc_details").toString()));
          }

          // validate the optional field `kyc_details` (array)
          for (int i = 0; i < jsonArraykycDetails.size(); i++) {
            KycDetails.validateJsonElement(jsonArraykycDetails.get(i));
          };
        }
      }
      if ((jsonObj.get("bank_details") != null && !jsonObj.get("bank_details").isJsonNull()) && !jsonObj.get("bank_details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_details").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateVendorResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateVendorResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateVendorResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateVendorResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateVendorResponse>() {
           @Override
           public void write(JsonWriter out, CreateVendorResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateVendorResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateVendorResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateVendorResponse
  * @throws IOException if the JSON string is invalid with respect to CreateVendorResponse
  */
  public static CreateVendorResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateVendorResponse.class);
  }

 /**
  * Convert an instance of CreateVendorResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

