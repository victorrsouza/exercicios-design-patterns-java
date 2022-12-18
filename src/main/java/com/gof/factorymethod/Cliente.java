package com.gof.factorymethod;

public class Cliente {
    
    public static void main(String[] args) {
        
        var jeepCar = new FabricaJeep().criarSUV();
        var gmCar = new FabricaGM().criarSUV();
        var vwCar = new FabricaVolkswagen().criarSUV();
        
        System.out.println("Info carro JEEP: " + jeepCar.exibirInformacoes());
        System.out.println("Info carro GM: " + gmCar.exibirInformacoes());
        System.out.println("Info carro VW: " + vwCar.exibirInformacoes());
        
    }
}