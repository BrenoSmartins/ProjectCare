package com.example.ProjectCare.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;



@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String login(Model model) {
        return "login/login";
    }
}
