package be.bxl.formation;

import be.bxl.formation.models.Dice;

public class Main {

    public static void main(String[] args) {

        Dice dice = new Dice(6);
        System.out.println(dice.getResult());

    }


}
