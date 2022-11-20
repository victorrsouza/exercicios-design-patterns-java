package com.gof.decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cavaleiro implements Heroi {

    private final String nome;
    private final List<String> habilidades = new ArrayList<>();
    private int forca;
    
    private final Random random;
    
    public Cavaleiro(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
        
        this.habilidades.add("Cavalgar");
        this.habilidades.add("Resistência a arma branca");
        this.habilidades.add("Fúria");
        
         this.random = new Random();
    }
    
    
    @Override
    public List<String> retornarHabilidades() {
        return this.habilidades;
    }
    
     @Override
    public void adicionarForca(int forca) {
        this.forca += forca; 
    }

    @Override
    public String atacar() {
        var dano = this.random.nextInt(0, forca);
        return this.nome + " ataca com " + dano + " de força!";
    }

   
    
    
    
}
