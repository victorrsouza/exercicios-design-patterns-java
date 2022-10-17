package com.gof.bridge;

public class Cliente {
 
    public static void main(String[] args){
    
        Cor cor = new Amarelo();        
        Forma forma = new Quadrado(cor);
        
        System.out.println(">>> Forma/Cor: " + forma.desenhar());
    }
}
