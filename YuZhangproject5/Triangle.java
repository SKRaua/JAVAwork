package YuZhangproject5;

/**
 * @Author YuZhang
 * @Date 2023/5/27
 *       Version 1.0
 */
public class Triangle extends Shape {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        try {
            // a valid triangle can be formed with sideOne, sideTwo, and sideThree,form this
            // triangle.
            if ((sideOne + sideTwo) > sideThree && (sideOne + sideThree) > sideTwo && (sideTwo + sideThree) > sideOne) {
                this.sideOne = sideOne;
                this.sideTwo = sideTwo;
                this.sideThree = sideThree;
            } else {
                throw new InvalidTriangleException("Three sides do not make a triangle.");
            }
        } catch (InvalidTriangleException e) {
            e.printStackTrace();// Handle InvalidTriangelException.A
        } catch (Exception e) {
            e.printStackTrace(); // handle other exceptions.
        }
    }

    double s;

    public double getsideOne() {
        return sideOne;
    }

    public double getsideTwo() {
        return sideTwo;
    }

    public double getsideThree() {
        return sideThree;
    }

    // 方法的重写
    public double getArea() {
        s = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt((s - sideOne) * (s - sideTwo) * (s - sideThree));
    }
}
