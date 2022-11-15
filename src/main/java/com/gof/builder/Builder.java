package com.gof.builder;

public interface Builder<T> {
    
    public Builder<T> reset();
    public Builder<T> setAssentos(int quantidade);
    public Builder<T> setMotor(Motor motor);
    public Builder<T> adicionarComputadorBordo();
    public Builder<T> adicionarGPS();
    public Builder<T> adicionarFreioDisco();
    public T build();
    
}
