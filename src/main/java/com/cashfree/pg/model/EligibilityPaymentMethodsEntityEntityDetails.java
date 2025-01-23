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
import com.cashfree.pg.model.PaymentModeDetails;
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

import com.cashfree.pg.JSON;

/**
 * EligibilityPaymentMethodsEntityEntityDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T13:50:37.026342Z[Etc/UTC]")
public class EligibilityPaymentMethodsEntityEntityDetails {
  public static final String SERIALIZED_NAME_PAYMENT_METHOD_DETAILS = "payment_method_details";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_DETAILS)
  private List<PaymentModeDetails> paymentMethodDetails;

  public EligibilityPaymentMethodsEntityEntityDetails() {
  }

  public EligibilityPaymentMethodsEntityEntityDetails paymentMethodDetails(List<PaymentModeDetails> paymentMethodDetails) {
    
    this.paymentMethodDetails = paymentMethodDetails;
    return this;
  }

  public EligibilityPaymentMethodsEntityEntityDetails addPaymentMethodDetailsItem(PaymentModeDetails paymentMethodDetailsItem) {
    if (this.paymentMethodDetails == null) {
      this.paymentMethodDetails = new ArrayList<>();
    }
    this.paymentMethodDetails.add(paymentMethodDetailsItem);
    return this;
  }

   /**
   * Get paymentMethodDetails
   * @return paymentMethodDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<PaymentModeDetails> getPaymentMethodDetails() {
    return paymentMethodDetails;
  }


  public void setPaymentMethodDetails(List<PaymentModeDetails> paymentMethodDetails) {
    this.paymentMethodDetails = paymentMethodDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EligibilityPaymentMethodsEntityEntityDetails eligibilityPaymentMethodsEntityEntityDetails = (EligibilityPaymentMethodsEntityEntityDetails) o;
    return Objects.equals(this.paymentMethodDetails, eligibilityPaymentMethodsEntityEntityDetails.paymentMethodDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityPaymentMethodsEntityEntityDetails {\n");
    sb.append("    paymentMethodDetails: ").append(toIndentedString(paymentMethodDetails)).append("\n");
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
    openapiFields.add("payment_method_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EligibilityPaymentMethodsEntityEntityDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("payment_method_details") != null && !jsonObj.get("payment_method_details").isJsonNull()) {
        JsonArray jsonArraypaymentMethodDetails = jsonObj.getAsJsonArray("payment_method_details");
        if (jsonArraypaymentMethodDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("payment_method_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `payment_method_details` to be an array in the JSON string but got `%s`", jsonObj.get("payment_method_details").toString()));
          }

          // validate the optional field `payment_method_details` (array)
          for (int i = 0; i < jsonArraypaymentMethodDetails.size(); i++) {
            PaymentModeDetails.validateJsonElement(jsonArraypaymentMethodDetails.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EligibilityPaymentMethodsEntityEntityDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("payment_method_details") != null && !jsonObj.get("payment_method_details").isJsonNull()) {
        JsonArray jsonArraypaymentMethodDetails = jsonObj.getAsJsonArray("payment_method_details");
        if (jsonArraypaymentMethodDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("payment_method_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `payment_method_details` to be an array in the JSON string but got `%s`", jsonObj.get("payment_method_details").toString()));
          }

          // validate the optional field `payment_method_details` (array)
          for (int i = 0; i < jsonArraypaymentMethodDetails.size(); i++) {
            PaymentModeDetails.validateJsonElement(jsonArraypaymentMethodDetails.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EligibilityPaymentMethodsEntityEntityDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EligibilityPaymentMethodsEntityEntityDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EligibilityPaymentMethodsEntityEntityDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EligibilityPaymentMethodsEntityEntityDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<EligibilityPaymentMethodsEntityEntityDetails>() {
           @Override
           public void write(JsonWriter out, EligibilityPaymentMethodsEntityEntityDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EligibilityPaymentMethodsEntityEntityDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EligibilityPaymentMethodsEntityEntityDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EligibilityPaymentMethodsEntityEntityDetails
  * @throws IOException if the JSON string is invalid with respect to EligibilityPaymentMethodsEntityEntityDetails
  */
  public static EligibilityPaymentMethodsEntityEntityDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EligibilityPaymentMethodsEntityEntityDetails.class);
  }

 /**
  * Convert an instance of EligibilityPaymentMethodsEntityEntityDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

