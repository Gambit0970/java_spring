package com.cta.training.springboot.responsebody;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * This uses a general Controller and a ResponseBody to provide an instance of a Customer
 * The RequestMapping provides class level routing
 * The GetMapping extends the RequestMapping to provide a specific method for a get request against a specific path
 */
@SpringBootApplication
@Controller
@RequestMapping("customers")
public class App {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(App.class).run();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody Customer returnCustomer(@PathVariable int id){
        return findCustomerByID(id);
    }

    private Customer findCustomerByID(int id) {
        return new Customer(1, "Alice", "1 New Street");
    }


}
