package be.bxl.formation.Interfaces;

public interface IlivingBeing {

    int[] dice();
    int[] bestResult();
    void hit();
    void putEnd();
    void putFor();
    void putPv();
    int getEnd();
    void setEnd();
    int getFor();
    void setFor();
    int getPV();
    void setPV();
}
