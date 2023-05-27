package XinYangZhouProject05;

/**
 * A sub class of Shape. It defines a Rectangle object.
 * 
 * @author Xinyang Zhou
 * @version 1.0
 */
public class Rectangle extends Shape {
    /**
     * The length of this rectangle
     */
    private double length;
    /**
     * The width of this rectangle
     */
    private double width;

    /**
     * Creates a default rectangle instance.
     */
    public Rectangle() {
        super("Rectangle");
        this.length = 1.0;
        this.width = 1.0;
    }

    /**
     * Given a name, a length, and a width, creates a rectangle instance with the
     * name,the length, and the width.
     * 
     * @param name   The name of the rectangle
     * @param length The length of the rectangle
     * @param width  The width of the rectangle
     */
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    /**
     * Returns the length of this rectangle.
     * 
     * @return The length of this rectangle
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Given a length, changes the length of this rectangle to the new length.
     * 
     * @param length The length of this rectangle
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Returns the width of this rectangle.
     * 
     * @return The width of this rectangle
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Given a width, changes the width of this rectangle to the new width.
     * 
     * @param width The width of this rectangle
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Returns the area of this rectangle.
     * 
     * @return The area of this rectangle
     */
    public double area() {
        // Length multiplied by width.
        return this.length * this.width;
    }

    /**
     * Compares this rectangle with some other object.
     *
     * @param obj A reference to some other object
     * @return A boolean value specifying if this rectangle is equal to some other
     *         object
     */
    public boolean equals(Object obj) {
        // TOLERANCE is used to compare whether two floating point numbers are
        // approximately equal.
        final double TOLERANCE = 0.0001;
        // If the other object is not a rectangle,return false.
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle other = (Rectangle) obj;
        // Compare two rectangles.
        return (super.equals(obj) && Math.abs(this.length - other.length) < TOLERANCE
                && Math.abs(this.width - other.width) < TOLERANCE);
    }

    /**
     * Represents this rectangle as a string literal.
     * 
     * @return A string representation of this rectangle
     */
    public String toString() {
        return (super.toString() + ", length: " + length + " width: " + width);
    }
}
