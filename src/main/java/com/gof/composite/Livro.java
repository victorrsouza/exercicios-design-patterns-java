package com.gof.composite;

public class Livro extends Produto {

    @Override
    public String nome() {
        return "Livro Padrões de Projeto - GOF";
    }

    @Override
    public int retornarPreco() {
        return 125;
    }
    
}
