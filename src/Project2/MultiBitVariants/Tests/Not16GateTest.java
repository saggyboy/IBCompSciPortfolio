package Project2.MultiBitVariants.Tests;

import Project2.MultiBitVariants.Not16;
import Project2.Tools.BMath;
import org.junit.Test;

import static org.junit.Assert.*;

public class Not16GateTest {

    @Test
    public void compute() {
        Not16 not16 = new Not16();
        boolean[] input = BMath.stringToBooleanArray("1111111111111111");
        not16.compute(input);
        boolean[] expected = BMath.stringToBooleanArray("0000000000000000");
        assertArrayEquals(expected,not16.out);
    }
}