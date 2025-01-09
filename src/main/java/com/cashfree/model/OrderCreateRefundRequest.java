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
import com.cashfree.model.VendorSplit;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * create refund request object
 */
@Schema(description = "create refund request object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-09T12:52:07.742309Z[Etc/UTC]")
public class OrderCreateRefundRequest {
  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private Double refundAmount;

  public static final String SERIALIZED_NAME_REFUND_ID = "refund_id";
  @SerializedName(SERIALIZED_NAME_REFUND_ID)
  private String refundId;

  public static final String SERIALIZED_NAME_REFUND_NOTE = "refund_note";
  @SerializedName(SERIALIZED_NAME_REFUND_NOTE)
  private String refundNote;

  /**
   * Speed at which the refund is processed. It&#39;s an optional field with default being STANDARD
   */
  @JsonAdapter(RefundSpeedEnum.Adapter.class)
  public enum RefundSpeedEnum {
    STANDARD("STANDARD"),
    
    INSTANT("INSTANT"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    RefundSpeedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RefundSpeedEnum fromValue(String value) {
      for (RefundSpeedEnum b : RefundSpeedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<RefundSpeedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RefundSpeedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RefundSpeedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RefundSpeedEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REFUND_SPEED = "refund_speed";
  @SerializedName(SERIALIZED_NAME_REFUND_SPEED)
  private RefundSpeedEnum refundSpeed;

  public static final String SERIALIZED_NAME_REFUND_SPLITS = "refund_splits";
  @SerializedName(SERIALIZED_NAME_REFUND_SPLITS)
  private List<VendorSplit> refundSplits;

  public OrderCreateRefundRequest() {
  }

  public OrderCreateRefundRequest refundAmount(Double refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * Amount to be refunded. Should be lesser than or equal to the transaction amount. (Decimals allowed)
   * @return refundAmount
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Amount to be refunded. Should be lesser than or equal to the transaction amount. (Decimals allowed)")
  public Double getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(Double refundAmount) {
    this.refundAmount = refundAmount;
  }


  public OrderCreateRefundRequest refundId(String refundId) {
    
    this.refundId = refundId;
    return this;
  }

   /**
   * An unique ID to associate the refund with. Provie alphanumeric values
   * @return refundId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "An unique ID to associate the refund with. Provie alphanumeric values")
  public String getRefundId() {
    return refundId;
  }


  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }


  public OrderCreateRefundRequest refundNote(String refundNote) {
    
    this.refundNote = refundNote;
    return this;
  }

   /**
   * A refund note for your reference.
   * @return refundNote
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "A refund note for your reference.")
  public String getRefundNote() {
    return refundNote;
  }


  public void setRefundNote(String refundNote) {
    this.refundNote = refundNote;
  }


  public OrderCreateRefundRequest refundSpeed(RefundSpeedEnum refundSpeed) {
    
    this.refundSpeed = refundSpeed;
    return this;
  }

   /**
   * Speed at which the refund is processed. It&#39;s an optional field with default being STANDARD
   * @return refundSpeed
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Speed at which the refund is processed. It's an optional field with default being STANDARD")
  public RefundSpeedEnum getRefundSpeed() {
    return refundSpeed;
  }


  public void setRefundSpeed(RefundSpeedEnum refundSpeed) {
    this.refundSpeed = refundSpeed;
  }


  public OrderCreateRefundRequest refundSplits(List<VendorSplit> refundSplits) {
    
    this.refundSplits = refundSplits;
    return this;
  }

  public OrderCreateRefundRequest addRefundSplitsItem(VendorSplit refundSplitsItem) {
    if (this.refundSplits == null) {
      this.refundSplits = new ArrayList<>();
    }
    this.refundSplits.add(refundSplitsItem);
    return this;
  }

   /**
   * Get refundSplits
   * @return refundSplits
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<VendorSplit> getRefundSplits() {
    return refundSplits;
  }


  public void setRefundSplits(List<VendorSplit> refundSplits) {
    this.refundSplits = refundSplits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateRefundRequest orderCreateRefundRequest = (OrderCreateRefundRequest) o;
    return Objects.equals(this.refundAmount, orderCreateRefundRequest.refundAmount) &&
        Objects.equals(this.refundId, orderCreateRefundRequest.refundId) &&
        Objects.equals(this.refundNote, orderCreateRefundRequest.refundNote) &&
        Objects.equals(this.refundSpeed, orderCreateRefundRequest.refundSpeed) &&
        Objects.equals(this.refundSplits, orderCreateRefundRequest.refundSplits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refundAmount, refundId, refundNote, refundSpeed, refundSplits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateRefundRequest {\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    refundNote: ").append(toIndentedString(refundNote)).append("\n");
    sb.append("    refundSpeed: ").append(toIndentedString(refundSpeed)).append("\n");
    sb.append("    refundSplits: ").append(toIndentedString(refundSplits)).append("\n");
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
    openapiFields.add("refund_amount");
    openapiFields.add("refund_id");
    openapiFields.add("refund_note");
    openapiFields.add("refund_speed");
    openapiFields.add("refund_splits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("refund_amount");
    openapiRequiredFields.add("refund_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateRefundRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderCreateRefundRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("refund_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_id").toString()));
      }
      if ((jsonObj.get("refund_note") != null && !jsonObj.get("refund_note").isJsonNull()) && !jsonObj.get("refund_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_note").toString()));
      }
      if ((jsonObj.get("refund_speed") != null && !jsonObj.get("refund_speed").isJsonNull()) && !jsonObj.get("refund_speed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_speed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_speed").toString()));
      }
      if (jsonObj.get("refund_splits") != null && !jsonObj.get("refund_splits").isJsonNull()) {
        JsonArray jsonArrayrefundSplits = jsonObj.getAsJsonArray("refund_splits");
        if (jsonArrayrefundSplits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("refund_splits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `refund_splits` to be an array in the JSON string but got `%s`", jsonObj.get("refund_splits").toString()));
          }

          // validate the optional field `refund_splits` (array)
          for (int i = 0; i < jsonArrayrefundSplits.size(); i++) {
            VendorSplit.validateJsonElement(jsonArrayrefundSplits.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateRefundRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderCreateRefundRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("refund_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_id").toString()));
      }
      if ((jsonObj.get("refund_note") != null && !jsonObj.get("refund_note").isJsonNull()) && !jsonObj.get("refund_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_note").toString()));
      }
      if ((jsonObj.get("refund_speed") != null && !jsonObj.get("refund_speed").isJsonNull()) && !jsonObj.get("refund_speed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_speed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_speed").toString()));
      }
      if (jsonObj.get("refund_splits") != null && !jsonObj.get("refund_splits").isJsonNull()) {
        JsonArray jsonArrayrefundSplits = jsonObj.getAsJsonArray("refund_splits");
        if (jsonArrayrefundSplits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("refund_splits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `refund_splits` to be an array in the JSON string but got `%s`", jsonObj.get("refund_splits").toString()));
          }

          // validate the optional field `refund_splits` (array)
          for (int i = 0; i < jsonArrayrefundSplits.size(); i++) {
            VendorSplit.validateJsonElement(jsonArrayrefundSplits.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateRefundRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateRefundRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateRefundRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateRefundRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateRefundRequest>() {
           @Override
           public void write(JsonWriter out, OrderCreateRefundRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateRefundRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateRefundRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateRefundRequest
  * @throws IOException if the JSON string is invalid with respect to OrderCreateRefundRequest
  */
  public static OrderCreateRefundRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateRefundRequest.class);
  }

 /**
  * Convert an instance of OrderCreateRefundRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

