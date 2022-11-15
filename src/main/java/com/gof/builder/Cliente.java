package com.gof.builder;

public class Cliente {
 
    public static void main(String[] args){
    
        Director director = new Director();        
        CarroBuilder builder = new CarroBuilder();
        
        Carro carroLuxo = director.contruirCarroLuxo(builder);
        Carro carroPasseio = director.contruirCarroPasseio(builder);
        
        Carro carroCustomizado 
                = builder
                    .reset()
                    .adicionarComputadorBordo()
                    .setMotor(new MotorPasseio())
                    .build();
        
        System.out.println(">>> Carro Luxo: " + carroLuxo);
        System.out.println(">>> Carro Passeio: " + carroPasseio);
        System.out.println(">>> Carro Customizado: " + carroCustomizado);
    }
}
