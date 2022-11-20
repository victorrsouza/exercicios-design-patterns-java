package com.gof.decorator;

public class Cliente {
    
    public static void main(String[] args) {
        
        Heroi cavaleiro = new Cavaleiro("Sir James", 150);
        
        cavaleiro = new HeroiLendario(cavaleiro);
        cavaleiro = new HeroiElite(cavaleiro);
        
        System.out.println(">>> Habilidades: " + cavaleiro.retornarHabilidades());
        System.out.println(">>> " + cavaleiro.atacar());
        
    }
}
