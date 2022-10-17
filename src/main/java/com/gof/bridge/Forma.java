package com.gof.bridge;

public abstract class Forma {
    
    private final Cor _cor;
    
    public Forma(Cor cor){
        this._cor = cor;
    }
    
    public abstract String nome();
    
    public String desenhar(){
        return this.nome() + " " + this._cor.nome();
    }
    
}
