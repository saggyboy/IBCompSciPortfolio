package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Xand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XandTest {

    @Test
    public void compute() {
        Xand xand1 = new Xand();

        xand1.compute(true,true);
        assertEquals(true,xand1.out);

        xand1.compute(true,false);
        assertEquals(false,xand1.out);

        xand1.compute(false,true);
        assertEquals(false,xand1.out);

        xand1.compute(false,false);
        assertEquals(true,xand1.out);
    }
}