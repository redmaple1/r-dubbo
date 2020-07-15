package com.renxy.rdubbo.rpc;

/**
 * Exporter listener
 *
 * @author renxiaoya
 * @date 2020-07-13
 **/
public interface ExporterListener {

    /**
     * when exporter exported
     *
     * @param exporter exporter
     * @throws RpcException Rpc exception
     */
    void exported(Exporter<?> exporter) throws RpcException;

    /**
     * when exporter un exported
     *
     * @param exporter exporter
     */
    void unExported(Exporter<?> exporter);

}
