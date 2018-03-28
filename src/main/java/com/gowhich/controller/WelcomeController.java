package com.gowhich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping("/web/index")
    public String webIndex(Model model) {
        model.addAttribute("title", "Walkerfree");
        return "index";
    }

    @RequestMapping("/web/user")
    public String webUser(Model model) {
        model.addAttribute("title", "Walkerfree");
        model.addAttribute("content", "The FreeMarker Template Page - Walkerfree");
        return "thymeleaf/user";
    }
}
