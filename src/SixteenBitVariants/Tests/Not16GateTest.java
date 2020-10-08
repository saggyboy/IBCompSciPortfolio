package SixteenBitVariants.Tests;

import SixteenBitVariants.Not16;
import org.junit.Test;

import static org.junit.Assert.*;

public class Not16GateTest {

    @Test
    public void compute() {
        Not16 not16 = new Not16();
        boolean[] input = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
        not16.compute(input);
        boolean[] expected = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
        assertArrayEquals(expected,not16.out);
    }
}