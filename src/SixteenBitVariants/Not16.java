package SixteenBitVariants;

import ElementaryLogicGates.Not;

public class Not16 {
    public boolean[] out = new boolean[16];
    private Not[] not16 = new Not[16];

    public Not16() {
        for (int i = 0; i < 16; i++) {
            not16[i]=new Not();
        }

    }

    public void compute(boolean[] in){
        for (int i = 0; i <16; i++) {
            not16[i].compute(in[i]);
            out[i]=not16[i].out;
        }

    }
}
