package com.renxy.rdubbo.rpc;

/**
 * Exporter
 *
 * @author renxiaoya
 * @date 2020-07-13
 **/
public interface Exporter<T> {

    /**
     * get invoker
     *
     * @return invoker
     */
    Invoker<T> getInvoker();

    /**
     * un export
     */
    void unExport();

}
