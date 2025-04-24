package com.example.ProjectCare.controller;

import com.example.ProjectCare.model.Caregiver;
import com.example.ProjectCare.service.CaregiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/caregivers")
public class CaregiversController {

    @Autowired
    private CaregiverService caregiverService;

    @GetMapping
    public String listCaregivers(Model model) {
        List<Caregiver> caregivers = caregiverService.getAllCaregivers();
        model.addAttribute("caregivers", caregivers);
        return "caregivers/list";
    }
}
