package com.wellison.almoxarifado.model;


import jakarta.persistence.*;

@Entity // Transforma a classe funcionário em um entidade do banco de dados
public class Funcionario {

    @Id // Define o campo id como uma chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Declaro para o banco de dados gerar minha chave automaticamente
    private Long id;

    private String name;

    @Column(unique = true, nullable = false, length = 11)
    private String cpf;

    @Column(unique = true) // Declaro que o campo e-mail será unico, impedindo que dois funcionários tenha dois email iguais
    private String email;

    private String senha;

    private boolean admin;

    public Funcionario() {}

    public Funcionario(String name, String cpf, String email, String senha, boolean admin) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
