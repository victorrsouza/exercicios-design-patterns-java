package com.gof.decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago implements Heroi {

    private final String nome;
    private final List<String> habilidades = new ArrayList<>();
    private int forca;
    
    private final Random random = new Random();
    
    public Mago(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
        
        this.habilidades.add("Curar");
        this.habilidades.add("Resistência a magia");
        this.habilidades.add("Atordoar");
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
