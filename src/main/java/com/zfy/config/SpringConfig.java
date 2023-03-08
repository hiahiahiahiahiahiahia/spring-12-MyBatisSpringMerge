package com.zfy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration//标识配置类
@ComponentScan("com.zfy")//扫描到所有的包
@PropertySource("classpath:jdbc.properties")//加载配置文件
@Import({JdbcConfig.class, MyBatisConfig.class})//导入JdbcConfig文件(在JdbcConfig.java文件中直接写@Configurarion)

public class SpringConfig {
}
