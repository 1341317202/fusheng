package com.nanshan.nanshan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启事务管理
@MapperScan("com.nanshan.nanshan.dao")//与dao层的@Mapper二选一写上即可(主要作用是扫包)
@EnableAspectJAutoProxy
@EnableAutoConfiguration
@EnableScheduling
public class NanshanApplication {

    public static void main(String[] args) {
        SpringApplication.run(NanshanApplication.class, args);
    }
}
