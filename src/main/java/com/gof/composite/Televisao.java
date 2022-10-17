package com.gof.composite;

public class Televisao extends Produto {

    @Override
    public String nome() {
        return "TV Samsung 55 polegadas LED";
    }

    @Override
    public int retornarPreco() {
        return 2685;
    }
    
}
