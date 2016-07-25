package com.sant.FSD.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorld {

	@RequestMapping("/helloworld")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello World!");
        return "helloWorld";
    }
}
