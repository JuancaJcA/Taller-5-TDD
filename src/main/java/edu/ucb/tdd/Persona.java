package edu.ucb.tdd;


public class Persona {

    int pisoInicial;
    int pisoObjetivo;
    
    //Determina si la persona se encuentra fuera = false o dentro = true del ascensor.
    boolean dentroAscensor = false;

    public Persona(int pisoInicial, int pisoObjetivo) {
        this.pisoInicial = pisoInicial;
        this.pisoObjetivo = pisoObjetivo;
    }
    
    public int getPisoInicial() {
        return pisoInicial;
    }

    public void setPisoInicial(int pisoInicial) {
        this.pisoInicial = pisoInicial;
    }

    public int getPisoObjetivo() {
        return pisoObjetivo;
    }

    public void setPisoObjetivo(int pisoObjetivo) {
        this.pisoObjetivo = pisoObjetivo;
    }

    @Override
    public String toString() {
        return "Persona{" + "pisoInicial=" + pisoInicial + ", pisoObjetivo=" + pisoObjetivo + ", dentroAscensor=" + dentroAscensor + '}';
    }
    
}
/**
 *
 * @author juanca - martin
 */