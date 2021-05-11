package be.bxl.formation.models;

import be.bxl.formation.Interfaces.IHeros;

public abstract class Heros extends LivingBeing implements IHeros {

    public Heros() {
        super();
        setGold();
        setLeather();
    }

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
