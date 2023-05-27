package Lab03;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
 * 
 * 
 * @author
 * @version 1.0
 */
public class lab03 {
    /**
     * 
     * 
     * @param args A reference to a string array containing command-line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        PrintWriter pw;
        String fileName;

        fileName = input.next();
        pw = new PrintWriter(new File(fileName));

        pw.println("Monday");
        pw.println("Tuesday");
        pw.println("Wednesday");
        pw.println("Thursday");
        pw.println("Friday");
        pw.println("Saturday");
        pw.println("Sunday");

        // pw.println(input.next());

        input.close();
        pw.close();
    }
}
