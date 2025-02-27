package com.wecompany.choongangihwa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/hi")
    public String hi() {

        return "/views/hi";
    }
}
