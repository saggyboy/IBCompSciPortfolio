package Project2.MultiBitVariants.Tests;

import Project2.MultiBitVariants.And16;
import Project2.Tools.BMath;
import org.junit.Test;

import static org.junit.Assert.*;

public class And16GateTest {

    @Test
    public void compute() {
        And16 and16 = new And16();

        boolean[] a = BMath.stringToBooleanArray("11111111111111111");
        boolean[] b = BMath.stringToBooleanArray("00001111111111111");
        and16.compute(a,b);
        boolean[] expected = BMath.stringToBooleanArray("00001111111111111");
        assertArrayEquals(expected,and16.out);

    }
}