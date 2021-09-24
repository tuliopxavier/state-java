package com.company;

public class Carregando implements Estado{

    private Carrinho carrinho;

    public Carregando(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public void adicionarProduto(String produto) {
        carrinho.setListaProdutos(produto);
    }

    @Override
    public void retornar() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("Está vazio novamente.");
    }

    @Override
    public void cancelar() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("Cancelado! Está vazio novamente.");
    }

    @Override
    public void proximoEstado() {
        carrinho.setEstado(new Pagando(carrinho));
    }
}
