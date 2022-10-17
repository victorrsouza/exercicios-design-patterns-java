package com.gof.builder;

public interface Builder<T> {
    
    public void reset();
    public void setAssentos(int quantidade);
    public void setMotor(Motor motor);
    public void adicionarComputadorBordo();
    public void adicionarGPS();
    public void adicionarFreioDisco();
    public T build();
    
}
