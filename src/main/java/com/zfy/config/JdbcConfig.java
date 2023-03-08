package com.zfy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    //value都可以放到property文件中读取，在此我没做
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://127.0.0.1:3306/world?useSSL=false")
    private String url;
    @Value("root")
    private String userName;
    @Value("20010918")
    private String password;


    @Bean("dataSource")
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
