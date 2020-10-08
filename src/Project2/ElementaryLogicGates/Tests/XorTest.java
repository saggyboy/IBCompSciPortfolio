package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Xor;
import org.junit.Test;

import static org.junit.Assert.*;

public class XorTest {

    @Test
    public void compute() {
        Xor xor1 = new Xor();
        xor1.compute(true, true);
        assertEquals(false, xor1.out);

        xor1.compute(true, false);
        assertEquals(true, xor1.out);

        xor1.compute(false, true);
        assertEquals(true, xor1.out);

        xor1.compute(false, false);
        assertEquals(false, xor1.out);

    }
}