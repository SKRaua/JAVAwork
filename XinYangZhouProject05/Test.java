package XinYangZhouProject05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The helper of the Driver,testing everything in the Shape class.
 * 
 * @author Xinyang Zhou
 * @version 1.0
 */
public class Test {

    /**
     * Starts all testing.
     * 
     * @throws FileNotFoundException "./XinYangZhouProject05/shapes.txt"
     *                               can't be found
     */
    public static void start() throws FileNotFoundException {

        // Create an empty list of shapes and save the reference.
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        // Create shapes.(All construction methods were tested.)
        // Create circles.
        Circle circle1 = new Circle();
        Circle circle2 = new Circle("Big Circle", 2.0);
        // Create rectangles.
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle("Big Rectangle", 2.0, 4.0);
        // Create triangles.
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle("Big Triangle", 1.5, 1.5, 1.5);

        String string1 = new String();

        // Pass the reference to create method that fills the shapes list.
        // (Three construction methods were tested.)
        create(shapes);
        // Pass the reference to display method that prints the shapes list.
        // (Three toString methods were tested.)
        display(shapes);
        // Check the size of the shapes list.
        System.out.println("The size of the shapes list: " + shapes.size());
        System.out.println();

        // Remove a shape.
        shapes.remove(4);
        // Display the shapes list again.
        display(shapes);
        // Check the size of the shapes list.
        System.out.println("The size of the shapes list: " + shapes.size());
        System.out.println();

        // Test setName methods of Circle class.(inherited from the Shape class)
        circle1.setName("Big Circle");
        // Test setRadius methods of Circle class.
        circle1.setRadius(2.0);
        // Test getName methods of Circle class.(inherited from the Shape class)
        System.out.println("The name of the circle1: " + circle1.getName());
        // Test getRadius methods of Circle class.(inherited from the Shape class)
        System.out.println("The radius of the circle1: " + circle1.getRadius());
        // Test area methods of Circle class.
        System.out.println("The area of the circle1: " + circle1.area());
        // Test equals methods of Circle class.
        System.out.println("Is circle1 equal to circle2: " + circle1.equals(circle2));
        System.out.println("Is circle1 equal to string1: " + circle1.equals(string1));
        System.out.println();

        // Test setName methods of Rectangle class.
        rectangle1.setName("Big Rectangle");
        // Test setLength methods of Rectangle class.
        rectangle1.setLength(2.0);
        // Test setWidth methods of Rectangle class.
        rectangle1.setWidth(4.0);
        // Test getName methods of Rectangle class.
        System.out.println("The name of the rectangle1: " + rectangle1.getName());
        // Test getLength methods of Rectangle class.
        System.out.println("The length of the rectangle1: " + rectangle1.getLength());
        // Test getWidth methods of Rectangle class.
        System.out.println("The width of the rectangle1: " + rectangle1.getWidth());
        // Test area methods of Rectangle class.
        System.out.println("The area of the rectangle1: " + rectangle1.area());
        // Test equals methods of Rectangle class.
        System.out.println("Is rectangle1 equal to rectangle2: " + rectangle1.equals(rectangle2));
        System.out.println("Is rectangle1 equal to string1: " + rectangle1.equals(string1));
        System.out.println();

        // Test setName methods of Triangle class.
        triangle1.setName("Big Triangle");
        // Test setSideOne methods of Triangle class.
        triangle1.setSideOne(1.5);
        // Test setSideTwo methods of Triangle class.
        triangle1.setSideTwo(1.5);
        // Test setSideThree methods of Triangle class.
        triangle1.setSideThree(1.5);
        // Test getName methods of Triangle class.
        System.out.println("The name of the triangle1: " + triangle1.getName());
        // Test getSideOne methods of Triangle class.
        System.out.println("The first side of the triangle1: " + triangle1.getSideOne());
        // Test getSideTwo methods of Triangle class.
        System.out.println("The second side of the triangle1: " + triangle1.getSideTwo());
        // Test getSideThree methods of Triangle class.
        System.out.println("The third side of the triangle1: " + triangle1.getSideThree());
        // Test area methods of Triangle class.
        System.out.println("The area of the triangle1: " + triangle1.area());
        // Test equals methods of Triangle class.
        System.out.println("Is triangle1 equal to triangle2: " + triangle1.equals(triangle2));
        System.out.println("Is triangle1 equal to string1: " + triangle1.equals(string1));
        System.out.println();
    }

    /**
     * Adds the objects into the shapes list.
     * 
     * @param shapes The reference to the list of shapes
     * @throws FileNotFoundException "./XinYangZhouProject05/shapes.txt"
     *                               can't be found
     */
    public static void create(ArrayList<Shape> shapes) throws FileNotFoundException {
        Scanner input = new Scanner(new File("./XinYangZhouProject05/shapes.txt"));
        String shape;

        // Create shape objects using data from an input file.
        while (input.hasNextLine()) {
            shape = input.nextLine();
            // A shape can be a rectangle, a circle or a triangle.
            switch (shape) {
                case "Circle": {
                    // Add the circle into the shapes list.
                    shapes.add(new Circle(input.nextLine(), input.nextDouble()));
                    break;
                }
                case "Rectangle": {
                    // Add the rectangle into the shapes list.
                    shapes.add(new Rectangle(input.nextLine(), input.nextDouble(), input.nextDouble()));
                    break;
                }
                case "Triangle": {
                    // Add the triangle into the shapes list.
                    shapes.add(
                            new Triangle(input.nextLine(), input.nextDouble(), input.nextDouble(), input.nextDouble()));
                    break;
                }
            }

        }
        input.close();
    }

    /**
     * Prints the list.
     * 
     * @param shapes The reference to the list of shapes
     */
    public static void display(ArrayList<Shape> shapes) {
        // Displays the objects of the shapes list.
        System.out.println("The shapes list: ");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
        System.out.println();
    }

}