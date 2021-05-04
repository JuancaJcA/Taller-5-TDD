package edu.ucb.tdd;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class AscensorTest {
    
    private Ascensor ascensor;
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Before
    public void before(){
        ascensor = new Ascensor();
    }

    @Test
    public void verificarPuertasCerradasYPisoInicial() throws Exception{
        // Preparación de la prueba.
        ascensor = new Ascensor();
        // Lógica de la prueba.
        boolean estadoInicial = ascensor.verificarEstadoInicial();
        // Verificación o Assert.
        assertEquals(true, estadoInicial);
    }

    @Test
    public void verificarEstadoDeAscensorSubidaBajada() throws Exception{
        // Preparación de la prueba
        ascensor = new Ascensor();
        // Lógica de la prueba
        boolean estadoSubidaBajada = ascensor.alternancia();
        // Verificación o Assert.
        assertEquals(false, estadoSubidaBajada);
    }
    
    @Test
    public void crearPersonaColocarPisoYPisoObjetivo() throws Exception{
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
    public void verificarQuePisoObjetivoNoSeaPisoInicial() throws Exception{
        // Preparación de la prueba
        ascensor = new Ascensor();
        // Lógica de la prueba
        Persona persona = ascensor.crearPersona();
        // Verificación o Assert.
        // Se verifica que los pisos no coincidan
        assertNotSame(persona.getPisoInicial(), persona.getPisoObjetivo());
    }

    @Test
    public void verificarMovimientoDelAscensorYPersonaAdentro() throws Exception{
        // Preparación de la prueba
        ascensor = new Ascensor();
        Persona persona = ascensor.crearPersona();
        // Lógica de la prueba
        persona.llamarAscensor(ascensor);
        // Verificación o Assert.
        // Se verifica que el ascensor se movío donde se encuentra la persona.
        assertEquals(ascensor.getCurrentPiso(), persona.getPisoInicial());
        assertEquals(true, ascensor.getPersonaAdentro());
    }

    @Test
    public void verificarPisoObjetivoAscensorConPisoObjetivoPersona() throws Exception{
        // Preparación de la prueba
        ascensor = new Ascensor();
        Persona persona = ascensor.crearPersona();
        // Lógica de la prueba
        persona.llamarAscensor(ascensor);
        // Verificación o Assert.
        // Se verifica que el piso objetivo del ascensor es el mismo que de la persona
        assertEquals(ascensor.getPisoObjetivo(), persona.getPisoObjetivo());

        //Cerrar puerta del ascensor.
        ascensor.setPuerta(false);
    }

    @Test
    public void llevarPersonaAPersonaB() throws Exception{
        // Preparación de la prueba
        ascensor = new Ascensor();
        Persona personaA = ascensor.crearPersona();
        Persona personaB = ascensor.crearPersona();
        // Lógica de la prueba
        //Persona A
        personaA.llamarAscensor(ascensor);
        ascensor.llevarPersona();
        assertEquals(ascensor.getCurrentPiso(), personaA.getPisoObjetivo());
        //Persona B
        personaB.llamarAscensor(ascensor);
        ascensor.llevarPersona();
        assertEquals(ascensor.getCurrentPiso(), personaB.getPisoObjetivo());
    }

    @Test
    public void verificarPuertaCerrada() throws Exception{
        // Preparación de la prueba
        ascensor = new Ascensor();
        Persona persona = ascensor.crearPersona();
        // Lógica de la prueba
        persona.llamarAscensor(ascensor);
        assertEquals(false, ascensor.getPuerta());
    }
}

/**
 * @author juanca - martin
 */