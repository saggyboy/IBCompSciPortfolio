package Project2.MultiBitVariants;


import Project2.ElementaryLogicGates.Or;

public class Or8Way {
    public boolean out;
    private Or[] ors = new Or[4];
    private Or or5 = new Or();
    private Or or6 = new Or();
    private Or or7 = new Or();

    public Or8Way(){
        for (int i = 0; i < 4; i++) {
            ors[i] = new Or();
        }
    }

    public void compute(boolean[] in){
        boolean[] result1 = new boolean[4];
        for (int i = 0; i < 3; i++) {
            boolean prev = in[i];
            boolean curr = in[i+1];
            ors[i].compute(curr, prev);
            result1[i] = ors[i].out;
        }
        or5.compute(result1[0], result1[1]);
        or6.compute(result1[2],result1[3]);
        or7.compute(or5.out, or6.out);
        out = or7.out;
    }

}
