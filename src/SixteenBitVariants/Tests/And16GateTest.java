package SixteenBitVariants.Tests;

import SixteenBitVariants.And16;
import org.junit.Test;

import static org.junit.Assert.*;

public class And16GateTest {

    @Test
    public void compute() {
        And16 and16 = new And16();

        boolean[] a = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
        boolean[] b = {false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true};
        and16.compute(a,b);
        boolean[] expected = {false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true};
        assertArrayEquals(expected,and16.out);

    }
}