package com.cashfree.pg.gatewayinterface;


import com.cashfree.pg.ApiException;
import com.cashfree.pg.ApiResponse;
import com.cashfree.pg.api.OrdersApi;
import com.cashfree.pg.api.PaymentsApi;
import com.cashfree.pg.api.RefundsApi;
import com.cashfree.pg.model.CFOrder;
import com.cashfree.pg.model.CFOrderPayRequest;
import com.cashfree.pg.model.CFOrderPayResponse;
import com.cashfree.pg.model.CFOrderRequest;
import com.cashfree.pg.model.CFPaymentsEntity;
import com.cashfree.pg.model.CFRefund;
import com.cashfree.pg.model.CFRefundRequest;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class CFPaymentGatewayService {
    private final OrdersApi OrdersApiInstance = new OrdersApi();
    private final PaymentsApi PaymentsApiInstance = new PaymentsApi();
    private final RefundsApi RefundsApiInstance = new RefundsApi();
    private final String configCheckFailed = "config check failed";
    private final Integer unauthorisedHTTPCode =
            401; // client request has not been completed because it lacks valid authentication
    // credentials for the requested resource

    private CFError checkConfig(@NotNull CFConfig session) {
        CFError cfError = new CFError("", "", "");
        if (session.getClientId() == null) {
            cfError.setMessage("xClientId is missing");
            cfError.setCode("xClientId_missing");
            cfError.setType("invalid_request");
            return cfError;
        }
        if (session.getClientSecret() == null) {
            cfError.setMessage("xClientSecret is missing");
            cfError.setCode("xClientSecret_missing");
            cfError.setType("invalid_request");
            return cfError;
        }
        if (session.getApiVersion() == null) {
            cfError.setMessage("xApiVersion is missing");
            cfError.setCode("xApiVersion_missing");
            cfError.setType("invalid_request");
            return cfError;
        }
        if (session.getEnvironment() == null) {
            cfError.setMessage("environment is missing");
            cfError.setCode("environment_missing");
            cfError.setType("invalid_request");
            return cfError;
        }
        return null;
    }

    private String getEnvironmentUrl(CFConfig.CFEnvironment environment) {
        if (environment == CFConfig.CFEnvironment.PRODUCTION) return "https://api.cashfree.com/pg";
        return "https://sandbox.cashfree.com/pg";
    }

    @SuppressWarnings("unused")
    public ApiResponse<CFOrder> createOrder(
            CFConfig cfConfig, CFHeaders cfHeaders, CFOrderRequest CFCreateOrderRequest)
            throws ApiException {
        ApiResponse<CFOrder> result;
        CFError checkConfigError = checkConfig(cfConfig);
        if (Objects.nonNull(checkConfigError)) {
            throw new ApiException(configCheckFailed, unauthorisedHTTPCode, checkConfigError);
        }
        String url = this.getEnvironmentUrl(cfConfig.getEnvironment());
        OrdersApiInstance.setCustomBaseUrl(url);
        result =
                OrdersApiInstance.createOrderWithHttpInfo(
                        cfConfig.getClientId(),
                        cfConfig.getClientSecret(),
                        cfConfig.getApiVersion(),
                        null,
                        cfHeaders.getIdempotencyKey(),
                        cfHeaders.getRequestID(),
                        CFCreateOrderRequest);
        return result;
    }

    @SuppressWarnings("unused")
    public ApiResponse<CFOrderPayResponse> orderPay(
            CFConfig cfConfig, CFHeaders cfHeaders, CFOrderPayRequest orderPayRequest)
            throws ApiException {
        ApiResponse<CFOrderPayResponse> result;
        CFError checkConfigError = checkConfig(cfConfig);
        if (Objects.nonNull(checkConfigError)) {
            throw new ApiException(configCheckFailed, unauthorisedHTTPCode, checkConfigError);
        }
        String url = this.getEnvironmentUrl(cfConfig.getEnvironment());
        OrdersApiInstance.setCustomBaseUrl(url);
        result =
                OrdersApiInstance.orderPayWithHttpInfo(
                        cfConfig.getClientId(), cfConfig.getClientSecret(), orderPayRequest);
        return result;
    }

    @SuppressWarnings("unused")
    public ApiResponse<CFOrder> getOrder(CFConfig cfConfig, CFHeaders cfHeaders, String orderId)
            throws ApiException {
        ApiResponse<CFOrder> result;
        CFError checkConfigError = checkConfig(cfConfig);
        if (Objects.nonNull(checkConfigError)) {
            throw new ApiException(configCheckFailed, unauthorisedHTTPCode, checkConfigError);
        }
        String url = this.getEnvironmentUrl(cfConfig.getEnvironment());
        OrdersApiInstance.setCustomBaseUrl(url);
        result =
                OrdersApiInstance.getOrderWithHttpInfo(
                        cfConfig.getClientId(),
                        cfConfig.getClientSecret(),
                        orderId,
                        cfConfig.getApiVersion(),
                        null,
                        cfHeaders.getIdempotencyKey(),
                        cfHeaders.getRequestID());
        return result;
    }

    @SuppressWarnings("unused")
    public ApiResponse<List<CFPaymentsEntity>> getAllPayments(
            CFConfig cfConfig, CFHeaders cfHeaders, String orderId) throws ApiException {
        ApiResponse<List<CFPaymentsEntity>> result;
        CFError checkConfigError = checkConfig(cfConfig);
        if (Objects.nonNull(checkConfigError)) {
            throw new ApiException(configCheckFailed, unauthorisedHTTPCode, checkConfigError);
        }
        String url = this.getEnvironmentUrl(cfConfig.getEnvironment());
        PaymentsApiInstance.setCustomBaseUrl(url);
        result =
                PaymentsApiInstance.getPaymentsfororderWithHttpInfo(
                        cfConfig.getClientId(),
                        cfConfig.getClientSecret(),
                        orderId,
                        cfConfig.getApiVersion(),
                        null,
                        cfHeaders.getIdempotencyKey(),
                        cfHeaders.getRequestID());
        return result;
    }

    @SuppressWarnings("unused")
    public ApiResponse<CFPaymentsEntity> getPaymentById(
            CFConfig cfConfig, CFHeaders cfHeaders, String orderId, Integer paymentId)
            throws ApiException {
        ApiResponse<CFPaymentsEntity> result;
        CFError checkConfigError = checkConfig(cfConfig);
        if (Objects.nonNull(checkConfigError)) {
            throw new ApiException(configCheckFailed, unauthorisedHTTPCode, checkConfigError);
        }
        String url = this.getEnvironmentUrl(cfConfig.getEnvironment());
        PaymentsApiInstance.setCustomBaseUrl(url);
        result =
                PaymentsApiInstance.getPaymentbyIdWithHttpInfo(
                        cfConfig.getClientId(),
                        cfConfig.getClientSecret(),
                        orderId,
                        paymentId,
                        cfConfig.getApiVersion(),
                        null,
                        cfHeaders.getIdempotencyKey(),
                        cfHeaders.getRequestID());
        return result;
    }

    @SuppressWarnings("unused")
    public ApiResponse<CFRefund> initiateRefund(
            CFConfig cfConfig, CFHeaders cfHeaders, String orderId, CFRefundRequest refundRequest)
            throws ApiException {
        ApiResponse<CFRefund> result;
        CFError checkConfigError = checkConfig(cfConfig);
        if (Objects.nonNull(checkConfigError)) {
            throw new ApiException(configCheckFailed, unauthorisedHTTPCode, checkConfigError);
        }
        String url = this.getEnvironmentUrl(cfConfig.getEnvironment());
        System.out.println("comes till here");
        RefundsApiInstance.setCustomBaseUrl(url);
        result =
                RefundsApiInstance.createrefundWithHttpInfo(
                        cfConfig.getClientId(),
                        cfConfig.getClientSecret(),
                        orderId,
                        cfConfig.getApiVersion(),
                        null,
                        cfHeaders.getIdempotencyKey(),
                        cfHeaders.getRequestID(),
                        refundRequest);
        return result;
    }

    @SuppressWarnings("unused")
    public ApiResponse<List<CFRefund>> getAllRefunds(
            CFConfig cfConfig, CFHeaders cfHeaders, String orderId) throws ApiException {
        ApiResponse<List<CFRefund>> result;
        CFError checkConfigError = checkConfig(cfConfig);
        if (Objects.nonNull(checkConfigError)) {
            throw new ApiException(configCheckFailed, unauthorisedHTTPCode, checkConfigError);
        }
        String url = this.getEnvironmentUrl(cfConfig.getEnvironment());
        RefundsApiInstance.setCustomBaseUrl(url);
        result =
                RefundsApiInstance.getallrefundsfororderWithHttpInfo(
                        cfConfig.getClientId(),
                        cfConfig.getClientSecret(),
                        orderId,
                        cfConfig.getApiVersion());
        return result;
    }

    @SuppressWarnings("unused")
    public ApiResponse<CFRefund> getRefundByRefundId(
            CFConfig cfConfig, CFHeaders cfHeaders, String orderId, String refundId)
            throws ApiException {
        ApiResponse<CFRefund> result;
        CFError checkConfigError = checkConfig(cfConfig);
        if (Objects.nonNull(checkConfigError)) {
            throw new ApiException(configCheckFailed, unauthorisedHTTPCode, checkConfigError);
        }
        String url = this.getEnvironmentUrl(cfConfig.getEnvironment());
        RefundsApiInstance.setCustomBaseUrl(url);
        result =
                RefundsApiInstance.getRefundWithHttpInfo(
                        cfConfig.getClientId(),
                        cfConfig.getClientSecret(),
                        orderId,
                        refundId,
                        cfConfig.getApiVersion(),
                        null,
                        cfHeaders.getIdempotencyKey(),
                        cfHeaders.getRequestID());
        return result;
    }
}
