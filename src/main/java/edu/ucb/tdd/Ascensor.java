package edu.ucb.tdd;
import java.util.Random;

public class Ascensor {
    int currentPiso = 1;
    //Puerta abierta = true, puerta cerrada = false.
    boolean puerta = false;
    //Botón apretado = true, botón sin apretar = false.
    boolean botonLlamada = false;
    //Alternancia del ascensor subida = true, bajada = false.
    boolean alternancia = false;
    //Botón que indica el piso objetivo donde quiere ir el usuario.
    int pisoObjetivo;

    public boolean verificarEstadoInicial(){
        if(currentPiso == 1 && puerta == false){
            return true;
        }
        return false;
    }

    public boolean alternancia(){
        return alternancia;
    }

    public Persona crearPersona(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;
        return new Persona(n);
    }
}
/**
 *
 * @author juanca - martin
 */