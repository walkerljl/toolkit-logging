/*
 * Copyright (c) 2013 lijunlin All Rights Reserved.
 * 本软件源代码版权归作者所有,未经许可不得任意复制与传播.
 */
package org.walkerljl.toolkit.logging.jcl;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.walkerljl.toolkit.logging.Logger;

/**
 * 适配CommonsLogging，依赖于commons-logging.jar
 * <br/>
 * 有关CommonsLogging详细信息请参阅：<a target="_blank" href="http://www.apache.org/">http://www.apache.org/</a>
 *
 * @author lijunlin
 * @since 2014-2-12
 */
public class JclLogger implements Logger, Serializable {

    private static final long serialVersionUID = 1L;

    private final Log logger;

    public JclLogger(Log logger) {
        this.logger = logger;
    }

    @Override
    public void trace(String msg) {
        this.logger.trace(msg);
    }

    @Override
    public void trace(Throwable e) {
        this.logger.trace(e);
    }

    @Override
    public void trace(String msg, Throwable e) {
        this.logger.trace(msg, e);
    }

    @Override
    public void debug(String msg) {
        this.logger.debug(msg);
    }

    @Override
    public void debug(Throwable e) {
        this.logger.debug(e);
    }

    @Override
    public void debug(String msg, Throwable e) {
        this.logger.debug(msg, e);
    }

    @Override
    public void info(String msg) {
        this.logger.info(msg);
    }

    @Override
    public void info(Throwable e) {
        this.logger.info(e);
    }

    @Override
    public void info(String msg, Throwable e) {
        this.logger.info(msg, e);
    }

    @Override
    public void warn(String msg) {
        this.logger.warn(msg);
    }

    @Override
    public void warn(Throwable e) {
        this.logger.warn(e);
    }

    @Override
    public void warn(String msg, Throwable e) {
        this.logger.warn(msg, e);
    }

    @Override
    public void error(String msg) {
        this.logger.error(msg);
    }

    @Override
    public void error(Throwable e) {
        this.logger.error(e);
    }

    @Override
    public void error(String msg, Throwable e) {
        this.logger.error(msg, e);
    }

    @Override
    public boolean isTraceEnabled() {
        return this.logger.isTraceEnabled();
    }

    @Override
    public boolean isDebugEnabled() {
        return this.logger.isDebugEnabled();
    }

    @Override
    public boolean isInfoEnabled() {
        return this.logger.isInfoEnabled();
    }

    @Override
    public boolean isWarnEnabled() {
        return this.logger.isWarnEnabled();
    }

    @Override
    public boolean isErrorEnabled() {
        return this.logger.isErrorEnabled();
    }
}