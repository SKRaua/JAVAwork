package chapter10.comparableemployee;

/**
 * Represents a general paid employee.
 * 
 * @author Qi Wang
 * @version 1.1
 */

public class ComparableEmployee2 implements Comparable<ComparableEmployee2> {
	/**
	 * The name of this employee
	 */
	protected String name;

	/**
	 * The pay rate of this employee
	 */
	protected double payRate;

	/**
	 * Constructs an employee.
	 */
	public ComparableEmployee2() {
		this("", 0.0);
	}

	/**
	 * Constructs an employee with the specified information.
	 * 
	 * @param name    The name of this employee
	 * @param payRate The pay rate of this employee
	 */
	public ComparableEmployee2(String name, double payRate) {
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
		if (!(obj instanceof ComparableEmployee2)) {
			return false;
		}
		ComparableEmployee2 other = (ComparableEmployee2) obj;
		return this.name.equalsIgnoreCase(other.name);
	}

	/**
	 * Compares this object with the specified object for order. Returns a negative
	 * integer, zero, or a positive integer
	 * as this object is less than, equal to, or greater than the specified object.
	 * The natural ordering of this object is
	 * the order of pay rates.
	 * 
	 * @param o The object to be compared
	 * @return A negative integer, zero, or a positive integer as this object is
	 *         less than, equal to,
	 *         or greater than the specified object
	 */
	public int compareTo(ComparableEmployee2 o) {
		// Compare long bit representations of double pay rates
		// Double.doubleToRawLongBits(this.payRate) vs.
		// Double.doubleToRawLongBits(o.payRate)
		if (Double.doubleToRawLongBits(this.payRate) > Double.doubleToRawLongBits(o.payRate)) {
			return 1;
		} else if (Double.doubleToRawLongBits(this.payRate) < Double.doubleToRawLongBits(o.payRate)) {
			return -1;
		} else {
			// (Double.doubleToRawLongBits(this.payRate) ==
			// Double.doubleToRawLongBits(o.payRate){
			return 0;
		}
	}
}
