package com.msi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sianchen on 3/31/16.
 */
@RestController
public class Hello {
    @RequestMapping("/")
    public String index(){
        return "Hello world";

    }
}
