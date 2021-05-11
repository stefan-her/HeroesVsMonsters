package be.bxl.formation.models;

import be.bxl.formation.Interfaces.IlivingBeing;
import be.bxl.formation.Interfaces.Imonster;

public class Ork extends Monster implements Imonster, IlivingBeing {

    public Ork() {
        super();
        setGold();
        addFor();
    }

    @Override
    public void setGold() {
        gold = 1;
    }

    @Override
    public void setLeather() {}

    @Override
    public void addEnd() {}

    @Override
    public void addFor() {
        int v = getFor() +1;
        setFor(v);
    }
}
