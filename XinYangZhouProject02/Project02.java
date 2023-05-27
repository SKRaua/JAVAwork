package XinYangZhouProject02;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * A bill generator
 * 
 * @author XinYang Zhou
 * @version 1.0
 */
public class Project02 {

    /**
     * creates customers’ bills when the customer’s first name and last name,the
     * length and width of carpet in feet and the carpet price per square foot are
     * given.
     * 
     * @param args A reference to a string array containing command-line arguments.
     */
    public static void main(String[] args) {
        final float TAX_RATE = (float) 0.085;
        Scanner input = new Scanner(System.in);
        String firstName, lastName, ID;
        int length, width, area;
        float costPerSquareFoot, totalCost, totalTax, totalCharges;

        Random ran = new Random();
        DecimalFormat measurementDataFormat = new DecimalFormat("000");
        DecimalFormat costPerSquareFootFormat = new DecimalFormat("00.00      ");
        DecimalFormat chargesFormat = new DecimalFormat("$0000.00");
        DecimalFormat percentfmt = new DecimalFormat(" 0.00%     ");
        DecimalFormat taxChargesFormat = new DecimalFormat(" 0000.00");

        // 1.Read 5 items of data entered by the user.
        System.out.print("Enter your first name: ");
        firstName = input.next();
        System.out.print("Enter your last name: ");
        lastName = input.next();
        System.out.print("Enter length of room (feet): ");
        length = input.nextInt();
        System.out.print("Enter width of room (feet): ");
        width = input.nextInt();
        System.out.print("Enter cost per square foot: ");
        costPerSquareFoot = input.nextFloat();
        System.out.println();

        // 2.Process the first name, making the initial letter uppercase and other
        // lowercase letters.
        firstName = firstName.substring(0, 1).toUpperCase().concat(firstName.substring(1).toLowerCase());

        // 3.Process the last name, making the initial letter uppercase and other
        // lowercase letters.
        lastName = lastName.substring(0, 1).toUpperCase().concat(lastName.substring(1).toLowerCase());

        ID = firstName.substring(0, 1) + lastName.substring(0, 5) + (ran.nextInt(90) + 10);

        // 4.Length multiplied by width.
        area = length * width;

        // 5.the cost per square foot multiplied by the area.
        totalCost = costPerSquareFoot * area;

        // 6.the total cost multiplied by the tax rate.
        totalTax = totalCost * TAX_RATE;

        // 7.the total cost plus the total tax.
        totalCharges = totalCost + totalTax;

        // 8.Display the result,the CUSTOMER,the MEASUREMENT and the CHARGES in the
        // correct format.
        System.out.println("CUSTOMER");
        System.out.println("Last Name   " + lastName);
        System.out.println("First Name  " + firstName);
        System.out.println("ID          " + ID);
        System.out.println();

        System.out.println("MEASUREMENT");
        System.out.println("Length  " + measurementDataFormat.format(length) + " feet");
        System.out.println("Width   " + measurementDataFormat.format(width) + " feet");
        System.out.println("Area    " + measurementDataFormat.format(area) + " square feet");
        System.out.println();

        System.out.println("CHARGES");
        System.out.println("Description       Cost/Sq.Ft.       Charges");
        System.out.println("-----------       -----------       --------");
        System.out.println(
                "Carpet            " + costPerSquareFootFormat.format(costPerSquareFoot) + "       "
                        + chargesFormat.format(totalCost));
        System.out.println(
                "Tax               " + percentfmt.format(TAX_RATE) + "       " + taxChargesFormat.format(totalTax));
        System.out.println("                                    --------");
        System.out.println("Total                               " + chargesFormat.format(totalCharges));

        input.close();
    }
}
