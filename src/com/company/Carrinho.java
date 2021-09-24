package com.company;

import java.util.ArrayList;

public class Carrinho {

    private Estado estado;
    private ArrayList<String> listaProdutos = new ArrayList<>();


    public Carrinho(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<String> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(String produto) {
        this.listaProdutos.add(produto);
    }

    public void esvaziarCarrinho(){
        listaProdutos.clear();
        System.out.println("Carrinho vazio novamente.");
    }

    public void adicionarProduto(String produto){
        estado.adicionarProduto(produto);
    }

    public void retornar(){
        estado.retornar();
    }

    public void cancelar(){
        estado.cancelar();
    }

    public void proximoEstado(){
        estado.proximoEstado();
    }
}
