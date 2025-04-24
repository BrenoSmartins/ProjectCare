package com.example.ProjectCare.service;

import com.example.ProjectCare.model.Responsible;
import com.example.ProjectCare.repository.ResponsibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ResponsibleService {
    @Autowired
        private ResponsibleRepository responsibleRepository;

    public void save(Responsible responsible) {
        responsibleRepository.save(responsible);
    }
}
