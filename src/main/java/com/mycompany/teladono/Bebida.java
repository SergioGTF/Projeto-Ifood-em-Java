package com.mycompany.teladono;

public class Bebida extends Produto {
    private int tamanhoMl;
    private boolean isAlcoolica;
    private String recipiente;

    public Bebida(String nome, String descricao, double preco, int tamanhoMl, boolean isAlcoolica, String recipiente) {
        super(nome, descricao, preco);
        this.tamanhoMl = tamanhoMl;
        this.isAlcoolica = isAlcoolica;
        this.recipiente = recipiente;
    }

    public int getTamanhoMl() {
        return tamanhoMl;
    }

    public void setTamanhoMl(int tamanhoMl) {
        this.tamanhoMl = tamanhoMl;
    }

    public boolean isAlcoolica() {
        return isAlcoolica;
    }

    public void setAlcoolica(boolean alcoolica) {
        isAlcoolica = alcoolica;
    }

    public String getRecipiente() {
        return recipiente;
    }

    public void setRecipiente(String recipiente) {
        this.recipiente = recipiente;
    }
    
    

    @Override
    public void exibirDetalhesProduto() {
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Tamanho: " + tamanhoMl + " ml");
        System.out.println("Alcoólica: " + (isAlcoolica ? "Sim" : "Não"));
        System.out.println("Recipiente: " + recipiente);
    }
}
