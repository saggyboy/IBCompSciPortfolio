package ElementaryLogicGates;

public class Xor {
    public boolean out;
    private Not not1= new Not();
    private Not not2=new Not();
    private And and1=new And();
    private And and2=new And();
    private Or or1=new Or();

    public Xor() {
    }

    public void compute(boolean a, boolean b){
        not1.compute(a);
        not2.compute(b);
        and1.compute(not1.out,b);
        and2.compute(not2.out,a);
        or1.compute(and1.out,and2.out);
        out= or1.out;
    }
}
