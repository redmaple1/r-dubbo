package com.renxy.rdubbo.rpc;

/**
 * Invoker listener
 *
 * @author renxiaoya
 * @date 2020-07-13
 **/
public interface InvokerListener {

    /**
     * when the invoker referred
     *
     * @param invoker invoker
     * @throws RpcException Rpc exception
     */
    void referred(Invoker<?> invoker) throws RpcException;

    /**
     * when invoker destroyed
     *
     * @param invoker invoker
     */
    void destroy(Invoker<?> invoker);

}
