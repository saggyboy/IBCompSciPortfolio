package Project2.Adders.Tests;

import Project2.Adders.Add16;
import Project2.Tools.BMath;
import org.junit.Test;

import static org.junit.Assert.*;

public class Add16Test {

    @Test
    public void compute() {
        Add16 add16 = new Add16();

        boolean[] a = BMath.stringToBooleanArray("0000000000000011");
        boolean[] b = BMath.stringToBooleanArray("0000000000000011");
        boolean[] sum = BMath.stringToBooleanArray("0000000000000110");
        add16.compute(a,b);
        assertArrayEquals(sum,add16.sum);

        boolean[] c = BMath.stringToBooleanArray("0000000000010111");
        boolean[] d = BMath.stringToBooleanArray("0000000000001011");
        boolean[] sum2 = BMath.stringToBooleanArray("0000000000100010");

        add16.compute(c,d);
        assertArrayEquals(sum2,add16.sum);

    }
}