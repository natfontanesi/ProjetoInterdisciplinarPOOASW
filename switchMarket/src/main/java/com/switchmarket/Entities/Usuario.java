package com.switchmarket.Entities;

import com.sun.istack.NotNull;
import com.switchmarket.Enums.estadoEnum;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;

    @NotNull
    private String nome;

    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    private String senha;

    @NotNull
    @Column(unique = true)
    private String cpf;

    @NotNull
    private String cidade;

    @NotNull
    private estadoEnum estado;

    @NotNull
    private String cep;

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha, String cpf, String cidade, String cep) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.cidade = cidade;
        this.cep = cep;
    }


    public int getIdUser() {
        return idUser;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public estadoEnum getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


    @Override
    public String toString(){
        return "Usuario{" +
                "id=" + idUser +
                ", nome= '"+ nome+'\''+
                ", email= " + email + '\''+
                '}';
    }
}
