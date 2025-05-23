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
import com.cashfree.pg.model.CartAddress;
import com.cashfree.pg.model.CartItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
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

import com.cashfree.pg.JSON;

/**
 * The cart details that are necessary like shipping address, billing address and more.
 */
@Schema(description = "The cart details that are necessary like shipping address, billing address and more.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class CartDetails {
  public static final String SERIALIZED_NAME_CUSTOMER_NOTE = "customer_note";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NOTE)
  private String customerNote;

  public static final String SERIALIZED_NAME_SHIPPING_CHARGE = "shipping_charge";
  @SerializedName(SERIALIZED_NAME_SHIPPING_CHARGE)
  private BigDecimal shippingCharge;

  public static final String SERIALIZED_NAME_CART_NAME = "cart_name";
  @SerializedName(SERIALIZED_NAME_CART_NAME)
  private String cartName;

  public static final String SERIALIZED_NAME_CUSTOMER_SHIPPING_ADDRESS = "customer_shipping_address";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SHIPPING_ADDRESS)
  private CartAddress customerShippingAddress;

  public static final String SERIALIZED_NAME_CUSTOMER_BILLING_ADDRESS = "customer_billing_address";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BILLING_ADDRESS)
  private CartAddress customerBillingAddress;

  public static final String SERIALIZED_NAME_CART_ITEMS = "cart_items";
  @SerializedName(SERIALIZED_NAME_CART_ITEMS)
  private List<CartItem> cartItems;

  public CartDetails() {
  }

  public CartDetails customerNote(String customerNote) {
    
    this.customerNote = customerNote;
    return this;
  }

   /**
   * Get customerNote
   * @return customerNote
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCustomerNote() {
    return customerNote;
  }


  public void setCustomerNote(String customerNote) {
    this.customerNote = customerNote;
  }


  public CartDetails shippingCharge(BigDecimal shippingCharge) {
    
    this.shippingCharge = shippingCharge;
    return this;
  }

   /**
   * Get shippingCharge
   * @return shippingCharge
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getShippingCharge() {
    return shippingCharge;
  }


  public void setShippingCharge(BigDecimal shippingCharge) {
    this.shippingCharge = shippingCharge;
  }


  public CartDetails cartName(String cartName) {
    
    this.cartName = cartName;
    return this;
  }

   /**
   * Name of the cart.
   * @return cartName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Name of the cart.")
  public String getCartName() {
    return cartName;
  }


  public void setCartName(String cartName) {
    this.cartName = cartName;
  }


  public CartDetails customerShippingAddress(CartAddress customerShippingAddress) {
    
    this.customerShippingAddress = customerShippingAddress;
    return this;
  }

   /**
   * Get customerShippingAddress
   * @return customerShippingAddress
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CartAddress getCustomerShippingAddress() {
    return customerShippingAddress;
  }


  public void setCustomerShippingAddress(CartAddress customerShippingAddress) {
    this.customerShippingAddress = customerShippingAddress;
  }


  public CartDetails customerBillingAddress(CartAddress customerBillingAddress) {
    
    this.customerBillingAddress = customerBillingAddress;
    return this;
  }

   /**
   * Get customerBillingAddress
   * @return customerBillingAddress
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CartAddress getCustomerBillingAddress() {
    return customerBillingAddress;
  }


  public void setCustomerBillingAddress(CartAddress customerBillingAddress) {
    this.customerBillingAddress = customerBillingAddress;
  }


  public CartDetails cartItems(List<CartItem> cartItems) {
    
    this.cartItems = cartItems;
    return this;
  }

  public CartDetails addCartItemsItem(CartItem cartItemsItem) {
    if (this.cartItems == null) {
      this.cartItems = new ArrayList<>();
    }
    this.cartItems.add(cartItemsItem);
    return this;
  }

   /**
   * Get cartItems
   * @return cartItems
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<CartItem> getCartItems() {
    return cartItems;
  }


  public void setCartItems(List<CartItem> cartItems) {
    this.cartItems = cartItems;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartDetails cartDetails = (CartDetails) o;
    return Objects.equals(this.customerNote, cartDetails.customerNote) &&
        Objects.equals(this.shippingCharge, cartDetails.shippingCharge) &&
        Objects.equals(this.cartName, cartDetails.cartName) &&
        Objects.equals(this.customerShippingAddress, cartDetails.customerShippingAddress) &&
        Objects.equals(this.customerBillingAddress, cartDetails.customerBillingAddress) &&
        Objects.equals(this.cartItems, cartDetails.cartItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNote, shippingCharge, cartName, customerShippingAddress, customerBillingAddress, cartItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartDetails {\n");
    sb.append("    customerNote: ").append(toIndentedString(customerNote)).append("\n");
    sb.append("    shippingCharge: ").append(toIndentedString(shippingCharge)).append("\n");
    sb.append("    cartName: ").append(toIndentedString(cartName)).append("\n");
    sb.append("    customerShippingAddress: ").append(toIndentedString(customerShippingAddress)).append("\n");
    sb.append("    customerBillingAddress: ").append(toIndentedString(customerBillingAddress)).append("\n");
    sb.append("    cartItems: ").append(toIndentedString(cartItems)).append("\n");
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
    openapiFields.add("customer_note");
    openapiFields.add("shipping_charge");
    openapiFields.add("cart_name");
    openapiFields.add("customer_shipping_address");
    openapiFields.add("customer_billing_address");
    openapiFields.add("cart_items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CartDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customer_note") != null && !jsonObj.get("customer_note").isJsonNull()) && !jsonObj.get("customer_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_note").toString()));
      }
      if ((jsonObj.get("cart_name") != null && !jsonObj.get("cart_name").isJsonNull()) && !jsonObj.get("cart_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cart_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cart_name").toString()));
      }
      // validate the optional field `customer_shipping_address`
      if (jsonObj.get("customer_shipping_address") != null && !jsonObj.get("customer_shipping_address").isJsonNull()) {
        CartAddress.validateJsonElement(jsonObj.get("customer_shipping_address"));
      }
      // validate the optional field `customer_billing_address`
      if (jsonObj.get("customer_billing_address") != null && !jsonObj.get("customer_billing_address").isJsonNull()) {
        CartAddress.validateJsonElement(jsonObj.get("customer_billing_address"));
      }
      if (jsonObj.get("cart_items") != null && !jsonObj.get("cart_items").isJsonNull()) {
        JsonArray jsonArraycartItems = jsonObj.getAsJsonArray("cart_items");
        if (jsonArraycartItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cart_items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cart_items` to be an array in the JSON string but got `%s`", jsonObj.get("cart_items").toString()));
          }

          // validate the optional field `cart_items` (array)
          for (int i = 0; i < jsonArraycartItems.size(); i++) {
            CartItem.validateJsonElement(jsonArraycartItems.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CartDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customer_note") != null && !jsonObj.get("customer_note").isJsonNull()) && !jsonObj.get("customer_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_note").toString()));
      }
      if ((jsonObj.get("cart_name") != null && !jsonObj.get("cart_name").isJsonNull()) && !jsonObj.get("cart_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cart_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cart_name").toString()));
      }
      // validate the optional field `customer_shipping_address`
      if (jsonObj.get("customer_shipping_address") != null && !jsonObj.get("customer_shipping_address").isJsonNull()) {
        CartAddress.validateJsonElement(jsonObj.get("customer_shipping_address"));
        return true;
      }
      // validate the optional field `customer_billing_address`
      if (jsonObj.get("customer_billing_address") != null && !jsonObj.get("customer_billing_address").isJsonNull()) {
        CartAddress.validateJsonElement(jsonObj.get("customer_billing_address"));
        return true;
      }
      if (jsonObj.get("cart_items") != null && !jsonObj.get("cart_items").isJsonNull()) {
        JsonArray jsonArraycartItems = jsonObj.getAsJsonArray("cart_items");
        if (jsonArraycartItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cart_items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cart_items` to be an array in the JSON string but got `%s`", jsonObj.get("cart_items").toString()));
          }

          // validate the optional field `cart_items` (array)
          for (int i = 0; i < jsonArraycartItems.size(); i++) {
            CartItem.validateJsonElement(jsonArraycartItems.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CartDetails>() {
           @Override
           public void write(JsonWriter out, CartDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CartDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CartDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CartDetails
  * @throws IOException if the JSON string is invalid with respect to CartDetails
  */
  public static CartDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartDetails.class);
  }

 /**
  * Convert an instance of CartDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

