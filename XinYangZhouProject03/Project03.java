package XinYangZhouProject03;

import java.util.Scanner;

/**
 * A date difference calculator
 * 
 * @author XinYang Zhou
 * @version 1.0
 */
public class Project03 {

    /**
     * Prompt the user for two dates, each of which consists of a month and a year,
     * and display the number of years and months between these two dates.
     * 
     * @param args A reference to a string array containing command-line arguments.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month1, month2;
        int year1, year2, monthDifference = 0, yearDifference = 0;
        int monthNum1 = 1, monthNum2 = 2;

        // 1.Read the months and the years entered by the user.
        System.out.println("For the first data,");
        System.out.print("Enter mouth (For example,January): ");
        month1 = input.next();
        System.out.print("Enter year: ");
        year1 = input.nextInt();
        System.out.println();
        System.out.println("For the second data,");
        System.out.print("Enter mouth (For example,January): ");
        month2 = input.next();
        System.out.print("Enter year: ");
        year2 = input.nextInt();
        System.out.println();

        // 2.Convert months of string type to integer.(Using the Swith statement)
        switch (month1) {
            case "January":
                monthNum1 = 1;
                break;
            case "February":
                monthNum1 = 2;
                break;
            case "March":
                monthNum1 = 3;
                break;
            case "April":
                monthNum1 = 4;
                break;
            case "May":
                monthNum1 = 5;
                break;
            case "June":
                monthNum1 = 6;
                break;
            case "July":
                monthNum1 = 7;
                break;
            case "August":
                monthNum1 = 8;
                break;
            case "September":
                monthNum1 = 9;
                break;
            case "October":
                monthNum1 = 10;
                break;
            case "November":
                monthNum1 = 11;
                break;
            case "December":
                monthNum1 = 12;
                break;
            default:
                System.out.println("Input error of the first month information.");
        }
        switch (month2) {
            case "January":
                monthNum2 = 1;
                break;
            case "February":
                monthNum2 = 2;
                break;
            case "March":
                monthNum2 = 3;
                break;
            case "April":
                monthNum2 = 4;
                break;
            case "May":
                monthNum2 = 5;
                break;
            case "June":
                monthNum2 = 6;
                break;
            case "July":
                monthNum2 = 7;
                break;
            case "August":
                monthNum2 = 8;
                break;
            case "September":
                monthNum2 = 9;
                break;
            case "October":
                monthNum2 = 10;
                break;
            case "November":
                monthNum2 = 11;
                break;
            case "December":
                monthNum2 = 12;
                break;
            default:
                System.out.println("Input error of the second month information.");

        }

        // 3.Determine whether the difference between the year and month has the same
        // sign.
        if ((year1 - year2) * (monthNum1 - monthNum2) >= 0) {
            // 4.Subtract two years and take an absolute value.
            yearDifference = Math.abs(year1 - year2);
            // 5.Subtract two months and take an absolute value.
            monthDifference = Math.abs(monthNum1 - monthNum2);
        }
        // 6.Obtain a situation where the first year is greater than or equal to the
        // second year, and the first month is less than the second month.
        else if (year1 >= year2) {
            // 7.First year minus second year minus 1.
            yearDifference = year1 - year2 - 1;
            // 8.First month plus 12 minus second month.
            monthDifference = monthNum1 + 12 - monthNum2;
        }
        // 9.Obtain a situation where the first year is less than the
        // second year, and the first month is greater than or equal to the second month
        else if (year1 < year2) {
            // 10.Second year minus first year minus 1.
            yearDifference = year2 - year1 - 1;
            // 11.Second month plus 12 minus first month.
            monthDifference = monthNum2 + 12 - monthNum1;
        }

        // 12.Display the result,the absolute value of the month difference and the year
        // difference.
        System.out.println("These dates are " + yearDifference + (yearDifference == 1 ? " year" : " years") + " and "
                + monthDifference + (monthDifference == 1 ? " month" : " mouths") + " apart.");
        input.close();
    }
}
