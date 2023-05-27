package XinYangZhouProject05;

/**
 * An abstract class that defines a Shape object.
 * 
 * @author Xinyang Zhou
 * @version 1.0
 */
public abstract class Shape {

    /**
     * The name of this shape.
     */
    private String name;

    /**
     * Creates a Shape instance with a default name.
     */
    public Shape() {
        this("Shape");
    }

    /**
     * Given a name, creates a Shape instance with the name.
     * 
     * @param name The name of the shape
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Retrieves the name of this shape.
     * 
     * @return The name of the shape
     */
    public String getName() {
        return this.name;
    }

    /**
     * Given a name, changes the name of this shape to the new name.
     * 
     * @param name The name of the shape
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the area of this shape.
     * 
     * @return The area of the shape
     */
    public abstract double area();

    /**
     * Indicates if this shape is equal to some other object.
     * 
     * @param obj A reference to some other object
     * @return A boolean value specifying if this shape is equal to some other
     *         object
     */
    public boolean equals(Object obj) {
        // If the other object is not a shape,return false.
        if (!(obj instanceof Shape)) {
            return false;
        }

        Shape other = (Shape) obj;
        // Compare two shapes.
        return this.name.equals(other.name);
    }

    /**
     * Returns a string representation of this shape. The string consists of
     * - the type of this object
     * - the instance variable value(s) of this object.
     * 
     * @return A string representation of this shape
     */
    public String toString() {
        return (this.getClass().getSimpleName() + ": " + name);
    }
}
