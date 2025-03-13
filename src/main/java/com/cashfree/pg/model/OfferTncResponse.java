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

import com.cashfree.pg.JSON;

/**
 * Offer terms and condition object
 */
@Schema(description = "Offer terms and condition object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T09:38:52.601894Z[Etc/UTC]")
public class OfferTncResponse {
  /**
   * TnC Type for the Offer. It can be either &#x60;text&#x60; or &#x60;link&#x60;
   */
  @JsonAdapter(OfferTncTypeEnum.Adapter.class)
  public enum OfferTncTypeEnum {
    TEXT("text"),
    
    LINK("link"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    OfferTncTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OfferTncTypeEnum fromValue(String value) {
      for (OfferTncTypeEnum b : OfferTncTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<OfferTncTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OfferTncTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OfferTncTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OfferTncTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OFFER_TNC_TYPE = "offer_tnc_type";
  @SerializedName(SERIALIZED_NAME_OFFER_TNC_TYPE)
  private OfferTncTypeEnum offerTncType;

  public static final String SERIALIZED_NAME_OFFER_TNC_VALUE = "offer_tnc_value";
  @SerializedName(SERIALIZED_NAME_OFFER_TNC_VALUE)
  private String offerTncValue;

  public OfferTncResponse() {
  }

  public OfferTncResponse offerTncType(OfferTncTypeEnum offerTncType) {
    
    this.offerTncType = offerTncType;
    return this;
  }

   /**
   * TnC Type for the Offer. It can be either &#x60;text&#x60; or &#x60;link&#x60;
   * @return offerTncType
  **/
  @javax.annotation.Nullable
  @Schema(example = "text", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "TnC Type for the Offer. It can be either `text` or `link`")
  public OfferTncTypeEnum getOfferTncType() {
    return offerTncType;
  }


  public void setOfferTncType(OfferTncTypeEnum offerTncType) {
    this.offerTncType = offerTncType;
  }


  public OfferTncResponse offerTncValue(String offerTncValue) {
    
    this.offerTncValue = offerTncValue;
    return this;
  }

   /**
   * TnC for the Offer.
   * @return offerTncValue
  **/
  @javax.annotation.Nullable
  @Schema(example = "Lorem ipsum dolor sit amet, consectetur adipiscing elit", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "TnC for the Offer.")
  public String getOfferTncValue() {
    return offerTncValue;
  }


  public void setOfferTncValue(String offerTncValue) {
    this.offerTncValue = offerTncValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferTncResponse offerTncResponse = (OfferTncResponse) o;
    return Objects.equals(this.offerTncType, offerTncResponse.offerTncType) &&
        Objects.equals(this.offerTncValue, offerTncResponse.offerTncValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerTncType, offerTncValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferTncResponse {\n");
    sb.append("    offerTncType: ").append(toIndentedString(offerTncType)).append("\n");
    sb.append("    offerTncValue: ").append(toIndentedString(offerTncValue)).append("\n");
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
    openapiFields.add("offer_tnc_type");
    openapiFields.add("offer_tnc_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfferTncResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("offer_tnc_type") != null && !jsonObj.get("offer_tnc_type").isJsonNull()) && !jsonObj.get("offer_tnc_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_tnc_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_tnc_type").toString()));
      }
      if ((jsonObj.get("offer_tnc_value") != null && !jsonObj.get("offer_tnc_value").isJsonNull()) && !jsonObj.get("offer_tnc_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_tnc_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_tnc_value").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfferTncResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("offer_tnc_type") != null && !jsonObj.get("offer_tnc_type").isJsonNull()) && !jsonObj.get("offer_tnc_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_tnc_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_tnc_type").toString()));
      }
      if ((jsonObj.get("offer_tnc_value") != null && !jsonObj.get("offer_tnc_value").isJsonNull()) && !jsonObj.get("offer_tnc_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_tnc_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_tnc_value").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferTncResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferTncResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferTncResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferTncResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferTncResponse>() {
           @Override
           public void write(JsonWriter out, OfferTncResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferTncResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OfferTncResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfferTncResponse
  * @throws IOException if the JSON string is invalid with respect to OfferTncResponse
  */
  public static OfferTncResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferTncResponse.class);
  }

 /**
  * Convert an instance of OfferTncResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

