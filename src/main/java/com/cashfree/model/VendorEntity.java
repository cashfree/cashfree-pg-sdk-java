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
import com.cashfree.model.ScheduleOption;
import com.cashfree.model.VendorEntityRelatedDocsInner;
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
 * Vendor entity object
 */
@Schema(description = "Vendor entity object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T09:16:46.389568Z[Etc/UTC]")
public class VendorEntity {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VENDOR_ID = "vendor_id";
  @SerializedName(SERIALIZED_NAME_VENDOR_ID)
  private String vendorId;

  public static final String SERIALIZED_NAME_ADDED_ON = "added_on";
  @SerializedName(SERIALIZED_NAME_ADDED_ON)
  private String addedOn;

  public static final String SERIALIZED_NAME_UPDATED_ON = "updated_on";
  @SerializedName(SERIALIZED_NAME_UPDATED_ON)
  private String updatedOn;

  public static final String SERIALIZED_NAME_BANK = "bank";
  @SerializedName(SERIALIZED_NAME_BANK)
  private List<BankDetails> bank;

  public static final String SERIALIZED_NAME_UPI = "upi";
  @SerializedName(SERIALIZED_NAME_UPI)
  private String upi;

  public static final String SERIALIZED_NAME_SCHEDULE_OPTION = "schedule_option";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_OPTION)
  private List<ScheduleOption> scheduleOption;

  public static final String SERIALIZED_NAME_VENDOR_TYPE = "vendor_type";
  @SerializedName(SERIALIZED_NAME_VENDOR_TYPE)
  private String vendorType;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_BUSINESS_TYPE = "business_type";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TYPE)
  private String businessType;

  public static final String SERIALIZED_NAME_REMARKS = "remarks";
  @SerializedName(SERIALIZED_NAME_REMARKS)
  private String remarks;

  public static final String SERIALIZED_NAME_RELATED_DOCS = "related_docs";
  @SerializedName(SERIALIZED_NAME_RELATED_DOCS)
  private List<VendorEntityRelatedDocsInner> relatedDocs;

  public VendorEntity() {
  }

  public VendorEntity email(String email) {
    
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


  public VendorEntity status(String status) {
    
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


  public VendorEntity phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public VendorEntity name(String name) {
    
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


  public VendorEntity vendorId(String vendorId) {
    
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


  public VendorEntity addedOn(String addedOn) {
    
    this.addedOn = addedOn;
    return this;
  }

   /**
   * Get addedOn
   * @return addedOn
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getAddedOn() {
    return addedOn;
  }


  public void setAddedOn(String addedOn) {
    this.addedOn = addedOn;
  }


  public VendorEntity updatedOn(String updatedOn) {
    
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * Get updatedOn
   * @return updatedOn
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getUpdatedOn() {
    return updatedOn;
  }


  public void setUpdatedOn(String updatedOn) {
    this.updatedOn = updatedOn;
  }


  public VendorEntity bank(List<BankDetails> bank) {
    
    this.bank = bank;
    return this;
  }

  public VendorEntity addBankItem(BankDetails bankItem) {
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


  public VendorEntity upi(String upi) {
    
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


  public VendorEntity scheduleOption(List<ScheduleOption> scheduleOption) {
    
    this.scheduleOption = scheduleOption;
    return this;
  }

  public VendorEntity addScheduleOptionItem(ScheduleOption scheduleOptionItem) {
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


  public VendorEntity vendorType(String vendorType) {
    
    this.vendorType = vendorType;
    return this;
  }

   /**
   * Get vendorType
   * @return vendorType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getVendorType() {
    return vendorType;
  }


  public void setVendorType(String vendorType) {
    this.vendorType = vendorType;
  }


  public VendorEntity accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public VendorEntity businessType(String businessType) {
    
    this.businessType = businessType;
    return this;
  }

   /**
   * Get businessType
   * @return businessType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getBusinessType() {
    return businessType;
  }


  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }


  public VendorEntity remarks(String remarks) {
    
    this.remarks = remarks;
    return this;
  }

   /**
   * Get remarks
   * @return remarks
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getRemarks() {
    return remarks;
  }


  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public VendorEntity relatedDocs(List<VendorEntityRelatedDocsInner> relatedDocs) {
    
    this.relatedDocs = relatedDocs;
    return this;
  }

  public VendorEntity addRelatedDocsItem(VendorEntityRelatedDocsInner relatedDocsItem) {
    if (this.relatedDocs == null) {
      this.relatedDocs = new ArrayList<>();
    }
    this.relatedDocs.add(relatedDocsItem);
    return this;
  }

   /**
   * Get relatedDocs
   * @return relatedDocs
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<VendorEntityRelatedDocsInner> getRelatedDocs() {
    return relatedDocs;
  }


  public void setRelatedDocs(List<VendorEntityRelatedDocsInner> relatedDocs) {
    this.relatedDocs = relatedDocs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorEntity vendorEntity = (VendorEntity) o;
    return Objects.equals(this.email, vendorEntity.email) &&
        Objects.equals(this.status, vendorEntity.status) &&
        Objects.equals(this.phone, vendorEntity.phone) &&
        Objects.equals(this.name, vendorEntity.name) &&
        Objects.equals(this.vendorId, vendorEntity.vendorId) &&
        Objects.equals(this.addedOn, vendorEntity.addedOn) &&
        Objects.equals(this.updatedOn, vendorEntity.updatedOn) &&
        Objects.equals(this.bank, vendorEntity.bank) &&
        Objects.equals(this.upi, vendorEntity.upi) &&
        Objects.equals(this.scheduleOption, vendorEntity.scheduleOption) &&
        Objects.equals(this.vendorType, vendorEntity.vendorType) &&
        Objects.equals(this.accountType, vendorEntity.accountType) &&
        Objects.equals(this.businessType, vendorEntity.businessType) &&
        Objects.equals(this.remarks, vendorEntity.remarks) &&
        Objects.equals(this.relatedDocs, vendorEntity.relatedDocs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, status, phone, name, vendorId, addedOn, updatedOn, bank, upi, scheduleOption, vendorType, accountType, businessType, remarks, relatedDocs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorEntity {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    addedOn: ").append(toIndentedString(addedOn)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    upi: ").append(toIndentedString(upi)).append("\n");
    sb.append("    scheduleOption: ").append(toIndentedString(scheduleOption)).append("\n");
    sb.append("    vendorType: ").append(toIndentedString(vendorType)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    relatedDocs: ").append(toIndentedString(relatedDocs)).append("\n");
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
    openapiFields.add("phone");
    openapiFields.add("name");
    openapiFields.add("vendor_id");
    openapiFields.add("added_on");
    openapiFields.add("updated_on");
    openapiFields.add("bank");
    openapiFields.add("upi");
    openapiFields.add("schedule_option");
    openapiFields.add("vendor_type");
    openapiFields.add("account_type");
    openapiFields.add("business_type");
    openapiFields.add("remarks");
    openapiFields.add("related_docs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VendorEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("vendor_id") != null && !jsonObj.get("vendor_id").isJsonNull()) && !jsonObj.get("vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_id").toString()));
      }
      if ((jsonObj.get("added_on") != null && !jsonObj.get("added_on").isJsonNull()) && !jsonObj.get("added_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on").toString()));
      }
      if ((jsonObj.get("updated_on") != null && !jsonObj.get("updated_on").isJsonNull()) && !jsonObj.get("updated_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_on").toString()));
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
      if ((jsonObj.get("vendor_type") != null && !jsonObj.get("vendor_type").isJsonNull()) && !jsonObj.get("vendor_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_type").toString()));
      }
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      if ((jsonObj.get("business_type") != null && !jsonObj.get("business_type").isJsonNull()) && !jsonObj.get("business_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_type").toString()));
      }
      if ((jsonObj.get("remarks") != null && !jsonObj.get("remarks").isJsonNull()) && !jsonObj.get("remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remarks").toString()));
      }
      if (jsonObj.get("related_docs") != null && !jsonObj.get("related_docs").isJsonNull()) {
        JsonArray jsonArrayrelatedDocs = jsonObj.getAsJsonArray("related_docs");
        if (jsonArrayrelatedDocs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("related_docs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `related_docs` to be an array in the JSON string but got `%s`", jsonObj.get("related_docs").toString()));
          }

          // validate the optional field `related_docs` (array)
          for (int i = 0; i < jsonArrayrelatedDocs.size(); i++) {
            VendorEntityRelatedDocsInner.validateJsonElement(jsonArrayrelatedDocs.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VendorEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("vendor_id") != null && !jsonObj.get("vendor_id").isJsonNull()) && !jsonObj.get("vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_id").toString()));
      }
      if ((jsonObj.get("added_on") != null && !jsonObj.get("added_on").isJsonNull()) && !jsonObj.get("added_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on").toString()));
      }
      if ((jsonObj.get("updated_on") != null && !jsonObj.get("updated_on").isJsonNull()) && !jsonObj.get("updated_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_on").toString()));
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
      if ((jsonObj.get("vendor_type") != null && !jsonObj.get("vendor_type").isJsonNull()) && !jsonObj.get("vendor_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_type").toString()));
      }
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      if ((jsonObj.get("business_type") != null && !jsonObj.get("business_type").isJsonNull()) && !jsonObj.get("business_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_type").toString()));
      }
      if ((jsonObj.get("remarks") != null && !jsonObj.get("remarks").isJsonNull()) && !jsonObj.get("remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remarks").toString()));
      }
      if (jsonObj.get("related_docs") != null && !jsonObj.get("related_docs").isJsonNull()) {
        JsonArray jsonArrayrelatedDocs = jsonObj.getAsJsonArray("related_docs");
        if (jsonArrayrelatedDocs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("related_docs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `related_docs` to be an array in the JSON string but got `%s`", jsonObj.get("related_docs").toString()));
          }

          // validate the optional field `related_docs` (array)
          for (int i = 0; i < jsonArrayrelatedDocs.size(); i++) {
            VendorEntityRelatedDocsInner.validateJsonElement(jsonArrayrelatedDocs.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VendorEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VendorEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VendorEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VendorEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<VendorEntity>() {
           @Override
           public void write(JsonWriter out, VendorEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VendorEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VendorEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VendorEntity
  * @throws IOException if the JSON string is invalid with respect to VendorEntity
  */
  public static VendorEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VendorEntity.class);
  }

 /**
  * Convert an instance of VendorEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

