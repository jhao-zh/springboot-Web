package com.springboot.web.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * *spring-boot-starter-jdbc主要提供了三个功能：
 * *第一个就是对数据源的装配
 * *第二个就是提供一个JdbcTemplate简化使用
 * *第三个就是事务
 */

@SpringBootApplication
//继承CommandLineRunner接口，重写run() 监听方法
public class JDBCApplication implements CommandLineRunner {
	// 日志工具
	private static final Logger log = LoggerFactory.getLogger(JDBCApplication.class);
	
	// 数据连接池
	@Autowired
	DataSource dataSource;
	
	//启动类
	public static void main(String[] args) throws Exception {
		SpringApplication.run(JDBCApplication.class, args);
	}

	@Override
	//监听服务的启动，启动后调用showConnection()方法
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(">>>>>>>>>>>>>>>>服务启动");
		showConnection();
	}
	
	
	public void showConnection() throws SQLException {
		//打印当前的DataSource的实现类
		log.error("dataSource{}", dataSource.getClass().getName());
		//创建连接池连接
		Connection connection = dataSource.getConnection();
		//打印该连接的基本信息
		log.error("connection:{}", connection.toString());
	}
}
