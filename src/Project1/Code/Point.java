package Project1.Code;

import java.util.Objects;

public class Point {

    public double x;   //fields
    public double y;

    //constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return Math.abs(point.x- x) < 0.000001 &&
                Math.abs(point.y- y) < 0.000001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    public double distanceFromOrigin(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public String getQuadrant(){
        //x is positive and y is positive
        if (x>0 && y>0){
            return "1";
        }
        else if (x<0 && y>0){
            return "2";
        }
        else if (x<0 && y<0){
            return "3";
        }
        else if (x>0 && y<0){
            return "4";
        }
        else if (x==0 || y==0){
            return "Axes";
        }
        else {
            return null;
        }
    }
}
