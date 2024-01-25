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
 * Payment link meta information object
 */
@Schema(description = "Payment link meta information object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-25T07:39:27.472751Z[Etc/UTC]")
public class LinkMetaEntity {
  public static final String SERIALIZED_NAME_NOTIFY_URL = "notify_url";
  @SerializedName(SERIALIZED_NAME_NOTIFY_URL)
  private String notifyUrl;

  public static final String SERIALIZED_NAME_UPI_INTENT = "upi_intent";
  @SerializedName(SERIALIZED_NAME_UPI_INTENT)
  private Boolean upiIntent;

  public static final String SERIALIZED_NAME_RETURN_URL = "return_url";
  @SerializedName(SERIALIZED_NAME_RETURN_URL)
  private String returnUrl;

  public static final String SERIALIZED_NAME_PAYMENT_METHODS = "payment_methods";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHODS)
  private String paymentMethods;

  public LinkMetaEntity() {
  }

  public LinkMetaEntity notifyUrl(String notifyUrl) {
    
    this.notifyUrl = notifyUrl;
    return this;
  }

   /**
   * Notification URL for server-server communication. It should be an https URL.
   * @return notifyUrl
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Notification URL for server-server communication. It should be an https URL.")
  public String getNotifyUrl() {
    return notifyUrl;
  }


  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }


  public LinkMetaEntity upiIntent(Boolean upiIntent) {
    
    this.upiIntent = upiIntent;
    return this;
  }

   /**
   * If \&quot;true\&quot;, link will directly open UPI Intent flow on mobile, and normal link flow elsewhere
   * @return upiIntent
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "If \"true\", link will directly open UPI Intent flow on mobile, and normal link flow elsewhere")
  public Boolean getUpiIntent() {
    return upiIntent;
  }


  public void setUpiIntent(Boolean upiIntent) {
    this.upiIntent = upiIntent;
  }


  public LinkMetaEntity returnUrl(String returnUrl) {
    
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * The URL to which user will be redirected to after the payment is done on the link. Maximum length: 250.
   * @return returnUrl
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The URL to which user will be redirected to after the payment is done on the link. Maximum length: 250.")
  public String getReturnUrl() {
    return returnUrl;
  }


  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }


  public LinkMetaEntity paymentMethods(String paymentMethods) {
    
    this.paymentMethods = paymentMethods;
    return this;
  }

   /**
   * Allowed payment modes for this link. Pass comma-separated values among following options - \&quot;cc\&quot;, \&quot;dc\&quot;, \&quot;ccc\&quot;, \&quot;ppc\&quot;, \&quot;nb\&quot;, \&quot;upi\&quot;, \&quot;paypal\&quot;, \&quot;app\&quot;. Leave it blank to show all available payment methods
   * @return paymentMethods
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Allowed payment modes for this link. Pass comma-separated values among following options - \"cc\", \"dc\", \"ccc\", \"ppc\", \"nb\", \"upi\", \"paypal\", \"app\". Leave it blank to show all available payment methods")
  public String getPaymentMethods() {
    return paymentMethods;
  }


  public void setPaymentMethods(String paymentMethods) {
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
    LinkMetaEntity linkMetaEntity = (LinkMetaEntity) o;
    return Objects.equals(this.notifyUrl, linkMetaEntity.notifyUrl) &&
        Objects.equals(this.upiIntent, linkMetaEntity.upiIntent) &&
        Objects.equals(this.returnUrl, linkMetaEntity.returnUrl) &&
        Objects.equals(this.paymentMethods, linkMetaEntity.paymentMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyUrl, upiIntent, returnUrl, paymentMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkMetaEntity {\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
    sb.append("    upiIntent: ").append(toIndentedString(upiIntent)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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
    openapiFields.add("notify_url");
    openapiFields.add("upi_intent");
    openapiFields.add("return_url");
    openapiFields.add("payment_methods");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LinkMetaEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("notify_url") != null && !jsonObj.get("notify_url").isJsonNull()) && !jsonObj.get("notify_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_url").toString()));
      }
      if ((jsonObj.get("return_url") != null && !jsonObj.get("return_url").isJsonNull()) && !jsonObj.get("return_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("return_url").toString()));
      }
      if ((jsonObj.get("payment_methods") != null && !jsonObj.get("payment_methods").isJsonNull()) && !jsonObj.get("payment_methods").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_methods` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_methods").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkMetaEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkMetaEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkMetaEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkMetaEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkMetaEntity>() {
           @Override
           public void write(JsonWriter out, LinkMetaEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkMetaEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LinkMetaEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkMetaEntity
  * @throws IOException if the JSON string is invalid with respect to LinkMetaEntity
  */
  public static LinkMetaEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkMetaEntity.class);
  }

 /**
  * Convert an instance of LinkMetaEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

