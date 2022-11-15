package com.gof.bridge;

public class Cliente {
 
    public static void main(String[] args){
    
        Cor cor = new Magenta();
        Forma forma = new Estrela(cor);
        
        System.out.println(">>> Forma/Cor: " + forma.desenhar());
    }
}
