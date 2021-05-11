package be.bxl.formation.models;

import be.bxl.formation.Interfaces.IHeroes;

import java.util.ArrayList;

public class Forest {

    private String name;
    private ArrayList<LivingBeing> being;
    private int nbMonster;
    private int nbHeros;

    public Forest() {
        being = new ArrayList<>();
        nbMonster = 0;
        nbHeros = 0;
    }

    public int getNbMonster() {
        return nbMonster;
    }

    public int getNbHeros() {
        return nbHeros;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addHuman() {
        LivingBeing obj = new Human();
        being.add(obj);
        nbHeros++;
    }

    public void addDwarf() {
        LivingBeing obj = new Dwarf();
        being.add(obj);
        nbHeros++;
    }

    public void addOrk() {
        LivingBeing obj = new Ork();
        being.add(obj);
        nbMonster++;
    }

    public void addDragonnet() {
        LivingBeing obj = new Dragonnet();
        being.add(obj);
        nbMonster++;
    }

    public void addWolf() {
        LivingBeing obj = new Wolf();
        being.add(obj);
        nbMonster++;
    }

    // TODO problème de filtration entre Imonstre et IHeroes (demander à Aurélien)
     private LivingBeing searchOpponent(LivingBeing obj) {
        String type = obj.getClass().getSimpleName();

        int i = 0;
        while(i < being.size()) {
            LivingBeing opp = being.get(i);

            if(opp != obj && !opp.isHitDone() && opp.getClass().getSimpleName() != type)  {
                System.out.println(opp.getClass().getSimpleName() + "->" + type);
                return opp;
            }

            i++;
        }
        return null;
    }

    private void clearDeath() {
        for (int i = being.size() -1; i < 0; i--) {
            if(being.get(i).getPV() <= 0) {
                being.remove(i);
            }
        }
    }

    private void resetHitDone() {
        for (int i = 0; i < being.size(); i++) {
            being.get(i).setHitDone(false);
        }
    }

    private void restorHeroes() {
        for (int i = 0; i < being.size(); i++) {
            LivingBeing obj = being.get(i);
            if(obj instanceof Heroes) {
                ((Heroes) obj).restor();
            }
        }
    }

    public void loop(int loop) {
        for (int i = 0; i < loop; i++) {

            clearDeath();
            resetHitDone();

            System.out.println("le jour " + (i+1) + " dans la forêt de " + this.name );
            boolean flag = true;
            for (int j = 0; j < being.size() || flag; j++) {

                LivingBeing el = being.get(j);
                LivingBeing opp = searchOpponent(el);

                if(opp != null) {
                    el.hit(opp);
                    el.setHitDone(true);
                    opp.setHitDone(true);

                    System.out.println("\t--->" + el.getClass().getSimpleName() + " face à un " + opp.getClass().getSimpleName());
                    System.out.println("\t\t->  point de vie de: " + el.getClass().getSimpleName() + " : " + el.getPV());
                    System.out.println("\t\t  Or : " + el.getGold());
                    System.out.println("\t\t  cuir : " + el.getLeather());
                    String status = "vivant";
                    if(el.getPV() <= 0) status = "mort";
                    System.out.println("\t\t  status: " + status);

                    System.out.println("\t->  point de vie de: " + opp.getClass().getSimpleName() + " : " + opp.getPV());
                    System.out.println("\t\t  Or : " + opp.getGold());
                    System.out.println("\t\t  cuir : " + opp.getLeather());
                    status = "vivant";
                    if(opp.getPV() <= 0) status = "mort";
                    System.out.println("\t\t  status: " + status);

                    System.out.println("----------------------------------------------");
                } else {
                    flag = false;
                }
            }
            resetHitDone();
        }
    }
}
