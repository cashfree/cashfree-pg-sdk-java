/*
 * Cashfree Payment Gateway APIs
 * Cashfree's Payment Gateway APIs provide developers with a streamlined pathway to integrate advanced payment processing capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2023-08-01
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
 * Fetch Static QR Codes using terminal ID or phone number
 */
@Schema(description = "Fetch Static QR Codes using terminal ID or phone number")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T13:25:41.657534Z[Etc/UTC]")
public class FetchTerminalQRCodesEntity {
  public static final String SERIALIZED_NAME_BANK = "bank";
  @SerializedName(SERIALIZED_NAME_BANK)
  private String bank;

  public static final String SERIALIZED_NAME_QR_CODE = "qrCode";
  @SerializedName(SERIALIZED_NAME_QR_CODE)
  private String qrCode;

  public static final String SERIALIZED_NAME_QR_CODE_URL = "qrCodeUrl";
  @SerializedName(SERIALIZED_NAME_QR_CODE_URL)
  private String qrCodeUrl;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public FetchTerminalQRCodesEntity() {
  }

  public FetchTerminalQRCodesEntity bank(String bank) {
    
    this.bank = bank;
    return this;
  }

   /**
   * Name of the bank that is linked to the Static QR.
   * @return bank
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Name of the bank that is linked to the Static QR.")
  public String getBank() {
    return bank;
  }


  public void setBank(String bank) {
    this.bank = bank;
  }


  public FetchTerminalQRCodesEntity qrCode(String qrCode) {
    
    this.qrCode = qrCode;
    return this;
  }

   /**
   * Base-64 Encoded QR Code URL
   * @return qrCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Base-64 Encoded QR Code URL")
  public String getQrCode() {
    return qrCode;
  }


  public void setQrCode(String qrCode) {
    this.qrCode = qrCode;
  }


  public FetchTerminalQRCodesEntity qrCodeUrl(String qrCodeUrl) {
    
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

   /**
   * URL of the qr Code.
   * @return qrCodeUrl
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "URL of the qr Code.")
  public String getQrCodeUrl() {
    return qrCodeUrl;
  }


  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }


  public FetchTerminalQRCodesEntity status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the static QR.
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Status of the static QR.")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchTerminalQRCodesEntity fetchTerminalQRCodesEntity = (FetchTerminalQRCodesEntity) o;
    return Objects.equals(this.bank, fetchTerminalQRCodesEntity.bank) &&
        Objects.equals(this.qrCode, fetchTerminalQRCodesEntity.qrCode) &&
        Objects.equals(this.qrCodeUrl, fetchTerminalQRCodesEntity.qrCodeUrl) &&
        Objects.equals(this.status, fetchTerminalQRCodesEntity.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bank, qrCode, qrCodeUrl, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchTerminalQRCodesEntity {\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
    sb.append("    qrCodeUrl: ").append(toIndentedString(qrCodeUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("bank");
    openapiFields.add("qrCode");
    openapiFields.add("qrCodeUrl");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FetchTerminalQRCodesEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bank") != null && !jsonObj.get("bank").isJsonNull()) && !jsonObj.get("bank").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank").toString()));
      }
      if ((jsonObj.get("qrCode") != null && !jsonObj.get("qrCode").isJsonNull()) && !jsonObj.get("qrCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qrCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qrCode").toString()));
      }
      if ((jsonObj.get("qrCodeUrl") != null && !jsonObj.get("qrCodeUrl").isJsonNull()) && !jsonObj.get("qrCodeUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qrCodeUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qrCodeUrl").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FetchTerminalQRCodesEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bank") != null && !jsonObj.get("bank").isJsonNull()) && !jsonObj.get("bank").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank").toString()));
      }
      if ((jsonObj.get("qrCode") != null && !jsonObj.get("qrCode").isJsonNull()) && !jsonObj.get("qrCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qrCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qrCode").toString()));
      }
      if ((jsonObj.get("qrCodeUrl") != null && !jsonObj.get("qrCodeUrl").isJsonNull()) && !jsonObj.get("qrCodeUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qrCodeUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qrCodeUrl").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FetchTerminalQRCodesEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FetchTerminalQRCodesEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FetchTerminalQRCodesEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FetchTerminalQRCodesEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<FetchTerminalQRCodesEntity>() {
           @Override
           public void write(JsonWriter out, FetchTerminalQRCodesEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FetchTerminalQRCodesEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FetchTerminalQRCodesEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FetchTerminalQRCodesEntity
  * @throws IOException if the JSON string is invalid with respect to FetchTerminalQRCodesEntity
  */
  public static FetchTerminalQRCodesEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FetchTerminalQRCodesEntity.class);
  }

 /**
  * Convert an instance of FetchTerminalQRCodesEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

