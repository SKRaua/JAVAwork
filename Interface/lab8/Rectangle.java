package lab8;

/**
 * Representation of a rectangle.
 * @author Qi Wang
 * @version 1.0
 */
public class Rectangle implements Shape{
	/**
	 * The width of this rectangle
	 */
	private double width;
	
	/**
	 * The length of this rectangle
	 */
	private double length;
	
	/**
	 * Constructs a default rectangle.
	 */
	public Rectangle(){
		this.width = 0;
		this.length = 0;
	}
	
	/**
	 * Constructs a specific rectangle.
	 * @param width The width of this rectangle
	 * @param length The length of this rectangle
	 */
	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}

	/**
	 * Returns the area of this rectangle.
	 * @return The area of this rectangle
	 */
	public double getArea() {
		return this.width * this.length;
	}
}
