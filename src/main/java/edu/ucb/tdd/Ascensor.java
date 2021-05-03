package edu.ucb.tdd;

public class Ascensor {
    int currentPiso = 1;
    //Puerta abierta = true, puerta cerrada = false
    boolean puerta = false;
    //Botón apretado = true, botón sin apretar = false
    boolean botonLlamada = false;

    public boolean verificarEstadoInicial(){
        if(currentPiso == 1 && puerta == false){
            return true;
        }
        return false;
    }
}
/**
 *
 * @author juanca - martin
 */