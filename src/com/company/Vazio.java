package com.company;

public class Vazio implements Estado{

    private Carrinho carrinho;

    public Vazio(Carrinho carrinho) {
        this.carrinho = carrinho;
        carrinho.esvaziarCarrinho();
    }

    @Override
    public void adicionarProduto(String produto) {
        carrinho.setEstado(new Carregando(carrinho));
        carrinho.setListaProdutos(produto);
        System.out.println("Produto " + produto + "adicionado.");
    }

    @Override
    public void retornar() {
        System.out.println("Já está vazio");
    }

    @Override
    public void cancelar() {
        System.out.println("Está vazio, não pode cancelar");
    }

    @Override
    public void proximoEstado() {
        carrinho.setEstado(new Carregando(carrinho));
    }
}
