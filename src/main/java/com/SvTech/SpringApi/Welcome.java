package com.SvTech.SpringApi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {


    @GetMapping("/hello")
    public String getPage(){

        return "Welcome To Restaurant Api";
    }
}
