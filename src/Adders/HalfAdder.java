package Adders;

import ElementaryLogicGates.And;
import ElementaryLogicGates.Xor;

public class HalfAdder {
    public boolean sum;
    public boolean carry;
    private Xor xor1 = new Xor();
    private And and1 = new And();

    public HalfAdder() {
    }

    public void compute(boolean a, boolean b){
        xor1.compute(a,b);
        sum = xor1.out;

        and1.compute(a,b);
        carry = and1.out;

    }

}
