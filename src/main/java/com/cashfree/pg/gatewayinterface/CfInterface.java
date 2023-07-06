package com.cashfree.pg.gatewayinterface;

import com.cashfree.pg.ApiException;
import com.cashfree.pg.ApiResponse;
import com.cashfree.pg.model.CFCustomerDetails;
import com.cashfree.pg.model.CFOrder;
import com.cashfree.pg.model.CFOrderRequest;
import com.cashfree.pg.model.CFPaymentsEntity;

import java.sql.SQLOutput;
import java.util.List;

public class CfInterface {
    static CFConfig config =
            CFConfig.builder()
                    .ClientId("TEST274978695f195b1258a7dcff78879472")
                    .ClientSecret("TESTfea82c479c3ddf8843d12b9f4da0db163685fdf1")
                    .ApiVersion("2022-09-01")
                    .Environment(CFConfig.CFEnvironment.SANDBOX)
                    .build();
    static CFHeaders headers = CFHeaders.builder().RequestID("PrasunTestJAVAJULY").IdempotencyKey("HELLO").build();
    static CFCustomerDetails customerDetails =
            new CFCustomerDetails().customerId("Prasun").customerPhone("9515967416");
    static CFOrderRequest createOrderRequest =
            new CFOrderRequest()
                    .orderAmount(1.0)
                    .orderCurrency("INR")
                    .customerDetails(customerDetails);
    public static void main(String[] args) {
        CFPaymentGatewayService apiInstance = new CFPaymentGatewayService();
//        System.out.println("comes here 1");
//        try {
//            System.out.println("comes here 2");
//            ApiResponse<CFOrder> orderCreateResponse =
//                    apiInstance.createOrder(config, headers, createOrderRequest);
//            System.out.println("statusCode:: "+ orderCreateResponse.getStatusCode());
//            System.out.println("data:: "+orderCreateResponse.getData());
//
//        } catch (ApiException e) {
//            System.err.println("Exception when calling OrdersApi#createOrder");
//            System.err.println("Status code: " + e.getCode());
//            System.err.println("Reason: " + e.getResponseBody());
//            System.err.println("Response headers: " + e.getResponseHeaders());
//            e.printStackTrace();
//        }
        String orderIdCard = "order_2749782SBUCMQxFrOxXDjmmgzq1cxNNjI";
        Long paymentIdCard = 2147559048L;
        String orderIdUPI="order_2749782SBp15nEL14tA4tVggm9orvERwm";
        Long paymentIdUPI = 2147560518L;
        String orderIdNB="order_2749782SBqD2Gp0ut4liO9QdSKRtRW0sN";
        Long paymentIdNB = 2147560546L;



//        try {
//            System.out.println("comes here 4");
//            ApiResponse<List<CFPaymentsEntity>> orderCreateResponse =
//                    apiInstance.getPaymentById(config, headers, orderId,paymentId);
//            System.out.println("statusCode4:: "+ orderCreateResponse.getStatusCode());
//            System.out.println("data4:: "+orderCreateResponse.getData());
//
//        } catch (ApiException e) {
//            System.err.println("Exception when calling OrdersApi#createOrder");
//            System.err.println("Status code: " + e.getCode());
//            System.err.println("Reason: " + e.getResponseBody());
//            System.err.println("Response headers: " + e.getResponseHeaders());
//            e.printStackTrace();
//        }
        try {
            System.out.println("comes here 4");
            ApiResponse<CFPaymentsEntity> orderCreateResponse =
                    apiInstance.getPaymentById(config, headers, orderIdNB,paymentIdNB);
            System.out.println("statusCode4:: "+ orderCreateResponse.getStatusCode());
            System.out.println("data4:: "+orderCreateResponse.getData());

        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#createOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
