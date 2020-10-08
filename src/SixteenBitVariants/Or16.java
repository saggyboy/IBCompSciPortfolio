package SixteenBitVariants;

import ElementaryLogicGates.Or;

public class Or16 {
    public boolean[] out = new boolean[16];
    private Or[] or16 = new Or[16];

    public Or16() {
        for (int i = 0; i < 16; i++) {
            or16[i]=new Or();
        }
    }

    public void compute(boolean[] a,boolean[] b){
        for (int i = 0; i <16; i++) {
            or16[i].compute(a[i],b[i]);
            out[i]=or16[i].out;
        }

    }
}
