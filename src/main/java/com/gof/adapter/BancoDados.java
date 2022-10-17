package com.gof.adapter;

import java.util.ArrayList;

public interface BancoDados {
    public void inserir(String valor);
    public void alterar(String valorAntigo, String valorNovo);
    public void excluir(int indice);
    public ArrayList<String> recuperar();    
}
