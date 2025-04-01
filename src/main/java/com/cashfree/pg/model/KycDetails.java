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
 * KycDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-01T11:00:02.685522Z[Etc/UTC]")
public class KycDetails {
  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_BUSINESS_TYPE = "business_type";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TYPE)
  private String businessType;

  public static final String SERIALIZED_NAME_UIDAI = "uidai";
  @SerializedName(SERIALIZED_NAME_UIDAI)
  private BigDecimal uidai;

  public static final String SERIALIZED_NAME_GST = "gst";
  @SerializedName(SERIALIZED_NAME_GST)
  private String gst;

  public static final String SERIALIZED_NAME_CIN = "cin";
  @SerializedName(SERIALIZED_NAME_CIN)
  private String cin;

  public static final String SERIALIZED_NAME_PAN = "pan";
  @SerializedName(SERIALIZED_NAME_PAN)
  private String pan;

  public static final String SERIALIZED_NAME_PASSPORT_NUMBER = "passport_number";
  @SerializedName(SERIALIZED_NAME_PASSPORT_NUMBER)
  private String passportNumber;

  public static final String SERIALIZED_NAME_DRIVING_LICENSE = "driving_license";
  @SerializedName(SERIALIZED_NAME_DRIVING_LICENSE)
  private String drivingLicense;

  public static final String SERIALIZED_NAME_VOTER_ID = "voter_id";
  @SerializedName(SERIALIZED_NAME_VOTER_ID)
  private String voterId;

  public KycDetails() {
  }

  public KycDetails accountType(String accountType) {
    
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


  public KycDetails businessType(String businessType) {
    
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


  public KycDetails uidai(BigDecimal uidai) {
    
    this.uidai = uidai;
    return this;
  }

   /**
   * Get uidai
   * @return uidai
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getUidai() {
    return uidai;
  }


  public void setUidai(BigDecimal uidai) {
    this.uidai = uidai;
  }


  public KycDetails gst(String gst) {
    
    this.gst = gst;
    return this;
  }

   /**
   * Get gst
   * @return gst
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getGst() {
    return gst;
  }


  public void setGst(String gst) {
    this.gst = gst;
  }


  public KycDetails cin(String cin) {
    
    this.cin = cin;
    return this;
  }

   /**
   * Get cin
   * @return cin
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCin() {
    return cin;
  }


  public void setCin(String cin) {
    this.cin = cin;
  }


  public KycDetails pan(String pan) {
    
    this.pan = pan;
    return this;
  }

   /**
   * Get pan
   * @return pan
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getPan() {
    return pan;
  }


  public void setPan(String pan) {
    this.pan = pan;
  }


  public KycDetails passportNumber(String passportNumber) {
    
    this.passportNumber = passportNumber;
    return this;
  }

   /**
   * Get passportNumber
   * @return passportNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getPassportNumber() {
    return passportNumber;
  }


  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }


  public KycDetails drivingLicense(String drivingLicense) {
    
    this.drivingLicense = drivingLicense;
    return this;
  }

   /**
   * Get drivingLicense
   * @return drivingLicense
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getDrivingLicense() {
    return drivingLicense;
  }


  public void setDrivingLicense(String drivingLicense) {
    this.drivingLicense = drivingLicense;
  }


  public KycDetails voterId(String voterId) {
    
    this.voterId = voterId;
    return this;
  }

   /**
   * Get voterId
   * @return voterId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getVoterId() {
    return voterId;
  }


  public void setVoterId(String voterId) {
    this.voterId = voterId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KycDetails kycDetails = (KycDetails) o;
    return Objects.equals(this.accountType, kycDetails.accountType) &&
        Objects.equals(this.businessType, kycDetails.businessType) &&
        Objects.equals(this.uidai, kycDetails.uidai) &&
        Objects.equals(this.gst, kycDetails.gst) &&
        Objects.equals(this.cin, kycDetails.cin) &&
        Objects.equals(this.pan, kycDetails.pan) &&
        Objects.equals(this.passportNumber, kycDetails.passportNumber) &&
        Objects.equals(this.drivingLicense, kycDetails.drivingLicense) &&
        Objects.equals(this.voterId, kycDetails.voterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, businessType, uidai, gst, cin, pan, passportNumber, drivingLicense, voterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KycDetails {\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    uidai: ").append(toIndentedString(uidai)).append("\n");
    sb.append("    gst: ").append(toIndentedString(gst)).append("\n");
    sb.append("    cin: ").append(toIndentedString(cin)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    drivingLicense: ").append(toIndentedString(drivingLicense)).append("\n");
    sb.append("    voterId: ").append(toIndentedString(voterId)).append("\n");
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
    openapiFields.add("account_type");
    openapiFields.add("business_type");
    openapiFields.add("uidai");
    openapiFields.add("gst");
    openapiFields.add("cin");
    openapiFields.add("pan");
    openapiFields.add("passport_number");
    openapiFields.add("driving_license");
    openapiFields.add("voter_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to KycDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      if ((jsonObj.get("business_type") != null && !jsonObj.get("business_type").isJsonNull()) && !jsonObj.get("business_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_type").toString()));
      }
      if ((jsonObj.get("gst") != null && !jsonObj.get("gst").isJsonNull()) && !jsonObj.get("gst").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gst` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gst").toString()));
      }
      if ((jsonObj.get("cin") != null && !jsonObj.get("cin").isJsonNull()) && !jsonObj.get("cin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cin").toString()));
      }
      if ((jsonObj.get("pan") != null && !jsonObj.get("pan").isJsonNull()) && !jsonObj.get("pan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan").toString()));
      }
      if ((jsonObj.get("passport_number") != null && !jsonObj.get("passport_number").isJsonNull()) && !jsonObj.get("passport_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passport_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passport_number").toString()));
      }
      if ((jsonObj.get("driving_license") != null && !jsonObj.get("driving_license").isJsonNull()) && !jsonObj.get("driving_license").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driving_license` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driving_license").toString()));
      }
      if ((jsonObj.get("voter_id") != null && !jsonObj.get("voter_id").isJsonNull()) && !jsonObj.get("voter_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voter_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voter_id").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to KycDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      if ((jsonObj.get("business_type") != null && !jsonObj.get("business_type").isJsonNull()) && !jsonObj.get("business_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_type").toString()));
      }
      if ((jsonObj.get("gst") != null && !jsonObj.get("gst").isJsonNull()) && !jsonObj.get("gst").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gst` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gst").toString()));
      }
      if ((jsonObj.get("cin") != null && !jsonObj.get("cin").isJsonNull()) && !jsonObj.get("cin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cin").toString()));
      }
      if ((jsonObj.get("pan") != null && !jsonObj.get("pan").isJsonNull()) && !jsonObj.get("pan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan").toString()));
      }
      if ((jsonObj.get("passport_number") != null && !jsonObj.get("passport_number").isJsonNull()) && !jsonObj.get("passport_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passport_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passport_number").toString()));
      }
      if ((jsonObj.get("driving_license") != null && !jsonObj.get("driving_license").isJsonNull()) && !jsonObj.get("driving_license").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driving_license` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driving_license").toString()));
      }
      if ((jsonObj.get("voter_id") != null && !jsonObj.get("voter_id").isJsonNull()) && !jsonObj.get("voter_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voter_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voter_id").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KycDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KycDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KycDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KycDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<KycDetails>() {
           @Override
           public void write(JsonWriter out, KycDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KycDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KycDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KycDetails
  * @throws IOException if the JSON string is invalid with respect to KycDetails
  */
  public static KycDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KycDetails.class);
  }

 /**
  * Convert an instance of KycDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

