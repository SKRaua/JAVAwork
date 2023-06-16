package lab8;


/**
 * Representation of a circle.
 * @author Qi Wang
 * @version 1.0
 */
public class Circle implements Shape{
	/**
	 * The radius of this circle
	 */
	private double radius;

	/**
	 * Constructs a default circle.
	 */
	public Circle(){
		this.radius = 0;
	}
	
	/**
	 * Constructs a circle with a specific radius.
	 * @param radius THe radius of this circle
	 */
	public Circle(double radius){
		this.radius = radius;
	}
	
	
	/**
	 * Returns the area of this circle.
	 * @return The area of this circle
	 */
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}