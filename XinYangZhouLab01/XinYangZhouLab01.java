package XinYangZhouLab01;

import java.util.Scanner;

/**
 * A Name Converter
 * 
 * @author XinYangZhou
 * @version 1.0
 */
public class XinYangZhouLab01 {

    /**
     * Read the name entered by the user and convert it to title case.
     * 
     * @param args A reference to a string array containing command-line arguments.
     */
    public static void main(String[] args) {
        String firstName, lastName, titleCasedFirstName, titleCasedLastName, firstName2, lastName2;
        char firstName1, lastName1;
        Scanner input = new Scanner(System.in);

        // 1.Read the first name entered by the user.
        System.out.print("Enter your first name: ");
        firstName = input.next();
        // 2.Read the last name entered by the user.
        System.out.print("Enter your last name: ");
        lastName = input.next();

        // 3.Extract the first letter of the first name.
        firstName1 = firstName.charAt(0);
        // 4.Extract remaining letters of the first name.
        firstName2 = firstName.substring(1);
        // 5.Capitalize the first letter, lower the remaining letters, and connect them.
        titleCasedFirstName = Character.toString(firstName1).toUpperCase().concat(firstName2.toLowerCase());

        // 6.Extract the first letter of the last name.
        lastName1 = lastName.charAt(0);
        // 7.Extract remaining letters of the last name.
        lastName2 = lastName.substring(1);
        // 8.Capitalize the first letter, lower the remaining letters, and connect them.
        titleCasedLastName = Character.toString(lastName1).toUpperCase().concat(lastName2.toLowerCase());

        // 9.display the first name.
        System.out.println("First Name: " + titleCasedFirstName);
        // 10.display the last name.
        System.out.println("Last Name: " + titleCasedLastName);

        input.close();
    }

}
