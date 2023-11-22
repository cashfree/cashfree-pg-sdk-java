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
 * payment mode eligiblity object
 */
@Schema(description = "payment mode eligiblity object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T09:13:46.373979Z[Etc/UTC]")
public class PaymentModeDetails {
  public static final String SERIALIZED_NAME_NICK = "nick";
  @SerializedName(SERIALIZED_NAME_NICK)
  private String nick;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private String display;

  public static final String SERIALIZED_NAME_ELIGIBILITY = "eligibility";
  @SerializedName(SERIALIZED_NAME_ELIGIBILITY)
  private Boolean eligibility;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private BigDecimal code;

  public PaymentModeDetails() {
  }

  public PaymentModeDetails nick(String nick) {
    
    this.nick = nick;
    return this;
  }

   /**
   * Get nick
   * @return nick
  **/
  @javax.annotation.Nullable
  @Schema(example = "motak_kahindra_bank", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getNick() {
    return nick;
  }


  public void setNick(String nick) {
    this.nick = nick;
  }


  public PaymentModeDetails display(String display) {
    
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  @javax.annotation.Nullable
  @Schema(example = "Motak Mahindra Bank", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getDisplay() {
    return display;
  }


  public void setDisplay(String display) {
    this.display = display;
  }


  public PaymentModeDetails eligibility(Boolean eligibility) {
    
    this.eligibility = eligibility;
    return this;
  }

   /**
   * Get eligibility
   * @return eligibility
  **/
  @javax.annotation.Nullable
  @Schema(example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Boolean getEligibility() {
    return eligibility;
  }


  public void setEligibility(Boolean eligibility) {
    this.eligibility = eligibility;
  }


  public PaymentModeDetails code(BigDecimal code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @Schema(example = "3001", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getCode() {
    return code;
  }


  public void setCode(BigDecimal code) {
    this.code = code;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentModeDetails paymentModeDetails = (PaymentModeDetails) o;
    return Objects.equals(this.nick, paymentModeDetails.nick) &&
        Objects.equals(this.display, paymentModeDetails.display) &&
        Objects.equals(this.eligibility, paymentModeDetails.eligibility) &&
        Objects.equals(this.code, paymentModeDetails.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nick, display, eligibility, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentModeDetails {\n");
    sb.append("    nick: ").append(toIndentedString(nick)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
    openapiFields.add("nick");
    openapiFields.add("display");
    openapiFields.add("eligibility");
    openapiFields.add("code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentModeDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nick") != null && !jsonObj.get("nick").isJsonNull()) && !jsonObj.get("nick").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nick` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nick").toString()));
      }
      if ((jsonObj.get("display") != null && !jsonObj.get("display").isJsonNull()) && !jsonObj.get("display").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentModeDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentModeDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentModeDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentModeDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentModeDetails>() {
           @Override
           public void write(JsonWriter out, PaymentModeDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentModeDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentModeDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentModeDetails
  * @throws IOException if the JSON string is invalid with respect to PaymentModeDetails
  */
  public static PaymentModeDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentModeDetails.class);
  }

 /**
  * Convert an instance of PaymentModeDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
