package com.mycompany.teladono;

public class Comida extends Produto {
    private String tipoCozinha;
    private boolean isVegano;
    private boolean isVegetariano;
    private int tempoPreparo;

    public Comida(String nome, String descricao, double preco, String tipoCozinha, boolean isVegano, boolean isVegetariano, int tempoPreparo) {
        super(nome, descricao, preco);
        this.tipoCozinha = tipoCozinha;
        this.isVegano = isVegano;
        this.isVegetariano = isVegetariano;
        this.tempoPreparo = tempoPreparo;
    }

    public String getTipoCozinha() {
        return tipoCozinha;
    }

    public void setTipoCozinha(String tipoCozinha) {
        this.tipoCozinha = tipoCozinha;
    }

    public boolean isVegano() {
        return isVegano;
    }

    public void setVegano(boolean vegano) {
        isVegano = vegano;
    }

    public boolean isVegetariano() {
        return isVegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        isVegetariano = vegetariano;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    @Override
    public void exibirDetalhesProduto() {
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Tipo de Cozinha: " + tipoCozinha);
        System.out.println("Vegano: " + (isVegano ? "Sim" : "Não"));
        System.out.println("Vegetariano: " + (isVegetariano ? "Sim" : "Não"));
        System.out.println("Tempo de Preparo: " + tempoPreparo + " minutos");
    }
}
