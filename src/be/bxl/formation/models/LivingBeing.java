package be.bxl.formation.models;


import be.bxl.formation.Interfaces.IlivingBeing;

public abstract class LivingBeing implements IlivingBeing {

    private int End; //Endurance
    private int For; // Force
    private int PV; // point de vie
    private boolean hitDone;

    protected int gold;
    protected int leather;

    public LivingBeing() {
        putEnd();
        putFor();
        putPv();
        setHitDone(false);
    }

    private int[] dice(int nbFace, int nbLoop) {
        int i = 0;
        int length = 4;
        int[] result = new int[nbLoop];
        while (i < nbLoop) {
            Dice dice = new Dice(nbFace);
            result[i] = dice.getResult();
            i++;
        }
        return result;
    }

    private int[] bestResult(int[] a, int length) {
        int[] result = new int[length];
        int size = a.length;
        for(int i=0; i < size; i++) {
            for(int j=1; j < (size-i); j++) {
                if(a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }

        if(length > size)
                throw new IllegalArgumentException("taille de sortie plus grande que taille d'entrée");

        int i = size -1;
        int k = 0;
        while(k < length) {
            result[k] = a[i];
            i--;
            k++;
        }

        return result;
    }

    public void putEnd() {
        int[] resultDice = dice(6, 4);
        int[] bestResult = bestResult(resultDice, 3);
        for (int i = 0; i < bestResult.length; i++) {
            setEnd(getEnd() + bestResult[i]);
        }
    }

    public void putFor() {
        int[] resultDice = dice(6, 4);
        int[] bestResult = bestResult(resultDice, 3);
        for (int i = 0; i < bestResult.length; i++) {
            setFor(getFor() + bestResult[i]);
        }
    }

    private int mod(int score) {
        int mod = 2;
        if(score < 15) { mod = 1; }
        else if(score < 10) { mod = 0; }
        else if(score < 5) { mod = -1; }
        return mod;
    }

    public void putPv() {
        int mod = mod(getEnd());
        setPV(getEnd() + mod);
    }

    public int getEnd() {
        return End;
    }

    public void setEnd(int end) {
        End = end;
    }

    public int getFor() {
        return For;
    }

    public void setFor(int aFor) {
        For = aFor;
    }

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public int getGold() {
        return gold;
    }

    public int getLeather() {
        return leather;
    }

    public boolean isHitDone() {
        return hitDone;
    }

    public void setHitDone(boolean hitDone) {
        this.hitDone = hitDone;
    }

    public abstract void setGold();

    public abstract void setLeather();

    public void hit(LivingBeing obj) {
        Dice dice = new Dice(4);
        int result = dice.getResult();
        int damage = mod(getFor()) + result;
        obj.setPV(obj.getPV() - damage);
        if(obj.getPV() <= 0 && obj instanceof Monster) {
            this.gold = obj.getGold();
            this.leather = obj.getLeather();
        }
    }
}
