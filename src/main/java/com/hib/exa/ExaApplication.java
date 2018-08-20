package com.hib.exa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(value = "com.hib.exa.model")
@ComponentScan("com.hib.exa")
@EnableJpaRepositories(basePackages = "com.hib.exa.repo")
@EnableAsync
public class ExaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExaApplication.class, args);
    }
}
