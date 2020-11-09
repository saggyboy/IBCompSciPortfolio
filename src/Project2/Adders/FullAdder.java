package Project2.Adders;

import Project2.ElementaryLogicGates.And;
import Project2.ElementaryLogicGates.Not;
import Project2.ElementaryLogicGates.Or;
import Project2.ElementaryLogicGates.Xor;

public class FullAdder {
    public boolean sum, carry;
    private Xor xorSum = new Xor();
    private Xor xorAB = new Xor();
    private And andCarry1 = new And();
    private And andCarry2 = new And();
    private Or orCarry = new Or();
    private Or orAB = new Or();

    public void compute(boolean a, boolean b, boolean c){
        xorAB.compute(a,b);
        xorSum.compute(xorAB.out, c);
        sum = xorSum.out;

        orAB.compute(a,b);
        andCarry1.compute(orAB.out,c);
        andCarry2.compute(a,b);
        orCarry.compute(andCarry1.out, andCarry2.out);
        carry = orCarry.out;
    }
}
