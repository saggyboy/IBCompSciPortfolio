package Project2.ElementaryLogicGates;

public class And {
    public boolean out;
    private Nand nand = new Nand();
    private Not not = new Not();

    public void compute(boolean a, boolean b){
        nand.compute(a,b);
        not.compute(nand.out);
        out = not.out;
    }
}
