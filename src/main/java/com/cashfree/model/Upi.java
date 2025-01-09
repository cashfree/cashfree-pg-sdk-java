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
import com.cashfree.model.UPIAuthorizeDetails;
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
 * UPI collect payment method object
 */
@Schema(description = "UPI collect payment method object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-09T12:52:07.742309Z[Etc/UTC]")
public class Upi {
  /**
   * Specify the channel through which the payment must be processed. Can be one of [\&quot;link\&quot;, \&quot;collect\&quot;, \&quot;qrcode\&quot;]
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    LINK("link"),
    
    COLLECT("collect"),
    
    QRCODE("qrcode"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelEnum fromValue(String value) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private ChannelEnum channel;

  public static final String SERIALIZED_NAME_UPI_ID = "upi_id";
  @SerializedName(SERIALIZED_NAME_UPI_ID)
  private String upiId;

  public static final String SERIALIZED_NAME_UPI_REDIRECT_URL = "upi_redirect_url";
  @SerializedName(SERIALIZED_NAME_UPI_REDIRECT_URL)
  private Boolean upiRedirectUrl;

  public static final String SERIALIZED_NAME_UPI_EXPIRY_MINUTES = "upi_expiry_minutes";
  @SerializedName(SERIALIZED_NAME_UPI_EXPIRY_MINUTES)
  private BigDecimal upiExpiryMinutes;

  public static final String SERIALIZED_NAME_AUTHORIZE_ONLY = "authorize_only";
  @SerializedName(SERIALIZED_NAME_AUTHORIZE_ONLY)
  private Boolean authorizeOnly;

  public static final String SERIALIZED_NAME_AUTHORIZATION = "authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private UPIAuthorizeDetails authorization;

  public Upi() {
  }

  public Upi channel(ChannelEnum channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Specify the channel through which the payment must be processed. Can be one of [\&quot;link\&quot;, \&quot;collect\&quot;, \&quot;qrcode\&quot;]
   * @return channel
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Specify the channel through which the payment must be processed. Can be one of [\"link\", \"collect\", \"qrcode\"]")
  public ChannelEnum getChannel() {
    return channel;
  }


  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }


  public Upi upiId(String upiId) {
    
    this.upiId = upiId;
    return this;
  }

   /**
   * Customer UPI VPA to process payment.  ### Important This is a required parameter for channel &#x3D; &#x60;collect&#x60; 
   * @return upiId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Customer UPI VPA to process payment.  ### Important This is a required parameter for channel = `collect` ")
  public String getUpiId() {
    return upiId;
  }


  public void setUpiId(String upiId) {
    this.upiId = upiId;
  }


  public Upi upiRedirectUrl(Boolean upiRedirectUrl) {
    
    this.upiRedirectUrl = upiRedirectUrl;
    return this;
  }

   /**
   * use this if you want cashfree to show a loader. Sample response below. It is only supported for collect &#x60;action:collect&#x60; will be returned with &#x60;data.url&#x60; having the link for redirection 
   * @return upiRedirectUrl
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "use this if you want cashfree to show a loader. Sample response below. It is only supported for collect `action:collect` will be returned with `data.url` having the link for redirection ")
  public Boolean getUpiRedirectUrl() {
    return upiRedirectUrl;
  }


  public void setUpiRedirectUrl(Boolean upiRedirectUrl) {
    this.upiRedirectUrl = upiRedirectUrl;
  }


  public Upi upiExpiryMinutes(BigDecimal upiExpiryMinutes) {
    
    this.upiExpiryMinutes = upiExpiryMinutes;
    return this;
  }

   /**
   * The UPI request will be valid for this expiry minutes. This parameter is only applicable for a UPI collect payment. The default value is 5 minutes. You should keep the minimum as 5 minutes, and maximum as 15 minutes
   * @return upiExpiryMinutes
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The UPI request will be valid for this expiry minutes. This parameter is only applicable for a UPI collect payment. The default value is 5 minutes. You should keep the minimum as 5 minutes, and maximum as 15 minutes")
  public BigDecimal getUpiExpiryMinutes() {
    return upiExpiryMinutes;
  }


  public void setUpiExpiryMinutes(BigDecimal upiExpiryMinutes) {
    this.upiExpiryMinutes = upiExpiryMinutes;
  }


  public Upi authorizeOnly(Boolean authorizeOnly) {
    
    this.authorizeOnly = authorizeOnly;
    return this;
  }

   /**
   * For one time mandate on UPI. Set this as authorize_only &#x3D; true. Please note that you can only use the \&quot;collect\&quot; channel if you are sending a one time mandate request
   * @return authorizeOnly
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "For one time mandate on UPI. Set this as authorize_only = true. Please note that you can only use the \"collect\" channel if you are sending a one time mandate request")
  public Boolean getAuthorizeOnly() {
    return authorizeOnly;
  }


  public void setAuthorizeOnly(Boolean authorizeOnly) {
    this.authorizeOnly = authorizeOnly;
  }


  public Upi authorization(UPIAuthorizeDetails authorization) {
    
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public UPIAuthorizeDetails getAuthorization() {
    return authorization;
  }


  public void setAuthorization(UPIAuthorizeDetails authorization) {
    this.authorization = authorization;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Upi upi = (Upi) o;
    return Objects.equals(this.channel, upi.channel) &&
        Objects.equals(this.upiId, upi.upiId) &&
        Objects.equals(this.upiRedirectUrl, upi.upiRedirectUrl) &&
        Objects.equals(this.upiExpiryMinutes, upi.upiExpiryMinutes) &&
        Objects.equals(this.authorizeOnly, upi.authorizeOnly) &&
        Objects.equals(this.authorization, upi.authorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, upiId, upiRedirectUrl, upiExpiryMinutes, authorizeOnly, authorization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Upi {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    upiId: ").append(toIndentedString(upiId)).append("\n");
    sb.append("    upiRedirectUrl: ").append(toIndentedString(upiRedirectUrl)).append("\n");
    sb.append("    upiExpiryMinutes: ").append(toIndentedString(upiExpiryMinutes)).append("\n");
    sb.append("    authorizeOnly: ").append(toIndentedString(authorizeOnly)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
    openapiFields.add("channel");
    openapiFields.add("upi_id");
    openapiFields.add("upi_redirect_url");
    openapiFields.add("upi_expiry_minutes");
    openapiFields.add("authorize_only");
    openapiFields.add("authorization");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Upi
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Upi.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("upi_id") != null && !jsonObj.get("upi_id").isJsonNull()) && !jsonObj.get("upi_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi_id").toString()));
      }
      // validate the optional field `authorization`
      if (jsonObj.get("authorization") != null && !jsonObj.get("authorization").isJsonNull()) {
        UPIAuthorizeDetails.validateJsonElement(jsonObj.get("authorization"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Upi
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Upi.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("upi_id") != null && !jsonObj.get("upi_id").isJsonNull()) && !jsonObj.get("upi_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi_id").toString()));
      }
      // validate the optional field `authorization`
      if (jsonObj.get("authorization") != null && !jsonObj.get("authorization").isJsonNull()) {
        UPIAuthorizeDetails.validateJsonElement(jsonObj.get("authorization"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Upi.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Upi' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Upi> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Upi.class));

       return (TypeAdapter<T>) new TypeAdapter<Upi>() {
           @Override
           public void write(JsonWriter out, Upi value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Upi read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Upi given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Upi
  * @throws IOException if the JSON string is invalid with respect to Upi
  */
  public static Upi fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Upi.class);
  }

 /**
  * Convert an instance of Upi to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

