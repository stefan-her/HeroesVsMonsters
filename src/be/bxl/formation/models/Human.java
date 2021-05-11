package be.bxl.formation.models;

import be.bxl.formation.Interfaces.IHeros;
import be.bxl.formation.Interfaces.IlivingBeing;

public class Human extends Heros implements IlivingBeing, IHeros {

    public Human() {
        super();
        addEnd();
        addFor();
    }

    @Override
    public void addEnd() {
        int v = getEnd() +1;
        setEnd(v);
    }

    @Override
    public void addFor() {
        int v = getFor() +1;
        setFor(v);
    }
}
