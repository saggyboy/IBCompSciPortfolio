package Project2.ElementaryLogicGates;

public class Nand {
    public boolean out;

    public void compute(boolean inA, boolean inB){
        out = !(inA&inB);
    }
}
