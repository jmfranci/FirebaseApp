package com.angoapp.firebaseapp;

/**
 * Created by jmfranci on 3/17/2018.
 */

public class Produto {
    String descricao;
    String cor;
    String fabricante;

    public Produto(String descricao, String cor, String fabricante) {
        this.descricao = descricao;
        this.cor = cor;
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
