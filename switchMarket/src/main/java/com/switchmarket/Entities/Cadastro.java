package com.switchmarket.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProduct;

    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    @JsonIgnore
    private String senha;

    @OneToOne (mappedBy = "Cadastro", cascade = CascadeType.REMOVE)
    private List<Usuario> usuario;

    public Cadastro() {
    }

    public Cadastro(int idProduct, String email, String senha, List<Usuario> usuario) {
        this.idProduct = idProduct;
        this.email = email;
        this.senha = senha;
        this.usuario = usuario;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
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

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }
}
