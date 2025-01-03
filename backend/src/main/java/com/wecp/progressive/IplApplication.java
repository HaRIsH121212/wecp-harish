package com.wecp.progressive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@RequestMapping("/api")

public class IplApplication
{
    @GetMapping("/hello")
    public String helloIpl() {
        return "Hello IPL Progressive Project";
}
 
    public static void main(String[] args) {
        
        
    }
}



