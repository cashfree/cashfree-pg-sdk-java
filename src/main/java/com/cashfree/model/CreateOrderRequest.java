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
import com.cashfree.model.CreateOrderRequestOrderMeta;
import com.cashfree.model.CreateOrderRequestTerminal;
import com.cashfree.model.CustomerDetails;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Request body to create an order at cashfree
 */
@Schema(description = "Request body to create an order at cashfree")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T08:16:03.269971Z[Etc/UTC]")
public class CreateOrderRequest {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ORDER_AMOUNT = "order_amount";
  @SerializedName(SERIALIZED_NAME_ORDER_AMOUNT)
  private Double orderAmount;

  public static final String SERIALIZED_NAME_ORDER_CURRENCY = "order_currency";
  @SerializedName(SERIALIZED_NAME_ORDER_CURRENCY)
  private String orderCurrency;

  public static final String SERIALIZED_NAME_CUSTOMER_DETAILS = "customer_details";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DETAILS)
  private CustomerDetails customerDetails;

  public static final String SERIALIZED_NAME_TERMINAL = "terminal";
  @SerializedName(SERIALIZED_NAME_TERMINAL)
  private CreateOrderRequestTerminal terminal;

  public static final String SERIALIZED_NAME_ORDER_META = "order_meta";
  @SerializedName(SERIALIZED_NAME_ORDER_META)
  private CreateOrderRequestOrderMeta orderMeta;

  public static final String SERIALIZED_NAME_ORDER_EXPIRY_TIME = "order_expiry_time";
  @SerializedName(SERIALIZED_NAME_ORDER_EXPIRY_TIME)
  private String orderExpiryTime;

  public static final String SERIALIZED_NAME_ORDER_NOTE = "order_note";
  @SerializedName(SERIALIZED_NAME_ORDER_NOTE)
  private String orderNote;

  public static final String SERIALIZED_NAME_ORDER_TAGS = "order_tags";
  @SerializedName(SERIALIZED_NAME_ORDER_TAGS)
  private Map<String, String> orderTags;

  public static final String SERIALIZED_NAME_ORDER_SPLITS = "order_splits";
  @SerializedName(SERIALIZED_NAME_ORDER_SPLITS)
  private List<VendorSplit> orderSplits;

  public CreateOrderRequest() {
  }

  public CreateOrderRequest orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Order identifier present in your system. Alphanumeric, &#39;_&#39; and &#39;-&#39; only
   * @return orderId
  **/
  @javax.annotation.Nullable
  @Schema(example = "your-order-id", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Order identifier present in your system. Alphanumeric, '_' and '-' only")
  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public CreateOrderRequest orderAmount(Double orderAmount) {
    
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * Bill amount for the order. Provide upto two decimals. 10.15 means Rs 10 and 15 paisa
   * minimum: 1
   * @return orderAmount
  **/
  @javax.annotation.Nonnull
  @Schema(example = "10.15", requiredMode = Schema.RequiredMode.REQUIRED, description = "Bill amount for the order. Provide upto two decimals. 10.15 means Rs 10 and 15 paisa")
  public Double getOrderAmount() {
    return orderAmount;
  }


  public void setOrderAmount(Double orderAmount) {
    this.orderAmount = orderAmount;
  }


  public CreateOrderRequest orderCurrency(String orderCurrency) {
    
    this.orderCurrency = orderCurrency;
    return this;
  }

   /**
   * Currency for the order. INR if left empty. Contact care@cashfree.com to enable new currencies.
   * @return orderCurrency
  **/
  @javax.annotation.Nonnull
  @Schema(example = "INR", requiredMode = Schema.RequiredMode.REQUIRED, description = "Currency for the order. INR if left empty. Contact care@cashfree.com to enable new currencies.")
  public String getOrderCurrency() {
    return orderCurrency;
  }


  public void setOrderCurrency(String orderCurrency) {
    this.orderCurrency = orderCurrency;
  }


  public CreateOrderRequest customerDetails(CustomerDetails customerDetails) {
    
    this.customerDetails = customerDetails;
    return this;
  }

   /**
   * Get customerDetails
   * @return customerDetails
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public CustomerDetails getCustomerDetails() {
    return customerDetails;
  }


  public void setCustomerDetails(CustomerDetails customerDetails) {
    this.customerDetails = customerDetails;
  }


  public CreateOrderRequest terminal(CreateOrderRequestTerminal terminal) {
    
    this.terminal = terminal;
    return this;
  }

   /**
   * Get terminal
   * @return terminal
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CreateOrderRequestTerminal getTerminal() {
    return terminal;
  }


  public void setTerminal(CreateOrderRequestTerminal terminal) {
    this.terminal = terminal;
  }


  public CreateOrderRequest orderMeta(CreateOrderRequestOrderMeta orderMeta) {
    
    this.orderMeta = orderMeta;
    return this;
  }

   /**
   * Get orderMeta
   * @return orderMeta
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CreateOrderRequestOrderMeta getOrderMeta() {
    return orderMeta;
  }


  public void setOrderMeta(CreateOrderRequestOrderMeta orderMeta) {
    this.orderMeta = orderMeta;
  }


  public CreateOrderRequest orderExpiryTime(String orderExpiryTime) {
    
    this.orderExpiryTime = orderExpiryTime;
    return this;
  }

   /**
   * Time after which the order expires. Customers will not be able to make the payment beyond the time specified here. We store timestamps in IST, but you can provide them in a valid ISO 8601 time format. Example 2021-07-02T10:20:12+05:30 for IST, 2021-07-02T10:20:12Z for UTC
   * @return orderExpiryTime
  **/
  @javax.annotation.Nullable
  @Schema(example = "2021-07-02T10:20:12+05:30", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Time after which the order expires. Customers will not be able to make the payment beyond the time specified here. We store timestamps in IST, but you can provide them in a valid ISO 8601 time format. Example 2021-07-02T10:20:12+05:30 for IST, 2021-07-02T10:20:12Z for UTC")
  public String getOrderExpiryTime() {
    return orderExpiryTime;
  }


  public void setOrderExpiryTime(String orderExpiryTime) {
    this.orderExpiryTime = orderExpiryTime;
  }


  public CreateOrderRequest orderNote(String orderNote) {
    
    this.orderNote = orderNote;
    return this;
  }

   /**
   * Order note for reference.
   * @return orderNote
  **/
  @javax.annotation.Nullable
  @Schema(example = "Test order", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Order note for reference.")
  public String getOrderNote() {
    return orderNote;
  }


  public void setOrderNote(String orderNote) {
    this.orderNote = orderNote;
  }


  public CreateOrderRequest orderTags(Map<String, String> orderTags) {
    
    this.orderTags = orderTags;
    return this;
  }

  public CreateOrderRequest putOrderTagsItem(String key, String orderTagsItem) {
    if (this.orderTags == null) {
      this.orderTags = new HashMap<>();
    }
    this.orderTags.put(key, orderTagsItem);
    return this;
  }

   /**
   * Custom Tags in thr form of {\&quot;key\&quot;:\&quot;value\&quot;} which can be passed for an order. A maximum of 10 tags can be added
   * @return orderTags
  **/
  @javax.annotation.Nullable
  @Schema(example = "{\"product\":\"Laptop\",\"shipping_address\":\"123 Main St\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Custom Tags in thr form of {\"key\":\"value\"} which can be passed for an order. A maximum of 10 tags can be added")
  public Map<String, String> getOrderTags() {
    return orderTags;
  }


  public void setOrderTags(Map<String, String> orderTags) {
    this.orderTags = orderTags;
  }


  public CreateOrderRequest orderSplits(List<VendorSplit> orderSplits) {
    
    this.orderSplits = orderSplits;
    return this;
  }

  public CreateOrderRequest addOrderSplitsItem(VendorSplit orderSplitsItem) {
    if (this.orderSplits == null) {
      this.orderSplits = new ArrayList<>();
    }
    this.orderSplits.add(orderSplitsItem);
    return this;
  }

   /**
   * If you have Easy split enabled in your Cashfree account then you can use this option to split the order amount.
   * @return orderSplits
  **/
  @javax.annotation.Nullable
  @Schema(example = "[{\"amount\":10,\"vendor\":\"john\"}]", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "If you have Easy split enabled in your Cashfree account then you can use this option to split the order amount.")
  public List<VendorSplit> getOrderSplits() {
    return orderSplits;
  }


  public void setOrderSplits(List<VendorSplit> orderSplits) {
    this.orderSplits = orderSplits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderRequest createOrderRequest = (CreateOrderRequest) o;
    return Objects.equals(this.orderId, createOrderRequest.orderId) &&
        Objects.equals(this.orderAmount, createOrderRequest.orderAmount) &&
        Objects.equals(this.orderCurrency, createOrderRequest.orderCurrency) &&
        Objects.equals(this.customerDetails, createOrderRequest.customerDetails) &&
        Objects.equals(this.terminal, createOrderRequest.terminal) &&
        Objects.equals(this.orderMeta, createOrderRequest.orderMeta) &&
        Objects.equals(this.orderExpiryTime, createOrderRequest.orderExpiryTime) &&
        Objects.equals(this.orderNote, createOrderRequest.orderNote) &&
        Objects.equals(this.orderTags, createOrderRequest.orderTags) &&
        Objects.equals(this.orderSplits, createOrderRequest.orderSplits);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, orderAmount, orderCurrency, customerDetails, terminal, orderMeta, orderExpiryTime, orderNote, orderTags, orderSplits);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequest {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    orderCurrency: ").append(toIndentedString(orderCurrency)).append("\n");
    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    orderMeta: ").append(toIndentedString(orderMeta)).append("\n");
    sb.append("    orderExpiryTime: ").append(toIndentedString(orderExpiryTime)).append("\n");
    sb.append("    orderNote: ").append(toIndentedString(orderNote)).append("\n");
    sb.append("    orderTags: ").append(toIndentedString(orderTags)).append("\n");
    sb.append("    orderSplits: ").append(toIndentedString(orderSplits)).append("\n");
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
    openapiFields.add("order_id");
    openapiFields.add("order_amount");
    openapiFields.add("order_currency");
    openapiFields.add("customer_details");
    openapiFields.add("terminal");
    openapiFields.add("order_meta");
    openapiFields.add("order_expiry_time");
    openapiFields.add("order_note");
    openapiFields.add("order_tags");
    openapiFields.add("order_splits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("order_amount");
    openapiRequiredFields.add("order_currency");
    openapiRequiredFields.add("customer_details");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateOrderRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateOrderRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if (!jsonObj.get("order_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_currency").toString()));
      }
      // validate the required field `customer_details`
      CustomerDetails.validateJsonElement(jsonObj.get("customer_details"));
      // validate the optional field `terminal`
      if (jsonObj.get("terminal") != null && !jsonObj.get("terminal").isJsonNull()) {
        CreateOrderRequestTerminal.validateJsonElement(jsonObj.get("terminal"));
      }
      // validate the optional field `order_meta`
      if (jsonObj.get("order_meta") != null && !jsonObj.get("order_meta").isJsonNull()) {
        CreateOrderRequestOrderMeta.validateJsonElement(jsonObj.get("order_meta"));
      }
      if ((jsonObj.get("order_expiry_time") != null && !jsonObj.get("order_expiry_time").isJsonNull()) && !jsonObj.get("order_expiry_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_expiry_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_expiry_time").toString()));
      }
      if ((jsonObj.get("order_note") != null && !jsonObj.get("order_note").isJsonNull()) && !jsonObj.get("order_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_note").toString()));
      }
      if (jsonObj.get("order_splits") != null && !jsonObj.get("order_splits").isJsonNull()) {
        JsonArray jsonArrayorderSplits = jsonObj.getAsJsonArray("order_splits");
        if (jsonArrayorderSplits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("order_splits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `order_splits` to be an array in the JSON string but got `%s`", jsonObj.get("order_splits").toString()));
          }

          // validate the optional field `order_splits` (array)
          for (int i = 0; i < jsonArrayorderSplits.size(); i++) {
            VendorSplit.validateJsonElement(jsonArrayorderSplits.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOrderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOrderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOrderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOrderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOrderRequest>() {
           @Override
           public void write(JsonWriter out, CreateOrderRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOrderRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateOrderRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateOrderRequest
  * @throws IOException if the JSON string is invalid with respect to CreateOrderRequest
  */
  public static CreateOrderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOrderRequest.class);
  }

 /**
  * Convert an instance of CreateOrderRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

