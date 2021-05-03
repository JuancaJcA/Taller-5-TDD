package edu.ucb.tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class AscensorTest {
    
    private Ascensor ascensor;

    @Before
    public void before(){
        ascensor = new Ascensor();
    }

    @Test
    public void verificarPuertasCerradasYPisoInicial(){
        // Preparación de la prueba.
        ascensor = new Ascensor();
        // Lógica de la prueba.
        boolean estadoInicial = ascensor.verificarEstadoInicial();
        // Verificación o Assert.
        assertEquals(true, estadoInicial);
    }

    @Test
    public void verificarEstadoDeAscensorSubidaBajada(){
        // Preparación de la prueba
        ascensor = new Ascensor();
        // Lógica de la prueba
        boolean estadoSubidaBajada = ascensor.verificarEstadoSubidaBajada();
        // Verificación o Assert.
        assertEquals(false, estadoSubidaBajada);
    }
    
}
/**
 * @author juanca - martin
 */