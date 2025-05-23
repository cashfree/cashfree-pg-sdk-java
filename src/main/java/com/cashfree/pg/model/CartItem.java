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
 * Each item in the cart.
 */
@Schema(description = "Each item in the cart.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class CartItem {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item_name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  private String itemName;

  public static final String SERIALIZED_NAME_ITEM_DESCRIPTION = "item_description";
  @SerializedName(SERIALIZED_NAME_ITEM_DESCRIPTION)
  private String itemDescription;

  public static final String SERIALIZED_NAME_ITEM_TAGS = "item_tags";
  @SerializedName(SERIALIZED_NAME_ITEM_TAGS)
  private List<String> itemTags;

  public static final String SERIALIZED_NAME_ITEM_DETAILS_URL = "item_details_url";
  @SerializedName(SERIALIZED_NAME_ITEM_DETAILS_URL)
  private String itemDetailsUrl;

  public static final String SERIALIZED_NAME_ITEM_IMAGE_URL = "item_image_url";
  @SerializedName(SERIALIZED_NAME_ITEM_IMAGE_URL)
  private String itemImageUrl;

  public static final String SERIALIZED_NAME_ITEM_ORIGINAL_UNIT_PRICE = "item_original_unit_price";
  @SerializedName(SERIALIZED_NAME_ITEM_ORIGINAL_UNIT_PRICE)
  private BigDecimal itemOriginalUnitPrice;

  public static final String SERIALIZED_NAME_ITEM_DISCOUNTED_UNIT_PRICE = "item_discounted_unit_price";
  @SerializedName(SERIALIZED_NAME_ITEM_DISCOUNTED_UNIT_PRICE)
  private BigDecimal itemDiscountedUnitPrice;

  public static final String SERIALIZED_NAME_ITEM_CURRENCY = "item_currency";
  @SerializedName(SERIALIZED_NAME_ITEM_CURRENCY)
  private String itemCurrency;

  public static final String SERIALIZED_NAME_ITEM_QUANTITY = "item_quantity";
  @SerializedName(SERIALIZED_NAME_ITEM_QUANTITY)
  private BigDecimal itemQuantity;

  public CartItem() {
  }

  public CartItem itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Unique identifier of the item
   * @return itemId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Unique identifier of the item")
  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public CartItem itemName(String itemName) {
    
    this.itemName = itemName;
    return this;
  }

   /**
   * Name of the item
   * @return itemName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Name of the item")
  public String getItemName() {
    return itemName;
  }


  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  public CartItem itemDescription(String itemDescription) {
    
    this.itemDescription = itemDescription;
    return this;
  }

   /**
   * Description of the item
   * @return itemDescription
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Description of the item")
  public String getItemDescription() {
    return itemDescription;
  }


  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }


  public CartItem itemTags(List<String> itemTags) {
    
    this.itemTags = itemTags;
    return this;
  }

  public CartItem addItemTagsItem(String itemTagsItem) {
    if (this.itemTags == null) {
      this.itemTags = new ArrayList<>();
    }
    this.itemTags.add(itemTagsItem);
    return this;
  }

   /**
   * Tags attached to that item
   * @return itemTags
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Tags attached to that item")
  public List<String> getItemTags() {
    return itemTags;
  }


  public void setItemTags(List<String> itemTags) {
    this.itemTags = itemTags;
  }


  public CartItem itemDetailsUrl(String itemDetailsUrl) {
    
    this.itemDetailsUrl = itemDetailsUrl;
    return this;
  }

   /**
   * Item details url
   * @return itemDetailsUrl
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Item details url")
  public String getItemDetailsUrl() {
    return itemDetailsUrl;
  }


  public void setItemDetailsUrl(String itemDetailsUrl) {
    this.itemDetailsUrl = itemDetailsUrl;
  }


  public CartItem itemImageUrl(String itemImageUrl) {
    
    this.itemImageUrl = itemImageUrl;
    return this;
  }

   /**
   * Item image url
   * @return itemImageUrl
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Item image url")
  public String getItemImageUrl() {
    return itemImageUrl;
  }


  public void setItemImageUrl(String itemImageUrl) {
    this.itemImageUrl = itemImageUrl;
  }


  public CartItem itemOriginalUnitPrice(BigDecimal itemOriginalUnitPrice) {
    
    this.itemOriginalUnitPrice = itemOriginalUnitPrice;
    return this;
  }

   /**
   * Original price
   * @return itemOriginalUnitPrice
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Original price")
  public BigDecimal getItemOriginalUnitPrice() {
    return itemOriginalUnitPrice;
  }


  public void setItemOriginalUnitPrice(BigDecimal itemOriginalUnitPrice) {
    this.itemOriginalUnitPrice = itemOriginalUnitPrice;
  }


  public CartItem itemDiscountedUnitPrice(BigDecimal itemDiscountedUnitPrice) {
    
    this.itemDiscountedUnitPrice = itemDiscountedUnitPrice;
    return this;
  }

   /**
   * Discounted Price
   * @return itemDiscountedUnitPrice
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Discounted Price")
  public BigDecimal getItemDiscountedUnitPrice() {
    return itemDiscountedUnitPrice;
  }


  public void setItemDiscountedUnitPrice(BigDecimal itemDiscountedUnitPrice) {
    this.itemDiscountedUnitPrice = itemDiscountedUnitPrice;
  }


  public CartItem itemCurrency(String itemCurrency) {
    
    this.itemCurrency = itemCurrency;
    return this;
  }

   /**
   * Currency of the item.
   * @return itemCurrency
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Currency of the item.")
  public String getItemCurrency() {
    return itemCurrency;
  }


  public void setItemCurrency(String itemCurrency) {
    this.itemCurrency = itemCurrency;
  }


  public CartItem itemQuantity(BigDecimal itemQuantity) {
    
    this.itemQuantity = itemQuantity;
    return this;
  }

   /**
   * Quantity if that item
   * @return itemQuantity
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Quantity if that item")
  public BigDecimal getItemQuantity() {
    return itemQuantity;
  }


  public void setItemQuantity(BigDecimal itemQuantity) {
    this.itemQuantity = itemQuantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItem cartItem = (CartItem) o;
    return Objects.equals(this.itemId, cartItem.itemId) &&
        Objects.equals(this.itemName, cartItem.itemName) &&
        Objects.equals(this.itemDescription, cartItem.itemDescription) &&
        Objects.equals(this.itemTags, cartItem.itemTags) &&
        Objects.equals(this.itemDetailsUrl, cartItem.itemDetailsUrl) &&
        Objects.equals(this.itemImageUrl, cartItem.itemImageUrl) &&
        Objects.equals(this.itemOriginalUnitPrice, cartItem.itemOriginalUnitPrice) &&
        Objects.equals(this.itemDiscountedUnitPrice, cartItem.itemDiscountedUnitPrice) &&
        Objects.equals(this.itemCurrency, cartItem.itemCurrency) &&
        Objects.equals(this.itemQuantity, cartItem.itemQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, itemName, itemDescription, itemTags, itemDetailsUrl, itemImageUrl, itemOriginalUnitPrice, itemDiscountedUnitPrice, itemCurrency, itemQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItem {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    itemTags: ").append(toIndentedString(itemTags)).append("\n");
    sb.append("    itemDetailsUrl: ").append(toIndentedString(itemDetailsUrl)).append("\n");
    sb.append("    itemImageUrl: ").append(toIndentedString(itemImageUrl)).append("\n");
    sb.append("    itemOriginalUnitPrice: ").append(toIndentedString(itemOriginalUnitPrice)).append("\n");
    sb.append("    itemDiscountedUnitPrice: ").append(toIndentedString(itemDiscountedUnitPrice)).append("\n");
    sb.append("    itemCurrency: ").append(toIndentedString(itemCurrency)).append("\n");
    sb.append("    itemQuantity: ").append(toIndentedString(itemQuantity)).append("\n");
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
    openapiFields.add("item_id");
    openapiFields.add("item_name");
    openapiFields.add("item_description");
    openapiFields.add("item_tags");
    openapiFields.add("item_details_url");
    openapiFields.add("item_image_url");
    openapiFields.add("item_original_unit_price");
    openapiFields.add("item_discounted_unit_price");
    openapiFields.add("item_currency");
    openapiFields.add("item_quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CartItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("item_id") != null && !jsonObj.get("item_id").isJsonNull()) && !jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
      if ((jsonObj.get("item_name") != null && !jsonObj.get("item_name").isJsonNull()) && !jsonObj.get("item_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_name").toString()));
      }
      if ((jsonObj.get("item_description") != null && !jsonObj.get("item_description").isJsonNull()) && !jsonObj.get("item_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("item_tags") != null && !jsonObj.get("item_tags").isJsonNull() && !jsonObj.get("item_tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_tags` to be an array in the JSON string but got `%s`", jsonObj.get("item_tags").toString()));
      }
      if ((jsonObj.get("item_details_url") != null && !jsonObj.get("item_details_url").isJsonNull()) && !jsonObj.get("item_details_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_details_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_details_url").toString()));
      }
      if ((jsonObj.get("item_image_url") != null && !jsonObj.get("item_image_url").isJsonNull()) && !jsonObj.get("item_image_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_image_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_image_url").toString()));
      }
      if ((jsonObj.get("item_currency") != null && !jsonObj.get("item_currency").isJsonNull()) && !jsonObj.get("item_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_currency").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CartItem
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("item_id") != null && !jsonObj.get("item_id").isJsonNull()) && !jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
      if ((jsonObj.get("item_name") != null && !jsonObj.get("item_name").isJsonNull()) && !jsonObj.get("item_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_name").toString()));
      }
      if ((jsonObj.get("item_description") != null && !jsonObj.get("item_description").isJsonNull()) && !jsonObj.get("item_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("item_tags") != null && !jsonObj.get("item_tags").isJsonNull() && !jsonObj.get("item_tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_tags` to be an array in the JSON string but got `%s`", jsonObj.get("item_tags").toString()));
      }
      if ((jsonObj.get("item_details_url") != null && !jsonObj.get("item_details_url").isJsonNull()) && !jsonObj.get("item_details_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_details_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_details_url").toString()));
      }
      if ((jsonObj.get("item_image_url") != null && !jsonObj.get("item_image_url").isJsonNull()) && !jsonObj.get("item_image_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_image_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_image_url").toString()));
      }
      if ((jsonObj.get("item_currency") != null && !jsonObj.get("item_currency").isJsonNull()) && !jsonObj.get("item_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_currency").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartItem.class));

       return (TypeAdapter<T>) new TypeAdapter<CartItem>() {
           @Override
           public void write(JsonWriter out, CartItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CartItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CartItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CartItem
  * @throws IOException if the JSON string is invalid with respect to CartItem
  */
  public static CartItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartItem.class);
  }

 /**
  * Convert an instance of CartItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

