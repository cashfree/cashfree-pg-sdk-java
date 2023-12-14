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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * CreateOrderRequestOrderMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-14T10:44:30.379726Z[Etc/UTC]")
public class CreateOrderRequestOrderMeta {
  public static final String SERIALIZED_NAME_RETURN_URL = "return_url";
  @SerializedName(SERIALIZED_NAME_RETURN_URL)
  private String returnUrl;

  public static final String SERIALIZED_NAME_NOTIFY_URL = "notify_url";
  @SerializedName(SERIALIZED_NAME_NOTIFY_URL)
  private String notifyUrl;

  public static final String SERIALIZED_NAME_PAYMENT_METHODS = "payment_methods";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHODS)
  private Object paymentMethods = null;

  public CreateOrderRequestOrderMeta() {
  }

  public CreateOrderRequestOrderMeta returnUrl(String returnUrl) {
    
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * The URL to which user will be redirected to after the payment on bank OTP page. Maximum length: 250. The return_url must contain placeholder {order_id}. When redirecting the customer back to the return url from the bank’s OTP page, Cashfree will replace this placeholder with the actual value for that order.
   * @return returnUrl
  **/
  @javax.annotation.Nullable
  @Schema(example = "https://example.com/return?order_id={order_id}", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The URL to which user will be redirected to after the payment on bank OTP page. Maximum length: 250. The return_url must contain placeholder {order_id}. When redirecting the customer back to the return url from the bank’s OTP page, Cashfree will replace this placeholder with the actual value for that order.")
  public String getReturnUrl() {
    return returnUrl;
  }


  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }


  public CreateOrderRequestOrderMeta notifyUrl(String notifyUrl) {
    
    this.notifyUrl = notifyUrl;
    return this;
  }

   /**
   * Notification URL for server-server communication. Useful when user&#39;s connection drops while re-directing. NotifyUrl should be an https URL. Maximum length: 250.
   * @return notifyUrl
  **/
  @javax.annotation.Nullable
  @Schema(example = "https://example.com/cf_notify", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Notification URL for server-server communication. Useful when user's connection drops while re-directing. NotifyUrl should be an https URL. Maximum length: 250.")
  public String getNotifyUrl() {
    return notifyUrl;
  }


  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }


  public CreateOrderRequestOrderMeta paymentMethods(Object paymentMethods) {
    
    this.paymentMethods = paymentMethods;
    return this;
  }

   /**
   * Allowed payment modes for this order. Pass comma-separated values among following options - \&quot;cc\&quot;, \&quot;dc\&quot;, \&quot;ccc\&quot;, \&quot;ppc\&quot;,\&quot;nb\&quot;,\&quot;upi\&quot;,\&quot;paypal\&quot;,\&quot;app\&quot;,\&quot;paylater\&quot;,\&quot;cardlessemi\&quot;,\&quot;dcemi\&quot;,\&quot;ccemi\&quot;,\&quot;banktransfer\&quot;. Leave it blank to show all available payment methods
   * @return paymentMethods
  **/
  @javax.annotation.Nullable
  @Schema(example = "cc,dc,upi", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Allowed payment modes for this order. Pass comma-separated values among following options - \"cc\", \"dc\", \"ccc\", \"ppc\",\"nb\",\"upi\",\"paypal\",\"app\",\"paylater\",\"cardlessemi\",\"dcemi\",\"ccemi\",\"banktransfer\". Leave it blank to show all available payment methods")
  public Object getPaymentMethods() {
    return paymentMethods;
  }


  public void setPaymentMethods(Object paymentMethods) {
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
    CreateOrderRequestOrderMeta createOrderRequestOrderMeta = (CreateOrderRequestOrderMeta) o;
    return Objects.equals(this.returnUrl, createOrderRequestOrderMeta.returnUrl) &&
        Objects.equals(this.notifyUrl, createOrderRequestOrderMeta.notifyUrl) &&
        Objects.equals(this.paymentMethods, createOrderRequestOrderMeta.paymentMethods);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnUrl, notifyUrl, paymentMethods);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequestOrderMeta {\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
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
    openapiFields.add("return_url");
    openapiFields.add("notify_url");
    openapiFields.add("payment_methods");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateOrderRequestOrderMeta
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("return_url") != null && !jsonObj.get("return_url").isJsonNull()) && !jsonObj.get("return_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("return_url").toString()));
      }
      if ((jsonObj.get("notify_url") != null && !jsonObj.get("notify_url").isJsonNull()) && !jsonObj.get("notify_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOrderRequestOrderMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOrderRequestOrderMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOrderRequestOrderMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOrderRequestOrderMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOrderRequestOrderMeta>() {
           @Override
           public void write(JsonWriter out, CreateOrderRequestOrderMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOrderRequestOrderMeta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateOrderRequestOrderMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateOrderRequestOrderMeta
  * @throws IOException if the JSON string is invalid with respect to CreateOrderRequestOrderMeta
  */
  public static CreateOrderRequestOrderMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOrderRequestOrderMeta.class);
  }

 /**
  * Convert an instance of CreateOrderRequestOrderMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

