package Project2.Adders.Tests;

import Project2.Adders.HalfAdder;
import org.junit.Test;

import static org.junit.Assert.*;

public class HalfAdderTest {

    @Test
    public void compute() {
        HalfAdder halfAdder = new HalfAdder();
        halfAdder.compute(true, true);
        assertEquals(false, halfAdder.sum);
        assertEquals(true, halfAdder.carry);

        halfAdder.compute(true, false);
        assertEquals(true, halfAdder.sum);
        assertEquals(false, halfAdder.carry);

        halfAdder.compute(false, true);
        assertEquals(true, halfAdder.sum);
        assertEquals(false, halfAdder.carry);

        halfAdder.compute(false, false);
        assertEquals(false, halfAdder.sum);
        assertEquals(false, halfAdder.carry);


    }
}