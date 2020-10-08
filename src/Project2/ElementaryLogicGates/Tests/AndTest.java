package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.And;
import org.junit.Test;

import static org.junit.Assert.*;

public class AndTest {

    @Test
    public void compute() {
        And and1 = new And();

        and1.compute(true,true);
        assertEquals(true,and1.out);

        and1.compute(true,false);
        assertEquals(false,and1.out);

        and1.compute(false,true);
        assertEquals(false,and1.out);

        and1.compute(false,false);
        assertEquals(false,and1.out);
    }
}