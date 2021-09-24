package com.company;

public class Fechado implements Estado {

    private Carrinho carrinho;

    public Fechado(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public void adicionarProduto(String produto) {
        System.out.println("Não aceita novos produtos. Faça uma nova compra.");
    }

    @Override
    public void retornar() {
        System.out.println("Compra finalizada, carrinho fechado. Faça uma nova compra.");
    }

    @Override
    public void cancelar() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("Carrinho vazio novamente.");
    }

    @Override
    public void proximoEstado() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("Carrinho vazio, adicione novos produtos.");
    }
}
