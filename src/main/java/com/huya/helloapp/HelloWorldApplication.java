package com.huya.helloapp;

import com.huya.taf.spring.annotation.EnableTafServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author saikei
 * @email lishiji@huya.com
 */
@EnableTafServer
@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}
