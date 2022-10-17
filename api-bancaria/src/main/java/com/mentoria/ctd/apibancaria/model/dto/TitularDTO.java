package com.mentoria.ctd.apibancaria.model.dto;

import com.mentoria.ctd.apibancaria.model.EnderecoEntity;

import java.io.Serializable;

public class TitularDTO implements Serializable {

    private Long idTitular;
    private String nome;
    private  String sobrenome;
    private String cpf;
    private EnderecoEntity enderecoEntity;

    public TitularDTO() {
    }

    public TitularDTO(Long idTitular, String nome, String sobrenome, String cpf, EnderecoEntity enderecoEntity) {
        this.idTitular = idTitular;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.enderecoEntity = enderecoEntity;
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

    public EnderecoEntity getEndereco() {
        return enderecoEntity;
    }

    public void setEndereco(EnderecoEntity enderecoEntity) {
        this.enderecoEntity = enderecoEntity;
    }
}
