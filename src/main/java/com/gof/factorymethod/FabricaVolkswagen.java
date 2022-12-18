package com.gof.factorymethod;

public class FabricaVolkswagen implements FabricaCarro{

    @Override
    public Carro criarSUV() {
        return new Taos();
    }
    
}
