package com.gof.bridge;

public class Quadrado extends Forma{

    public Quadrado(Cor cor) {
        super(cor);
    }

    @Override
    public String nome() {
        return "Quadrado";
    }
    
}
