package com.springboot.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//返回控制类
public class InitController {

	private static final Logger log = LoggerFactory.getLogger(InitController.class);

	@RequestMapping("/")//拦截页面
	public String hello() {
		log.error("this is log4j test");//日志控制台输出
		return "<h1>Hello World</h1>";//返回页面的显示
	}
}
