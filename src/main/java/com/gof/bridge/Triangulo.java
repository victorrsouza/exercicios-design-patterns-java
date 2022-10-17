package com.gof.bridge;

public class Triangulo extends Forma{

    public Triangulo(Cor cor) {
        super(cor);
    }

    @Override
    public String nome() {
        return "Triangulo";
    }
    
}
