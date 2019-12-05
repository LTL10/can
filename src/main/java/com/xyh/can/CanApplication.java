package com.xyh.can;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.xyh.can.mapper")
@SpringBootApplication
public class CanApplication {

    public static void main(String[] args) {
        SpringApplication.run(CanApplication.class, args);
    }

}
