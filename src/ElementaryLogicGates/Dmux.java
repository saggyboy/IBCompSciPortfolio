package ElementaryLogicGates;

public class Dmux {

    public boolean a;
    public boolean b;

    private And and1=new And();
    private And and2=new And();
    private Not not1=new Not();

    public Dmux() {

    }

    public void compute(boolean in, boolean sel){

        not1.compute(sel);
        and1.compute(in,not1.out);
        a=and1.out;

        and2.compute(in,sel);
        b=and2.out;

    }
}
