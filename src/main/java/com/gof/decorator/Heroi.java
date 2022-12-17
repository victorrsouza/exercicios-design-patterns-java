package com.gof.decorator;

import java.util.List;

public interface Heroi {
    
    public List<String> retornarHabilidades();    
    public void adicionarForca(int forca);    
    public String atacar();
    
}
