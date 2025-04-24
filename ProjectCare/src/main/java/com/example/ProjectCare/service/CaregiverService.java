package com.example.ProjectCare.service;

import com.example.ProjectCare.model.Caregiver;
import com.example.ProjectCare.repository.CaregiverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CaregiverService {
    @Autowired
        private CaregiverRepository caregiverRepository;

    public void save(Caregiver caregiver) {
        caregiverRepository.save(caregiver);

    }
    public List<Caregiver> getAllCaregivers() {
        return caregiverRepository.findAll();
    }
}
