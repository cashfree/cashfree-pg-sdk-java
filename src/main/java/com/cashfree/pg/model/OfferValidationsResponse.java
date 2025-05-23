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
import com.cashfree.pg.model.OfferValidationsResponsePaymentMethod;
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
 * Offer validation object
 */
@Schema(description = "Offer validation object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class OfferValidationsResponse {
  public static final String SERIALIZED_NAME_MAX_ALLOWED = "max_allowed";
  @SerializedName(SERIALIZED_NAME_MAX_ALLOWED)
  private BigDecimal maxAllowed;

  public static final String SERIALIZED_NAME_MIN_AMOUNT = "min_amount";
  @SerializedName(SERIALIZED_NAME_MIN_AMOUNT)
  private BigDecimal minAmount;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private OfferValidationsResponsePaymentMethod paymentMethod;

  public OfferValidationsResponse() {
  }

  public OfferValidationsResponse maxAllowed(BigDecimal maxAllowed) {
    
    this.maxAllowed = maxAllowed;
    return this;
  }

   /**
   * Maximum Amount for Offer to be Applicable
   * minimum: 1
   * @return maxAllowed
  **/
  @javax.annotation.Nullable
  @Schema(example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Maximum Amount for Offer to be Applicable")
  public BigDecimal getMaxAllowed() {
    return maxAllowed;
  }


  public void setMaxAllowed(BigDecimal maxAllowed) {
    this.maxAllowed = maxAllowed;
  }


  public OfferValidationsResponse minAmount(BigDecimal minAmount) {
    
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


  public OfferValidationsResponse paymentMethod(OfferValidationsResponsePaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public OfferValidationsResponsePaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(OfferValidationsResponsePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferValidationsResponse offerValidationsResponse = (OfferValidationsResponse) o;
    return Objects.equals(this.maxAllowed, offerValidationsResponse.maxAllowed) &&
        Objects.equals(this.minAmount, offerValidationsResponse.minAmount) &&
        Objects.equals(this.paymentMethod, offerValidationsResponse.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxAllowed, minAmount, paymentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferValidationsResponse {\n");
    sb.append("    maxAllowed: ").append(toIndentedString(maxAllowed)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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
    openapiFields.add("max_allowed");
    openapiFields.add("min_amount");
    openapiFields.add("payment_method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfferValidationsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `payment_method`
      if (jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) {
        OfferValidationsResponsePaymentMethod.validateJsonElement(jsonObj.get("payment_method"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfferValidationsResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `payment_method`
      if (jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) {
        OfferValidationsResponsePaymentMethod.validateJsonElement(jsonObj.get("payment_method"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferValidationsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferValidationsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferValidationsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferValidationsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferValidationsResponse>() {
           @Override
           public void write(JsonWriter out, OfferValidationsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferValidationsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OfferValidationsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfferValidationsResponse
  * @throws IOException if the JSON string is invalid with respect to OfferValidationsResponse
  */
  public static OfferValidationsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferValidationsResponse.class);
  }

 /**
  * Convert an instance of OfferValidationsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

