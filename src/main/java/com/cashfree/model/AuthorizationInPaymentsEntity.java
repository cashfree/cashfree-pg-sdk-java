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
 * If preauth enabled for account you will get this body
 */
@Schema(description = "If preauth enabled for account you will get this body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T08:45:36.305155Z[Etc/UTC]")
public class AuthorizationInPaymentsEntity {
  /**
   * One of CAPTURE or VOID
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    CAPTURE("CAPTURE"),
    
    VOID("VOID"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  /**
   * One of SUCCESS or PENDING
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    
    PENDING("PENDING"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CAPTURED_AMOUNT = "captured_amount";
  @SerializedName(SERIALIZED_NAME_CAPTURED_AMOUNT)
  private BigDecimal capturedAmount;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_APPROVE_BY = "approve_by";
  @SerializedName(SERIALIZED_NAME_APPROVE_BY)
  private String approveBy;

  public static final String SERIALIZED_NAME_ACTION_REFERENCE = "action_reference";
  @SerializedName(SERIALIZED_NAME_ACTION_REFERENCE)
  private String actionReference;

  public static final String SERIALIZED_NAME_ACTION_TIME = "action_time";
  @SerializedName(SERIALIZED_NAME_ACTION_TIME)
  private String actionTime;

  public AuthorizationInPaymentsEntity() {
  }

  public AuthorizationInPaymentsEntity action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * One of CAPTURE or VOID
   * @return action
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "One of CAPTURE or VOID")
  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public AuthorizationInPaymentsEntity status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * One of SUCCESS or PENDING
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "One of SUCCESS or PENDING")
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public AuthorizationInPaymentsEntity capturedAmount(BigDecimal capturedAmount) {
    
    this.capturedAmount = capturedAmount;
    return this;
  }

   /**
   * The captured amount for this authorization request
   * @return capturedAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The captured amount for this authorization request")
  public BigDecimal getCapturedAmount() {
    return capturedAmount;
  }


  public void setCapturedAmount(BigDecimal capturedAmount) {
    this.capturedAmount = capturedAmount;
  }


  public AuthorizationInPaymentsEntity startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Start time of this authorization hold (only for UPI)
   * @return startTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Start time of this authorization hold (only for UPI)")
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AuthorizationInPaymentsEntity endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * End time of this authorization hold (only for UPI)
   * @return endTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "End time of this authorization hold (only for UPI)")
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AuthorizationInPaymentsEntity approveBy(String approveBy) {
    
    this.approveBy = approveBy;
    return this;
  }

   /**
   * Approve by time as passed in the authorization request (only for UPI)
   * @return approveBy
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Approve by time as passed in the authorization request (only for UPI)")
  public String getApproveBy() {
    return approveBy;
  }


  public void setApproveBy(String approveBy) {
    this.approveBy = approveBy;
  }


  public AuthorizationInPaymentsEntity actionReference(String actionReference) {
    
    this.actionReference = actionReference;
    return this;
  }

   /**
   * CAPTURE or VOID reference number based on action 
   * @return actionReference
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "CAPTURE or VOID reference number based on action ")
  public String getActionReference() {
    return actionReference;
  }


  public void setActionReference(String actionReference) {
    this.actionReference = actionReference;
  }


  public AuthorizationInPaymentsEntity actionTime(String actionTime) {
    
    this.actionTime = actionTime;
    return this;
  }

   /**
   * Time of action (CAPTURE or VOID)
   * @return actionTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Time of action (CAPTURE or VOID)")
  public String getActionTime() {
    return actionTime;
  }


  public void setActionTime(String actionTime) {
    this.actionTime = actionTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationInPaymentsEntity authorizationInPaymentsEntity = (AuthorizationInPaymentsEntity) o;
    return Objects.equals(this.action, authorizationInPaymentsEntity.action) &&
        Objects.equals(this.status, authorizationInPaymentsEntity.status) &&
        Objects.equals(this.capturedAmount, authorizationInPaymentsEntity.capturedAmount) &&
        Objects.equals(this.startTime, authorizationInPaymentsEntity.startTime) &&
        Objects.equals(this.endTime, authorizationInPaymentsEntity.endTime) &&
        Objects.equals(this.approveBy, authorizationInPaymentsEntity.approveBy) &&
        Objects.equals(this.actionReference, authorizationInPaymentsEntity.actionReference) &&
        Objects.equals(this.actionTime, authorizationInPaymentsEntity.actionTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, status, capturedAmount, startTime, endTime, approveBy, actionReference, actionTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationInPaymentsEntity {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    capturedAmount: ").append(toIndentedString(capturedAmount)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    approveBy: ").append(toIndentedString(approveBy)).append("\n");
    sb.append("    actionReference: ").append(toIndentedString(actionReference)).append("\n");
    sb.append("    actionTime: ").append(toIndentedString(actionTime)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("status");
    openapiFields.add("captured_amount");
    openapiFields.add("start_time");
    openapiFields.add("end_time");
    openapiFields.add("approve_by");
    openapiFields.add("action_reference");
    openapiFields.add("action_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuthorizationInPaymentsEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonNull()) && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if ((jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonNull()) && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if ((jsonObj.get("approve_by") != null && !jsonObj.get("approve_by").isJsonNull()) && !jsonObj.get("approve_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approve_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approve_by").toString()));
      }
      if ((jsonObj.get("action_reference") != null && !jsonObj.get("action_reference").isJsonNull()) && !jsonObj.get("action_reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_reference").toString()));
      }
      if ((jsonObj.get("action_time") != null && !jsonObj.get("action_time").isJsonNull()) && !jsonObj.get("action_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizationInPaymentsEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizationInPaymentsEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizationInPaymentsEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizationInPaymentsEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizationInPaymentsEntity>() {
           @Override
           public void write(JsonWriter out, AuthorizationInPaymentsEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthorizationInPaymentsEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthorizationInPaymentsEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizationInPaymentsEntity
  * @throws IOException if the JSON string is invalid with respect to AuthorizationInPaymentsEntity
  */
  public static AuthorizationInPaymentsEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizationInPaymentsEntity.class);
  }

 /**
  * Convert an instance of AuthorizationInPaymentsEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

