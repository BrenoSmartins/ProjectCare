package com.example.ProjectCare.repository;

import com.example.ProjectCare.model.Caregiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaregiverRepository extends JpaRepository <Caregiver, Long> {


}
