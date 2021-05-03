package edu.ucb.tdd;
import java.util.Random;

public class Persona {

    int pisoInicial;
    int pisoObjetivo;

    final int PISOMAX = 3;
    final int PISOMIN = 1;
    
    //Determina si la persona se encuentra fuera = false o dentro = true del ascensor.
    boolean dentroAscensor = false;

    public Persona(int pisoInicial, int pisoObjetivo) {
        this.pisoInicial = pisoInicial;
        this.pisoObjetivo = pisoObjetivo;
    }
    public Persona(int pisoInicial) throws Exception{
        //Asignación de variables.
        this.pisoInicial = pisoInicial;
        //Asignación de un piso diferente.
        int pisoOb = pisoInicial;
        while(pisoOb == pisoInicial){
            Random rand = new Random();
            pisoOb = rand.nextInt(PISOMAX) + 1;
        }
        if(pisoOb > PISOMAX || pisoOb < PISOMIN){
            throw new Exception("Piso Fuera del Edificio");
        }
        this.pisoObjetivo = pisoOb;
    }

    public void llamarAscensor(Ascensor ascensor){
        ascensor.recogerPersona(pisoInicial, pisoObjetivo);
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
    
}
/**
 * @author juanca - martin
 */