package com.cashfree.pg.gatewayinterface;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CFError {
    private String Message;
    private String Code;
    private String Type;
}
