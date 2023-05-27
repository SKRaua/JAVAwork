package chapter09;

import java.util.Scanner;

/**
 * Demonstrates the Character class's toUpperCase method.
 * @author Tony Gaddis
 * @version 1.0
 */

public class CircleArea{
	/**
	 * Demonstrates the Character class's toUpperCase method.
	 * @param args A reference to a string array containing command-line arguments
	 */
   public static void main(String[] args){
      double radius; // The circle's radius
      double area;   // The circle's area
      String input;  // To hold a line of input
      char choice;   // To hold a single character

      // Create a Scanner object to read keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      do{
         // Get the circle's radius.
         System.out.print("Enter the circle's radius: ");
         radius = keyboard.nextDouble();
         
         // Consume the remaining newline character.
         keyboard.nextLine();

         // Calculate and display the area.
         area = Math.PI * radius * radius;
         System.out.printf("The area is %.2f.\n", area);

         // Repeat this?
         System.out.print("Do you want to do this " + "again? (Y or N) ");
         input = keyboard.nextLine();
         choice = input.charAt(0);

      } while (Character.toUpperCase(choice) == 'Y');
      
      keyboard.close();
   }
}
