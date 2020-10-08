package SixteenBitVariants.Tests;

import SixteenBitVariants.Or16;
import org.junit.Test;

import static org.junit.Assert.*;

public class Or16GateTest {

    @Test
    public void compute() {
        Or16 or16 = new Or16();

        boolean[] a = {false,true,false,true,true,true,true,true,true,true,true,true,false,false,false,false};
        boolean[] b = {false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,false};
        or16.compute(a,b);
        boolean[] expected = {false,true,false,true,true,true,true,true,true,true,true,true,true,true,true,false};
        assertArrayEquals(expected,or16.out);
    }
}