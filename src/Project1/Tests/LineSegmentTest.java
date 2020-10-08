package Project1.Tests;

import org.junit.Test;
import static org.junit.Assert.*;
import Project1.Code.*;

public class LineSegmentTest {

    @Test
    public void subDivideTest1() {

        Point a = new Point(1,1);
        Point b = new Point(5,5);
        LineSegment lineSegment = new LineSegment(a,b);
        Point[] actual = lineSegment.subDivide(4);
        Point[] expected = new Point[5];
        expected[0]=a;
        expected[1]=new Point(2,2);
        expected[2]=new Point(3,3);
        expected[3]=new Point(4,4);
        expected[4]=b;
        assertArrayEquals(expected,actual);

    }

    @Test
    public void subDivideTest2() {

        Point a = new Point(-3,-5);
        Point b = new Point(4,6);
        LineSegment lineSegment = new LineSegment(a,b);
        Point[] actual = lineSegment.subDivide(3);
        Point[] expected = new Point[4];
        expected[0]=a;
        expected[1]=new Point(-2.0/3,-4.0/3);
        expected[2]=new Point(5.0/3,7.0/3);
        expected[3]=b;
        assertArrayEquals(expected,actual);

    }
}