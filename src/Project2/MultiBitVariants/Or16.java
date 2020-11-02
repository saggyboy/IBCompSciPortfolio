package Project2.MultiBitVariants;

import Project2.ElementaryLogicGates.And;
import Project2.ElementaryLogicGates.Or;

public class Or16 {
    public boolean[] out = new boolean[16];
    Or[] ors = new Or[16];

    public Or16() {
        for (int i = 0; i < 16; i++) {
            ors[i] = new Or();
        }
    }

    public void compute(boolean[] a,boolean[] b){
        for (int i = 0; i < 16; i++) {
            Or curr = ors[i];
            curr.compute(a[i], b[i]);
            out[i] = curr.out;
        }
    }
}
