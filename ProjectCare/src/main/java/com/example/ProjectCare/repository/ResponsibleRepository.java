package com.example.ProjectCare.repository;

import com.example.ProjectCare.model.Responsible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ResponsibleRepository extends JpaRepository <Responsible, Long> {

}
