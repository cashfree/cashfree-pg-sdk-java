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
import com.cashfree.pg.model.App;
import com.cashfree.pg.model.AppPaymentMethod;
import com.cashfree.pg.model.Banktransfer;
import com.cashfree.pg.model.BanktransferPaymentMethod;
import com.cashfree.pg.model.Card;
import com.cashfree.pg.model.CardEMI;
import com.cashfree.pg.model.CardEMIPaymentMethod;
import com.cashfree.pg.model.CardPaymentMethod;
import com.cashfree.pg.model.CardlessEMI;
import com.cashfree.pg.model.CardlessEMIPaymentMethod;
import com.cashfree.pg.model.NetBankingPaymentMethod;
import com.cashfree.pg.model.Netbanking;
import com.cashfree.pg.model.Paylater;
import com.cashfree.pg.model.PaylaterPaymentMethod;
import com.cashfree.pg.model.UPIPaymentMethod;
import com.cashfree.pg.model.Upi;
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

import com.cashfree.pg.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-01T11:00:02.685522Z[Etc/UTC]")
public class PayOrderRequestPaymentMethod extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PayOrderRequestPaymentMethod.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PayOrderRequestPaymentMethod.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PayOrderRequestPaymentMethod' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CardPaymentMethod> adapterCardPaymentMethod = gson.getDelegateAdapter(this, TypeToken.get(CardPaymentMethod.class));
            final TypeAdapter<UPIPaymentMethod> adapterUPIPaymentMethod = gson.getDelegateAdapter(this, TypeToken.get(UPIPaymentMethod.class));
            final TypeAdapter<NetBankingPaymentMethod> adapterNetBankingPaymentMethod = gson.getDelegateAdapter(this, TypeToken.get(NetBankingPaymentMethod.class));
            final TypeAdapter<AppPaymentMethod> adapterAppPaymentMethod = gson.getDelegateAdapter(this, TypeToken.get(AppPaymentMethod.class));
            final TypeAdapter<CardEMIPaymentMethod> adapterCardEMIPaymentMethod = gson.getDelegateAdapter(this, TypeToken.get(CardEMIPaymentMethod.class));
            final TypeAdapter<CardlessEMIPaymentMethod> adapterCardlessEMIPaymentMethod = gson.getDelegateAdapter(this, TypeToken.get(CardlessEMIPaymentMethod.class));
            final TypeAdapter<PaylaterPaymentMethod> adapterPaylaterPaymentMethod = gson.getDelegateAdapter(this, TypeToken.get(PaylaterPaymentMethod.class));
            final TypeAdapter<BanktransferPaymentMethod> adapterBanktransferPaymentMethod = gson.getDelegateAdapter(this, TypeToken.get(BanktransferPaymentMethod.class));

            return (TypeAdapter<T>) new TypeAdapter<PayOrderRequestPaymentMethod>() {
                @Override
                public void write(JsonWriter out, PayOrderRequestPaymentMethod value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CardPaymentMethod`
                    if (value.getActualInstance() instanceof CardPaymentMethod) {
                      JsonElement element = adapterCardPaymentMethod.toJsonTree((CardPaymentMethod)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `UPIPaymentMethod`
                    if (value.getActualInstance() instanceof UPIPaymentMethod) {
                      JsonElement element = adapterUPIPaymentMethod.toJsonTree((UPIPaymentMethod)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `NetBankingPaymentMethod`
                    if (value.getActualInstance() instanceof NetBankingPaymentMethod) {
                      JsonElement element = adapterNetBankingPaymentMethod.toJsonTree((NetBankingPaymentMethod)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `AppPaymentMethod`
                    if (value.getActualInstance() instanceof AppPaymentMethod) {
                      JsonElement element = adapterAppPaymentMethod.toJsonTree((AppPaymentMethod)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CardEMIPaymentMethod`
                    if (value.getActualInstance() instanceof CardEMIPaymentMethod) {
                      JsonElement element = adapterCardEMIPaymentMethod.toJsonTree((CardEMIPaymentMethod)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CardlessEMIPaymentMethod`
                    if (value.getActualInstance() instanceof CardlessEMIPaymentMethod) {
                      JsonElement element = adapterCardlessEMIPaymentMethod.toJsonTree((CardlessEMIPaymentMethod)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PaylaterPaymentMethod`
                    if (value.getActualInstance() instanceof PaylaterPaymentMethod) {
                      JsonElement element = adapterPaylaterPaymentMethod.toJsonTree((PaylaterPaymentMethod)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `BanktransferPaymentMethod`
                    if (value.getActualInstance() instanceof BanktransferPaymentMethod) {
                      JsonElement element = adapterBanktransferPaymentMethod.toJsonTree((BanktransferPaymentMethod)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AppPaymentMethod, BanktransferPaymentMethod, CardEMIPaymentMethod, CardPaymentMethod, CardlessEMIPaymentMethod, NetBankingPaymentMethod, PaylaterPaymentMethod, UPIPaymentMethod");
                }

                @Override
                public PayOrderRequestPaymentMethod read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CardPaymentMethod
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(CardPaymentMethod.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterCardPaymentMethod;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CardPaymentMethod'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CardPaymentMethod failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CardPaymentMethod'", e);
                    }
                    // deserialize UPIPaymentMethod
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(UPIPaymentMethod.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterUPIPaymentMethod;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'UPIPaymentMethod'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for UPIPaymentMethod failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'UPIPaymentMethod'", e);
                    }
                    // deserialize NetBankingPaymentMethod
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(NetBankingPaymentMethod.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterNetBankingPaymentMethod;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'NetBankingPaymentMethod'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for NetBankingPaymentMethod failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'NetBankingPaymentMethod'", e);
                    }
                    // deserialize AppPaymentMethod
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(AppPaymentMethod.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterAppPaymentMethod;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'AppPaymentMethod'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for AppPaymentMethod failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'AppPaymentMethod'", e);
                    }
                    // deserialize CardEMIPaymentMethod
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(CardEMIPaymentMethod.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterCardEMIPaymentMethod;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CardEMIPaymentMethod'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CardEMIPaymentMethod failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CardEMIPaymentMethod'", e);
                    }
                    // deserialize CardlessEMIPaymentMethod
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(CardlessEMIPaymentMethod.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterCardlessEMIPaymentMethod;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CardlessEMIPaymentMethod'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CardlessEMIPaymentMethod failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CardlessEMIPaymentMethod'", e);
                    }
                    // deserialize PaylaterPaymentMethod
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(PaylaterPaymentMethod.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterPaylaterPaymentMethod;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PaylaterPaymentMethod'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PaylaterPaymentMethod failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PaylaterPaymentMethod'", e);
                    }
                    // deserialize BanktransferPaymentMethod
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(BanktransferPaymentMethod.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterBanktransferPaymentMethod;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'BanktransferPaymentMethod'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for BanktransferPaymentMethod failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'BanktransferPaymentMethod'", e);
                    }

                    // if (match == 1) {
                        PayOrderRequestPaymentMethod ret = new PayOrderRequestPaymentMethod();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    // }

                    // throw new IOException(String.format("Failed deserialization for PayOrderRequestPaymentMethod: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public PayOrderRequestPaymentMethod() {
        super("oneOf", Boolean.FALSE);
    }

    public PayOrderRequestPaymentMethod(AppPaymentMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PayOrderRequestPaymentMethod(BanktransferPaymentMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PayOrderRequestPaymentMethod(CardEMIPaymentMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PayOrderRequestPaymentMethod(CardPaymentMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PayOrderRequestPaymentMethod(CardlessEMIPaymentMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PayOrderRequestPaymentMethod(NetBankingPaymentMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PayOrderRequestPaymentMethod(PaylaterPaymentMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PayOrderRequestPaymentMethod(UPIPaymentMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CardPaymentMethod", CardPaymentMethod.class);
        schemas.put("UPIPaymentMethod", UPIPaymentMethod.class);
        schemas.put("NetBankingPaymentMethod", NetBankingPaymentMethod.class);
        schemas.put("AppPaymentMethod", AppPaymentMethod.class);
        schemas.put("CardEMIPaymentMethod", CardEMIPaymentMethod.class);
        schemas.put("CardlessEMIPaymentMethod", CardlessEMIPaymentMethod.class);
        schemas.put("PaylaterPaymentMethod", PaylaterPaymentMethod.class);
        schemas.put("BanktransferPaymentMethod", BanktransferPaymentMethod.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return PayOrderRequestPaymentMethod.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AppPaymentMethod, BanktransferPaymentMethod, CardEMIPaymentMethod, CardPaymentMethod, CardlessEMIPaymentMethod, NetBankingPaymentMethod, PaylaterPaymentMethod, UPIPaymentMethod
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CardPaymentMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UPIPaymentMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof NetBankingPaymentMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AppPaymentMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CardEMIPaymentMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CardlessEMIPaymentMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaylaterPaymentMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BanktransferPaymentMethod) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AppPaymentMethod, BanktransferPaymentMethod, CardEMIPaymentMethod, CardPaymentMethod, CardlessEMIPaymentMethod, NetBankingPaymentMethod, PaylaterPaymentMethod, UPIPaymentMethod");
    }

    /**
     * Get the actual instance, which can be the following:
     * AppPaymentMethod, BanktransferPaymentMethod, CardEMIPaymentMethod, CardPaymentMethod, CardlessEMIPaymentMethod, NetBankingPaymentMethod, PaylaterPaymentMethod, UPIPaymentMethod
     *
     * @return The actual instance (AppPaymentMethod, BanktransferPaymentMethod, CardEMIPaymentMethod, CardPaymentMethod, CardlessEMIPaymentMethod, NetBankingPaymentMethod, PaylaterPaymentMethod, UPIPaymentMethod)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CardPaymentMethod`. If the actual instance is not `CardPaymentMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CardPaymentMethod`
     * @throws ClassCastException if the instance is not `CardPaymentMethod`
     */
    public CardPaymentMethod getCardPaymentMethod() throws ClassCastException {
        return (CardPaymentMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UPIPaymentMethod`. If the actual instance is not `UPIPaymentMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UPIPaymentMethod`
     * @throws ClassCastException if the instance is not `UPIPaymentMethod`
     */
    public UPIPaymentMethod getUPIPaymentMethod() throws ClassCastException {
        return (UPIPaymentMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `NetBankingPaymentMethod`. If the actual instance is not `NetBankingPaymentMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NetBankingPaymentMethod`
     * @throws ClassCastException if the instance is not `NetBankingPaymentMethod`
     */
    public NetBankingPaymentMethod getNetBankingPaymentMethod() throws ClassCastException {
        return (NetBankingPaymentMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `AppPaymentMethod`. If the actual instance is not `AppPaymentMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppPaymentMethod`
     * @throws ClassCastException if the instance is not `AppPaymentMethod`
     */
    public AppPaymentMethod getAppPaymentMethod() throws ClassCastException {
        return (AppPaymentMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CardEMIPaymentMethod`. If the actual instance is not `CardEMIPaymentMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CardEMIPaymentMethod`
     * @throws ClassCastException if the instance is not `CardEMIPaymentMethod`
     */
    public CardEMIPaymentMethod getCardEMIPaymentMethod() throws ClassCastException {
        return (CardEMIPaymentMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CardlessEMIPaymentMethod`. If the actual instance is not `CardlessEMIPaymentMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CardlessEMIPaymentMethod`
     * @throws ClassCastException if the instance is not `CardlessEMIPaymentMethod`
     */
    public CardlessEMIPaymentMethod getCardlessEMIPaymentMethod() throws ClassCastException {
        return (CardlessEMIPaymentMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PaylaterPaymentMethod`. If the actual instance is not `PaylaterPaymentMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaylaterPaymentMethod`
     * @throws ClassCastException if the instance is not `PaylaterPaymentMethod`
     */
    public PaylaterPaymentMethod getPaylaterPaymentMethod() throws ClassCastException {
        return (PaylaterPaymentMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `BanktransferPaymentMethod`. If the actual instance is not `BanktransferPaymentMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BanktransferPaymentMethod`
     * @throws ClassCastException if the instance is not `BanktransferPaymentMethod`
     */
    public BanktransferPaymentMethod getBanktransferPaymentMethod() throws ClassCastException {
        return (BanktransferPaymentMethod)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PayOrderRequestPaymentMethod
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CardPaymentMethod
    try {
      CardPaymentMethod.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CardPaymentMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UPIPaymentMethod
    try {
      UPIPaymentMethod.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UPIPaymentMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with NetBankingPaymentMethod
    try {
      NetBankingPaymentMethod.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for NetBankingPaymentMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with AppPaymentMethod
    try {
      AppPaymentMethod.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AppPaymentMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CardEMIPaymentMethod
    try {
      CardEMIPaymentMethod.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CardEMIPaymentMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CardlessEMIPaymentMethod
    try {
      CardlessEMIPaymentMethod.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CardlessEMIPaymentMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PaylaterPaymentMethod
    try {
      PaylaterPaymentMethod.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PaylaterPaymentMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with BanktransferPaymentMethod
    try {
      BanktransferPaymentMethod.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for BanktransferPaymentMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // if (validCount != 1) {
    //  throw new IOException(String.format("The JSON string is invalid for PayOrderRequestPaymentMethod with oneOf schemas: AppPaymentMethod, BanktransferPaymentMethod, CardEMIPaymentMethod, CardPaymentMethod, CardlessEMIPaymentMethod, NetBankingPaymentMethod, PaylaterPaymentMethod, UPIPaymentMethod. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    // }
  }

 /**
  * Create an instance of PayOrderRequestPaymentMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayOrderRequestPaymentMethod
  * @throws IOException if the JSON string is invalid with respect to PayOrderRequestPaymentMethod
  */
  public static PayOrderRequestPaymentMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayOrderRequestPaymentMethod.class);
  }

 /**
  * Convert an instance of PayOrderRequestPaymentMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

