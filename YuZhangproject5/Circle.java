package YuZhangproject5;

/**
 * @Author YuZhang
 * @Date 2023/5/27
 *       Version 1.0
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Constructs a default circle.
     */
    public Circle() {
        super("Circle");
        this.radius = 1.0;
    }

    /**
     * Constructs a circle with a specific radius.
     * 
     * @param radius THe radius of this circle
     */
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getCircle() {
        return radius;
    }

    public void setCircle(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the area of this circle.
     * 
     * @return The area of this circle
     */
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public boolean equals(Object obj) {
        final double TOLERANCE = 0.0001;
        if (!(obj instanceof Circle)) {
            return false;
        }
        Circle other = (Circle) obj;
        return (super.equals(obj)
                && Math.abs(this.radius - other.radius) < TOLERANCE);
    }
}