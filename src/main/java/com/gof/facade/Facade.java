package com.gof.facade;

public class Facade {
    
    private final SubsistemaA subsistemaA;
    private final SubsistemaB subsistemaB;
    private final SubsistemaC subsistemaC;
    
    public Facade(){
        subsistemaA = new SubsistemaA();
        subsistemaB = new SubsistemaB();
        subsistemaC = new SubsistemaC();
    }
    
    public String execute(){
        return subsistemaA.executarOperacao() + " " +
                subsistemaB.executarOperacao() +
                subsistemaC.executarOperacao();
    }
    
}
