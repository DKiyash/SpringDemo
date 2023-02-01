package de.telran.springdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static String greetValue = "World";

    @GetMapping("/greet")
    public String greet(){
        return "Hello " + greetValue;
    }

    @GetMapping("/setgreet/{val}")
    public void setGreetValue(@PathVariable("val") String value) {
        greetValue = value;
    }


}
