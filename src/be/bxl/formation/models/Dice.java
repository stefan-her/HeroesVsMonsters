package be.bxl.formation.models;

import java.util.ArrayList;

public class Dice {
    private int nbFace;
    private int result;

    public Dice(int i) {
        setNbFace(i);
        this.result = (int)(Math.random() * nbFace)  + 1;
    }

    public int getResult() {
        return result;
    }

    public void setNbFace(int nbFace) {
        this.nbFace = nbFace;
    }
}
