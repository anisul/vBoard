package com.livingoncodes.vboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration 
public class VBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(VBoardApplication.class, args);
    }
}
