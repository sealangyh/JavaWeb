package com.peipeihh.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String Welcome(ModelMap model) {
        
        System.out.println("debug: HelloController.Welcome()");
        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello";

    }
    
}
