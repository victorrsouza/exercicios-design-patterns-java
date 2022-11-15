package com.gof.bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BridgeTests {
    
    private Forma _sut;
        
    @Test
    public void deve_desenhar_quadrado_amarelo_com_sucesso(){        
        //Given / Arrange
        Cor cor = new Amarelo();
        _sut = new Quadrado(cor);
        String expected = "Quadrado Amarelo";
        
        //When / Act
        String result = _sut.desenhar();
        
        //Then / Assert
        assertEquals(expected, result);
    }
    
    @Test
    public void deve_desenhar_quadrado_vermelho_com_sucesso(){        
        //Given
        Cor cor = new Vermelho();
        _sut = new Quadrado(cor);
        String expected = "Quadrado Vermelho";
        
        //When
        String result = _sut.desenhar();
        
        //Then
        assertEquals(expected, result);
    }
    
    @Test
    public void deve_desenhar_triangulo_amarelo_com_sucesso(){        
        //Given
        Cor cor = new Amarelo();
        _sut = new Triangulo(cor);
        String expected = "Triangulo Amarelo";
        
        //When
        String result = _sut.desenhar();
        
        //Then
        assertEquals(expected, result);
    }
    
    @Test
    public void deve_desenhar_triangulo_vermelho(){        
        //Given
        Cor cor = new Vermelho();
        _sut = new Triangulo(cor);
        String expected = "Triangulo Vermelho";
        
        //When
        String result = _sut.desenhar();
        
        //Then
        assertEquals(expected, result);
    }
    
}
