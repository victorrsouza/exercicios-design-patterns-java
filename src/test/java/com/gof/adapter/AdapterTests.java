package com.gof.adapter;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdapterTests {
       
    private BancoDados bd;
    
    @BeforeEach
    public void setUp() {
        BancoDadosLegado bdLegado = new BancoDadosLegado();
        bd = new BancoDadosAdapter(bdLegado);
    }
           
    @Test
    public void deve_inserir_com_sucesso(){        
        //Given
        this.bd.inserir("victor");
        
        //When
        ArrayList<String> registros = this.bd.recuperar();
        
        //Then
        assertEquals(1, registros.size());
        assertEquals("victor", registros.get(0));
    }
    
    @Test
    public void deve_alterar_com_sucesso(){        
        //Given
        this.bd.inserir("victor");
        this.bd.alterar("victor", "victor rios");
        
        //When
        ArrayList<String> registros = this.bd.recuperar();
        
        //Then
        assertEquals(1, registros.size());
        assertEquals("victor rios", registros.get(0));
    }
    
    @Test
    public void deve_excluir_com_sucesso(){        
        //Given
        this.bd.inserir("victor");
        this.bd.inserir("joao");
        this.bd.inserir("jose");        
        
        this.bd.excluir(0);
        
        //When
        ArrayList<String> registros = this.bd.recuperar();
        
        //Then
        assertEquals(2, registros.size());
        assertEquals("joao", registros.get(0));
        assertEquals("jose", registros.get(1));
    }
}
