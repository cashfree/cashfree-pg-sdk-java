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
 * Address associated with the customer.
 */
@Schema(description = "Address associated with the customer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-09T12:02:51.543385Z[Etc/UTC]")
public class AddressDetails {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS_LINE_ONE = "address_line_one";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE_ONE)
  private String addressLineOne;

  public static final String SERIALIZED_NAME_ADDRESS_LINE_TWO = "address_line_two";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE_TWO)
  private String addressLineTwo;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_STATE_CODE = "state_code";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_PIN_CODE = "pin_code";
  @SerializedName(SERIALIZED_NAME_PIN_CODE)
  private String pinCode;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public AddressDetails() {
  }

  public AddressDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Full Name of the customer associated with the address.
   * @return name
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Full Name of the customer associated with the address.")
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AddressDetails addressLineOne(String addressLineOne) {
    
    this.addressLineOne = addressLineOne;
    return this;
  }

   /**
   * First line of the address.
   * @return addressLineOne
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "First line of the address.")
  public String getAddressLineOne() {
    return addressLineOne;
  }


  public void setAddressLineOne(String addressLineOne) {
    this.addressLineOne = addressLineOne;
  }


  public AddressDetails addressLineTwo(String addressLineTwo) {
    
    this.addressLineTwo = addressLineTwo;
    return this;
  }

   /**
   * Second line of the address.
   * @return addressLineTwo
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Second line of the address.")
  public String getAddressLineTwo() {
    return addressLineTwo;
  }


  public void setAddressLineTwo(String addressLineTwo) {
    this.addressLineTwo = addressLineTwo;
  }


  public AddressDetails country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country Name.
   * @return country
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Country Name.")
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public AddressDetails countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country Code.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Country Code.")
  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public AddressDetails state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * State Name.
   * @return state
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "State Name.")
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public AddressDetails stateCode(String stateCode) {
    
    this.stateCode = stateCode;
    return this;
  }

   /**
   * State Code.
   * @return stateCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "State Code.")
  public String getStateCode() {
    return stateCode;
  }


  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  public AddressDetails city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City Name.
   * @return city
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "City Name.")
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public AddressDetails pinCode(String pinCode) {
    
    this.pinCode = pinCode;
    return this;
  }

   /**
   * Pin Code/Zip Code.
   * @return pinCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Pin Code/Zip Code.")
  public String getPinCode() {
    return pinCode;
  }


  public void setPinCode(String pinCode) {
    this.pinCode = pinCode;
  }


  public AddressDetails phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Customer Phone Number.
   * @return phone
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Customer Phone Number.")
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public AddressDetails email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Cutomer Email Address.
   * @return email
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Cutomer Email Address.")
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDetails addressDetails = (AddressDetails) o;
    return Objects.equals(this.name, addressDetails.name) &&
        Objects.equals(this.addressLineOne, addressDetails.addressLineOne) &&
        Objects.equals(this.addressLineTwo, addressDetails.addressLineTwo) &&
        Objects.equals(this.country, addressDetails.country) &&
        Objects.equals(this.countryCode, addressDetails.countryCode) &&
        Objects.equals(this.state, addressDetails.state) &&
        Objects.equals(this.stateCode, addressDetails.stateCode) &&
        Objects.equals(this.city, addressDetails.city) &&
        Objects.equals(this.pinCode, addressDetails.pinCode) &&
        Objects.equals(this.phone, addressDetails.phone) &&
        Objects.equals(this.email, addressDetails.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, addressLineOne, addressLineTwo, country, countryCode, state, stateCode, city, pinCode, phone, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addressLineOne: ").append(toIndentedString(addressLineOne)).append("\n");
    sb.append("    addressLineTwo: ").append(toIndentedString(addressLineTwo)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    pinCode: ").append(toIndentedString(pinCode)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("address_line_one");
    openapiFields.add("address_line_two");
    openapiFields.add("country");
    openapiFields.add("country_code");
    openapiFields.add("state");
    openapiFields.add("state_code");
    openapiFields.add("city");
    openapiFields.add("pin_code");
    openapiFields.add("phone");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddressDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("address_line_one") != null && !jsonObj.get("address_line_one").isJsonNull()) && !jsonObj.get("address_line_one").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line_one` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line_one").toString()));
      }
      if ((jsonObj.get("address_line_two") != null && !jsonObj.get("address_line_two").isJsonNull()) && !jsonObj.get("address_line_two").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line_two` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line_two").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("state_code") != null && !jsonObj.get("state_code").isJsonNull()) && !jsonObj.get("state_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_code").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("pin_code") != null && !jsonObj.get("pin_code").isJsonNull()) && !jsonObj.get("pin_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pin_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pin_code").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddressDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("address_line_one") != null && !jsonObj.get("address_line_one").isJsonNull()) && !jsonObj.get("address_line_one").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line_one` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line_one").toString()));
      }
      if ((jsonObj.get("address_line_two") != null && !jsonObj.get("address_line_two").isJsonNull()) && !jsonObj.get("address_line_two").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line_two` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line_two").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("state_code") != null && !jsonObj.get("state_code").isJsonNull()) && !jsonObj.get("state_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_code").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("pin_code") != null && !jsonObj.get("pin_code").isJsonNull()) && !jsonObj.get("pin_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pin_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pin_code").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressDetails>() {
           @Override
           public void write(JsonWriter out, AddressDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressDetails
  * @throws IOException if the JSON string is invalid with respect to AddressDetails
  */
  public static AddressDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressDetails.class);
  }

 /**
  * Convert an instance of AddressDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

