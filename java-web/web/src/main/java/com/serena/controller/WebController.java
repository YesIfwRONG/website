package com.serena.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping("hello")
    public String hello(){
        return "Hello";
    }
}
