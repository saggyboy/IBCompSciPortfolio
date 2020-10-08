package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Mux;
import org.junit.Test;

import static org.junit.Assert.*;

public class MuxTest {

    @Test
    public void compute() {
        Mux mux1 = new Mux();

        mux1.compute(false,false,false);
        assertEquals(false,mux1.out);

        mux1.compute(false,true,false);
        assertEquals(false,mux1.out);

        mux1.compute(true,false,false);
        assertEquals(true,mux1.out);

        mux1.compute(true,true,false);
        assertEquals(true,mux1.out);

        mux1.compute(false,false,true);
        assertEquals(false,mux1.out);

        mux1.compute(false,true,true);
        assertEquals(true,mux1.out);

        mux1.compute(true,false,true);
        assertEquals(false,mux1.out);

        mux1.compute(true,true,true);
        assertEquals(true,mux1.out);

    }
}