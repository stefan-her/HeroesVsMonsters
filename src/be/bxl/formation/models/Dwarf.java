package be.bxl.formation.models;

import be.bxl.formation.Interfaces.IHeros;
import be.bxl.formation.Interfaces.IlivingBeing;

public class Dwarf extends Heros implements IlivingBeing, IHeros {

    public Dwarf() {
        super();
        addEnd();
        addFor();
    }

    @Override
    public void addEnd() {
        int v = getEnd() +2;
        setEnd(v);
    }

    @Override
    public void addFor() {}
}
