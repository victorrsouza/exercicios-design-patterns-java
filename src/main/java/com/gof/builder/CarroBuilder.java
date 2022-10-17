package com.gof.builder;

public class CarroBuilder implements Builder<Carro> {

    private String _descricao;
    
    @Override
    public void reset() {
        this._descricao = "";
    }

    @Override
    public void setAssentos(int quantidade) {
        this._descricao += " " + quantidade + " lugares";
    }

    @Override
    public void setMotor(Motor motor) {
        this._descricao += " " + motor;
    }

    @Override
    public void adicionarComputadorBordo() {
        this._descricao += " com computador de bordo";
    }

    @Override
    public void adicionarGPS() {
        this._descricao += " com GPS";
    }

    @Override
    public void adicionarFreioDisco() {
        this._descricao += " com Freio a Disco";
    }

    @Override
    public Carro build() {
        Carro carro = new Carro(this._descricao);
        return carro;
    }
    
    
    
}
