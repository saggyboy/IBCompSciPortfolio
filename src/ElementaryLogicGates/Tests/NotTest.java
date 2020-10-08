package ElementaryLogicGates.Tests;

import ElementaryLogicGates.Not;
import org.junit.Test;

import static org.junit.Assert.*;

public class NotTest {


    @Test
    public void compute() {
        Not not1 = new Not();

        not1.compute(true);
        assertEquals(false,not1.out);

        not1.compute(true);
        assertEquals(false,not1.out);
    }
}