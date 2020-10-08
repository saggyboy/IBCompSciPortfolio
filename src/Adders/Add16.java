package Adders;

import ElementaryLogicGates.And;

public class Add16 {
    public boolean[] sum = new boolean[16];
    private FullAdder[] fullAdders = new FullAdder[15];
    private HalfAdder halfAdder = new HalfAdder();

    public Add16() {
        for (int i = 0; i < 15; i++) {
            fullAdders[i]=new FullAdder();
        }
    }

    public void compute(boolean[] a,boolean[] b){

        halfAdder.compute(a[15],b[15]);
        sum[15]=halfAdder.sum;
        fullAdders[14].compute(a[14],b[14],halfAdder.carry);
        sum[14]=fullAdders[14].sum;
        for (int i = 13; i >=0; i--) {
            fullAdders[i].compute(a[i],b[i],fullAdders[i+1].carry);
            sum[i]=fullAdders[i].sum;
        }

    }
}

