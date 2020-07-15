package com.renxy.rdubbo.rpc;

/**
 * Result
 *
 * @author renxiaoya
 * @date 2020-07-13
 **/
public interface Result {

    /**
     * get invoke result
     *
     * @return result. If no result return null
     */
    Object getValue();

    /**
     * get exception
     *
     * @return exception. If no exception return null
     */
    Throwable getException();

    /**
     * has exception
     *
     * @return has exception
     */
    boolean hasException();

    /**
     * recreate
     *
     * @return result
     * @throws Throwable if has exception throw it
     */
    Object recreate() throws Throwable;

}
