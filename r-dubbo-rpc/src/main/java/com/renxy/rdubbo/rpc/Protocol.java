package com.renxy.rdubbo.rpc;

import com.renxy.rdubbo.common.URL;

/**
 * Protocol
 *
 * @author renxiaoya
 * @date 2020-07-13
 **/
public interface Protocol {

    /**
     * expose rpc service
     *
     * @param invoker invoker
     * @param <T>     exporter generics
     * @return exporter
     * @throws RpcException Rpc exception
     */
    <T> Exporter<T> export(Invoker<T> invoker) throws RpcException;

    /**
     * refer rpc service
     *
     * @param type service type
     * @param url  service url
     * @param <T>  service generics
     * @return service invoker
     * @throws RpcException Rpc exception
     */
    <T> Invoker<T> refer(Class<T> type, URL url) throws RpcException;

    /**
     * destroy all service which has already exposed and referred
     */
    void destroy();

}
