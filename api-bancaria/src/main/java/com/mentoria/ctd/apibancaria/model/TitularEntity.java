package com.mentoria.ctd.apibancaria.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class TitularEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String sobrenome;
    @NotNull
    private String cpf;
    @OneToOne
    @JoinColumn(name = "idEndereco", referencedColumnName ="idEndereco" )
    private EnderecoEntity enderecoEntity;

    public TitularEntity() {
    }

    public TitularEntity(Long id, String nome, String sobrenome, String cpf, EnderecoEntity enderecoEntity) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.enderecoEntity = enderecoEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
