package XinYangZhouProject05;

/**
 * A sub class of Shape. It defines a Triangle object.
 * 
 * @author Xinyang Zhou
 * @version 1.0
 */
public class Triangle extends Shape {

    /**
     * The first side of this triangle
     */
    private double sideOne;
    /**
     * The second side of this triangle
     */
    private double sideTwo;
    /**
     * The third side of this triangle
     */
    private double sideThree;

    /**
     * Creates a default triangle instance.
     */
    public Triangle() {
        super("Triangle");
        this.sideOne = 1.0;
        this.sideTwo = 1.0;
        this.sideThree = 1.0;
    }

    /**
     * Given a name and three sides, creates a triangle instance with the name and
     * the sides.
     * 
     * @param name    The name of this triangle
     * @param sideOne The first side of this triangle
     * @param sideTwo The second side of this triangle
     * @param sideTwo The third side of this triangle
     */
    public Triangle(String name, double sideOne, double sideTwo, double sideThree) {
        super(name);
        try {
            // Determine whether the three sides violate the rules.
            if ((sideOne + sideTwo) > sideThree && (sideOne + sideThree) > sideTwo && (sideTwo + sideThree) > sideOne) {
                this.sideOne = sideOne;
                this.sideTwo = sideTwo;
                this.sideThree = sideThree;
            } else {
                throw new InvalidTriangleException(
                        sideOne + ", " + sideTwo + " and " + sideThree + " can't form a triangle.");
            }
        } catch (InvalidTriangleException e) {
            e.printStackTrace();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println();
        }
    }

    /**
     * Returns the first side of this triangle
     * 
     * @return The first side of this triangle
     */
    public double getSideOne() {
        return this.sideOne;
    }

    /**
     * Given a side, changes the first side of this triangle if the new side will
     * form a triangle with the other two sides.
     * 
     * @param sideOne The first side of this circle.
     */
    public void setSideOne(double sideOne) {
        try {
            // Determine whether the three sides violate the rules.
            if ((sideOne + this.sideTwo) > this.sideThree && (sideOne + this.sideThree) > this.sideTwo
                    && (this.sideTwo + this.sideThree) > sideOne) {
                this.sideOne = sideOne;
            } else {
                throw new InvalidTriangleException(
                        sideOne + ", " + sideTwo + " and " + sideThree + " can't form a triangle.");
            }
        } catch (InvalidTriangleException e) {
            e.printStackTrace();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println();
        }
    }

    /**
     * Returns the second side of this triangle
     * 
     * @return The second side of this triangle
     */
    public double getSideTwo() {
        return this.sideTwo;
    }

    /**
     * Given a side, changes the second side of this triangle if the new side will
     * form a triangle with the other two sides.
     * 
     * @param sideTwo The second side of this triangle
     */
    public void setSideTwo(double sideTwo) {
        try {
            // Determine whether the three sides violate the rules.
            if ((this.sideOne + sideTwo) > this.sideThree && (this.sideOne + this.sideThree) > sideTwo
                    && (sideTwo + this.sideThree) > this.sideOne) {
                this.sideTwo = sideTwo;
            } else {
                throw new InvalidTriangleException(
                        sideOne + ", " + sideTwo + " and " + sideThree + " can't form a triangle.");
            }
        } catch (InvalidTriangleException e) {
            e.printStackTrace();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println();
        }
    }

    /**
     * Returns the third side of this triangle
     * 
     * @return The third side of this triangle
     */
    public double getSideThree() {
        return this.sideThree;
    }

    /**
     * Given a side, changes the third side of this triangle if the new side will
     * form a triangle with the other two sides.
     * 
     * @param sideThree The third side of this triangle
     */
    public void setSideThree(double sideThree) {
        try {
            // Determine whether the three sides violate the rules.
            if ((this.sideOne + this.sideTwo) > sideThree && (this.sideOne + sideThree) > this.sideTwo
                    && (this.sideTwo + sideThree) > this.sideOne) {
                this.sideThree = sideThree;
            } else {
                throw new InvalidTriangleException(
                        sideOne + ", " + sideTwo + " and " + sideThree + " can't form a triangle.");
            }
        } catch (InvalidTriangleException e) {
            e.printStackTrace();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println();
        }
    }

    /**
     * Returns the area of this triangle.
     * 
     * @return The area of this triangle.
     */
    public double area() {
        // Divide the sum of three sides by two.
        double s = (sideOne + sideTwo + sideThree) / 2;
        // S multiplied by s minus sideOne multiplied by s minus sideTwo multiplied by s
        // minus sideThree and then root.
        return Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
    }

    /**
     * Compares this triangle with some other object.
     *
     * @param obj A reference to some other object
     * @return A boolean value specifying if this triangle is equal to some other
     *         object
     */
    public boolean equals(Object obj) {
        // TOLERANCE is used to compare whether two floating point numbers are
        // approximately equal.
        final double TOLERANCE = 0.0001;
        // If the other object is not a triangle,return false.
        if (!(obj instanceof Triangle)) {
            return false;
        }
        Triangle other = (Triangle) obj;
        // Compare two triangles.
        return (super.equals(obj) && Math.abs(this.sideOne - other.sideOne) < TOLERANCE
                && Math.abs(this.sideTwo - other.sideTwo) < TOLERANCE
                && Math.abs(this.sideThree - other.sideThree) < TOLERANCE);
    }

    /**
     * Represents this triangle as a string literal.
     * 
     * @return A string representation of this triangle
     */
    public String toString() {
        return (super.toString() + ", first side: " + sideOne + " second side: " + sideTwo + " third side: "
                + sideThree);
    }

}
