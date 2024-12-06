package com.mycompany.teladono;

import java.util.ArrayList;
import java.util.List;

public class ListaRestaurantes {
    private String nome;
    private String endereco;
    private List<Produto> produtos; 

    public ListaRestaurantes(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.produtos = new ArrayList<>(); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto); 
    }

    @Override
    public String toString() {
        return nome + " - " + endereco;
    }
}
