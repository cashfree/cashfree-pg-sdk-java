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
 * PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-24T05:12:29.162122Z[Etc/UTC]")
public class PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails {
  public static final String SERIALIZED_NAME_EMI_AMOUNT = "emi_amount";
  @SerializedName(SERIALIZED_NAME_EMI_AMOUNT)
  private BigDecimal emiAmount;

  public static final String SERIALIZED_NAME_EMI_TENURE = "emi_tenure";
  @SerializedName(SERIALIZED_NAME_EMI_TENURE)
  private BigDecimal emiTenure;

  public static final String SERIALIZED_NAME_EMI_INTEREST = "emi_interest";
  @SerializedName(SERIALIZED_NAME_EMI_INTEREST)
  private BigDecimal emiInterest;

  public PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails() {
  }

  public PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails emiAmount(BigDecimal emiAmount) {
    
    this.emiAmount = emiAmount;
    return this;
  }

   /**
   * Get emiAmount
   * @return emiAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getEmiAmount() {
    return emiAmount;
  }


  public void setEmiAmount(BigDecimal emiAmount) {
    this.emiAmount = emiAmount;
  }


  public PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails emiTenure(BigDecimal emiTenure) {
    
    this.emiTenure = emiTenure;
    return this;
  }

   /**
   * Get emiTenure
   * @return emiTenure
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getEmiTenure() {
    return emiTenure;
  }


  public void setEmiTenure(BigDecimal emiTenure) {
    this.emiTenure = emiTenure;
  }


  public PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails emiInterest(BigDecimal emiInterest) {
    
    this.emiInterest = emiInterest;
    return this;
  }

   /**
   * Get emiInterest
   * @return emiInterest
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getEmiInterest() {
    return emiInterest;
  }


  public void setEmiInterest(BigDecimal emiInterest) {
    this.emiInterest = emiInterest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails paymentMethodCardEMIInPaymentsEntityEmiEmiDetails = (PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails) o;
    return Objects.equals(this.emiAmount, paymentMethodCardEMIInPaymentsEntityEmiEmiDetails.emiAmount) &&
        Objects.equals(this.emiTenure, paymentMethodCardEMIInPaymentsEntityEmiEmiDetails.emiTenure) &&
        Objects.equals(this.emiInterest, paymentMethodCardEMIInPaymentsEntityEmiEmiDetails.emiInterest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emiAmount, emiTenure, emiInterest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails {\n");
    sb.append("    emiAmount: ").append(toIndentedString(emiAmount)).append("\n");
    sb.append("    emiTenure: ").append(toIndentedString(emiTenure)).append("\n");
    sb.append("    emiInterest: ").append(toIndentedString(emiInterest)).append("\n");
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
    openapiFields.add("emi_amount");
    openapiFields.add("emi_tenure");
    openapiFields.add("emi_interest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails>() {
           @Override
           public void write(JsonWriter out, PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails
  */
  public static PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails.class);
  }

 /**
  * Convert an instance of PaymentMethodCardEMIInPaymentsEntityEmiEmiDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

