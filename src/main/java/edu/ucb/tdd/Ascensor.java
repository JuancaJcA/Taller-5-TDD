package edu.ucb.tdd;
import java.util.Random;

public class Ascensor {
    private int currentPiso = 1;
    //Puerta abierta = true, puerta cerrada = false.
    private boolean puerta = false;
    //Botón apretado = true, botón sin apretar = false.
    private boolean botonLlamada = false;
    //Alternancia del ascensor subida = true, bajada = false.
    private boolean alternancia = false;
    //Botón que indica el piso objetivo donde quiere ir el usuario.
    private int pisoObjetivo;

    private final int PISOMAX = 3;
    private final int PISOMIN = 1;

    public int getCurrentPiso() {
        return currentPiso;
    }

    public void setCurrentPiso(int currentPiso) {
        this.currentPiso = currentPiso;
    }

    public boolean getPuerta() {
        return puerta;
    }

    public void setPuerta(boolean puerta) {
        this.puerta = puerta;
    }

    public int getPisoObjetivo() {
        return pisoObjetivo;
    }

    public void setPisoObjetivo(int pisoObjetivo) {
        this.pisoObjetivo = pisoObjetivo;
    }
    
    public boolean verificarEstadoInicial(){
        if(currentPiso == 1 && puerta == false){
            return true;
        }
        return false;
    }

    public boolean alternancia(){
        return alternancia;
    }

    public Persona crearPersona() throws Exception{
        Random rand = new Random();
        int n = rand.nextInt(PISOMAX) + 1;
        return new Persona(n);
    }

    public void recogerPersona(int pisoActualPersona, int pisoFinal){
        if(pisoActualPersona != currentPiso){
            currentPiso = pisoActualPersona;
        }
        if(pisoActualPersona == currentPiso){
            setPisoObjetivo(pisoFinal);
            setPuerta(true);
        }
    }
}

/**
 * @author juanca - martin
 */