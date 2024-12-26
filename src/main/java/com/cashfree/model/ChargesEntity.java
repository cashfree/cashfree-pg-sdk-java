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
 * Charges accociated with the order
 */
@Schema(description = "Charges accociated with the order")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T13:33:59.432802Z[Etc/UTC]")
public class ChargesEntity {
  public static final String SERIALIZED_NAME_SHIPPING_CHARGES = "shipping_charges";
  @SerializedName(SERIALIZED_NAME_SHIPPING_CHARGES)
  private BigDecimal shippingCharges;

  public static final String SERIALIZED_NAME_COD_HANDLING_CHARGES = "cod_handling_charges";
  @SerializedName(SERIALIZED_NAME_COD_HANDLING_CHARGES)
  private BigDecimal codHandlingCharges;

  public ChargesEntity() {
  }

  public ChargesEntity shippingCharges(BigDecimal shippingCharges) {
    
    this.shippingCharges = shippingCharges;
    return this;
  }

   /**
   * Shipping charge of the order
   * @return shippingCharges
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Shipping charge of the order")
  public BigDecimal getShippingCharges() {
    return shippingCharges;
  }


  public void setShippingCharges(BigDecimal shippingCharges) {
    this.shippingCharges = shippingCharges;
  }


  public ChargesEntity codHandlingCharges(BigDecimal codHandlingCharges) {
    
    this.codHandlingCharges = codHandlingCharges;
    return this;
  }

   /**
   * COD handling fee for order
   * @return codHandlingCharges
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "COD handling fee for order")
  public BigDecimal getCodHandlingCharges() {
    return codHandlingCharges;
  }


  public void setCodHandlingCharges(BigDecimal codHandlingCharges) {
    this.codHandlingCharges = codHandlingCharges;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargesEntity chargesEntity = (ChargesEntity) o;
    return Objects.equals(this.shippingCharges, chargesEntity.shippingCharges) &&
        Objects.equals(this.codHandlingCharges, chargesEntity.codHandlingCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingCharges, codHandlingCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargesEntity {\n");
    sb.append("    shippingCharges: ").append(toIndentedString(shippingCharges)).append("\n");
    sb.append("    codHandlingCharges: ").append(toIndentedString(codHandlingCharges)).append("\n");
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
    openapiFields.add("shipping_charges");
    openapiFields.add("cod_handling_charges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChargesEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChargesEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChargesEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChargesEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChargesEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChargesEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<ChargesEntity>() {
           @Override
           public void write(JsonWriter out, ChargesEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChargesEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChargesEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChargesEntity
  * @throws IOException if the JSON string is invalid with respect to ChargesEntity
  */
  public static ChargesEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargesEntity.class);
  }

 /**
  * Convert an instance of ChargesEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

