package lab06;
/**
 * Test of the design of a six-sided die.
 * @author Qi Wang
 * @version 1.0
 */
public class Drive1 {
	/**
	 * Demonstrates 
	 * @param args A reference to a string array containing command-line arguments
	 */ 
	public static void main(String[] args){
		Die firstDie = new Die(); //1
		Die secondDie = new Die(5);
		int firstDieFaceValue;
		
		//Change secondDie's face value to be 6.
		secondDie.setFaceValue(6);
		
		firstDieFaceValue = firstDie.getFaceValue();//1
		firstDie.roll();// [1,6]
		firstDieFaceValue = firstDie.getFaceValue(); //[1,6]
		
		System.out.println(firstDieFaceValue);
		//System.out.println(firstDie.toString());
		System.out.println(firstDie); //chapter0608.Die@6d06d69c
		
		System.out.println(firstDie.equals(secondDie)); //true or false
		System.out.println(firstDie.equals(new String("Hello")));//false
		System.out.println(firstDie.equals("Hello"));//false
		
		System.out.println(Die.getCount());//false
	}
	

}
