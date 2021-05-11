package be.bxl.formation.models;

import be.bxl.formation.Interfaces.IHeroes;
import be.bxl.formation.Interfaces.IlivingBeing;

public class Dwarf extends Heroes implements IlivingBeing, IHeroes {

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

    @Override
    public void restor() {
        putEnd();
        putFor();
        putPv();
        addEnd();
        addFor();
    }
}
