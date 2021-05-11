package be.bxl.formation.models;

import be.bxl.formation.Interfaces.IlivingBeing;
import be.bxl.formation.Interfaces.Imonster;

public class Wolf extends Monster implements Imonster, IlivingBeing {

    public Wolf() {
        super();
        setLeather();
    }

    @Override
    public void setGold() {}

    @Override
    public void setLeather() {
        leather = 1;
    }

    @Override
    public void addEnd() {
        int v = getEnd();
        setEnd(v);
    }

    @Override
    public void addFor() {}
}
