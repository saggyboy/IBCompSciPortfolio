package Project2.ElementaryLogicGates;

public class Xand {
    public boolean out;
    private And and = new And();
    private And and2 = new And();
    private Not notA = new Not();
    private Not notB = new Not();
    private Or or = new Or();

    public void compute(boolean a, boolean b){
        notA.compute(a);
        notB.compute(b);
        and.compute(notA.out, notB.out);
        and2.compute(a, b);
        or.compute(and.out, and2.out);
        out = or.out;
    }
}
