package com.cta.training.springboot.simpleexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * A really simple example which just returns a string
 * This is a RestController, a type of controller that Spring knows to map web requests to
 * The RequestMapping provides a specific path to route to
 */
@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

    @RequestMapping("/string")
    String home() {
        return "Hello World!";
    }

}
