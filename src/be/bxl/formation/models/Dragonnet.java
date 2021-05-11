package be.bxl.formation.models;

import be.bxl.formation.Interfaces.IlivingBeing;
import be.bxl.formation.Interfaces.Imonster;

public class Dragonnet extends Monster implements Imonster, IlivingBeing {

    public Dragonnet() {
        super();
        setGold();
        setLeather();
        addEnd();
    }

    @Override
    public void setGold() {
        gold = 1;
    }

    @Override
    public void setLeather() {
        leather = 1;
    }

    @Override
    public void addEnd() {
        int v = getEnd() +1;
        setEnd(v);
    }

    @Override
    public void addFor() {}
}
