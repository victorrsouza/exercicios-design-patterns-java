package com.gof.decorator;

public class HeroiElite extends HeroiDecorator{
    
    public HeroiElite(Heroi heroi) {        
        super(heroi);
        heroi.adicionarForca(200);
    }
    
    @Override
    public String atacar() {
        return super.atacar() + " INCRÍVEL!!";
    }
    
}
