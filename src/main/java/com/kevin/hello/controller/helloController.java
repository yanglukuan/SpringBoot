package com.kevin.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kevin on 2017/9/24.
 */
@RestController
public class helloController {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

}
