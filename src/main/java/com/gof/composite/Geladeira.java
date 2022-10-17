package com.gof.composite;

public class Geladeira extends Produto {

    @Override
    public String nome() {
        return "Geladeira Brastemp Frost Free 220v";
    }

    @Override
    public int retornarPreco() {
        return 10000;
    }
    
}
