package XinYangZhouLab02;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * A date displayer in two forms
 * 
 * @author Xinyang Zhou
 * @version 1.0
 */
public class lab02 {

    /**
     * Reads a user-entered date, converts it to other form
     * and displays both forms.
     * 
     * @param args A reference to a string array containing command-line arguments.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat format1 = new DecimalFormat("00");
        DecimalFormat format2 = new DecimalFormat("0000");

        String month;
        int day;
        int year;
        int monthNum = 1;

        // 1.Prompt user for date input(month,day and year).
        System.out.print("Enter the month in English (For example,January): ");
        month = input.next();
        System.out.print("Enter the day: ");
        day = input.nextInt();
        System.out.print("Enter the year: ");
        year = input.nextInt();

        // 2.Convert the month to numerical representation.
        switch (month) {
            case "January":
                monthNum = 1;
                break;
            case "February":
                monthNum = 2;
                break;
            case "March":
                monthNum = 3;
                break;
            case "April":
                monthNum = 4;
                break;
            case "May":
                monthNum = 5;
                break;
            case "June":
                monthNum = 6;
                break;
            case "July":
                monthNum = 7;
                break;
            case "August":
                monthNum = 8;
                break;
            case "September":
                monthNum = 9;
                break;
            case "October":
                monthNum = 10;
                break;
            case "November":
                monthNum = 11;
                break;
            case "December":
                monthNum = 12;
                break;
            default:
                System.out.println("Input error of the month information.");
        }

        // 3.Output date in the first form.
        System.out.println("The date in the first form: " + month + " " + day + ", " + year);

        // 4.Output date in the second form.
        System.out.println("The date in the second form: " + format1.format(monthNum) + "/" + format1.format(day) + "/"
                + format2.format(year));
        input.close();
    }
}
