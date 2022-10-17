package com.gof.adapter;

public class Cliente {
    
    public static void main(String[] args){
        
        BancoDadosLegado bdLegado = new BancoDadosLegado();
        BancoDados bd = new BancoDadosAdapter(bdLegado);
        
        bd.inserir("victor");
        bd.inserir("daniel");
        bd.inserir("maycon");
        bd.inserir("joao");
        
        bd.alterar("victor", "victor rios");
        
        bd.excluir(3);
        
        System.out.println(">>> Itens BD: " + bd.recuperar());
    }
    
}