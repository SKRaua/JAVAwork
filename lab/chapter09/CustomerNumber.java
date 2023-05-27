package chapter09;

import javax.swing.JOptionPane;

/**
 * Tests a customer number to verify that it is in the proper format.
 * @author Tony Gaddis
 * @version 1.0
 */
public class CustomerNumber{
	/**
	 * Tests a customer number to verify that it is in the form of LLLNNNN. 
	 * 	- LLL = letters
	 * 	- NNNN = numbers
	 * @param args A reference to a string array containing command-line arguments
	 */
   public static void main(String[] args){
      String input;

      // Get a customer number.
      input = JOptionPane.showInputDialog("Enter " +
         "a customer number in the form LLLNNNN\n" +
         "(LLL = letters and NNNN = numbers)");

      // Validate the input.
      if (isValid(input)){
         JOptionPane.showMessageDialog(null, "That's a valid customer number.");
      }else {
         JOptionPane.showMessageDialog(null,
             "That is not the proper format of a " +
             "customer number.\nHere is an " +
             "example: ABC1234");
      }
      
      System.exit(0);
   }

   /**
    * Determines whether a String is a valid customer number. If so, it
    * returns true.
    * @param custNumber The String to test
    * @return true if valid, otherwise false
    */
   private static boolean isValid(String custNumber) {
      boolean goodSoFar = true;  
      int i = 0;               

      // Test the length.
      if (custNumber.length() != 7)
         goodSoFar = false;

      // Test the first three characters for letters.
      while (goodSoFar && i < 3){
         if (!Character.isLetter(custNumber.charAt(i)))
            goodSoFar = false;
         i++;
      }

      // Test the last four characters for digits.
      while (goodSoFar && i < 7){
         if (!Character.isDigit(custNumber.charAt(i)))
            goodSoFar = false;
         i++;
      }

      return goodSoFar;
   }
}
