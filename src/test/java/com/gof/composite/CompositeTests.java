package com.gof.composite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CompositeTests {

    Embalagem _sut = new Embalagem();
    
    @Test
    public void deve_retornar_quantidade_itens_com_sucesso(){        
        //Given
        int expected = 3;
        
        Livro l1 = new Livro();
        Livro l2 = new Livro();
        Livro l3 = new Livro();
        
        _sut.addComponente(l1);
        _sut.addComponente(l2);
        _sut.addComponente(l3);
        
        //When
        int result = _sut.quantidadeItens();
        
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void deve_retornar_preco_do_pedido_com_sucesso(){
        //Given
        int expected = 12815;
        
        Livro l1 = new Livro();
        Geladeira g1 = new Geladeira();
        Televisao v1 = new Televisao();
        
        _sut.addComponente(l1);
        _sut.addComponente(g1);
        _sut.addComponente(v1);
        
        //When
        int result = _sut.retornarPreco();
        
        //Then
        assertEquals(expected, result);
    }
}
