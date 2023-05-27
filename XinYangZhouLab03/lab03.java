package XinYangZhouLab03;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * A program save names to file
 * 
 * @author Xinyang Zhou
 * @version 1.0
 */
public class lab03 {
    /**
     * Prints the names data entered by the user into the file.
     * 
     * @param args A reference to a string array containing command-line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        FileWriter fw;
        PrintWriter pw;

        String fileName;

        // User input file name.
        System.out.println("Enter the file name: ");
        fileName = input.next();
        fw = new FileWriter(new File(fileName), true);
        pw = new PrintWriter(fw);

        // Print some data in a file.
        pw.println("Monday\nTuesday\nWednesday\nThursday\nFriday\nSaturday\nSunday");
        pw.println("Monday");
        pw.println("Tuesday");
        pw.println("Wednesday");
        pw.println("Thursday");
        pw.println("Friday");
        pw.println("Saturday");
        pw.println("Sunday");

        // Read user input data and print it in the file
        System.out.println("Enter the data: ");
        input.nextLine();
        pw.println(input.nextLine());

        input.close();
        fw.close();
        pw.close();
    }
}
