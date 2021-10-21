package com.switchmarket.Entities;

import com.sun.istack.NotNull;
import com.switchmarket.Enums.productEnum;

import javax.persistence.*;

@Entity
public class Produto {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int idProduct;

    @NotNull
    private productEnum productType;

    @NotNull
    private double valor;

    @NotNull
    private String nomeDono;

    private int idDono;

    public Produto() {
    }

    public Produto(productEnum productType, double valor, String nomeDono, int idDono) {
        this.productType = productType;
        this.valor = valor;
        this.nomeDono = nomeDono;
        this.idDono = idDono;

    }

    public int getIdProduct() {
        return idProduct;
    }


    public productEnum getProductType() {
        return productType;
    }

    public void setProductType(productEnum productType) {
        this.productType = productType;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
}
