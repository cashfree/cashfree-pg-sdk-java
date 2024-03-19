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
import com.cashfree.model.CardOffer;
import com.cashfree.model.EMIOffer;
import com.cashfree.model.OfferAll;
import com.cashfree.model.OfferCard;
import com.cashfree.model.OfferEMI;
import com.cashfree.model.OfferNB;
import com.cashfree.model.OfferNBNetbanking;
import com.cashfree.model.OfferPaylater;
import com.cashfree.model.OfferUPI;
import com.cashfree.model.OfferWallet;
import com.cashfree.model.PaylaterOffer;
import com.cashfree.model.WalletOffer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Arrays;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.cashfree.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T11:26:29.184559Z[Etc/UTC]")
public class OfferValidationsPaymentMethod extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(OfferValidationsPaymentMethod.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!OfferValidationsPaymentMethod.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'OfferValidationsPaymentMethod' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<OfferAll> adapterOfferAll = gson.getDelegateAdapter(this, TypeToken.get(OfferAll.class));
            final TypeAdapter<OfferCard> adapterOfferCard = gson.getDelegateAdapter(this, TypeToken.get(OfferCard.class));
            final TypeAdapter<OfferNB> adapterOfferNB = gson.getDelegateAdapter(this, TypeToken.get(OfferNB.class));
            final TypeAdapter<OfferWallet> adapterOfferWallet = gson.getDelegateAdapter(this, TypeToken.get(OfferWallet.class));
            final TypeAdapter<OfferUPI> adapterOfferUPI = gson.getDelegateAdapter(this, TypeToken.get(OfferUPI.class));
            final TypeAdapter<OfferPaylater> adapterOfferPaylater = gson.getDelegateAdapter(this, TypeToken.get(OfferPaylater.class));
            final TypeAdapter<OfferEMI> adapterOfferEMI = gson.getDelegateAdapter(this, TypeToken.get(OfferEMI.class));

            return (TypeAdapter<T>) new TypeAdapter<OfferValidationsPaymentMethod>() {
                @Override
                public void write(JsonWriter out, OfferValidationsPaymentMethod value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `OfferAll`
                    if (value.getActualInstance() instanceof OfferAll) {
                      JsonElement element = adapterOfferAll.toJsonTree((OfferAll)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `OfferCard`
                    if (value.getActualInstance() instanceof OfferCard) {
                      JsonElement element = adapterOfferCard.toJsonTree((OfferCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `OfferNB`
                    if (value.getActualInstance() instanceof OfferNB) {
                      JsonElement element = adapterOfferNB.toJsonTree((OfferNB)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `OfferWallet`
                    if (value.getActualInstance() instanceof OfferWallet) {
                      JsonElement element = adapterOfferWallet.toJsonTree((OfferWallet)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `OfferUPI`
                    if (value.getActualInstance() instanceof OfferUPI) {
                      JsonElement element = adapterOfferUPI.toJsonTree((OfferUPI)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `OfferPaylater`
                    if (value.getActualInstance() instanceof OfferPaylater) {
                      JsonElement element = adapterOfferPaylater.toJsonTree((OfferPaylater)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `OfferEMI`
                    if (value.getActualInstance() instanceof OfferEMI) {
                      JsonElement element = adapterOfferEMI.toJsonTree((OfferEMI)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: OfferAll, OfferCard, OfferEMI, OfferNB, OfferPaylater, OfferUPI, OfferWallet");
                }

                @Override
                public OfferValidationsPaymentMethod read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize OfferAll
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(OfferAll.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterOfferAll;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'OfferAll'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for OfferAll failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'OfferAll'", e);
                    }
                    // deserialize OfferCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(OfferCard.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterOfferCard;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'OfferCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for OfferCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'OfferCard'", e);
                    }
                    // deserialize OfferNB
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(OfferNB.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterOfferNB;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'OfferNB'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for OfferNB failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'OfferNB'", e);
                    }
                    // deserialize OfferWallet
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(OfferWallet.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterOfferWallet;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'OfferWallet'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for OfferWallet failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'OfferWallet'", e);
                    }
                    // deserialize OfferUPI
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(OfferUPI.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterOfferUPI;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'OfferUPI'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for OfferUPI failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'OfferUPI'", e);
                    }
                    // deserialize OfferPaylater
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(OfferPaylater.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterOfferPaylater;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'OfferPaylater'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for OfferPaylater failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'OfferPaylater'", e);
                    }
                    // deserialize OfferEMI
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(OfferEMI.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterOfferEMI;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'OfferEMI'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for OfferEMI failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'OfferEMI'", e);
                    }

                    // if (match == 1) {
                        OfferValidationsPaymentMethod ret = new OfferValidationsPaymentMethod();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    // }

                    // throw new IOException(String.format("Failed deserialization for OfferValidationsPaymentMethod: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public OfferValidationsPaymentMethod() {
        super("oneOf", Boolean.FALSE);
    }

    public OfferValidationsPaymentMethod(OfferAll o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public OfferValidationsPaymentMethod(OfferCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public OfferValidationsPaymentMethod(OfferEMI o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public OfferValidationsPaymentMethod(OfferNB o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public OfferValidationsPaymentMethod(OfferPaylater o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public OfferValidationsPaymentMethod(OfferUPI o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public OfferValidationsPaymentMethod(OfferWallet o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("OfferAll", OfferAll.class);
        schemas.put("OfferCard", OfferCard.class);
        schemas.put("OfferNB", OfferNB.class);
        schemas.put("OfferWallet", OfferWallet.class);
        schemas.put("OfferUPI", OfferUPI.class);
        schemas.put("OfferPaylater", OfferPaylater.class);
        schemas.put("OfferEMI", OfferEMI.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return OfferValidationsPaymentMethod.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * OfferAll, OfferCard, OfferEMI, OfferNB, OfferPaylater, OfferUPI, OfferWallet
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof OfferAll) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof OfferCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof OfferNB) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof OfferWallet) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof OfferUPI) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof OfferPaylater) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof OfferEMI) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be OfferAll, OfferCard, OfferEMI, OfferNB, OfferPaylater, OfferUPI, OfferWallet");
    }

    /**
     * Get the actual instance, which can be the following:
     * OfferAll, OfferCard, OfferEMI, OfferNB, OfferPaylater, OfferUPI, OfferWallet
     *
     * @return The actual instance (OfferAll, OfferCard, OfferEMI, OfferNB, OfferPaylater, OfferUPI, OfferWallet)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `OfferAll`. If the actual instance is not `OfferAll`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OfferAll`
     * @throws ClassCastException if the instance is not `OfferAll`
     */
    public OfferAll getOfferAll() throws ClassCastException {
        return (OfferAll)super.getActualInstance();
    }
    /**
     * Get the actual instance of `OfferCard`. If the actual instance is not `OfferCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OfferCard`
     * @throws ClassCastException if the instance is not `OfferCard`
     */
    public OfferCard getOfferCard() throws ClassCastException {
        return (OfferCard)super.getActualInstance();
    }
    /**
     * Get the actual instance of `OfferNB`. If the actual instance is not `OfferNB`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OfferNB`
     * @throws ClassCastException if the instance is not `OfferNB`
     */
    public OfferNB getOfferNB() throws ClassCastException {
        return (OfferNB)super.getActualInstance();
    }
    /**
     * Get the actual instance of `OfferWallet`. If the actual instance is not `OfferWallet`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OfferWallet`
     * @throws ClassCastException if the instance is not `OfferWallet`
     */
    public OfferWallet getOfferWallet() throws ClassCastException {
        return (OfferWallet)super.getActualInstance();
    }
    /**
     * Get the actual instance of `OfferUPI`. If the actual instance is not `OfferUPI`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OfferUPI`
     * @throws ClassCastException if the instance is not `OfferUPI`
     */
    public OfferUPI getOfferUPI() throws ClassCastException {
        return (OfferUPI)super.getActualInstance();
    }
    /**
     * Get the actual instance of `OfferPaylater`. If the actual instance is not `OfferPaylater`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OfferPaylater`
     * @throws ClassCastException if the instance is not `OfferPaylater`
     */
    public OfferPaylater getOfferPaylater() throws ClassCastException {
        return (OfferPaylater)super.getActualInstance();
    }
    /**
     * Get the actual instance of `OfferEMI`. If the actual instance is not `OfferEMI`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OfferEMI`
     * @throws ClassCastException if the instance is not `OfferEMI`
     */
    public OfferEMI getOfferEMI() throws ClassCastException {
        return (OfferEMI)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfferValidationsPaymentMethod
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with OfferAll
    try {
      OfferAll.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for OfferAll failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with OfferCard
    try {
      OfferCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for OfferCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with OfferNB
    try {
      OfferNB.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for OfferNB failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with OfferWallet
    try {
      OfferWallet.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for OfferWallet failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with OfferUPI
    try {
      OfferUPI.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for OfferUPI failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with OfferPaylater
    try {
      OfferPaylater.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for OfferPaylater failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with OfferEMI
    try {
      OfferEMI.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for OfferEMI failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // if (validCount != 1) {
    //  throw new IOException(String.format("The JSON string is invalid for OfferValidationsPaymentMethod with oneOf schemas: OfferAll, OfferCard, OfferEMI, OfferNB, OfferPaylater, OfferUPI, OfferWallet. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    // }
  }

 /**
  * Create an instance of OfferValidationsPaymentMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfferValidationsPaymentMethod
  * @throws IOException if the JSON string is invalid with respect to OfferValidationsPaymentMethod
  */
  public static OfferValidationsPaymentMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferValidationsPaymentMethod.class);
  }

 /**
  * Convert an instance of OfferValidationsPaymentMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

