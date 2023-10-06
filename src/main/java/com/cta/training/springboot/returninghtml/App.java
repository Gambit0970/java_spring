package com.cta.training.springboot.returninghtml;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This is similar to the "simpleexample" but uses the Controller and RequestMapping combination
 * The RequestMapping can be at a class or method level, here it is at the method
 * It also uses Thymeleaf to provide a HTML response - the html is in the resources/templates folder
 * The name attribute is passed to the html
 */
@SpringBootApplication
@Controller
public class App {



    @RequestMapping(method= RequestMethod.GET, path="/hello")
    public String hello(Model model){
        model.addAttribute("name", "Alice" );
        return "hello";
    }

}
