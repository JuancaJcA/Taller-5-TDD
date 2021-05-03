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
        boolean estadoSubidaBajada = ascensor.alternancia();
        // Verificación o Assert.
        assertEquals(false, estadoSubidaBajada);
    }
    
    @Test
    public void crearPersonaColocarPisoYPisoObjetivo(){
        // Preparación de la prueba
        ascensor = new Ascensor();
        // Lógica de la prueba
        Persona persona = ascensor.crearPersona();
        // Verificación o Assert.
        // Ser verifica que todos los datos de una persona son diferentes a null
        // Para poder proseguir con su transporte
        assertNotNull(persona);
    }

    @Test
    public void verificarQuePisoObjetivoNoSeaPisoInicial(){
        // Preparación de la prueba
        ascensor = new Ascensor();
        // Lógica de la prueba
        Persona persona = ascensor.crearPersona();
        // Verificación o Assert.
        // Se verifica que los pisos no coincidan
        assertNotSame(persona.pisoInicial, persona.pisoObjetivo);
    }
}
/**
 * @author juanca - martin
 */