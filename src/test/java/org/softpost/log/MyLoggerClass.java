package org.softpost.log;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created by Sagar on 22-01-2017.
 */
public class MyLoggerClass {


        final static Logger logger = Logger.getLogger(MyLoggerClass.class);

        @Test
        public void test1(){
            //OFF, FATAL, ERROR, WARN, INFO, DEBUG and TRACE
            logger.fatal("Fatal message");
            logger.error("Dump error message");
            logger.warn("Warning message");
            logger.info("Hello - This is info");
            //Below messages will not be logged as we have set the log level as INFO
            logger.debug("Debug message");
            logger.trace("Trace message");
        }



}
