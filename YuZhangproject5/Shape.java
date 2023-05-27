package YuZhangproject5;

/**
 * @Author YuZhang
 * @Date 2023/5/27
 *       Version 1.0
 */
public abstract class Shape {
    /**
     * Constructs a Shape with a default name.
     */
    private String name;

    /**
     * Returns the area of this shape.
     * 
     * @return The area of this shape
     */
    public Shape() {
        this(" ");
    }

    public Shape(String name) {
        this.name = name;
    }

    /**
     * Returns the name of this Shape.
     * 
     * @return A string specifying this shape's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Changes the name of this Shape.
     * 
     * @param name A reference to a name
     */
    public void setName(String name) {
        this.name = name;
    }

    public abstract double area();

    public boolean equals(Object obj) {
        if (!(obj instanceof Shape)) {
            return false;
        }
        Shape other = (Shape) obj;
        return this.name.equals(other.name);
    }

    public String toString() {
        return "Shape name:" + name;
    }
}
