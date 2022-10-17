package com.gof.composite;

public class Cliente {
    
    public static void main(String[] args){
        
        Embalagem e1 = new Embalagem();
        Produto p1 = new Geladeira();
        e1.addComponente(p1);
                
        Embalagem e2 = new Embalagem();
        Produto p2 = new Televisao();
        e2.addComponente(p2);
        
        Embalagem e3 = new Embalagem();
        Produto p3 = new Livro();
        Produto p4 = new Livro();
        Produto p5 = new Livro();
        e3.addComponente(p3);
        e3.addComponente(p4);
        e3.addComponente(p5);
        
        Embalagem e4 = new Embalagem();
        e4.addComponente(e1);
        e4.addComponente(e2);
        e4.addComponente(e3);
        
        System.out.println(">>> Preço do pedido: " + e4.retornarPreco());
        
    }
    
}
