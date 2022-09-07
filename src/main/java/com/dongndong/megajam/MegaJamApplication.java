package com.dongndong.megajam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MegaJamApplication {

    public static void main(String[] args) {
        SpringApplication.run(MegaJamApplication.class, args);
    }

}