package Project2.ElementaryLogicGates;

public class Not {
    public boolean out;
    private Nand nand = new Nand();

    public void compute(boolean in){
        nand.compute(in,in);
        out = nand.out;
    }

}
