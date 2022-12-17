package com.gof.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecoratorTests {
    
    Heroi _sut;
    
    @Test
    public void deve_retornar_quantidade_itens_com_sucesso(){        
        //Given
        _sut = new Mago("Merlin", 10);
        _sut = new HeroiElite(_sut);
        _sut = new HeroiLendario(_sut);
                
        //When
        String result = _sut.atacar();
        
        //Then
        Assertions.assertEquals("INCRÌVEL", result);
    }
    
}