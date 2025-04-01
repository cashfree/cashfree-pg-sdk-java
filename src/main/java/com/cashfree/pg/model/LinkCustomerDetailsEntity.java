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
 * Payment link customer entity
 */
@Schema(description = "Payment link customer entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-01T11:00:02.685522Z[Etc/UTC]")
public class LinkCustomerDetailsEntity {
  public static final String SERIALIZED_NAME_CUSTOMER_PHONE = "customer_phone";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PHONE)
  private String customerPhone;

  public static final String SERIALIZED_NAME_CUSTOMER_EMAIL = "customer_email";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_EMAIL)
  private String customerEmail;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customer_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName;

  public static final String SERIALIZED_NAME_CUSTOMER_BANK_ACCOUNT_NUMBER = "customer_bank_account_number";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK_ACCOUNT_NUMBER)
  private String customerBankAccountNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_BANK_IFSC = "customer_bank_ifsc";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK_IFSC)
  private String customerBankIfsc;

  /**
   * Customer Bank Code
   */
  @JsonAdapter(CustomerBankCodeEnum.Adapter.class)
  public enum CustomerBankCodeEnum {
    NUMBER_3003(3003),
    
    NUMBER_3005(3005),
    
    NUMBER_3006(3006),
    
    NUMBER_3010(3010),
    
    NUMBER_3012(3012),
    
    NUMBER_3016(3016),
    
    NUMBER_3019(3019),
    
    NUMBER_3020(3020),
    
    NUMBER_3021(3021),
    
    NUMBER_3022(3022),
    
    NUMBER_3023(3023),
    
    NUMBER_3024(3024),
    
    NUMBER_3026(3026),
    
    NUMBER_3027(3027),
    
    NUMBER_3028(3028),
    
    NUMBER_3029(3029),
    
    NUMBER_3030(3030),
    
    NUMBER_3031(3031),
    
    NUMBER_3032(3032),
    
    NUMBER_3033(3033),
    
    NUMBER_3038(3038),
    
    NUMBER_3039(3039),
    
    NUMBER_3040(3040),
    
    NUMBER_3042(3042),
    
    NUMBER_3044(3044),
    
    NUMBER_3054(3054),
    
    NUMBER_3055(3055),
    
    NUMBER_3058(3058),
    
    NUMBER_3086(3086),
    
    NUMBER_3087(3087),
    
    NUMBER_3088(3088),
    
    NUMBER_3089(3089),
    
    NUMBER_3090(3090),
    
    NUMBER_3091(3091),
    
    NUMBER_3092(3092),
    
    NUMBER_3098(3098),
    
    NUMBER_3115(3115),
    
    NUMBER_3117(3117),
    
    NUMBER_7001(7001),
    
    NUMBER_unknown_default_open_api(11184809);

    private Integer value;

    CustomerBankCodeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CustomerBankCodeEnum fromValue(Integer value) {
      for (CustomerBankCodeEnum b : CustomerBankCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return NUMBER_unknown_default_open_api;
    }

    public static class Adapter extends TypeAdapter<CustomerBankCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CustomerBankCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CustomerBankCodeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return CustomerBankCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CUSTOMER_BANK_CODE = "customer_bank_code";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK_CODE)
  private CustomerBankCodeEnum customerBankCode;

  public LinkCustomerDetailsEntity() {
  }

  public LinkCustomerDetailsEntity customerPhone(String customerPhone) {
    
    this.customerPhone = customerPhone;
    return this;
  }

   /**
   * Customer phone number
   * @return customerPhone
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Customer phone number")
  public String getCustomerPhone() {
    return customerPhone;
  }


  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }


  public LinkCustomerDetailsEntity customerEmail(String customerEmail) {
    
    this.customerEmail = customerEmail;
    return this;
  }

   /**
   * Customer email address
   * @return customerEmail
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Customer email address")
  public String getCustomerEmail() {
    return customerEmail;
  }


  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }


  public LinkCustomerDetailsEntity customerName(String customerName) {
    
    this.customerName = customerName;
    return this;
  }

   /**
   * Customer name
   * @return customerName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Customer name")
  public String getCustomerName() {
    return customerName;
  }


  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public LinkCustomerDetailsEntity customerBankAccountNumber(String customerBankAccountNumber) {
    
    this.customerBankAccountNumber = customerBankAccountNumber;
    return this;
  }

   /**
   * Customer Bank Account Number
   * @return customerBankAccountNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Customer Bank Account Number")
  public String getCustomerBankAccountNumber() {
    return customerBankAccountNumber;
  }


  public void setCustomerBankAccountNumber(String customerBankAccountNumber) {
    this.customerBankAccountNumber = customerBankAccountNumber;
  }


  public LinkCustomerDetailsEntity customerBankIfsc(String customerBankIfsc) {
    
    this.customerBankIfsc = customerBankIfsc;
    return this;
  }

   /**
   * Customer Bank Ifsc
   * @return customerBankIfsc
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Customer Bank Ifsc")
  public String getCustomerBankIfsc() {
    return customerBankIfsc;
  }


  public void setCustomerBankIfsc(String customerBankIfsc) {
    this.customerBankIfsc = customerBankIfsc;
  }


  public LinkCustomerDetailsEntity customerBankCode(CustomerBankCodeEnum customerBankCode) {
    
    this.customerBankCode = customerBankCode;
    return this;
  }

   /**
   * Customer Bank Code
   * @return customerBankCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Customer Bank Code")
  public CustomerBankCodeEnum getCustomerBankCode() {
    return customerBankCode;
  }


  public void setCustomerBankCode(CustomerBankCodeEnum customerBankCode) {
    this.customerBankCode = customerBankCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkCustomerDetailsEntity linkCustomerDetailsEntity = (LinkCustomerDetailsEntity) o;
    return Objects.equals(this.customerPhone, linkCustomerDetailsEntity.customerPhone) &&
        Objects.equals(this.customerEmail, linkCustomerDetailsEntity.customerEmail) &&
        Objects.equals(this.customerName, linkCustomerDetailsEntity.customerName) &&
        Objects.equals(this.customerBankAccountNumber, linkCustomerDetailsEntity.customerBankAccountNumber) &&
        Objects.equals(this.customerBankIfsc, linkCustomerDetailsEntity.customerBankIfsc) &&
        Objects.equals(this.customerBankCode, linkCustomerDetailsEntity.customerBankCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerPhone, customerEmail, customerName, customerBankAccountNumber, customerBankIfsc, customerBankCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkCustomerDetailsEntity {\n");
    sb.append("    customerPhone: ").append(toIndentedString(customerPhone)).append("\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerBankAccountNumber: ").append(toIndentedString(customerBankAccountNumber)).append("\n");
    sb.append("    customerBankIfsc: ").append(toIndentedString(customerBankIfsc)).append("\n");
    sb.append("    customerBankCode: ").append(toIndentedString(customerBankCode)).append("\n");
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
    openapiFields.add("customer_phone");
    openapiFields.add("customer_email");
    openapiFields.add("customer_name");
    openapiFields.add("customer_bank_account_number");
    openapiFields.add("customer_bank_ifsc");
    openapiFields.add("customer_bank_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("customer_phone");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LinkCustomerDetailsEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LinkCustomerDetailsEntity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("customer_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_phone").toString()));
      }
      if ((jsonObj.get("customer_email") != null && !jsonObj.get("customer_email").isJsonNull()) && !jsonObj.get("customer_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_email").toString()));
      }
      if ((jsonObj.get("customer_name") != null && !jsonObj.get("customer_name").isJsonNull()) && !jsonObj.get("customer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_name").toString()));
      }
      if ((jsonObj.get("customer_bank_account_number") != null && !jsonObj.get("customer_bank_account_number").isJsonNull()) && !jsonObj.get("customer_bank_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_account_number").toString()));
      }
      if ((jsonObj.get("customer_bank_ifsc") != null && !jsonObj.get("customer_bank_ifsc").isJsonNull()) && !jsonObj.get("customer_bank_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_ifsc").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LinkCustomerDetailsEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LinkCustomerDetailsEntity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("customer_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_phone").toString()));
      }
      if ((jsonObj.get("customer_email") != null && !jsonObj.get("customer_email").isJsonNull()) && !jsonObj.get("customer_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_email").toString()));
      }
      if ((jsonObj.get("customer_name") != null && !jsonObj.get("customer_name").isJsonNull()) && !jsonObj.get("customer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_name").toString()));
      }
      if ((jsonObj.get("customer_bank_account_number") != null && !jsonObj.get("customer_bank_account_number").isJsonNull()) && !jsonObj.get("customer_bank_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_account_number").toString()));
      }
      if ((jsonObj.get("customer_bank_ifsc") != null && !jsonObj.get("customer_bank_ifsc").isJsonNull()) && !jsonObj.get("customer_bank_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_bank_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_bank_ifsc").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkCustomerDetailsEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkCustomerDetailsEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkCustomerDetailsEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkCustomerDetailsEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkCustomerDetailsEntity>() {
           @Override
           public void write(JsonWriter out, LinkCustomerDetailsEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkCustomerDetailsEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LinkCustomerDetailsEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkCustomerDetailsEntity
  * @throws IOException if the JSON string is invalid with respect to LinkCustomerDetailsEntity
  */
  public static LinkCustomerDetailsEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkCustomerDetailsEntity.class);
  }

 /**
  * Convert an instance of LinkCustomerDetailsEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

