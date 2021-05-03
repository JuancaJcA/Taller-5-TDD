package edu.ucb.tdd;

public class Ascensor {
    int currentPiso = 1;
    //Puerta abierta = true, puerta cerrada = false.
    boolean puerta = false;
    //Botón apretado = true, botón sin apretar = false.
    boolean botonLlamada = false;
    //Alternancia del ascensor subida = true, bajada = false.
    boolean alternancia = false;
    //Botón que indica el piso objetivo donde quiere ir el usuario.
    int pisoObjetivo = false;

    public boolean verificarEstadoInicial(){
        if(currentPiso == 1 && puerta == false){
            return true;
        }
        return false;
    }

    public boolean alternancia(){
        return alternancia;
    }

}
/**
 *
 * @author juanca - martin
 */