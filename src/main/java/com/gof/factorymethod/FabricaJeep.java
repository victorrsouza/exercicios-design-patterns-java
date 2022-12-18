package com.gof.factorymethod;

public class FabricaJeep implements FabricaCarro{

    @Override
    public Carro criarSUV() {
        return new Compass();
    }
    
}
