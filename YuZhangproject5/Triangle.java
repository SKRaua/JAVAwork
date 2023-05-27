package YuZhangproject5;

import java.lang.reflect.Constructor;

/**
 * @Author YuZhang
 * @Date 2023/5/27
 * Version 1.0
 */
public class Triangle extends Shape{
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    public  Triangle(String name,double sideOne, double sideTwo, double sideThree) {
        try{
            // a valid triangle can be formed with sideOne, sideTwo, and sideThree,form this triangle.
            if ((sideOne + sideTwo) > sideThree && (sideOne + sideThree) > sideTwo && (sideTwo + sideThree) > sideOne) {
                this.sideOne = sideOne;
                this.sideTwo = sideTwo;
                this.sideThree = sideThree;
            } else {
                throw new InvalidTriangleException("Three sides do not make a triangle.");
            }
        } catch(InvalidTriangleException e){
            e.printStackTrace();// Handle  InvalidTriangleException.
        } catch(Exception e){
            e.printStackTrace(); // handle other exceptions.
        }
    }
    double s;
    public double getSideOne() {
        return sideOne;
    }
    public void setSideOne(double sideOne){
        this.sideOne =sideOne;
    }
    public double getSideTwo() {
        return sideTwo;
    }
    public void setSideTwo(double sideTwo){
        this.sideTwo = sideTwo;
    }
    public double getSideThree() {
        return sideThree;
    }
    public void setSideThree(double sideThree){
        this.sideThree = sideThree;
    }
    //Method rewriting
    public double getArea() {
        s=(sideOne+sideTwo+sideThree)/2;
        return Math.sqrt((s-sideOne)*(s-sideTwo)*(s-sideThree));
    }
    public boolean equals(Object obj) {
        final double TOLERANCE = 0.0001;
        if (!(obj instanceof Triangle)) {
            return false;
        }
        Triangle other = (Triangle) obj;
        return (super.equals(obj)
                && Math.abs(this.sideOne - other.sideOne) < TOLERANCE
                && Math.abs(this.sideTwo - other.sideTwo) < TOLERANCE
                && Math.abs(this.sideThree - other.sideThree) < TOLERANCE
                && super.equals(other)==super.equals(obj)
                );
    }

    public String toString() {
        return getClass().getName() + ":" + this.sideOne+
                getClass().getName() + ":" + this.sideTwo+
                getClass().getName() + ":" + this.sideThree;
    }
}