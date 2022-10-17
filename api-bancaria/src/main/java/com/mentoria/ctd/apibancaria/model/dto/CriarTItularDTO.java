package com.mentoria.ctd.apibancaria.model.dto;

import java.io.Serializable;

public class CriarTItularDTO implements Serializable {
    private Long idTitular;
    private String nome;
    private  String sobrenome;
    private String cpf;

    public CriarTItularDTO(Long idTitular, String nome, String sobrenome, String cpf) {
        this.idTitular = idTitular;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public Long getIdTitular() {
        return idTitular;
    }

    public void setIdTitular(Long idTitular) {
        this.idTitular = idTitular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
