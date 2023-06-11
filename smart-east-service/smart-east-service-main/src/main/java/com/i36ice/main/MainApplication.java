package com.i36ice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.i36ice.main","com.i36ice.api","com.i36ice.user"})
public class MainApplication {

    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class);
    }
}
