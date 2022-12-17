package com.gof.decorator;

public class Cliente {
    
    public static void main(String[] args) {
        
        Heroi cavaleiro = new Cavaleiro("Sir James", 150);
        
        cavaleiro = new HeroiElite(cavaleiro);
        cavaleiro = new HeroiLendario(cavaleiro);
        
        System.out.println(">>> Habilidades cavaleiro: " + cavaleiro.retornarHabilidades());
        System.out.println(">>> " + cavaleiro.atacar());
        
        //
        
        Heroi mago = new Mago("Merlin", 10);
        
        mago = new HeroiElite(mago);
        mago = new HeroiLendario(mago);
        
        System.out.println(">>> Habilidades mago: " + mago.retornarHabilidades());
        System.out.println(">>> " + mago.atacar());
    }
}
