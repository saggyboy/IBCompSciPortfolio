package Project1.Tests;

import Project1.Code.Point;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceFromOriginTest() {
        Point testPoint = new Point(7,24);
        double actualDistance = testPoint.distanceFromOrigin();
        double expectedDistance = 25;

        assertEquals(expectedDistance,actualDistance,0.0001);
    }
    @Test
    public void distanceFromOriginTest2() {
        Point testPoint = new Point(0,-1);
        double actualDistance = testPoint.distanceFromOrigin();
        double expectedDistance = 1;

        assertEquals(expectedDistance,actualDistance,0.0001);
    }
    @Test
    public void distanceFromOriginTest3() {
        Point testPoint = new Point(-6,-10);
        double actualDistance = testPoint.distanceFromOrigin();
        double expectedDistance = 11.6619;

        assertEquals(expectedDistance,actualDistance,0.0001);
    }
    @Test
    public void distanceFromOriginTest4() {
        Point testPoint = new Point(0,0);
        double actualDistance = testPoint.distanceFromOrigin();
        double expectedDistance = 0;

        assertEquals(expectedDistance,actualDistance,0.0001);
    }

    @Test
    public void getQuadrantTest1() {
        Point testPoint = new Point(1,5);
        String actualQuadrant = testPoint.getQuadrant();
        String expectedQuadrant = "1";

        assertEquals(expectedQuadrant,actualQuadrant);
    }
    @Test
    public void getQuadrantTest2() {
        Point testPoint = new Point(-1,3.21);
        String actualQuadrant = testPoint.getQuadrant();
        String expectedQuadrant = "2";

        assertEquals(expectedQuadrant,actualQuadrant);
    }

    @Test
    public void getQuadrantTest3() {
        Point testPoint = new Point(-4,-5);
        String actualQuadrant = testPoint.getQuadrant();
        String expectedQuadrant = "3";

        assertEquals(expectedQuadrant,actualQuadrant);
    }

    @Test
    public void getQuadrantTest4() {
        Point testPoint = new Point(4,-5);
        String actualQuadrant = testPoint.getQuadrant();
        String expectedQuadrant = "4";

        assertEquals(expectedQuadrant,actualQuadrant);
    }

    @Test
    public void getQuadrantTestAxis1() {
        Point testPoint = new Point(0,-5);
        String actualQuadrant = testPoint.getQuadrant();
        String expectedQuadrant = "Axes";

        assertEquals(expectedQuadrant,actualQuadrant);
    }

    @Test
    public void getQuadrantTestAxis2() {
        Point testPoint = new Point(0,0);
        String actualQuadrant = testPoint.getQuadrant();
        String expectedQuadrant = "Axes";

        assertEquals(expectedQuadrant,actualQuadrant);
    }

}