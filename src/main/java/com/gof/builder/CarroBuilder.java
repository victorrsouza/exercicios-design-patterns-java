package com.gof.builder;

public class CarroBuilder implements Builder<Carro> {

    private String _descricao;
    
    @Override
    public CarroBuilder reset() {
        this._descricao = "";
        return this;
    }

    @Override
    public CarroBuilder setAssentos(int quantidade) {
        this._descricao += " " + quantidade + " lugares";
        return this;
    }

    @Override
    public CarroBuilder setMotor(Motor motor) {
        this._descricao += " " + motor;
        return this;
    }

    @Override
    public CarroBuilder adicionarComputadorBordo() {
        this._descricao += " com computador de bordo";
        return this;
    }

    @Override
    public CarroBuilder adicionarGPS() {
        this._descricao += " com GPS";
        return this;
    }

    @Override
    public CarroBuilder adicionarFreioDisco() {
        this._descricao += " com Freio a Disco";
        return this;
    }

    @Override
    public Carro build() {
        Carro carro = new Carro(this._descricao);
        return carro;
    }
    
    
    
}
