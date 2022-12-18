package com.gof.singleton;

public class Cliente {
    
    public static void main(String[] args) {
        var db1 = DatabaseSingleton.getInstance();
        var db2 = DatabaseSingleton.getInstance();
        
        System.out.println("São a mesma classe? " + db1.equals(db2));
        
    }
}