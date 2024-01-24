/*
 * Cashfree Payment Gateway APIs
 * Cashfree's Payment Gateway APIs provide developers with a streamlined pathway to integrate advanced payment processing capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2022-09-01
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
 * detils of the discount object of offer
 */
@Schema(description = "detils of the discount object of offer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-24T11:29:19.497960Z[Etc/UTC]")
public class DiscountDetails {
  /**
   * Type of discount
   */
  @JsonAdapter(DiscountTypeEnum.Adapter.class)
  public enum DiscountTypeEnum {
    FLAT("flat"),
    
    PERCENTAGE("percentage"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    DiscountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DiscountTypeEnum fromValue(String value) {
      for (DiscountTypeEnum b : DiscountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<DiscountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DiscountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DiscountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DiscountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISCOUNT_TYPE = "discount_type";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_TYPE)
  private DiscountTypeEnum discountType;

  public static final String SERIALIZED_NAME_DISCOUNT_VALUE = "discount_value";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_VALUE)
  private String discountValue;

  public static final String SERIALIZED_NAME_MAX_DISCOUNT_AMOUNT = "max_discount_amount";
  @SerializedName(SERIALIZED_NAME_MAX_DISCOUNT_AMOUNT)
  private String maxDiscountAmount;

  public DiscountDetails() {
  }

  public DiscountDetails discountType(DiscountTypeEnum discountType) {
    
    this.discountType = discountType;
    return this;
  }

   /**
   * Type of discount
   * @return discountType
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Type of discount")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }


  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }


  public DiscountDetails discountValue(String discountValue) {
    
    this.discountValue = discountValue;
    return this;
  }

   /**
   * Value of Discount.
   * @return discountValue
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Value of Discount.")
  public String getDiscountValue() {
    return discountValue;
  }


  public void setDiscountValue(String discountValue) {
    this.discountValue = discountValue;
  }


  public DiscountDetails maxDiscountAmount(String maxDiscountAmount) {
    
    this.maxDiscountAmount = maxDiscountAmount;
    return this;
  }

   /**
   * Maximum Value of Discount allowed.
   * @return maxDiscountAmount
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Maximum Value of Discount allowed.")
  public String getMaxDiscountAmount() {
    return maxDiscountAmount;
  }


  public void setMaxDiscountAmount(String maxDiscountAmount) {
    this.maxDiscountAmount = maxDiscountAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountDetails discountDetails = (DiscountDetails) o;
    return Objects.equals(this.discountType, discountDetails.discountType) &&
        Objects.equals(this.discountValue, discountDetails.discountValue) &&
        Objects.equals(this.maxDiscountAmount, discountDetails.maxDiscountAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountType, discountValue, maxDiscountAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountDetails {\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    discountValue: ").append(toIndentedString(discountValue)).append("\n");
    sb.append("    maxDiscountAmount: ").append(toIndentedString(maxDiscountAmount)).append("\n");
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
    openapiFields.add("discount_type");
    openapiFields.add("discount_value");
    openapiFields.add("max_discount_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("discount_type");
    openapiRequiredFields.add("discount_value");
    openapiRequiredFields.add("max_discount_amount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DiscountDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DiscountDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("discount_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_type").toString()));
      }
      if (!jsonObj.get("discount_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_value").toString()));
      }
      if (!jsonObj.get("max_discount_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max_discount_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max_discount_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiscountDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiscountDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiscountDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiscountDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<DiscountDetails>() {
           @Override
           public void write(JsonWriter out, DiscountDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiscountDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiscountDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiscountDetails
  * @throws IOException if the JSON string is invalid with respect to DiscountDetails
  */
  public static DiscountDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiscountDetails.class);
  }

 /**
  * Convert an instance of DiscountDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

