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
 * Cashback detail boject
 */
@Schema(description = "Cashback detail boject")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-26T12:53:05.189649Z[Etc/UTC]")
public class CashbackDetails {
  /**
   * Type of discount
   */
  @JsonAdapter(CashbackTypeEnum.Adapter.class)
  public enum CashbackTypeEnum {
    FLAT("flat"),
    
    PERCENTAGE("percentage"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    CashbackTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CashbackTypeEnum fromValue(String value) {
      for (CashbackTypeEnum b : CashbackTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<CashbackTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CashbackTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CashbackTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CashbackTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CASHBACK_TYPE = "cashback_type";
  @SerializedName(SERIALIZED_NAME_CASHBACK_TYPE)
  private CashbackTypeEnum cashbackType;

  public static final String SERIALIZED_NAME_CASHBACK_VALUE = "cashback_value";
  @SerializedName(SERIALIZED_NAME_CASHBACK_VALUE)
  private BigDecimal cashbackValue;

  public static final String SERIALIZED_NAME_MAX_CASHBACK_AMOUNT = "max_cashback_amount";
  @SerializedName(SERIALIZED_NAME_MAX_CASHBACK_AMOUNT)
  private BigDecimal maxCashbackAmount;

  public CashbackDetails() {
  }

  public CashbackDetails cashbackType(CashbackTypeEnum cashbackType) {
    
    this.cashbackType = cashbackType;
    return this;
  }

   /**
   * Type of discount
   * @return cashbackType
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Type of discount")
  public CashbackTypeEnum getCashbackType() {
    return cashbackType;
  }


  public void setCashbackType(CashbackTypeEnum cashbackType) {
    this.cashbackType = cashbackType;
  }


  public CashbackDetails cashbackValue(BigDecimal cashbackValue) {
    
    this.cashbackValue = cashbackValue;
    return this;
  }

   /**
   * Value of Discount.
   * @return cashbackValue
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Value of Discount.")
  public BigDecimal getCashbackValue() {
    return cashbackValue;
  }


  public void setCashbackValue(BigDecimal cashbackValue) {
    this.cashbackValue = cashbackValue;
  }


  public CashbackDetails maxCashbackAmount(BigDecimal maxCashbackAmount) {
    
    this.maxCashbackAmount = maxCashbackAmount;
    return this;
  }

   /**
   * Maximum Value of Cashback allowed.
   * @return maxCashbackAmount
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Maximum Value of Cashback allowed.")
  public BigDecimal getMaxCashbackAmount() {
    return maxCashbackAmount;
  }


  public void setMaxCashbackAmount(BigDecimal maxCashbackAmount) {
    this.maxCashbackAmount = maxCashbackAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashbackDetails cashbackDetails = (CashbackDetails) o;
    return Objects.equals(this.cashbackType, cashbackDetails.cashbackType) &&
        Objects.equals(this.cashbackValue, cashbackDetails.cashbackValue) &&
        Objects.equals(this.maxCashbackAmount, cashbackDetails.maxCashbackAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashbackType, cashbackValue, maxCashbackAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashbackDetails {\n");
    sb.append("    cashbackType: ").append(toIndentedString(cashbackType)).append("\n");
    sb.append("    cashbackValue: ").append(toIndentedString(cashbackValue)).append("\n");
    sb.append("    maxCashbackAmount: ").append(toIndentedString(maxCashbackAmount)).append("\n");
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
    openapiFields.add("cashback_type");
    openapiFields.add("cashback_value");
    openapiFields.add("max_cashback_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cashback_type");
    openapiRequiredFields.add("cashback_value");
    openapiRequiredFields.add("max_cashback_amount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CashbackDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CashbackDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cashback_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cashback_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cashback_type").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CashbackDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CashbackDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cashback_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cashback_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cashback_type").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CashbackDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CashbackDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CashbackDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CashbackDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CashbackDetails>() {
           @Override
           public void write(JsonWriter out, CashbackDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CashbackDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CashbackDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CashbackDetails
  * @throws IOException if the JSON string is invalid with respect to CashbackDetails
  */
  public static CashbackDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CashbackDetails.class);
  }

 /**
  * Convert an instance of CashbackDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

