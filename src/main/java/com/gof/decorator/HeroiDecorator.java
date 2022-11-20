package com.gof.decorator;

import java.util.List;

public class HeroiDecorator implements Heroi {

    private final Heroi wrappee;
    
    public HeroiDecorator(Heroi heroi){
        this.wrappee = heroi;
    }

    @Override
    public List<String> retornarHabilidades() {
        return this.wrappee.retornarHabilidades();
    }
    
    @Override
    public void adicionarForca(int forca) {
        this.wrappee.adicionarForca(forca);
    }

    @Override
    public String atacar() {
        return this.wrappee.atacar();
    }

   
    
}
