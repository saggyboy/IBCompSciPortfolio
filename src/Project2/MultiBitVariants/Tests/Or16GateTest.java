package Project2.MultiBitVariants.Tests;

import Project2.MultiBitVariants.Or16;
import Project2.Tools.BMath;
import org.junit.Test;

import static org.junit.Assert.*;

public class Or16GateTest {

    @Test
    public void compute() {
        Or16 or16 = new Or16();

        boolean[] a = BMath.stringToBooleanArray("0101111111110000");
        boolean[] b = BMath.stringToBooleanArray("0000111111111110");
        or16.compute(a,b);
        boolean[] expected = BMath.stringToBooleanArray("0101111111111110");
        assertArrayEquals(expected,or16.out);
    }
}