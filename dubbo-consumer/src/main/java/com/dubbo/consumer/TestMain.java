package com.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class TestMain {
    public static void main(String[] args) throws Exception {

        SpringApplication.run(TestMain.class, args);
        System.out.println("hello start.............");
    }
}
