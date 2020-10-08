package SixteenBitVariants.Tests;

import SixteenBitVariants.Mux16;
import org.junit.Test;

import static org.junit.Assert.*;

public class Mux16Test {

    @Test
    public void compute() {
        Mux16 mux16 = new Mux16();

        boolean[] a = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
        boolean[] b = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
        boolean[] sel = {true,true,true,true,true,true,true,true,false,false,false,false,false,false,false,false};

        mux16.compute(a,b,sel);
        boolean[] expected = {false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true};
        assertArrayEquals(expected,mux16.out);

    }
}