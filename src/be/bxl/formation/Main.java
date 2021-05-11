package be.bxl.formation;


import be.bxl.formation.models.Forest;

public class Main {

    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.setName("Stormwall");
        forest.addDragonnet();
        forest.addDwarf();
        forest.addHuman();
        forest.addOrk();
        forest.addWolf();
        forest.addWolf();
        forest.addWolf();
        forest.addDragonnet();
        forest.addDragonnet();
        forest.addOrk();
        forest.addHuman();
        forest.loop(10);
    }


}
