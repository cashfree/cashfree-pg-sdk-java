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

import com.cashfree.JSON;

/**
 * Filter for specific Payment Methods
 */
@Schema(description = "Filter for specific Payment Methods")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-23T08:10:57.817367Z[Etc/UTC]")
public class PaymentMethodsFilters {
  public static final String SERIALIZED_NAME_PAYMENT_METHODS = "payment_methods";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHODS)
  private List<String> paymentMethods;

  public PaymentMethodsFilters() {
  }

  public PaymentMethodsFilters paymentMethods(List<String> paymentMethods) {
    
    this.paymentMethods = paymentMethods;
    return this;
  }

  public PaymentMethodsFilters addPaymentMethodsItem(String paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

   /**
   * Array of payment methods to be filtered. This is optional, by default all payment methods will be returned. Possible values in [ &#39;debit_card&#39;, &#39;credit_card&#39;, &#39;prepaid_card&#39;, &#39;corporate_credit_card&#39;, &#39;upi&#39;, &#39;wallet&#39;, &#39;netbanking&#39;, &#39;banktransfer&#39;, &#39;paylater&#39;, &#39;paypal&#39;, &#39;debit_card_emi&#39;, &#39;credit_card_emi&#39;, &#39;upi_credit_card&#39;, &#39;upi_ppi&#39;, &#39;cardless_emi&#39;, &#39;account_based_payment&#39; ] 
   * @return paymentMethods
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Array of payment methods to be filtered. This is optional, by default all payment methods will be returned. Possible values in [ 'debit_card', 'credit_card', 'prepaid_card', 'corporate_credit_card', 'upi', 'wallet', 'netbanking', 'banktransfer', 'paylater', 'paypal', 'debit_card_emi', 'credit_card_emi', 'upi_credit_card', 'upi_ppi', 'cardless_emi', 'account_based_payment' ] ")
  public List<String> getPaymentMethods() {
    return paymentMethods;
  }


  public void setPaymentMethods(List<String> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodsFilters paymentMethodsFilters = (PaymentMethodsFilters) o;
    return Objects.equals(this.paymentMethods, paymentMethodsFilters.paymentMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodsFilters {\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
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
    openapiFields.add("payment_methods");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodsFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("payment_methods") != null && !jsonObj.get("payment_methods").isJsonNull() && !jsonObj.get("payment_methods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_methods` to be an array in the JSON string but got `%s`", jsonObj.get("payment_methods").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodsFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodsFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodsFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodsFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodsFilters>() {
           @Override
           public void write(JsonWriter out, PaymentMethodsFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodsFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodsFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodsFilters
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodsFilters
  */
  public static PaymentMethodsFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodsFilters.class);
  }

 /**
  * Convert an instance of PaymentMethodsFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

