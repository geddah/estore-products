package com.knockoff.product.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( value = {"com.knockoff"})
public class EstoreProductCoreServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstoreProductCoreServiceApplication.class, args);
    }

}
