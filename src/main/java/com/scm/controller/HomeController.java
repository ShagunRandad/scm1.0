package com.scm.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("name", "Shagun Randad");
        model.addAttribute("Paragraph", "Hello Shagun Here! ready for new Project");
        return "home";
    }

}
