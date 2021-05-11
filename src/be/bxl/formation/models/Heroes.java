package be.bxl.formation.models;

import be.bxl.formation.Interfaces.IHeroes;

public abstract class Heroes extends LivingBeing implements IHeroes {

    public Heroes() {
        super();
        setGold();
        setLeather();
    }

    public abstract void restor();

    @Override
    public void setGold() {
        this.gold = 1;
    }

    @Override
    public void setLeather() {
        this.leather = 1;
    }

    @Override
    public abstract void addEnd();

    @Override
    public abstract void addFor();

}
