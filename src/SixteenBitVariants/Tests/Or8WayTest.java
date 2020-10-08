package SixteenBitVariants.Tests;

import SixteenBitVariants.Or8Way;
import org.junit.Test;

import static org.junit.Assert.*;

public class Or8WayTest {

    @Test
    public void compute() {
        Or8Way or8Way = new Or8Way();
        boolean[] test1 = {true, false, false, false, false, false, false, false};
        or8Way.compute(test1);
        assertEquals(true,or8Way.out);

        boolean[] test2 = {false, false, false, false, false, false, false, false};
        or8Way.compute(test2);
        assertEquals(false,or8Way.out);

        boolean[] test3 = {true, true, true, true, true, true, true, true};
        or8Way.compute(test3);
        assertEquals(true,or8Way.out);
    }
}