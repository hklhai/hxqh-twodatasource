package com.hxqh.twodatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
@ComponentScan(basePackages = "com.hxqh.twodatasource")
public class HxqhTwodatasourceApplication {

    public static void main(String[] args) {

        SpringApplication.run(HxqhTwodatasourceApplication.class, args);
    }


}



