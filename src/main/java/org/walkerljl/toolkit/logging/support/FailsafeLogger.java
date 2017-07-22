/*
 * Copyright (c) 2013 lijunlin All Rights Reserved.
 * 本软件源代码版权归作者所有,未经许可不得任意复制与传播.
 */
package org.walkerljl.toolkit.logging.support;

import org.walkerljl.toolkit.logging.Logger;

/**
 * 日志类
 *
 * @author lijunlin
 * @since 2014-2-12
 */
public class FailsafeLogger implements Logger {

    private Logger logger;

    public FailsafeLogger(Logger logger) {
        this.logger = logger;
    }

    public Logger getLogger() {
        return this.logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    private String appendContextMessage(String msg) {
        //		StringBuilder sb = new StringBuilder();
        //			sb.append(" [JARVIS] ").append(msg).append(", jarvis version: ").append(Version.getVersion());
        //			sb.append(", current host: ").append(NetUtils.getLogHost());
        //		return sb.toString();
        return msg;
    }

    @Override
    public void trace(String msg) {
        try {
            this.logger.trace(appendContextMessage(msg));
        } catch (Throwable e) {
        }
    }

    @Override
    public void trace(Throwable e) {
        try {
            this.logger.trace(e);
        } catch (Throwable ex) {
        }
    }

    @Override
    public void trace(String msg, Throwable e) {
        try {
            this.logger.trace(appendContextMessage(msg), e);
        } catch (Throwable ex) {
        }
    }

    @Override
    public void debug(String msg) {
        try {
            this.logger.debug(appendContextMessage(msg));
        } catch (Exception e) {
        }
    }

    @Override
    public void debug(Throwable e) {
        try {
            this.logger.debug(e);
        } catch (Exception ex) {
        }
    }

    @Override
    public void debug(String msg, Throwable e) {
        try {
            this.logger.debug(appendContextMessage(msg), e);
        } catch (Exception ex) {
        }
    }

    @Override
    public void info(String msg) {
        try {
            this.logger.info(appendContextMessage(msg));
        } catch (Exception e) {
        }
    }

    @Override
    public void info(Throwable e) {
        try {
            this.logger.info(e);
        } catch (Exception ex) {
        }
    }

    @Override
    public void info(String msg, Throwable e) {
        try {
            this.logger.info(appendContextMessage(msg), e);
        } catch (Exception ex) {
        }
    }

    @Override
    public void warn(String msg) {
        try {
            this.logger.warn(appendContextMessage(msg));
        } catch (Exception e) {
        }
    }

    @Override
    public void warn(Throwable e) {
        try {
            this.logger.warn(e);
        } catch (Exception ex) {
        }
    }

    @Override
    public void warn(String msg, Throwable e) {
        try {
            this.logger.warn(appendContextMessage(msg), e);
        } catch (Exception ex) {
        }
    }

    @Override
    public void error(String msg) {
        try {
            this.logger.error(appendContextMessage(msg));
        } catch (Exception e) {
        }
    }

    @Override
    public void error(Throwable e) {
        try {
            this.logger.error(e);
        } catch (Exception ex) {
        }
    }

    @Override
    public void error(String msg, Throwable e) {
        try {
            this.logger.error(appendContextMessage(msg), e);
        } catch (Exception ex) {
        }
    }

    @Override
    public boolean isTraceEnabled() {
        try {
            return this.logger.isTraceEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean isDebugEnabled() {
        try {
            return this.logger.isDebugEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean isInfoEnabled() {
        try {
            return this.logger.isInfoEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean isWarnEnabled() {
        try {
            return this.logger.isWarnEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean isErrorEnabled() {
        try {
            return this.logger.isErrorEnabled();
        } catch (Exception e) {
            return false;
        }
    }
}