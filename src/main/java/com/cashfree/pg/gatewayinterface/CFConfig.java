package com.cashfree.pg.gatewayinterface;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CFConfig {
    public enum CFEnvironment {
        SANDBOX,
        PRODUCTION
    }

    private String ClientId;
    private String ClientSecret;
    private String ApiVersion;
    private Integer Timeout;
    private String Proxy;
    private CFEnvironment Environment;
}
