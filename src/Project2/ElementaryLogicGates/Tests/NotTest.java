package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Not;
import org.junit.Test;

import static org.junit.Assert.*;

public class NotTest {


    @Test
    public void compute() {
        Not not1 = new Not();

        not1.compute(true);
        assertEquals(false,not1.out);

        not1.compute(false);
        assertEquals(true,not1.out);
    }
}