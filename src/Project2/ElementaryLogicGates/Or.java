package Project2.ElementaryLogicGates;

public class Or {
    public boolean out;
    private Not notA = new Not();
    private Not notB = new Not();
    private Nand nand = new Nand();

    public void compute(boolean a, boolean b){
        notA.compute(a);
        notB.compute(b);
        nand.compute(notA.out, notB.out);
        out = nand.out;
    }
}
