package chapter10.comparableemployee;

/**
 * Represents a general paid employee.
 * 
 * @author Qi Wang
 * @version 1.1
 */

public class ComparableEmployee implements Comparable<ComparableEmployee> {
	/**
	 * The name of this employee
	 */
	private String name;

	/**
	 * The pay rate of this employee
	 */
	private double payRate;

	/**
	 * Constructs an employee.
	 */
	public ComparableEmployee() {
		this("", 0.0);
	}

	/**
	 * Constructs an employee with the specified information.
	 * 
	 * @param name    The name of this employee
	 * @param payRate The pay rate of this employee
	 */
	public ComparableEmployee(String name, double payRate) {
		this.name = name;
		this.payRate = payRate;
	}

	/**
	 * Return the name of this employee.
	 * 
	 * @return The name of this employee
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Changes the name of this employee.
	 * 
	 * @param name The name of an employee
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Return the pay rate of this employee.
	 * 
	 * @return The pay rate of this employee
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * Changes the pay rate of this employee.
	 * 
	 * @param payRate The pay rate of an employee
	 */
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	/**
	 * Returns information about this employee as a string.
	 * 
	 * @return A String literal specifying the details of this employee
	 */
	public String toString() {
		return this.getClass().getSimpleName() + "\nName: " + this.name + "\nPay Rate: " + this.payRate;
	}

	/**
	 * Compares this employee with the other one and returns true if this staff has
	 * the same social security number
	 * as the other,false, otherwise.
	 * 
	 * @param obj A reference to the other employee
	 * @return A boolean value specifying whether this employee is the same as the
	 *         other employee
	 */
	public boolean equals(Object obj) {
		if (!(obj instanceof ComparableEmployee)) {
			return false;
		}
		ComparableEmployee other = (ComparableEmployee) obj;
		return this.name.equalsIgnoreCase(other.name);
	}

	/**
	 * Compares this object with the specified object for order. Returns a negative
	 * integer, zero, or a positive integer
	 * as this object is less than, equal to, or greater than the specified object.
	 * The natural ordering of this object is
	 * the order of names.
	 * 
	 * @param o The object to be compared
	 * @return A negative integer, zero, or a positive integer as this object is
	 *         less than, equal to,
	 *         or greater than the specified object
	 */
	public int compareTo(ComparableEmployee o) {
		// Order of names
		return this.name.compareTo(o.name);
	}
}
