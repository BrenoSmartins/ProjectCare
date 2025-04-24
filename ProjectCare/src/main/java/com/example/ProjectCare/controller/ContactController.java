package com.example.ProjectCare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
@Controller

@RequestMapping("/contact")
public class ContactController {

    @GetMapping
    public String contact(Model model) {
        return "contact/contact";
    }

}

