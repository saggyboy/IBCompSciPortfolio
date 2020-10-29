package Project2.ElementaryLogicGates;

public class Xor {
    public boolean out;
    private Not notA = new Not();
    private Not notB = new Not();
    private And and = new And();
    private And and2 = new And();
    private Or or = new Or();
    private Not not = new Not();

    public void compute(boolean a, boolean b){
        and.compute(a,b);
        notA.compute(a);
        notB.compute(b);
        and2.compute(notA.out, notB.out);
        or.compute(and.out, and2.out);
        not.compute(or.out);
        out = not.out;
    }
}
