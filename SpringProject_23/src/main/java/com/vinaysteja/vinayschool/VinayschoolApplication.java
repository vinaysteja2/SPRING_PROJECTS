package com.vinaysteja.vinayschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
public class VinayschoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(VinayschoolApplication.class, args);
    }

}
