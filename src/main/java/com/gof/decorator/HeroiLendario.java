package com.gof.decorator;

import java.util.List;

public class HeroiLendario extends HeroiDecorator {
    
    public HeroiLendario(Heroi heroi) {
        super(heroi);
    }
 
    @Override
    public List<String> retornarHabilidades() {
        List<String> habilidades = super.retornarHabilidades();
        habilidades.add("Invocar os deuses");
        return habilidades;
    }
}
