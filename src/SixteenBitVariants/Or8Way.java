package SixteenBitVariants;

import ElementaryLogicGates.Or;

public class Or8Way {
    public boolean out;
    private Or or1 = new Or();
    private Or or2 = new Or();
    private Or or3 = new Or();
    private Or or4 = new Or();
    private Or or5 = new Or();
    private Or or6 = new Or();
    private Or or7 = new Or();


    public Or8Way(){

    }

    public void compute(boolean[] in){
        or1.compute(in[0],in[1]);
        or2.compute(in[2],in[3]);
        or3.compute(in[4],in[5]);
        or4.compute(in[6],in[7]);
        or5.compute(or1.out, or2.out);
        or6.compute(or3.out, or4.out);
        or7.compute(or5.out, or6.out);
        out= or7.out;
    }

}
