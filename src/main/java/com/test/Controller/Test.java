package com.test.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {


@RequestMapping("/hello")
    public String getDetails(){

         return "Hello world";
    }


}
