package lab06;

import java.util.Random;

/**
 * Design of a six-sided die.
 * @author Qi Wang
 * @version 1.0
 */
public class Die{
	
	/*
	 * The face value of this die.
	 */
	private  int faceValue;
	
	/**
	 * The number of Die objects that have been constructed
	 */
	private static int count = 0; 
	
	/**
	 * Constructs a die with a face value of 1.
	 */
	public Die(){
		this.faceValue = 1;
		count++;
	}
	
	/**
	 * Constructs a die with a specific face value.
	 * @param faceValue A face value of this die
	 */
	public Die(int faceValue){
		if(faceValue >= 1 && faceValue <= 6){
			this.faceValue = faceValue;
			count++;
		}
	}
	
	/**
	 * Changes this die's face value to be a new value.	
	 * @param faceValue A new face value
	 */
	public void setFaceValue(int faceValue){
		if(faceValue >= 1 && faceValue <= 6){//validate the value
			this.faceValue = faceValue;
		}
	}
	
	/**
	 * Returns this die's face value.
	 * @return This die's face value
	 */
	public int getFaceValue(){ 
		return this.faceValue;
	}
	
	/**
	 * Changes this die's face value to be a random value between 1 and 6.
	 */
	public void roll(){
		Random rand = new Random();
		this.faceValue = rand.nextInt(6) + 1;
	}
	
	/**
	 * Returns the number of die objects that have be constructed. 
	 * @return The number of Ddie objects made
	 */
	public static int getCount(){
		return  count;
	}
	/**
	 * Returns a string representation of this die. The 
	 * returned string contains the object type and the face value. 
	 * @return A string representation of this die. 
	 */
	public String toString(){
		return  this.getClass().getSimpleName()  + ": The face value is "+ this.faceValue + ".";
	}
	
	/**
	 * Indicates whether this die is equal to some other object. If the other object is a die
	 * and it contains the same face value as this die, return true specifying this die is
	 * equal to the other die, false, otherwise. If the other object is not a die, return false.
	 * @return A boolean value specifying if this die is equal to some other object
	 * @param obj A reference to an object
	 */
	public boolean equals(Object obj){
		//obj doesn't reference to a die.
		if(!(obj instanceof Die)){
			return false;
		}
		
		//obj does reference to a die.
		Die other = (Die)obj;
		//compare this die's face value with the other die's face value
		return this.faceValue == other.faceValue;
	}
	
}