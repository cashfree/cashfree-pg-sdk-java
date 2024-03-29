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
import com.cashfree.model.PaymentEntity;
import com.cashfree.model.WHcustomerDetails;
import com.cashfree.model.WHorder;
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
 * webhook object
 */
@Schema(description = "webhook object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-02T08:03:31.581397Z[Etc/UTC]")
public class WHdata {
  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private WHorder order;

  public static final String SERIALIZED_NAME_PAYMENT = "payment";
  @SerializedName(SERIALIZED_NAME_PAYMENT)
  private PaymentEntity payment;

  public static final String SERIALIZED_NAME_CUSTOMER_DETAILS = "customer_details";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DETAILS)
  private WHcustomerDetails customerDetails;

  public WHdata() {
  }

  public WHdata order(WHorder order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public WHorder getOrder() {
    return order;
  }


  public void setOrder(WHorder order) {
    this.order = order;
  }


  public WHdata payment(PaymentEntity payment) {
    
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentEntity getPayment() {
    return payment;
  }


  public void setPayment(PaymentEntity payment) {
    this.payment = payment;
  }


  public WHdata customerDetails(WHcustomerDetails customerDetails) {
    
    this.customerDetails = customerDetails;
    return this;
  }

   /**
   * Get customerDetails
   * @return customerDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public WHcustomerDetails getCustomerDetails() {
    return customerDetails;
  }


  public void setCustomerDetails(WHcustomerDetails customerDetails) {
    this.customerDetails = customerDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WHdata whdata = (WHdata) o;
    return Objects.equals(this.order, whdata.order) &&
        Objects.equals(this.payment, whdata.payment) &&
        Objects.equals(this.customerDetails, whdata.customerDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, payment, customerDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WHdata {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
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
    openapiFields.add("order");
    openapiFields.add("payment");
    openapiFields.add("customer_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WHdata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        WHorder.validateJsonElement(jsonObj.get("order"));
      }
      // validate the optional field `payment`
      if (jsonObj.get("payment") != null && !jsonObj.get("payment").isJsonNull()) {
        PaymentEntity.validateJsonElement(jsonObj.get("payment"));
      }
      // validate the optional field `customer_details`
      if (jsonObj.get("customer_details") != null && !jsonObj.get("customer_details").isJsonNull()) {
        WHcustomerDetails.validateJsonElement(jsonObj.get("customer_details"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WHdata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WHdata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WHdata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WHdata.class));

       return (TypeAdapter<T>) new TypeAdapter<WHdata>() {
           @Override
           public void write(JsonWriter out, WHdata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WHdata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WHdata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WHdata
  * @throws IOException if the JSON string is invalid with respect to WHdata
  */
  public static WHdata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WHdata.class);
  }

 /**
  * Convert an instance of WHdata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

