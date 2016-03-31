package com.msi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by sianchen on 3/31/16.
 */

@SpringBootApplication
public class HelloApplication {
    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication
                .run(HelloApplication.class,args);

    }
}
