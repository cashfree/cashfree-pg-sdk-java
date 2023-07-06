/*
 * New Payment Gateway APIs
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2022-01-01
 * Contact: nextgenapi@cashfree.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.cashfree.pg.model;


import com.cashfree.pg.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** CFOrder */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-03-16T14:01:52.135917+05:30[Asia/Kolkata]")
public class CFOrder {
    public static final String SERIALIZED_NAME_CF_ORDER_ID = "cf_order_id";

    @SerializedName(SERIALIZED_NAME_CF_ORDER_ID)
    private Long cfOrderId;

    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_ORDER_ID = "order_id";

    @SerializedName(SERIALIZED_NAME_ORDER_ID)
    private String orderId;

    public static final String SERIALIZED_NAME_ENTITY = "entity";

    @SerializedName(SERIALIZED_NAME_ENTITY)
    private String entity;

    public static final String SERIALIZED_NAME_ORDER_CURRENCY = "order_currency";

    @SerializedName(SERIALIZED_NAME_ORDER_CURRENCY)
    private String orderCurrency;

    public static final String SERIALIZED_NAME_ORDER_AMOUNT = "order_amount";

    @SerializedName(SERIALIZED_NAME_ORDER_AMOUNT)
    private BigDecimal orderAmount;

    public static final String SERIALIZED_NAME_ORDER_STATUS = "order_status";

    @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
    private String orderStatus;

    public static final String SERIALIZED_NAME_ORDER_TOKEN = "order_token";

    @SerializedName(SERIALIZED_NAME_ORDER_TOKEN)
    private String orderToken;

    public static final String SERIALIZED_NAME_ORDER_EXPIRY_TIME = "order_expiry_time";

    @SerializedName(SERIALIZED_NAME_ORDER_EXPIRY_TIME)
    private String orderExpiryTime;

    public static final String SERIALIZED_NAME_ORDER_NOTE = "order_note";

    @SerializedName(SERIALIZED_NAME_ORDER_NOTE)
    private String orderNote;

    public static final String SERIALIZED_NAME_PAYMENT_LINK = "payment_link";

    @SerializedName(SERIALIZED_NAME_PAYMENT_LINK)
    private String paymentLink;

    public static final String SERIALIZED_NAME_PAYMENT_SESSION_ID = "payment_session_id";

    @SerializedName(SERIALIZED_NAME_PAYMENT_SESSION_ID)
    private String paymentSessionId;

    public static final String SERIALIZED_NAME_CUSTOMER_DETAILS = "customer_details";

    @SerializedName(SERIALIZED_NAME_CUSTOMER_DETAILS)
    private CFCustomerDetails customerDetails;

    public static final String SERIALIZED_NAME_ORDER_META = "order_meta";

    @SerializedName(SERIALIZED_NAME_ORDER_META)
    private CFOrderMeta orderMeta;

    public static final String SERIALIZED_NAME_PAYMENTS = "payments";

    @SerializedName(SERIALIZED_NAME_PAYMENTS)
    private CFPaymentURLObject payments;

    public static final String SERIALIZED_NAME_SETTLEMENTS = "settlements";

    @SerializedName(SERIALIZED_NAME_SETTLEMENTS)
    private CFSettlementURLObject settlements;

    public static final String SERIALIZED_NAME_REFUNDS = "refunds";

    @SerializedName(SERIALIZED_NAME_REFUNDS)
    private CFRefundURLObject refunds;

    public static final String SERIALIZED_NAME_ORDER_TAGS = "order_tags";

    @SerializedName(SERIALIZED_NAME_ORDER_TAGS)
    private Map<String, String> orderTags = new HashMap<>();

    public static final String SERIALIZED_NAME_ORDER_SPLITS = "order_splits";

    @SerializedName(SERIALIZED_NAME_ORDER_SPLITS)
    private List<CFVendorSplit> orderSplits = new ArrayList<>();

    public static final String SERIALIZED_NAME_TERMINAL_DATA = "terminal_data";

    @SerializedName(SERIALIZED_NAME_TERMINAL_DATA)
    private Object terminalData;

    public CFOrder() {}

    public CFOrder cfOrderId(Long cfOrderId) {

        this.cfOrderId = cfOrderId;
        return this;
    }

    /**
     * Get cfOrderId
     *
     * @return cfOrderId
     */
    @javax.annotation.Nullable
    public Long getCfOrderId() {
        return cfOrderId;
    }

    public void setCfOrderId(Long cfOrderId) {
        this.cfOrderId = cfOrderId;
    }

    public CFOrder createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     */
    @javax.annotation.Nullable
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CFOrder orderId(String orderId) {

        this.orderId = orderId;
        return this;
    }

    /**
     * Get orderId
     *
     * @return orderId
     */
    @javax.annotation.Nullable
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CFOrder entity(String entity) {

        this.entity = entity;
        return this;
    }

    /**
     * Get entity
     *
     * @return entity
     */
    @javax.annotation.Nullable
    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public CFOrder orderCurrency(String orderCurrency) {

        this.orderCurrency = orderCurrency;
        return this;
    }

    /**
     * Get orderCurrency
     *
     * @return orderCurrency
     */
    @javax.annotation.Nullable
    public String getOrderCurrency() {
        return orderCurrency;
    }

    public void setOrderCurrency(String orderCurrency) {
        this.orderCurrency = orderCurrency;
    }

    public CFOrder orderAmount(BigDecimal orderAmount) {

        this.orderAmount = orderAmount;
        return this;
    }

    /**
     * Get orderAmount
     *
     * @return orderAmount
     */
    @javax.annotation.Nullable
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public CFOrder orderStatus(String orderStatus) {

        this.orderStatus = orderStatus;
        return this;
    }

    /**
     * Get orderStatus
     *
     * @return orderStatus
     */
    @javax.annotation.Nullable
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public CFOrder orderToken(String orderToken) {

        this.orderToken = orderToken;
        return this;
    }

    /**
     * Get orderToken
     *
     * @return orderToken
     */
    @javax.annotation.Nullable
    public String getOrderToken() {
        return orderToken;
    }

    public void setOrderToken(String orderToken) {
        this.orderToken = orderToken;
    }

    public CFOrder orderExpiryTime(String orderExpiryTime) {

        this.orderExpiryTime = orderExpiryTime;
        return this;
    }

    /**
     * Get orderExpiryTime
     *
     * @return orderExpiryTime
     */
    @javax.annotation.Nullable
    public String getOrderExpiryTime() {
        return orderExpiryTime;
    }

    public void setOrderExpiryTime(String orderExpiryTime) {
        this.orderExpiryTime = orderExpiryTime;
    }

    public CFOrder orderNote(String orderNote) {

        this.orderNote = orderNote;
        return this;
    }

    /**
     * Get orderNote
     *
     * @return orderNote
     */
    @javax.annotation.Nullable
    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

    public CFOrder paymentLink(String paymentLink) {

        this.paymentLink = paymentLink;
        return this;
    }

    /**
     * Get paymentLink
     *
     * @return paymentLink
     */
    @javax.annotation.Nullable
    public String getPaymentLink() {
        return paymentLink;
    }

    public void setPaymentLink(String paymentLink) {
        this.paymentLink = paymentLink;
    }

    public CFOrder paymentSessionId(String paymentSessionId) {

        this.paymentSessionId = paymentSessionId;
        return this;
    }

    /**
     * Get paymentSessionId
     *
     * @return paymentSessionId
     */
    @javax.annotation.Nullable
    public String getPaymentSessionId() {
        return paymentSessionId;
    }

    public void setPaymentSessionId(String paymentSessionId) {
        this.paymentSessionId = paymentSessionId;
    }

    public CFOrder customerDetails(CFCustomerDetails customerDetails) {

        this.customerDetails = customerDetails;
        return this;
    }

    /**
     * Get customerDetails
     *
     * @return customerDetails
     */
    @javax.annotation.Nullable
    public CFCustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CFCustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public CFOrder orderMeta(CFOrderMeta orderMeta) {

        this.orderMeta = orderMeta;
        return this;
    }

    /**
     * Get orderMeta
     *
     * @return orderMeta
     */
    @javax.annotation.Nullable
    public CFOrderMeta getOrderMeta() {
        return orderMeta;
    }

    public void setOrderMeta(CFOrderMeta orderMeta) {
        this.orderMeta = orderMeta;
    }

    public CFOrder payments(CFPaymentURLObject payments) {

        this.payments = payments;
        return this;
    }

    /**
     * Get payments
     *
     * @return payments
     */
    @javax.annotation.Nullable
    public CFPaymentURLObject getPayments() {
        return payments;
    }

    public void setPayments(CFPaymentURLObject payments) {
        this.payments = payments;
    }

    public CFOrder settlements(CFSettlementURLObject settlements) {

        this.settlements = settlements;
        return this;
    }

    /**
     * Get settlements
     *
     * @return settlements
     */
    @javax.annotation.Nullable
    public CFSettlementURLObject getSettlements() {
        return settlements;
    }

    public void setSettlements(CFSettlementURLObject settlements) {
        this.settlements = settlements;
    }

    public CFOrder refunds(CFRefundURLObject refunds) {

        this.refunds = refunds;
        return this;
    }

    /**
     * Get refunds
     *
     * @return refunds
     */
    @javax.annotation.Nullable
    public CFRefundURLObject getRefunds() {
        return refunds;
    }

    public void setRefunds(CFRefundURLObject refunds) {
        this.refunds = refunds;
    }

    public CFOrder orderTags(Map<String, String> orderTags) {

        this.orderTags = orderTags;
        return this;
    }

    public CFOrder putOrderTagsItem(String key, String orderTagsItem) {
        if (this.orderTags == null) {
            this.orderTags = new HashMap<>();
        }
        this.orderTags.put(key, orderTagsItem);
        return this;
    }

    /**
     * Custom Tags which can be passed for an order. A maximum of 6 tags can be added
     *
     * @return orderTags
     */
    @javax.annotation.Nullable
    public Map<String, String> getOrderTags() {
        return orderTags;
    }

    public void setOrderTags(Map<String, String> orderTags) {
        this.orderTags = orderTags;
    }

    public CFOrder orderSplits(List<CFVendorSplit> orderSplits) {

        this.orderSplits = orderSplits;
        return this;
    }

    public CFOrder addOrderSplitsItem(CFVendorSplit orderSplitsItem) {
        if (this.orderSplits == null) {
            this.orderSplits = new ArrayList<>();
        }
        this.orderSplits.add(orderSplitsItem);
        return this;
    }

    /**
     * Get orderSplits
     *
     * @return orderSplits
     */
    @javax.annotation.Nullable
    public List<CFVendorSplit> getOrderSplits() {
        return orderSplits;
    }

    public void setOrderSplits(List<CFVendorSplit> orderSplits) {
        this.orderSplits = orderSplits;
    }

    public CFOrder terminalData(Object terminalData) {

        this.terminalData = terminalData;
        return this;
    }

    /**
     * Get terminalData
     *
     * @return terminalData
     */
    @javax.annotation.Nullable
    public Object getTerminalData() {
        return terminalData;
    }

    public void setTerminalData(Object terminalData) {
        this.terminalData = terminalData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CFOrder cfOrder = (CFOrder) o;
        return Objects.equals(this.cfOrderId, cfOrder.cfOrderId)
                && Objects.equals(this.createdAt, cfOrder.createdAt)
                && Objects.equals(this.orderId, cfOrder.orderId)
                && Objects.equals(this.entity, cfOrder.entity)
                && Objects.equals(this.orderCurrency, cfOrder.orderCurrency)
                && Objects.equals(this.orderAmount, cfOrder.orderAmount)
                && Objects.equals(this.orderStatus, cfOrder.orderStatus)
                && Objects.equals(this.orderToken, cfOrder.orderToken)
                && Objects.equals(this.orderExpiryTime, cfOrder.orderExpiryTime)
                && Objects.equals(this.orderNote, cfOrder.orderNote)
                && Objects.equals(this.paymentLink, cfOrder.paymentLink)
                && Objects.equals(this.paymentSessionId, cfOrder.paymentSessionId)
                && Objects.equals(this.customerDetails, cfOrder.customerDetails)
                && Objects.equals(this.orderMeta, cfOrder.orderMeta)
                && Objects.equals(this.payments, cfOrder.payments)
                && Objects.equals(this.settlements, cfOrder.settlements)
                && Objects.equals(this.refunds, cfOrder.refunds)
                && Objects.equals(this.orderTags, cfOrder.orderTags)
                && Objects.equals(this.orderSplits, cfOrder.orderSplits)
                && Objects.equals(this.terminalData, cfOrder.terminalData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                cfOrderId,
                createdAt,
                orderId,
                entity,
                orderCurrency,
                orderAmount,
                orderStatus,
                orderToken,
                orderExpiryTime,
                orderNote,
                paymentLink,
                paymentSessionId,
                customerDetails,
                orderMeta,
                payments,
                settlements,
                refunds,
                orderTags,
                orderSplits,
                terminalData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CFOrder {\n");
        sb.append("    cfOrderId: ").append(toIndentedString(cfOrderId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("    orderCurrency: ").append(toIndentedString(orderCurrency)).append("\n");
        sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
        sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
        sb.append("    orderToken: ").append(toIndentedString(orderToken)).append("\n");
        sb.append("    orderExpiryTime: ").append(toIndentedString(orderExpiryTime)).append("\n");
        sb.append("    orderNote: ").append(toIndentedString(orderNote)).append("\n");
        sb.append("    paymentLink: ").append(toIndentedString(paymentLink)).append("\n");
        sb.append("    paymentSessionId: ").append(toIndentedString(paymentSessionId)).append("\n");
        sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
        sb.append("    orderMeta: ").append(toIndentedString(orderMeta)).append("\n");
        sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
        sb.append("    settlements: ").append(toIndentedString(settlements)).append("\n");
        sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
        sb.append("    orderTags: ").append(toIndentedString(orderTags)).append("\n");
        sb.append("    orderSplits: ").append(toIndentedString(orderSplits)).append("\n");
        sb.append("    terminalData: ").append(toIndentedString(terminalData)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
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
        openapiFields.add("cf_order_id");
        openapiFields.add("created_at");
        openapiFields.add("order_id");
        openapiFields.add("entity");
        openapiFields.add("order_currency");
        openapiFields.add("order_amount");
        openapiFields.add("order_status");
        openapiFields.add("order_token");
        openapiFields.add("order_expiry_time");
        openapiFields.add("order_note");
        openapiFields.add("payment_link");
        openapiFields.add("payment_session_id");
        openapiFields.add("customer_details");
        openapiFields.add("order_meta");
        openapiFields.add("payments");
        openapiFields.add("settlements");
        openapiFields.add("refunds");
        openapiFields.add("order_tags");
        openapiFields.add("order_splits");
        openapiFields.add("terminal_data");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CFOrder
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CFOrder.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CFOrder is not found in the empty"
                                        + " JSON string",
                                CFOrder.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CFOrder.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `CFOrder`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull())
                && !jsonObj.get("created_at").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `created_at` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("created_at").toString()));
        }
        if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull())
                && !jsonObj.get("order_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `order_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("order_id").toString()));
        }
        if ((jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull())
                && !jsonObj.get("entity").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `entity` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("entity").toString()));
        }
        if ((jsonObj.get("order_currency") != null && !jsonObj.get("order_currency").isJsonNull())
                && !jsonObj.get("order_currency").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `order_currency` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("order_currency").toString()));
        }
        if ((jsonObj.get("order_status") != null && !jsonObj.get("order_status").isJsonNull())
                && !jsonObj.get("order_status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `order_status` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("order_status").toString()));
        }
        if ((jsonObj.get("order_token") != null && !jsonObj.get("order_token").isJsonNull())
                && !jsonObj.get("order_token").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `order_token` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("order_token").toString()));
        }
        if ((jsonObj.get("order_expiry_time") != null
                        && !jsonObj.get("order_expiry_time").isJsonNull())
                && !jsonObj.get("order_expiry_time").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `order_expiry_time` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("order_expiry_time").toString()));
        }
        if ((jsonObj.get("order_note") != null && !jsonObj.get("order_note").isJsonNull())
                && !jsonObj.get("order_note").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `order_note` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("order_note").toString()));
        }
        if ((jsonObj.get("payment_link") != null && !jsonObj.get("payment_link").isJsonNull())
                && !jsonObj.get("payment_link").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `payment_link` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("payment_link").toString()));
        }
        if ((jsonObj.get("payment_session_id") != null
                        && !jsonObj.get("payment_session_id").isJsonNull())
                && !jsonObj.get("payment_session_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `payment_session_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("payment_session_id").toString()));
        }
        // validate the optional field `customer_details`
        if (jsonObj.get("customer_details") != null
                && !jsonObj.get("customer_details").isJsonNull()) {
            CFCustomerDetails.validateJsonObject(jsonObj.getAsJsonObject("customer_details"));
        }
        // validate the optional field `order_meta`
        if (jsonObj.get("order_meta") != null && !jsonObj.get("order_meta").isJsonNull()) {
            CFOrderMeta.validateJsonObject(jsonObj.getAsJsonObject("order_meta"));
        }
        // validate the optional field `payments`
        if (jsonObj.get("payments") != null && !jsonObj.get("payments").isJsonNull()) {
            CFPaymentURLObject.validateJsonObject(jsonObj.getAsJsonObject("payments"));
        }
        // validate the optional field `settlements`
        if (jsonObj.get("settlements") != null && !jsonObj.get("settlements").isJsonNull()) {
            CFSettlementURLObject.validateJsonObject(jsonObj.getAsJsonObject("settlements"));
        }
        // validate the optional field `refunds`
        if (jsonObj.get("refunds") != null && !jsonObj.get("refunds").isJsonNull()) {
            CFRefundURLObject.validateJsonObject(jsonObj.getAsJsonObject("refunds"));
        }
        if (jsonObj.get("order_splits") != null && !jsonObj.get("order_splits").isJsonNull()) {
            JsonArray jsonArrayorderSplits = jsonObj.getAsJsonArray("order_splits");
            if (jsonArrayorderSplits != null) {
                // ensure the json data is an array
                if (!jsonObj.get("order_splits").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `order_splits` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("order_splits").toString()));
                }

                // validate the optional field `order_splits` (array)
                for (int i = 0; i < jsonArrayorderSplits.size(); i++) {
                    CFVendorSplit.validateJsonObject(jsonArrayorderSplits.get(i).getAsJsonObject());
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CFOrder.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CFOrder' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CFOrder> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CFOrder.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CFOrder>() {
                        @Override
                        public void write(JsonWriter out, CFOrder value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CFOrder read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CFOrder given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CFOrder
     * @throws IOException if the JSON string is invalid with respect to CFOrder
     */
    public static CFOrder fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CFOrder.class);
    }

    /**
     * Convert an instance of CFOrder to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
