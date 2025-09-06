package com.vinaysteja.vinayschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
@EnableJpaRepositories("com.vinaysteja.vinayschool.repository")
@EntityScan("com.vinaysteja.vinayschool.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class VinayschoolApplication {

    public static void main(String[] args) {

        SpringApplication.run(VinayschoolApplication.class, args);
    }

}
