/*
 * Copyright (c) 2013 lijunlin All Rights Reserved.
 * 本软件源代码版权归作者所有,未经许可不得任意复制与传播.
 */
package org.walkerljl.toolkit.logging.log4j;

import org.apache.log4j.Level;
import org.walkerljl.toolkit.logging.Logger;
import org.walkerljl.toolkit.logging.support.FailsafeLogger;

/**
 * Log4jLogger
 *
 * @author lijunlin
 * @since 2014-2-12
 */
public class Log4jLogger implements Logger {

    private static final String FQCN = FailsafeLogger.class.getName();

    private final org.apache.log4j.Logger logger;

    public Log4jLogger(org.apache.log4j.Logger logger) {
        this.logger = logger;
    }

    @Override
    public void trace(String msg) {
        logger.log(FQCN, Level.TRACE, msg, null);
    }

    @Override
    public void trace(Throwable e) {
        logger.log(FQCN, Level.TRACE, e == null ? null : e.getMessage(), e);
    }

    @Override
    public void trace(String msg, Throwable e) {
        logger.log(FQCN, Level.TRACE, msg, e);
    }

    @Override
    public void debug(String msg) {
        logger.log(FQCN, Level.DEBUG, msg, null);
    }

    @Override
    public void debug(Throwable e) {
        logger.log(FQCN, Level.DEBUG, e == null ? null : e.getMessage(), e);
    }

    @Override
    public void debug(String msg, Throwable e) {
        logger.log(FQCN, Level.DEBUG, msg, e);
    }

    @Override
    public void info(String msg) {
        logger.log(FQCN, Level.INFO, msg, null);
    }

    @Override
    public void info(Throwable e) {
        logger.log(FQCN, Level.INFO, e == null ? null : e.getMessage(), e);
    }

    @Override
    public void info(String msg, Throwable e) {
        logger.log(FQCN, Level.INFO, msg, e);
    }

    @Override
    public void warn(String msg) {
        logger.log(FQCN, Level.WARN, msg, null);
    }

    @Override
    public void warn(Throwable e) {
        logger.log(FQCN, Level.WARN, e == null ? null : e.getMessage(), e);
    }

    @Override
    public void warn(String msg, Throwable e) {
        logger.log(FQCN, Level.WARN, msg, e);
    }

    @Override
    public void error(String msg) {
        logger.log(FQCN, Level.ERROR, msg, null);
    }

    @Override
    public void error(Throwable e) {
        logger.log(FQCN, Level.ERROR, e == null ? null : e.getMessage(), e);
    }

    @Override
    public void error(String msg, Throwable e) {
        logger.log(FQCN, Level.ERROR, msg, e);
    }

    @Override
    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    @Override
    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    @Override
    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    @Override
    public boolean isWarnEnabled() {
        return logger.isEnabledFor(Level.WARN);
    }

    @Override
    public boolean isErrorEnabled() {
        return logger.isEnabledFor(Level.ERROR);
    }
}