package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Or;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrTest {

    @Test
    public void compute() {
        Or or1 = new Or();

        or1.compute(true,true);
        assertEquals(true,or1.out);

        or1.compute(true,false);
        assertEquals(true,or1.out);

        or1.compute(false,true);
        assertEquals(true,or1.out);

        or1.compute(false,false);
        assertEquals(false,or1.out);
    }
}