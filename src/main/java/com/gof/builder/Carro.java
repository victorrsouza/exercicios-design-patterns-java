package com.gof.builder;

public class Carro {

    private final String _descricao;
    
    public Carro(String descricao){
        this._descricao = descricao;
    }

    @Override
    public String toString() {
        return this._descricao;
    }
}
