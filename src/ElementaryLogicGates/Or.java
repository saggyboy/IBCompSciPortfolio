package ElementaryLogicGates;

public class Or {

    public boolean out;

    private Not not1;
    private Not not2;
    private Nand nand1;


    public Or() {
        not1 = new Not();
        not2 = new Not();
        nand1 = new Nand();

    }

    public void compute(boolean a, boolean b){
        not1.compute(a);
        not2.compute(b);
        nand1.compute(not1.out,not2.out);
        out=nand1.out;
    }

}
