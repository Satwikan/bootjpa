package com.example.bootjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class BootjpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootjpaApplication.class, args);
    }

}
