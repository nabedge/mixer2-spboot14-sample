package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/")
    public String sample(Model model) {
        model.addAttribute("message", "Hello World !");
        return "index";
    }

}
