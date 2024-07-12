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
 * Single EMI object
 */
@Schema(description = "Single EMI object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-12T08:35:35.237610Z[Etc/UTC]")
public class EMIPlansArray {
  public static final String SERIALIZED_NAME_TENURE = "tenure";
  @SerializedName(SERIALIZED_NAME_TENURE)
  private Integer tenure;

  public static final String SERIALIZED_NAME_INTEREST_RATE = "interest_rate";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE)
  private BigDecimal interestRate;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_EMI = "emi";
  @SerializedName(SERIALIZED_NAME_EMI)
  private Integer emi;

  public static final String SERIALIZED_NAME_TOTAL_INTEREST = "total_interest";
  @SerializedName(SERIALIZED_NAME_TOTAL_INTEREST)
  private Integer totalInterest;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Integer totalAmount;

  public EMIPlansArray() {
  }

  public EMIPlansArray tenure(Integer tenure) {
    
    this.tenure = tenure;
    return this;
  }

   /**
   * Get tenure
   * @return tenure
  **/
  @javax.annotation.Nullable
  @Schema(example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Integer getTenure() {
    return tenure;
  }


  public void setTenure(Integer tenure) {
    this.tenure = tenure;
  }


  public EMIPlansArray interestRate(BigDecimal interestRate) {
    
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * @return interestRate
  **/
  @javax.annotation.Nullable
  @Schema(example = "24", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getInterestRate() {
    return interestRate;
  }


  public void setInterestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
  }


  public EMIPlansArray currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @Schema(example = "INR", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public EMIPlansArray emi(Integer emi) {
    
    this.emi = emi;
    return this;
  }

   /**
   * Get emi
   * @return emi
  **/
  @javax.annotation.Nullable
  @Schema(example = "3468", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Integer getEmi() {
    return emi;
  }


  public void setEmi(Integer emi) {
    this.emi = emi;
  }


  public EMIPlansArray totalInterest(Integer totalInterest) {
    
    this.totalInterest = totalInterest;
    return this;
  }

   /**
   * Get totalInterest
   * @return totalInterest
  **/
  @javax.annotation.Nullable
  @Schema(example = "404", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Integer getTotalInterest() {
    return totalInterest;
  }


  public void setTotalInterest(Integer totalInterest) {
    this.totalInterest = totalInterest;
  }


  public EMIPlansArray totalAmount(Integer totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @Schema(example = "10404", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Integer getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMIPlansArray emIPlansArray = (EMIPlansArray) o;
    return Objects.equals(this.tenure, emIPlansArray.tenure) &&
        Objects.equals(this.interestRate, emIPlansArray.interestRate) &&
        Objects.equals(this.currency, emIPlansArray.currency) &&
        Objects.equals(this.emi, emIPlansArray.emi) &&
        Objects.equals(this.totalInterest, emIPlansArray.totalInterest) &&
        Objects.equals(this.totalAmount, emIPlansArray.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenure, interestRate, currency, emi, totalInterest, totalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMIPlansArray {\n");
    sb.append("    tenure: ").append(toIndentedString(tenure)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    emi: ").append(toIndentedString(emi)).append("\n");
    sb.append("    totalInterest: ").append(toIndentedString(totalInterest)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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
    openapiFields.add("tenure");
    openapiFields.add("interest_rate");
    openapiFields.add("currency");
    openapiFields.add("emi");
    openapiFields.add("total_interest");
    openapiFields.add("total_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMIPlansArray
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMIPlansArray
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMIPlansArray.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMIPlansArray' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMIPlansArray> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMIPlansArray.class));

       return (TypeAdapter<T>) new TypeAdapter<EMIPlansArray>() {
           @Override
           public void write(JsonWriter out, EMIPlansArray value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMIPlansArray read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMIPlansArray given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMIPlansArray
  * @throws IOException if the JSON string is invalid with respect to EMIPlansArray
  */
  public static EMIPlansArray fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMIPlansArray.class);
  }

 /**
  * Convert an instance of EMIPlansArray to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

