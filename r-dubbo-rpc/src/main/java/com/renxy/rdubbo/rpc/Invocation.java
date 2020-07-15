package com.renxy.rdubbo.rpc;

/**
 * Invocation
 *
 * @author renxiaoya
 * @date 2020-07-13
 **/
public interface Invocation {

    /**
     * get method name
     *
     * @return method name
     */
    String getMethodName();

    /**
     * get parameter types
     *
     * @return parameter types
     */
    Class<?>[] getParameterTypes();

    /**
     * get arguments
     *
     * @return arguments
     */
    Object[] getArguments();

    /**
     * get the invoker in current context
     *
     * @return invoker
     */
    Invoker<?> getInvoker();
}
