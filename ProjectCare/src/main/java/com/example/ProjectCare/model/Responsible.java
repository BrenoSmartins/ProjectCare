package com.example.ProjectCare.model;
// Classe do Responsavel que vai colocar os dados do idoso e procurar um cuidador compativel para sua necessidade.

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Responsible {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false, unique = true)
    private String phone;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String password;


    @OneToMany(mappedBy = "responsible", cascade = CascadeType.ALL)
    private List<Elderly> elderlies = new ArrayList<>();

    @OneToMany(mappedBy = "responsible", cascade = CascadeType.ALL)
    private List<Contract> contracts = new ArrayList<>();


    public Responsible() {
    }

    public Responsible(Long id, String name, String cpf, String phone, String email, String password, List<Elderly> elderlies, List<Contract> contracts) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.elderlies = elderlies;
        this.contracts = contracts;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Elderly> getElderlies() {
        return elderlies;
    }

    public void setElderlies(List<Elderly> elderlies) {
        this.elderlies = elderlies;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
