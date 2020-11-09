package Project2.Adders;

import Project2.ElementaryLogicGates.And;
import Project2.ElementaryLogicGates.Xor;

public class HalfAdder {
    public boolean sum, carry;
    private And and = new And();
    private Xor xor = new Xor();

    public void compute(boolean a, boolean b){
        and.compute(a,b);
        carry = and.out;

        xor.compute(a,b);
        sum = xor.out;
    }
}
