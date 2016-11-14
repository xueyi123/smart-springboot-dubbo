package com.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class TestMain {

    public static void main(String[] args) {
        SpringApplication.run(TestMain.class, args);
        System.out.println("start...");
    }
}
