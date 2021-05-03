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
    public void verificarPuertasCerradas(){
        // Preparación de la prueba
        ascensor = new Ascensor();
        // Lógica de la prueba
        boolean estadoInicial = ascensor.verificarEstadoInicial();
        // Verifiación o Assert
        assertEquals(true, estadoPuerta);
    }
    
}
/**
 * @author juanca - martin
 */