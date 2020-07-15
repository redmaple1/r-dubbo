package com.renxy.rdubbo.rpc;

/**
 * Rpc exception
 *
 * @author renxiaoya
 * @date 2020-07-13
 **/
public class RpcException extends RuntimeException {
    public RpcException() {
        super();
    }

    public RpcException(String message) {
        super(message);
    }
}
