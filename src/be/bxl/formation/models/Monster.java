package be.bxl.formation.models;

import be.bxl.formation.Interfaces.Imonster;

public abstract class Monster extends LivingBeing implements Imonster {

    public Monster() {
        super();
    }


    public abstract void setGold();
    public abstract void setLeather();
    public abstract void addEnd();
    public abstract void addFor();

}
