package Project2.MultiBitVariants;


import Project2.ElementaryLogicGates.Or;

public class Or8Way {
    public boolean out;
    private Or[] ors = new Or[6];
    private Or or7 = new Or();

    public Or8Way() {
        for (int i = 0; i < 6; i++) {
            ors[i] = new Or();
        }
    }

    public void compute(boolean[] in) {
        boolean prev;
        boolean curr;
        boolean[] results1 = new boolean[4];
        for (int i = 0; i < 8; i += 2) {
            prev = in[i];
            curr = in[i + 1];
            ors[i / 2].compute(curr, prev);
            results1[i / 2] = ors[i / 2].out;
        }

        boolean[] results2 = new boolean[2];
        for (int i = 0; i < 4; i += 2) {
            prev = results1[i];
            curr = results1[i + 1];
            ors[i / 2].compute(curr, prev);
            results2[i / 2] = ors[i / 2].out;
        }

        or7.compute(results2[0], results2[1]);
        out = or7.out;
    }


    private void compute2(boolean[] in) {
        Or thing = new Or();
        out = false;
        for (int i = 0; i < in.length; i++) {
            thing.compute(out, in[i]);
            out = thing.out;
       }
    }


}
