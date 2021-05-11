package be.bxl.formation.models;

public class Dice {

    final private int MINIMUM = 1;
    final private int MAXIMUM = 6;

    private int nbFace;
    private int result;


    public Dice(int i) {
        setNbFace(i);
        this.result = (int)(Math.random() * nbFace)  + MINIMUM;
    }

    public int getResult() {
        return result;
    }

    public void setNbFace(int nbFace) {
        this.nbFace = nbFace;
    }
}
