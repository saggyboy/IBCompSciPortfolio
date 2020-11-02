package Project2.MultiBitVariants;


import Project2.ElementaryLogicGates.And;
import Project2.ElementaryLogicGates.Not;
import Project2.ElementaryLogicGates.Or;

public class Not16 {
    public boolean[] out = new boolean[16];
    private Not[] nots = new Not[16];

    public Not16() {
        for (int i = 0; i < 16; i++) {
            nots[i] = new Not();
        }
    }

    public void compute(boolean[] in){
        for (int i = 0; i < 16; i++) {
            Not curr = nots[i];
            curr.compute(in[i]);
            out[i] = curr.out;
        }
    }
}
