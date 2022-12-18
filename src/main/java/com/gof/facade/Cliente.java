package com.gof.facade;

public class Cliente {
    
    public static void main(String[] args) {
        
        var facade = new Facade();
        
        System.out.println("Resultado do facade: " + facade.execute());
        
    }
}