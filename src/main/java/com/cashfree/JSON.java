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


package com.cashfree;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.ApiError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.ApiError404.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.ApiError409.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.ApiError502.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.App.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.AppPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.AuthenticationError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.AuthorizationInPaymentsEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.AuthorizeOrderRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.BadRequestError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.Card.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CardEMI.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CardEMIPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CardOffer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CardPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CardlessEMI.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CardlessEMIEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CardlessEMIPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CardlessEMIQueries.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CashbackDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CreateLinkRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CreateOfferRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CreateOrderRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CreateTerminalRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CreateTerminalRequestTerminalMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CreateTerminalTransactionRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CryptogramEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CustomerDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.CustomerDetailsCardlessEMI.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.DiscountDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.EMIOffer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.EMIPlansArray.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.EligibilityCardlessEMIEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.EligibilityFetchCardlessEMIRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.EligibilityFetchOffersRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.EligibilityFetchPaylaterRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.EligibilityFetchPaymentMethodsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.EligibilityOfferEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.EligibilityPaylaterEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.EligibilityPaymentMethodsEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.EligibilityPaymentMethodsEntityEntityDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.ErrorDetailsInPaymentsEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.FetchReconRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.FetchReconRequestFilters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.FetchReconRequestPagination.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.FetchSettlementsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.FetchSettlementsRequestFilters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.FetchSettlementsRequestPagination.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.FetchTerminalQRCodesEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.IdempotencyError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.InstrumentEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.InstrumentWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.InstrumentWebhookData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.InstrumentWebhookDataEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.LinkCustomerDetailsEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.LinkEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.LinkMetaEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.LinkNotifyEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.NetBankingPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.Netbanking.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferAll.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferCard.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferEMI.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferFilters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferNB.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferNBNetbanking.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferPaylater.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferQueries.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferTnc.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferUPI.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferValidations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferValidationsPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OfferWallet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OrderAuthenticateEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OrderAuthenticatePaymentRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OrderCreateRefundRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OrderEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OrderMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.OrderPayData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PayOrderEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PayOrderRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PayOrderRequestPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.Paylater.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaylaterEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaylaterOffer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaylaterPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentMethodAppInPaymentsEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentMethodCardInPaymentsEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentMethodCardlessEMIInPaymentsEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentMethodInPaymentsEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentMethodInPaymentsEntityPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentMethodNetBankingInPaymentsEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentMethodPaylaterInPaymentsEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentMethodUPIInPaymentsEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentMethodsFilters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentMethodsQueries.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentModeDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentURLObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentWebhookCustomerEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentWebhookDataEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentWebhookDataEntity1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentWebhookErrorEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentWebhookGatewayDetailsEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.PaymentWebhookOrderEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.RateLimitError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.ReconEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.ReconEntityDataInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.RefundEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.RefundSpeed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.RefundURLObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.RefundWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.SavedInstrumentMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.SettlementEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.SettlementFetchReconRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.SettlementFetchReconRequestFilters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.SettlementReconEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.SettlementReconEntityDataInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.SettlementURLObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.SettlementWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.SettlementWebhookDataEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.TerminalDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.TerminalEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.TerminalTransactionEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.UPIAuthorizeDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.UPIPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.Upi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.VendorSplit.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cashfree.model.WalletOffer.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
