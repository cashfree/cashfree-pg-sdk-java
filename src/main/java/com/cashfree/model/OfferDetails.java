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
import com.cashfree.model.CashbackDetails;
import com.cashfree.model.DiscountDetails;
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
 * Offer details and type
 */
@Schema(description = "Offer details and type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T09:13:46.373979Z[Etc/UTC]")
public class OfferDetails {
  /**
   * Offer Type for the Offer.
   */
  @JsonAdapter(OfferTypeEnum.Adapter.class)
  public enum OfferTypeEnum {
    DISCOUNT("DISCOUNT"),
    
    CASHBACK("CASHBACK"),
    
    DISCOUNT_AND_CASHBACK("DISCOUNT_AND_CASHBACK"),
    
    NO_COST_EMI("NO_COST_EMI"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    OfferTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OfferTypeEnum fromValue(String value) {
      for (OfferTypeEnum b : OfferTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<OfferTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OfferTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OfferTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OfferTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OFFER_TYPE = "offer_type";
  @SerializedName(SERIALIZED_NAME_OFFER_TYPE)
  private OfferTypeEnum offerType;

  public static final String SERIALIZED_NAME_DISCOUNT_DETAILS = "discount_details";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_DETAILS)
  private DiscountDetails discountDetails;

  public static final String SERIALIZED_NAME_CASHBACK_DETAILS = "cashback_details";
  @SerializedName(SERIALIZED_NAME_CASHBACK_DETAILS)
  private CashbackDetails cashbackDetails;

  public OfferDetails() {
  }

  public OfferDetails offerType(OfferTypeEnum offerType) {
    
    this.offerType = offerType;
    return this;
  }

   /**
   * Offer Type for the Offer.
   * @return offerType
  **/
  @javax.annotation.Nonnull
  @Schema(example = "DISCOUNT_AND_CASHBACK", requiredMode = Schema.RequiredMode.REQUIRED, description = "Offer Type for the Offer.")
  public OfferTypeEnum getOfferType() {
    return offerType;
  }


  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }


  public OfferDetails discountDetails(DiscountDetails discountDetails) {
    
    this.discountDetails = discountDetails;
    return this;
  }

   /**
   * Get discountDetails
   * @return discountDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public DiscountDetails getDiscountDetails() {
    return discountDetails;
  }


  public void setDiscountDetails(DiscountDetails discountDetails) {
    this.discountDetails = discountDetails;
  }


  public OfferDetails cashbackDetails(CashbackDetails cashbackDetails) {
    
    this.cashbackDetails = cashbackDetails;
    return this;
  }

   /**
   * Get cashbackDetails
   * @return cashbackDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CashbackDetails getCashbackDetails() {
    return cashbackDetails;
  }


  public void setCashbackDetails(CashbackDetails cashbackDetails) {
    this.cashbackDetails = cashbackDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDetails offerDetails = (OfferDetails) o;
    return Objects.equals(this.offerType, offerDetails.offerType) &&
        Objects.equals(this.discountDetails, offerDetails.discountDetails) &&
        Objects.equals(this.cashbackDetails, offerDetails.cashbackDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerType, discountDetails, cashbackDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDetails {\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    discountDetails: ").append(toIndentedString(discountDetails)).append("\n");
    sb.append("    cashbackDetails: ").append(toIndentedString(cashbackDetails)).append("\n");
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
    openapiFields.add("offer_type");
    openapiFields.add("discount_details");
    openapiFields.add("cashback_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("offer_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfferDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OfferDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("offer_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_type").toString()));
      }
      // validate the optional field `discount_details`
      if (jsonObj.get("discount_details") != null && !jsonObj.get("discount_details").isJsonNull()) {
        DiscountDetails.validateJsonElement(jsonObj.get("discount_details"));
      }
      // validate the optional field `cashback_details`
      if (jsonObj.get("cashback_details") != null && !jsonObj.get("cashback_details").isJsonNull()) {
        CashbackDetails.validateJsonElement(jsonObj.get("cashback_details"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferDetails>() {
           @Override
           public void write(JsonWriter out, OfferDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OfferDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfferDetails
  * @throws IOException if the JSON string is invalid with respect to OfferDetails
  */
  public static OfferDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferDetails.class);
  }

 /**
  * Convert an instance of OfferDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
