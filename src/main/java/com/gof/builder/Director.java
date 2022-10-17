package com.gof.builder;

public class Director {
    
    
    public Carro contruirCarroLuxo(CarroBuilder builder){
        
        builder.reset();
        builder.setMotor(new MotorSport());
        builder.setAssentos(6);
        builder.adicionarComputadorBordo();
        builder.adicionarGPS();
        builder.adicionarFreioDisco();
        
        return builder.build();
    }
    
    public Carro contruirCarroPasseio(CarroBuilder builder){
        builder.reset();
        builder.setMotor(new MotorPasseio());
        builder.setAssentos(4);
        
        return builder.build();
    }
}
