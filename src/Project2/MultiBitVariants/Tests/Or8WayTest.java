package Project2.MultiBitVariants.Tests;

import Project2.MultiBitVariants.Or8Way;
import Project2.Tools.BMath;
import org.junit.Test;

import static org.junit.Assert.*;

public class Or8WayTest {

    @Test
    public void compute() {
        Or8Way or8Way = new Or8Way();
        boolean[] test1 = BMath.stringToBooleanArray("10000000");;
        or8Way.compute(test1);
        assertEquals(true,or8Way.out);

        boolean[] test2 = BMath.stringToBooleanArray("00000000");;
        or8Way.compute(test2);
        assertEquals(false,or8Way.out);

        boolean[] test3 = BMath.stringToBooleanArray("11111111");;
        or8Way.compute(test3);
        assertEquals(true,or8Way.out);
    }
}