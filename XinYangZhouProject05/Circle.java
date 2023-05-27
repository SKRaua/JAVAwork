package XinYangZhouProject05;

/**
 * A sub class of Shape. It defines a Circle object.
 * 
 * @author Xinyang Zhou
 * @version 1.0
 */
public class Circle extends Shape {
    /**
     * The radius of this circle。
     */
    private double radius;

    /**
     * Creates a default circle instance.
     */
    public Circle() {
        super("Circle");
        this.radius = 1.0;
    }

    /**
     * Given a name and a radius, creates a circle instance with the name and the
     * radius.
     * 
     * @param name   The name of the rectangle
     * @param radius The radius of the rectangle
     */
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    /**
     * Returns the radius of this circle.
     * 
     * @return The radius of this circle
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Given a radius, changes the radius of this circle to the new radius.
     * 
     * @param radius The radius of this circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the area of this circle.
     * 
     * @return The area of this circle
     */
    public double area() {
        // Pi times radius squared.
        return Math.PI * radius * radius;
    }

    /**
     * Compares this circle with some other object.
     *
     * @param obj A reference to some other object
     * @return A boolean value specifying if this circle is equal to some other
     *         object
     */
    public boolean equals(Object obj) {
        // TOLERANCE is used to compare whether two floating point numbers are
        // approximately equal.
        final double TOLERANCE = 0.0001;
        // If the other object is not a circle,return false.
        if (!(obj instanceof Circle)) {
            return false;
        }
        Circle other = (Circle) obj;
        // Compare two circles.
        return (super.equals(obj) && Math.abs(this.radius - other.radius) < TOLERANCE);
    }

    /**
     * Represents this circle as a string literal.
     * 
     * @return A string representation of this circle
     */
    public String toString() {
        return (super.toString() + ", radius: " + radius);
    }
}
