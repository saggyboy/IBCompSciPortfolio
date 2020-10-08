package SixteenBitVariants;

import ElementaryLogicGates.Mux;


public class Mux16 {
    public boolean[] out = new boolean[16];
    private Mux[] mux16 = new Mux[16];

    public Mux16() {
        for (int i = 0; i < 16; i++) {
            mux16[i]=new Mux();
        }
    }

    public void compute(boolean[] a,boolean[] b,boolean[] sel){
        for (int i = 0; i <16; i++) {
            mux16[i].compute(a[i],b[i],sel[i]);
            out[i]=mux16[i].out;
        }

    }
}

