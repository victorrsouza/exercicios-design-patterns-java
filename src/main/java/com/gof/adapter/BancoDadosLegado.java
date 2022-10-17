package com.gof.adapter;

import java.util.ArrayList;

public class BancoDadosLegado {
    
    private ArrayList<String> _dbLegado = new ArrayList<>();
    
    public boolean inserirOuAtualizar(String valor, String valorAntigo){
        try{
            int index = this._dbLegado.indexOf(valorAntigo);

            if (index > -1) {
                this._dbLegado.set(index, valor);
            } else {
                this._dbLegado.add(valor);
            }   
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public boolean remover(String valor){
        try{                        
            this._dbLegado.remove(valor);
            return true;
        }
        catch(Exception e){
            return false;
        }
        
    }
    
    public ArrayList<String> recuperar() {
        return this._dbLegado;
    }
}
