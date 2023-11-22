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
 * Payment link Notify Object for SMS and Email
 */
@Schema(description = "Payment link Notify Object for SMS and Email")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T08:56:39.020570Z[Etc/UTC]")
public class LinkNotifyEntity {
  public static final String SERIALIZED_NAME_SEND_SMS = "send_sms";
  @SerializedName(SERIALIZED_NAME_SEND_SMS)
  private Boolean sendSms;

  public static final String SERIALIZED_NAME_SEND_EMAIL = "send_email";
  @SerializedName(SERIALIZED_NAME_SEND_EMAIL)
  private Boolean sendEmail;

  public LinkNotifyEntity() {
  }

  public LinkNotifyEntity sendSms(Boolean sendSms) {
    
    this.sendSms = sendSms;
    return this;
  }

   /**
   * If \&quot;true\&quot;, Cashfree will send sms on customer_phone
   * @return sendSms
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "If \"true\", Cashfree will send sms on customer_phone")
  public Boolean getSendSms() {
    return sendSms;
  }


  public void setSendSms(Boolean sendSms) {
    this.sendSms = sendSms;
  }


  public LinkNotifyEntity sendEmail(Boolean sendEmail) {
    
    this.sendEmail = sendEmail;
    return this;
  }

   /**
   * If \&quot;true\&quot;, Cashfree will send email on customer_email
   * @return sendEmail
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "If \"true\", Cashfree will send email on customer_email")
  public Boolean getSendEmail() {
    return sendEmail;
  }


  public void setSendEmail(Boolean sendEmail) {
    this.sendEmail = sendEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkNotifyEntity linkNotifyEntity = (LinkNotifyEntity) o;
    return Objects.equals(this.sendSms, linkNotifyEntity.sendSms) &&
        Objects.equals(this.sendEmail, linkNotifyEntity.sendEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sendSms, sendEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkNotifyEntity {\n");
    sb.append("    sendSms: ").append(toIndentedString(sendSms)).append("\n");
    sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
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
    openapiFields.add("send_sms");
    openapiFields.add("send_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LinkNotifyEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkNotifyEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkNotifyEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkNotifyEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkNotifyEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkNotifyEntity>() {
           @Override
           public void write(JsonWriter out, LinkNotifyEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkNotifyEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LinkNotifyEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkNotifyEntity
  * @throws IOException if the JSON string is invalid with respect to LinkNotifyEntity
  */
  public static LinkNotifyEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkNotifyEntity.class);
  }

 /**
  * Convert an instance of LinkNotifyEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

