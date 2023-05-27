package XinYangZhouLab01;

import java.util.Scanner;

/**
 * A Name Converter
 * 
 * @author XinYangZhou
 * @version 2.0
 */
public class XinYangZhouLab01_2 {

    /**
     * Read the name entered by the user and convert it to title case.
     * 
     * @param args A reference to a string array containing command-line arguments.
     */
    public static void main(String[] args) {
        String firstName, lastName;
        Scanner input = new Scanner(System.in);

        // 1.Read the first name entered by the user.
        System.out.print("Enter your first name: ");
        firstName = input.next();
        // 2.Read the last name entered by the user.
        System.out.print("Enter your last name: ");
        lastName = input.next();

        // 3.Extract the first letter of the first name and uppercase it, extract the
        // remaining letters and lowercase them, and then splice them together.
        firstName = firstName.substring(0, 1).toUpperCase().concat(firstName.substring(1).toLowerCase());
        // 4.Extract the first letter of the last name and uppercase it, extract the
        // remaining letters and lowercase them, and then splice them together.
        lastName = lastName.substring(0, 1).toUpperCase().concat(lastName.substring(1).toLowerCase());

        // 5.display the first name.
        System.out.println("First Name: " + firstName);
        // 6.display the last name.
        System.out.println("Last Name: " + lastName);

        input.close();
    }
}
