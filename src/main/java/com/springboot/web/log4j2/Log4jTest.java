package com.springboot.web.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * *log4j测试
 * */
public class Log4jTest {
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
		logger.trace("this is trace");
		logger.error("this is error");
		logger.debug("this is debug");
		logger.info("this is info");
		logger.warn("this is warn");
		logger.fatal("this is fatal");
	}

}
