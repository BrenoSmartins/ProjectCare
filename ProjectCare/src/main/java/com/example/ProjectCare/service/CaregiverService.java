package com.example.ProjectCare.service;

import com.example.ProjectCare.model.Caregiver;
import com.example.ProjectCare.repository.CaregiverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CaregiverService {
    @Autowired
        private CaregiverRepository caregiverRepository;

    public void save(Caregiver caregiver) {
        caregiverRepository.save(caregiver);

    }
}
