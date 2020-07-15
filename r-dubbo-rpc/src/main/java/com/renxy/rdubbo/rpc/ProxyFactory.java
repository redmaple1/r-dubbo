package com.renxy.rdubbo.rpc;

import com.renxy.rdubbo.common.URL;

/**
 * proxy factory
 *
 * @author renxiaoya
 * @date 2020-07-13
 **/
public interface ProxyFactory {

    /**
     * create proxy
     * when refer service
     *
     * @param invoker invoker
     * @param <T>     proxy
     * @return proxy
     * @throws RpcException Rpc exception
     */
    <T> T getProxy(Invoker<T> invoker) throws RpcException;

    /**
     * create invoker
     * when expose service
     *
     * @param proxy proxy
     * @param type  proxy type
     * @param url   url
     * @param <T>   invoker generics
     * @return invoker
     * @throws RpcException Rpc exception
     */
    <T> Invoker<T> getInvoker(T proxy, Class<T> type, URL url) throws RpcException;

}
