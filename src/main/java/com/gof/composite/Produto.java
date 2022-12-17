package com.gof.composite;

public abstract class Produto implements Componente {

    @Override
    public int quantidadeItens() {
        return 1;
    }
    
}