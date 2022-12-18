package com.gof.singleton;

public final class DatabaseSingleton {
    
    private static DatabaseSingleton INSTANCE;

    private DatabaseSingleton(){}
    
    public static synchronized DatabaseSingleton getInstance(){        
        if (INSTANCE == null){
            INSTANCE = new DatabaseSingleton();
        }
        return INSTANCE;
    }
    
    public void executeQuery(String args){
        //Executa consulta ao banco de dados
    }
    
}
