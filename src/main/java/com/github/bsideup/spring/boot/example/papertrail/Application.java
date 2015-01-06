package com.github.bsideup.spring.boot.example.papertrail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @RequestMapping("/")
    public String index() {
        log.warn("I'm so tired to welcome everyone", new Exception(new Exception()));
        return "Hello world!";
    }
}
