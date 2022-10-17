package com.gof.composite;

import java.util.ArrayList;

public class Embalagem extends Componente {
    
    private String _nome = "Embalagem";
    private ArrayList<Componente> _componentes = new ArrayList<>();

    public Embalagem(){ }
    
    public Embalagem(String nome){
        this._nome = nome;
    }
    
    @Override
    public String nome() {
        return this._nome;
    }
    
    @Override
    public int retornarPreco() {
        int total = 5;
        
        for (Componente _componente : this._componentes) {
            total += _componente.retornarPreco();
        }
        
        return total;
    }
    
    public void addComponente(Componente componente){
        this._componentes.add(componente);
    }
    
    public void removeComponente(Componente componente){
        this._componentes.remove(componente);
    }
}