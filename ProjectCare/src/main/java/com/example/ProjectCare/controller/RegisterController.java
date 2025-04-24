package com.example.ProjectCare.controller;

import com.example.ProjectCare.model.Caregiver;
import com.example.ProjectCare.model.Responsible;
import com.example.ProjectCare.service.CaregiverService;
import com.example.ProjectCare.service.ResponsibleService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private ResponsibleService responsibleService;

    @Autowired
    private CaregiverService caregiverService;

    @GetMapping
    public String register(Model model) {
        return "login/register";
    }

    @PostMapping("/responsible")
    public String registerResponsible(@ModelAttribute Responsible responsible) {
        responsibleService.save(responsible);
        return "redirect:/login";
    }

    @PostMapping("/caregiver")
    public String registerCaregiver(@ModelAttribute Caregiver caregiver) {
        caregiver.setRating(0.0);
        caregiverService.save(caregiver);
        return "redirect:/login";
    }
}
