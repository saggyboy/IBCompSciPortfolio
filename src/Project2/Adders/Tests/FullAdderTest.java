package Project2.Adders.Tests;

import Project2.Adders.FullAdder;
import org.junit.Test;

import static org.junit.Assert.*;

public class FullAdderTest {

    @Test
    public void compute() {
        FullAdder fullAdder = new FullAdder();
        fullAdder.compute(false, false, false);
        assertEquals(false, fullAdder.carry);
        assertEquals(false, fullAdder.sum);

        fullAdder.compute(false, false, true);
        assertEquals(false, fullAdder.carry);
        assertEquals(true, fullAdder.sum);

        fullAdder.compute(false, true, false);
        assertEquals(false, fullAdder.carry);
        assertEquals(true, fullAdder.sum);

        fullAdder.compute(false, true, true);
        assertEquals(true, fullAdder.carry);
        assertEquals(false, fullAdder.sum);

        fullAdder.compute(true, false, false);
        assertEquals(false, fullAdder.carry);
        assertEquals(true, fullAdder.sum);

        fullAdder.compute(true, false, true);
        assertEquals(true, fullAdder.carry);
        assertEquals(false, fullAdder.sum);

        fullAdder.compute(true, true, false);
        assertEquals(true, fullAdder.carry);
        assertEquals(false, fullAdder.sum);

        fullAdder.compute(true, true, true);
        assertEquals(true, fullAdder.carry);
        assertEquals(true, fullAdder.sum);


    }
}