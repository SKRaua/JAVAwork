package chapter09;

import javax.swing.JOptionPane;

/**
 * Demonstrates some of the Character class's character testing methods.
 * 
 * @author Tony Gaddis
 * @version 1.0
 */
public class CharacterTest {
   /**
    * Demonstrates some of the Character class's character testing methods.
    * 
    * @param args A reference to a string array containing command-line arguments
    */
   public static void main(String[] args) {
      String input;
      char ch;

      // Get a character from the user.
      input = JOptionPane.showInputDialog("Enter " + "any single character.");
      ch = input.charAt(0);

      // Test the character.
      if (Character.isLetter(ch)) {
         JOptionPane.showMessageDialog(null, "That is a letter.");
         if (Character.isLowerCase(ch)) {
            JOptionPane.showMessageDialog(null, "That is a lowercase letter.");
         } else if (Character.isUpperCase(ch)) {
            JOptionPane.showMessageDialog(null, "That is an uppercase letter.");
         }
      } else if (Character.isDigit(ch)) {
         JOptionPane.showMessageDialog(null, "That is a digit.");
      } else if (Character.isSpaceChar(ch)) {
         JOptionPane.showMessageDialog(null, "That is a space.");
      } else if (Character.isWhitespace(ch)) {
         JOptionPane.showMessageDialog(null, "That is a whitespace character.");
      }

      System.exit(0);
   }
}
