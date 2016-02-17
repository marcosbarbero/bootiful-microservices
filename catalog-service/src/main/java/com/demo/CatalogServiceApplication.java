package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;

/**
 * Dummie catalog service.
 *
 * @author Marcos Barbero
 */
@RestController
@SpringBootApplication
public class CatalogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalogServiceApplication.class, args);
    }

    @RequestMapping("/products")
    public Collection<String> products() {
        return Arrays.asList("Tênis Rainha Udaka,100% Whey Gold Standard,Bola Nike team training,Tênis Everlast Running".split(","));
    }
}