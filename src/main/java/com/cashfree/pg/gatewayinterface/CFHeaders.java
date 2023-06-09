package com.cashfree.pg.gatewayinterface;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CFHeaders {
    private String RequestID;
    private String IdempotencyKey;
}
