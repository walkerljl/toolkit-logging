/*
 * Copyright (c) 2013 lijunlin All Rights Reserved.
 * 本软件源代码版权归作者所有,未经许可不得任意复制与传播.
 */
package org.walkerljl.toolkit.logging;

/**
 * 日志接口
 *
 * @author lijunlin
 * @since 2014-2-12
 */
public interface Logger {

    /**
     * 输出跟踪信息
     *
     * @param msg 信息内容
     */
    void trace(String msg);

    /**
     * 输出跟踪信息
     *
     * @param e 异常信息
     */
    void trace(Throwable e);

    /**
     * 输出跟踪信息
     *
     * @param msg 信息内容
     * @param e   异常信息
     */
    void trace(String msg, Throwable e);

    /**
     * 输出调试信息
     *
     * @param msg 信息内容
     */
    void debug(String msg);

    /**
     * 输出调试信息
     *
     * @param e 异常信息
     */
    void debug(Throwable e);

    /**
     * 输出调试信息
     *
     * @param msg 信息内容
     * @param e   异常信息
     */
    void debug(String msg, Throwable e);

    /**
     * 输出普通信息
     *
     * @param msg 信息内容
     */
    void info(String msg);

    /**
     * 输出普通信息
     *
     * @param e 异常信息
     */
    void info(Throwable e);

    /**
     * 输出普通信息
     *
     * @param msg 信息内容
     * @param e   异常信息
     */
    void info(String msg, Throwable e);

    /**
     * 输出警告信息
     *
     * @param msg 信息内容
     */
    void warn(String msg);

    /**
     * 输出警告信息
     *
     * @param e 异常信息
     */
    void warn(Throwable e);

    /**
     * 输出警告信息
     *
     * @param msg 信息内容
     * @param e   异常信息
     */
    void warn(String msg, Throwable e);

    /**
     * 输出错误信息
     *
     * @param msg 信息内容
     */
    void error(String msg);

    /**
     * 输出错误信息
     *
     * @param e 异常信息
     */
    void error(Throwable e);

    /**
     * 输出错误信息
     *
     * @param msg 信息内容
     * @param e   异常信息
     */
    void error(String msg, Throwable e);

    /**
     * 跟踪信息是否开启
     *
     * @return 开启：true;关闭：false
     */
    boolean isTraceEnabled();

    /**
     * 调试信息是否开启
     *
     * @return 开启：true;关闭：false
     */
    boolean isDebugEnabled();

    /**
     * 普通信息是否开启
     *
     * @return 开启：true;关闭：false
     */
    boolean isInfoEnabled();

    /**
     * 警告信息是否开启
     *
     * @return 开启：true;关闭：false
     */
    boolean isWarnEnabled();

    /**
     * 错误信息是否开启
     *
     * @return 开启：true;关闭：false
     */
    boolean isErrorEnabled();
}