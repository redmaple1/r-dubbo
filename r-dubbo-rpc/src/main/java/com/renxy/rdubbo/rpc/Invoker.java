package com.renxy.rdubbo.rpc;

/**
 * Invoker
 *
 * @author renxiaoya
 * @date 2020-07-13
 **/
public interface Invoker<T> {

    /**
     * get service interface
     *
     * @return service interface
     */
    Class<T> getInterface();

}
