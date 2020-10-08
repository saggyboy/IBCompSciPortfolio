package Adders;

import ElementaryLogicGates.And;
import ElementaryLogicGates.Mux;
import ElementaryLogicGates.Not;
import ElementaryLogicGates.Or;

public class FullAdder {

    public boolean sum;
    public boolean carry;

    private HalfAdder halfAdder = new HalfAdder();
    private Not not1 = new Not();
    private Or or1 = new Or();
    private Mux mux1 = new Mux();
    private Mux mux2 = new Mux();


    public void compute(boolean a, boolean b, boolean c){

        halfAdder.compute(b,c);

        or1.compute(b,c);
        mux1.compute(halfAdder.carry,or1.out,a);
        carry = mux1.out;

        not1.compute(halfAdder.sum);
        mux2.compute(halfAdder.sum,not1.out,a);
        sum = mux2.out;
    }
}
