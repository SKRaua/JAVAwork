package YuZhangproject5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 * Represents a helper class of driver to test the entire design.
 * @Author YuZhang
 * @Date 2023/5/27
 * Version 1.0
 */
    //test conducted
    public class Test {
            public static void start() throws FileNotFoundException{
                /**
                 * Create an array ,and calls create and display.
                 */
            ArrayList<Shape> shapes = new ArrayList<Shape>();
            create(shapes);
            display(shapes);
        }

    /**
     * Creates new rectangle, circle and triangle.
     * @param shapes A reference to an ArrayList of Shape
     * @throws FileNotFoundException
     */
            public static void create(ArrayList<Shape> shapes) throws FileNotFoundException {
                Scanner input = new Scanner(new File("C:\\Users\\Lenovo\\IdeaProjects\\project\\shapes.txt"));
                String shape;
                while (input.hasNextLine()) {
                    shape = input.nextLine();
                    switch (shape) {
                        case "Rectangle": {
                            shapes.add(new Rectangle(input.nextLine(), input.nextDouble(), input.nextDouble()));
                            break;
                        }
                        case "Circle": {
                            shapes.add(new Circle(input.nextLine(), input.nextDouble()));
                            break;
                        }
                        case "Triangle": {
                            shapes.add(
                                    new Triangle(input.nextLine(), input.nextDouble(), input.nextDouble(), input.nextDouble()));
                            break;
                        }
                    }
                }
                input.close();
            }

    public static void display(ArrayList<Shape> shapes) throws FileNotFoundException{
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i));
            System.out.println();
        }
    }
    }