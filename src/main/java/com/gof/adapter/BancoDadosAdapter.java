package com.gof.adapter;

import java.util.ArrayList;

public class BancoDadosAdapter implements BancoDados{

    private final BancoDadosLegado _bdLegado;
            
    public BancoDadosAdapter(BancoDadosLegado bdLegado){
        this._bdLegado = bdLegado;
    }
    
    @Override
    public void inserir(String valor) {
        this._bdLegado.inserirOuAtualizar(valor, null);
    }

    @Override
    public void alterar(String valorAntigo, String valorNovo) {
        this._bdLegado.inserirOuAtualizar(valorNovo, valorAntigo);
    }

    @Override
    public void excluir(int indice) {        
        String valor = this._bdLegado.recuperar().get(indice);
        this._bdLegado.remover(valor);
    }

    @Override
    public ArrayList<String> recuperar() {
        return this._bdLegado.recuperar();
    }
    
}
