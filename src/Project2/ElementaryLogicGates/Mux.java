package Project2.ElementaryLogicGates;

public class Mux {
    public boolean out;
    private And and = new And();
    private And and2 = new And();
    private Not not = new Not();
    private Or or = new Or();

    public void compute(boolean a, boolean b, boolean sel){
        not.compute(sel);
        and.compute(a, not.out);
        and2.compute(b, sel);
        or.compute(and.out, and2.out);
        out = or.out;
    }
}
