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
import com.cashfree.model.OfferValidationsPaymentMethod;
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
 * Offer validation object
 */
@Schema(description = "Offer validation object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-09T14:02:06.288163Z[Etc/UTC]")
public class OfferValidations {
  public static final String SERIALIZED_NAME_MIN_AMOUNT = "min_amount";
  @SerializedName(SERIALIZED_NAME_MIN_AMOUNT)
  private BigDecimal minAmount;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private OfferValidationsPaymentMethod paymentMethod;

  public static final String SERIALIZED_NAME_MAX_ALLOWED = "max_allowed";
  @SerializedName(SERIALIZED_NAME_MAX_ALLOWED)
  private BigDecimal maxAllowed;

  public OfferValidations() {
  }

  public OfferValidations minAmount(BigDecimal minAmount) {
    
    this.minAmount = minAmount;
    return this;
  }

   /**
   * Minimum Amount for Offer to be Applicable
   * minimum: 1
   * @return minAmount
  **/
  @javax.annotation.Nullable
  @Schema(example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Minimum Amount for Offer to be Applicable")
  public BigDecimal getMinAmount() {
    return minAmount;
  }


  public void setMinAmount(BigDecimal minAmount) {
    this.minAmount = minAmount;
  }


  public OfferValidations paymentMethod(OfferValidationsPaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public OfferValidationsPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(OfferValidationsPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public OfferValidations maxAllowed(BigDecimal maxAllowed) {
    
    this.maxAllowed = maxAllowed;
    return this;
  }

   /**
   * Maximum amount of Offer that can be availed.
   * minimum: 1
   * @return maxAllowed
  **/
  @javax.annotation.Nonnull
  @Schema(example = "10", requiredMode = Schema.RequiredMode.REQUIRED, description = "Maximum amount of Offer that can be availed.")
  public BigDecimal getMaxAllowed() {
    return maxAllowed;
  }


  public void setMaxAllowed(BigDecimal maxAllowed) {
    this.maxAllowed = maxAllowed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferValidations offerValidations = (OfferValidations) o;
    return Objects.equals(this.minAmount, offerValidations.minAmount) &&
        Objects.equals(this.paymentMethod, offerValidations.paymentMethod) &&
        Objects.equals(this.maxAllowed, offerValidations.maxAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minAmount, paymentMethod, maxAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferValidations {\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    maxAllowed: ").append(toIndentedString(maxAllowed)).append("\n");
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
    openapiFields.add("min_amount");
    openapiFields.add("payment_method");
    openapiFields.add("max_allowed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("payment_method");
    openapiRequiredFields.add("max_allowed");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfferValidations
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OfferValidations.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `payment_method`
      OfferValidationsPaymentMethod.validateJsonElement(jsonObj.get("payment_method"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferValidations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferValidations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferValidations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferValidations.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferValidations>() {
           @Override
           public void write(JsonWriter out, OfferValidations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferValidations read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OfferValidations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfferValidations
  * @throws IOException if the JSON string is invalid with respect to OfferValidations
  */
  public static OfferValidations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferValidations.class);
  }

 /**
  * Convert an instance of OfferValidations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

