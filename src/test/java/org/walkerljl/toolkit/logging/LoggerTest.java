package org.walkerljl.toolkit.logging;

import org.junit.Test;

/**
 *
 * @author junlin.ljl
 * @version $Id: LoggerTest.java, v 0.1 2017年06月18日 上午9:54 junlin.ljl Exp $
 */
public class LoggerTest {

    @Test
    public void test() {

        Logger logger = LoggerFactory.getLogger(LoggerTest.class);

        logger.info(String.format("xxx"));
    }

}