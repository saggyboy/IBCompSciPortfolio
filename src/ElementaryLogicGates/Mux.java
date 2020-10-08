package ElementaryLogicGates;

public class Mux {

    public boolean out;

    private And and1;
    private And and2;
    private Or or1;
    private Not not1;

    public Mux() {
        and1 = new And();
        and2 = new And();
        or1 = new Or();
        not1 = new Not();
    }

    public void compute(boolean a, boolean b, boolean sel){

        not1.compute(sel);
        and1.compute(a,not1.out);
        and2.compute(b,sel);
        or1.compute(and1.out,and2.out);
        out=or1.out;
    }
}
