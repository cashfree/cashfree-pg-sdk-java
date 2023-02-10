package cashfree.models.response;

import cashfree.models.CustomerDetails;
import cashfree.models.OrderMetaData;
import cashfree.models.OrderSplit;
import cashfree.transformers.deserializers.NestedUrlDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.math.BigDecimal;
import lombok.*;

import java.net.URL;
import java.util.Currency;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonDeserialize(using = OrdersNesterUrlDeserializer.class)
public class CreateOrderResponse {

    @JsonProperty("cf_order_id")
    String cfOrderId;

    @JsonProperty("created_at")
    Date createAt;

    @JsonProperty("order_id")
    String orderId;

    @JsonProperty("order_amount")
    BigDecimal orderAmount;

    @JsonProperty("order_currency")
    Currency orderCurrency;

    @JsonProperty("order_expiry_time")
    Date orderExpiryTime;

    @JsonProperty("order_token")
    String orderToken;
   
    @JsonProperty("payment_session_id")
    String paymentSessionId;

    @JsonProperty("order_status")
    String orderStatus;

    @JsonProperty("order_note")
    String orderNote;

    @JsonProperty("customer_details")
    CustomerDetails customerDetails;

    @JsonProperty("order_meta")
    OrderMetaData orderMetaData;

    @JsonProperty("payment_link")
    URL paymentLink;

    @JsonProperty("payments")
    @JsonDeserialize(using = NestedUrlDeserializer.class)
    URL payments;

    @JsonProperty("refunds")
    @JsonDeserialize(using = NestedUrlDeserializer.class)
    URL refunds;

    @JsonProperty("settlements")
    @JsonDeserialize(using = NestedUrlDeserializer.class)
    URL settlements;

    @JsonProperty("entity")
    String cfEntity;

    @JsonProperty("order_tags")
    Map<String, String> orderTags;

    @JsonProperty("order_splits")
    List<OrderSplit> orderSplits;
}
