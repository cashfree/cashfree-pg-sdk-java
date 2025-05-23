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
 * SettlementReconEntityDataInnerSettlementDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class SettlementReconEntityDataInnerSettlementDetails {
  public static final String SERIALIZED_NAME_CF_SETTLEMENT_ID = "cf_settlement_id";
  @SerializedName(SERIALIZED_NAME_CF_SETTLEMENT_ID)
  private String cfSettlementId;

  public static final String SERIALIZED_NAME_SETTLEMENT_DATE = "settlement_date";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_DATE)
  private String settlementDate;

  public static final String SERIALIZED_NAME_UTR = "utr";
  @SerializedName(SERIALIZED_NAME_UTR)
  private String utr;

  public static final String SERIALIZED_NAME_SPLIT_SERVICE_CHARGE = "split_service_charge";
  @SerializedName(SERIALIZED_NAME_SPLIT_SERVICE_CHARGE)
  private BigDecimal splitServiceCharge;

  public static final String SERIALIZED_NAME_SPLIT_SERVICE_TAX = "split_service_tax";
  @SerializedName(SERIALIZED_NAME_SPLIT_SERVICE_TAX)
  private BigDecimal splitServiceTax;

  public static final String SERIALIZED_NAME_VENDOR_COMMISSION = "vendor_commission";
  @SerializedName(SERIALIZED_NAME_VENDOR_COMMISSION)
  private BigDecimal vendorCommission;

  public static final String SERIALIZED_NAME_PAYMENT_FROM = "payment_from";
  @SerializedName(SERIALIZED_NAME_PAYMENT_FROM)
  private String paymentFrom;

  public static final String SERIALIZED_NAME_PAYMENT_TILL = "payment_till";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TILL)
  private String paymentTill;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_REMARKS = "remarks";
  @SerializedName(SERIALIZED_NAME_REMARKS)
  private String remarks;

  public static final String SERIALIZED_NAME_SERVICE_CHARGE = "service_charge";
  @SerializedName(SERIALIZED_NAME_SERVICE_CHARGE)
  private BigDecimal serviceCharge;

  public static final String SERIALIZED_NAME_SERVICE_TAX = "service_tax";
  @SerializedName(SERIALIZED_NAME_SERVICE_TAX)
  private BigDecimal serviceTax;

  public static final String SERIALIZED_NAME_SETTLEMENT_CHARGE = "settlement_charge";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_CHARGE)
  private BigDecimal settlementCharge;

  public static final String SERIALIZED_NAME_SETTLEMENT_INITIATED_ON = "settlement_initiated_on";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_INITIATED_ON)
  private String settlementInitiatedOn;

  public static final String SERIALIZED_NAME_SETTLEMENT_TAX = "settlement_tax";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_TAX)
  private BigDecimal settlementTax;

  public static final String SERIALIZED_NAME_SETTLEMENT_TYPE = "settlement_type";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_TYPE)
  private String settlementType;

  public SettlementReconEntityDataInnerSettlementDetails() {
  }

  public SettlementReconEntityDataInnerSettlementDetails cfSettlementId(String cfSettlementId) {
    
    this.cfSettlementId = cfSettlementId;
    return this;
  }

   /**
   * Unique ID to identify the settlement.
   * @return cfSettlementId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Unique ID to identify the settlement.")
  public String getCfSettlementId() {
    return cfSettlementId;
  }


  public void setCfSettlementId(String cfSettlementId) {
    this.cfSettlementId = cfSettlementId;
  }


  public SettlementReconEntityDataInnerSettlementDetails settlementDate(String settlementDate) {
    
    this.settlementDate = settlementDate;
    return this;
  }

   /**
   * Date and time when the settlement was processed.
   * @return settlementDate
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Date and time when the settlement was processed.")
  public String getSettlementDate() {
    return settlementDate;
  }


  public void setSettlementDate(String settlementDate) {
    this.settlementDate = settlementDate;
  }


  public SettlementReconEntityDataInnerSettlementDetails utr(String utr) {
    
    this.utr = utr;
    return this;
  }

   /**
   * Unique transaction reference number of the settlement.
   * @return utr
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Unique transaction reference number of the settlement.")
  public String getUtr() {
    return utr;
  }


  public void setUtr(String utr) {
    this.utr = utr;
  }


  public SettlementReconEntityDataInnerSettlementDetails splitServiceCharge(BigDecimal splitServiceCharge) {
    
    this.splitServiceCharge = splitServiceCharge;
    return this;
  }

   /**
   * Service charge that is applicable for splitting the payment.
   * @return splitServiceCharge
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Service charge that is applicable for splitting the payment.")
  public BigDecimal getSplitServiceCharge() {
    return splitServiceCharge;
  }


  public void setSplitServiceCharge(BigDecimal splitServiceCharge) {
    this.splitServiceCharge = splitServiceCharge;
  }


  public SettlementReconEntityDataInnerSettlementDetails splitServiceTax(BigDecimal splitServiceTax) {
    
    this.splitServiceTax = splitServiceTax;
    return this;
  }

   /**
   * Service tax applicable for splitting the amount to vendors.
   * @return splitServiceTax
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Service tax applicable for splitting the amount to vendors.")
  public BigDecimal getSplitServiceTax() {
    return splitServiceTax;
  }


  public void setSplitServiceTax(BigDecimal splitServiceTax) {
    this.splitServiceTax = splitServiceTax;
  }


  public SettlementReconEntityDataInnerSettlementDetails vendorCommission(BigDecimal vendorCommission) {
    
    this.vendorCommission = vendorCommission;
    return this;
  }

   /**
   * Vendor commission applicable for this transaction.
   * @return vendorCommission
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Vendor commission applicable for this transaction.")
  public BigDecimal getVendorCommission() {
    return vendorCommission;
  }


  public void setVendorCommission(BigDecimal vendorCommission) {
    this.vendorCommission = vendorCommission;
  }


  public SettlementReconEntityDataInnerSettlementDetails paymentFrom(String paymentFrom) {
    
    this.paymentFrom = paymentFrom;
    return this;
  }

   /**
   * Date and time from settlement computed.
   * @return paymentFrom
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Date and time from settlement computed.")
  public String getPaymentFrom() {
    return paymentFrom;
  }


  public void setPaymentFrom(String paymentFrom) {
    this.paymentFrom = paymentFrom;
  }


  public SettlementReconEntityDataInnerSettlementDetails paymentTill(String paymentTill) {
    
    this.paymentTill = paymentTill;
    return this;
  }

   /**
   * Date and time till settlement computed.
   * @return paymentTill
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Date and time till settlement computed.")
  public String getPaymentTill() {
    return paymentTill;
  }


  public void setPaymentTill(String paymentTill) {
    this.paymentTill = paymentTill;
  }


  public SettlementReconEntityDataInnerSettlementDetails reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * If any reason for settlement failure.
   * @return reason
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "If any reason for settlement failure.")
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public SettlementReconEntityDataInnerSettlementDetails remarks(String remarks) {
    
    this.remarks = remarks;
    return this;
  }

   /**
   * Remarks related for settlement.
   * @return remarks
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Remarks related for settlement.")
  public String getRemarks() {
    return remarks;
  }


  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public SettlementReconEntityDataInnerSettlementDetails serviceCharge(BigDecimal serviceCharge) {
    
    this.serviceCharge = serviceCharge;
    return this;
  }

   /**
   * Service charge for the transactions.
   * @return serviceCharge
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Service charge for the transactions.")
  public BigDecimal getServiceCharge() {
    return serviceCharge;
  }


  public void setServiceCharge(BigDecimal serviceCharge) {
    this.serviceCharge = serviceCharge;
  }


  public SettlementReconEntityDataInnerSettlementDetails serviceTax(BigDecimal serviceTax) {
    
    this.serviceTax = serviceTax;
    return this;
  }

   /**
   * Service tax for the transactions.
   * @return serviceTax
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Service tax for the transactions.")
  public BigDecimal getServiceTax() {
    return serviceTax;
  }


  public void setServiceTax(BigDecimal serviceTax) {
    this.serviceTax = serviceTax;
  }


  public SettlementReconEntityDataInnerSettlementDetails settlementCharge(BigDecimal settlementCharge) {
    
    this.settlementCharge = settlementCharge;
    return this;
  }

   /**
   * Settlement Service Charge.
   * @return settlementCharge
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Settlement Service Charge.")
  public BigDecimal getSettlementCharge() {
    return settlementCharge;
  }


  public void setSettlementCharge(BigDecimal settlementCharge) {
    this.settlementCharge = settlementCharge;
  }


  public SettlementReconEntityDataInnerSettlementDetails settlementInitiatedOn(String settlementInitiatedOn) {
    
    this.settlementInitiatedOn = settlementInitiatedOn;
    return this;
  }

   /**
   * Date and time when Settlement initiated.
   * @return settlementInitiatedOn
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Date and time when Settlement initiated.")
  public String getSettlementInitiatedOn() {
    return settlementInitiatedOn;
  }


  public void setSettlementInitiatedOn(String settlementInitiatedOn) {
    this.settlementInitiatedOn = settlementInitiatedOn;
  }


  public SettlementReconEntityDataInnerSettlementDetails settlementTax(BigDecimal settlementTax) {
    
    this.settlementTax = settlementTax;
    return this;
  }

   /**
   * Settlement Service Tax.
   * @return settlementTax
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Settlement Service Tax.")
  public BigDecimal getSettlementTax() {
    return settlementTax;
  }


  public void setSettlementTax(BigDecimal settlementTax) {
    this.settlementTax = settlementTax;
  }


  public SettlementReconEntityDataInnerSettlementDetails settlementType(String settlementType) {
    
    this.settlementType = settlementType;
    return this;
  }

   /**
   * Type of Settlement, Example - Normal Settlement.
   * @return settlementType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Type of Settlement, Example - Normal Settlement.")
  public String getSettlementType() {
    return settlementType;
  }


  public void setSettlementType(String settlementType) {
    this.settlementType = settlementType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementReconEntityDataInnerSettlementDetails settlementReconEntityDataInnerSettlementDetails = (SettlementReconEntityDataInnerSettlementDetails) o;
    return Objects.equals(this.cfSettlementId, settlementReconEntityDataInnerSettlementDetails.cfSettlementId) &&
        Objects.equals(this.settlementDate, settlementReconEntityDataInnerSettlementDetails.settlementDate) &&
        Objects.equals(this.utr, settlementReconEntityDataInnerSettlementDetails.utr) &&
        Objects.equals(this.splitServiceCharge, settlementReconEntityDataInnerSettlementDetails.splitServiceCharge) &&
        Objects.equals(this.splitServiceTax, settlementReconEntityDataInnerSettlementDetails.splitServiceTax) &&
        Objects.equals(this.vendorCommission, settlementReconEntityDataInnerSettlementDetails.vendorCommission) &&
        Objects.equals(this.paymentFrom, settlementReconEntityDataInnerSettlementDetails.paymentFrom) &&
        Objects.equals(this.paymentTill, settlementReconEntityDataInnerSettlementDetails.paymentTill) &&
        Objects.equals(this.reason, settlementReconEntityDataInnerSettlementDetails.reason) &&
        Objects.equals(this.remarks, settlementReconEntityDataInnerSettlementDetails.remarks) &&
        Objects.equals(this.serviceCharge, settlementReconEntityDataInnerSettlementDetails.serviceCharge) &&
        Objects.equals(this.serviceTax, settlementReconEntityDataInnerSettlementDetails.serviceTax) &&
        Objects.equals(this.settlementCharge, settlementReconEntityDataInnerSettlementDetails.settlementCharge) &&
        Objects.equals(this.settlementInitiatedOn, settlementReconEntityDataInnerSettlementDetails.settlementInitiatedOn) &&
        Objects.equals(this.settlementTax, settlementReconEntityDataInnerSettlementDetails.settlementTax) &&
        Objects.equals(this.settlementType, settlementReconEntityDataInnerSettlementDetails.settlementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfSettlementId, settlementDate, utr, splitServiceCharge, splitServiceTax, vendorCommission, paymentFrom, paymentTill, reason, remarks, serviceCharge, serviceTax, settlementCharge, settlementInitiatedOn, settlementTax, settlementType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementReconEntityDataInnerSettlementDetails {\n");
    sb.append("    cfSettlementId: ").append(toIndentedString(cfSettlementId)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    utr: ").append(toIndentedString(utr)).append("\n");
    sb.append("    splitServiceCharge: ").append(toIndentedString(splitServiceCharge)).append("\n");
    sb.append("    splitServiceTax: ").append(toIndentedString(splitServiceTax)).append("\n");
    sb.append("    vendorCommission: ").append(toIndentedString(vendorCommission)).append("\n");
    sb.append("    paymentFrom: ").append(toIndentedString(paymentFrom)).append("\n");
    sb.append("    paymentTill: ").append(toIndentedString(paymentTill)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    serviceCharge: ").append(toIndentedString(serviceCharge)).append("\n");
    sb.append("    serviceTax: ").append(toIndentedString(serviceTax)).append("\n");
    sb.append("    settlementCharge: ").append(toIndentedString(settlementCharge)).append("\n");
    sb.append("    settlementInitiatedOn: ").append(toIndentedString(settlementInitiatedOn)).append("\n");
    sb.append("    settlementTax: ").append(toIndentedString(settlementTax)).append("\n");
    sb.append("    settlementType: ").append(toIndentedString(settlementType)).append("\n");
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
    openapiFields.add("cf_settlement_id");
    openapiFields.add("settlement_date");
    openapiFields.add("utr");
    openapiFields.add("split_service_charge");
    openapiFields.add("split_service_tax");
    openapiFields.add("vendor_commission");
    openapiFields.add("payment_from");
    openapiFields.add("payment_till");
    openapiFields.add("reason");
    openapiFields.add("remarks");
    openapiFields.add("service_charge");
    openapiFields.add("service_tax");
    openapiFields.add("settlement_charge");
    openapiFields.add("settlement_initiated_on");
    openapiFields.add("settlement_tax");
    openapiFields.add("settlement_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SettlementReconEntityDataInnerSettlementDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_settlement_id") != null && !jsonObj.get("cf_settlement_id").isJsonNull()) && !jsonObj.get("cf_settlement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_settlement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_settlement_id").toString()));
      }
      if ((jsonObj.get("settlement_date") != null && !jsonObj.get("settlement_date").isJsonNull()) && !jsonObj.get("settlement_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_date").toString()));
      }
      if ((jsonObj.get("utr") != null && !jsonObj.get("utr").isJsonNull()) && !jsonObj.get("utr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utr").toString()));
      }
      if ((jsonObj.get("payment_from") != null && !jsonObj.get("payment_from").isJsonNull()) && !jsonObj.get("payment_from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_from").toString()));
      }
      if ((jsonObj.get("payment_till") != null && !jsonObj.get("payment_till").isJsonNull()) && !jsonObj.get("payment_till").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_till` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_till").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("remarks") != null && !jsonObj.get("remarks").isJsonNull()) && !jsonObj.get("remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remarks").toString()));
      }
      if ((jsonObj.get("settlement_initiated_on") != null && !jsonObj.get("settlement_initiated_on").isJsonNull()) && !jsonObj.get("settlement_initiated_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_initiated_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_initiated_on").toString()));
      }
      if ((jsonObj.get("settlement_type") != null && !jsonObj.get("settlement_type").isJsonNull()) && !jsonObj.get("settlement_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_type").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SettlementReconEntityDataInnerSettlementDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_settlement_id") != null && !jsonObj.get("cf_settlement_id").isJsonNull()) && !jsonObj.get("cf_settlement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_settlement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_settlement_id").toString()));
      }
      if ((jsonObj.get("settlement_date") != null && !jsonObj.get("settlement_date").isJsonNull()) && !jsonObj.get("settlement_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_date").toString()));
      }
      if ((jsonObj.get("utr") != null && !jsonObj.get("utr").isJsonNull()) && !jsonObj.get("utr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utr").toString()));
      }
      if ((jsonObj.get("payment_from") != null && !jsonObj.get("payment_from").isJsonNull()) && !jsonObj.get("payment_from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_from").toString()));
      }
      if ((jsonObj.get("payment_till") != null && !jsonObj.get("payment_till").isJsonNull()) && !jsonObj.get("payment_till").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_till` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_till").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("remarks") != null && !jsonObj.get("remarks").isJsonNull()) && !jsonObj.get("remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remarks").toString()));
      }
      if ((jsonObj.get("settlement_initiated_on") != null && !jsonObj.get("settlement_initiated_on").isJsonNull()) && !jsonObj.get("settlement_initiated_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_initiated_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_initiated_on").toString()));
      }
      if ((jsonObj.get("settlement_type") != null && !jsonObj.get("settlement_type").isJsonNull()) && !jsonObj.get("settlement_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_type").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettlementReconEntityDataInnerSettlementDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettlementReconEntityDataInnerSettlementDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettlementReconEntityDataInnerSettlementDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettlementReconEntityDataInnerSettlementDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<SettlementReconEntityDataInnerSettlementDetails>() {
           @Override
           public void write(JsonWriter out, SettlementReconEntityDataInnerSettlementDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettlementReconEntityDataInnerSettlementDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SettlementReconEntityDataInnerSettlementDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettlementReconEntityDataInnerSettlementDetails
  * @throws IOException if the JSON string is invalid with respect to SettlementReconEntityDataInnerSettlementDetails
  */
  public static SettlementReconEntityDataInnerSettlementDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettlementReconEntityDataInnerSettlementDetails.class);
  }

 /**
  * Convert an instance of SettlementReconEntityDataInnerSettlementDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

