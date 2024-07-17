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

import com.cashfree.JSON;

/**
 * Vendor Balance Transfer Charges entity object
 */
@Schema(description = "Vendor Balance Transfer Charges entity object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T08:23:32.334006Z[Etc/UTC]")
public class VendorBalanceTransferCharges {
  public static final String SERIALIZED_NAME_SERVICE_CHARGES = "service_charges";
  @SerializedName(SERIALIZED_NAME_SERVICE_CHARGES)
  private BigDecimal serviceCharges;

  public static final String SERIALIZED_NAME_SERVICE_TAX = "service_tax";
  @SerializedName(SERIALIZED_NAME_SERVICE_TAX)
  private BigDecimal serviceTax;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_BILLED_TO = "billed_to";
  @SerializedName(SERIALIZED_NAME_BILLED_TO)
  private String billedTo;

  public static final String SERIALIZED_NAME_IS_POSTPAID = "is_postpaid";
  @SerializedName(SERIALIZED_NAME_IS_POSTPAID)
  private Boolean isPostpaid;

  public VendorBalanceTransferCharges() {
  }

  public VendorBalanceTransferCharges serviceCharges(BigDecimal serviceCharges) {
    
    this.serviceCharges = serviceCharges;
    return this;
  }

   /**
   * Get serviceCharges
   * @return serviceCharges
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getServiceCharges() {
    return serviceCharges;
  }


  public void setServiceCharges(BigDecimal serviceCharges) {
    this.serviceCharges = serviceCharges;
  }


  public VendorBalanceTransferCharges serviceTax(BigDecimal serviceTax) {
    
    this.serviceTax = serviceTax;
    return this;
  }

   /**
   * Get serviceTax
   * @return serviceTax
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getServiceTax() {
    return serviceTax;
  }


  public void setServiceTax(BigDecimal serviceTax) {
    this.serviceTax = serviceTax;
  }


  public VendorBalanceTransferCharges amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public VendorBalanceTransferCharges billedTo(String billedTo) {
    
    this.billedTo = billedTo;
    return this;
  }

   /**
   * Get billedTo
   * @return billedTo
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getBilledTo() {
    return billedTo;
  }


  public void setBilledTo(String billedTo) {
    this.billedTo = billedTo;
  }


  public VendorBalanceTransferCharges isPostpaid(Boolean isPostpaid) {
    
    this.isPostpaid = isPostpaid;
    return this;
  }

   /**
   * Get isPostpaid
   * @return isPostpaid
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Boolean getIsPostpaid() {
    return isPostpaid;
  }


  public void setIsPostpaid(Boolean isPostpaid) {
    this.isPostpaid = isPostpaid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorBalanceTransferCharges vendorBalanceTransferCharges = (VendorBalanceTransferCharges) o;
    return Objects.equals(this.serviceCharges, vendorBalanceTransferCharges.serviceCharges) &&
        Objects.equals(this.serviceTax, vendorBalanceTransferCharges.serviceTax) &&
        Objects.equals(this.amount, vendorBalanceTransferCharges.amount) &&
        Objects.equals(this.billedTo, vendorBalanceTransferCharges.billedTo) &&
        Objects.equals(this.isPostpaid, vendorBalanceTransferCharges.isPostpaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceCharges, serviceTax, amount, billedTo, isPostpaid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorBalanceTransferCharges {\n");
    sb.append("    serviceCharges: ").append(toIndentedString(serviceCharges)).append("\n");
    sb.append("    serviceTax: ").append(toIndentedString(serviceTax)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    billedTo: ").append(toIndentedString(billedTo)).append("\n");
    sb.append("    isPostpaid: ").append(toIndentedString(isPostpaid)).append("\n");
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
    openapiFields.add("service_charges");
    openapiFields.add("service_tax");
    openapiFields.add("amount");
    openapiFields.add("billed_to");
    openapiFields.add("is_postpaid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VendorBalanceTransferCharges
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("billed_to") != null && !jsonObj.get("billed_to").isJsonNull()) && !jsonObj.get("billed_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billed_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billed_to").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VendorBalanceTransferCharges
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("billed_to") != null && !jsonObj.get("billed_to").isJsonNull()) && !jsonObj.get("billed_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billed_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billed_to").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VendorBalanceTransferCharges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VendorBalanceTransferCharges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VendorBalanceTransferCharges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VendorBalanceTransferCharges.class));

       return (TypeAdapter<T>) new TypeAdapter<VendorBalanceTransferCharges>() {
           @Override
           public void write(JsonWriter out, VendorBalanceTransferCharges value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VendorBalanceTransferCharges read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VendorBalanceTransferCharges given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VendorBalanceTransferCharges
  * @throws IOException if the JSON string is invalid with respect to VendorBalanceTransferCharges
  */
  public static VendorBalanceTransferCharges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VendorBalanceTransferCharges.class);
  }

 /**
  * Convert an instance of VendorBalanceTransferCharges to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

