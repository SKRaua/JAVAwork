package lab8;

import java.util.ArrayList;

/**
 * Test shape design with a list shapes.
 * 
 * @author Qi Wang
 * @version 1.0
 */
public class Helper {
	/**
	 * Creates a list of shapes, and displays the areas.
	 * 
	 * @param args A reference to a string array containing command-line arguments
	 */
	public static void start() {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		create(shapes);
		display(shapes);
	}

	/**
	 * Creates a list of shapes.
	 * 
	 * @param shapes A reference to a list
	 */
	public static void create(ArrayList<Shape> shapes) {
		shapes.add(new Circle());
		shapes.add(new Circle(2.5));
		shapes.add(new Rectangle());
		shapes.add(new Rectangle(1.3, 2.3));
	}

	/**
	 * Displays a list of shapes.
	 * 
	 * @param shapes A reference to a list
	 */
	public static void display(ArrayList<Shape> shapes) {
		for (int i = 0; i < shapes.size(); i++) {
			// A Shape variable can reference an object of compatible types such as Circle
			// or Rectangle
			Shape s = shapes.get(i);
			// The object type, not the reference type(Shape), determines which version of
			// the method to be invoked.
			// getArea() of Circle is called when i is 0 or 1.
			// getArea() of Rectangle is called when i is 2 or 3.
			System.out.println(s.getArea());
		}
	}
}
