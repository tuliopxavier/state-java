package com.company;

public class Pagando implements Estado{

    private Carrinho carrinho;

    public Pagando(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public void adicionarProduto(String produto) {
        System.out.println("Não aceita mais produtos.");
    }

    @Override
    public void retornar() {
        carrinho.setEstado(new Carregando(carrinho));
    }

    @Override
    public void cancelar() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("Carrinho vazio novamente.");
    }

    @Override
    public void proximoEstado() {
        carrinho.setEstado(new Fechado(carrinho));
        System.out.println("Compra finalizada com sucesso!");
    }
}
