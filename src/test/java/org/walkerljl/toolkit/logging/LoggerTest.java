package org.walkerljl.toolkit.logging;

import org.junit.Test;

public class LoggerTest {

    @Test
    public void test() {

        Logger logger = LoggerFactory.getLogger(LoggerTest.class);

        logger.info(String.format("xxx"));
    }

}