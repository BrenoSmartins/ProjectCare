package com.example.ProjectCare.model;
// Classe do idoso para futuro database
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity


public class Elderly {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String name;

        @Column(nullable = false)
        private LocalDate birthdate;

        @Column(nullable = false)
        private String gender;

        @Column(nullable = false)
        private String address;


        @ManyToOne
        @JoinColumn(name = "responsible_id")
        private Responsible responsible;

        public Elderly() {
        }

        public Elderly(Long id, String name, LocalDate birthdate, String gender, String address, Responsible responsible) {
                this.id = id;
                this.name = name;
                this.birthdate = birthdate;
                this.gender = gender;
                this.address = address;
                this.responsible = responsible;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public LocalDate getBirthdate() {
                return birthdate;
        }

        public void setBirthdate(LocalDate birthdate) {
                this.birthdate = birthdate;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public Responsible getResponsible() {
                return responsible;
        }

        public void setResponsible(Responsible responsible) {
                this.responsible = responsible;
        }
}



