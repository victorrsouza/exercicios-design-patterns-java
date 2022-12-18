package com.gof.factorymethod;

public class FabricaGM implements FabricaCarro{

    @Override
    public Carro criarSUV() {
        return new Equinox();
    }
    
}
