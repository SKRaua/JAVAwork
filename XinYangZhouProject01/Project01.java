package XinYangZhouProject01;

import java.util.Scanner;

/**
 * A money calculator
 * 
 * @author XinYang Zhou
 * @version 1.0
 */
public class Project01 {

    /**
     * Reads an original amount in dollars,and then determines the fewest number of
     * each bill and coin needed to represent that amount, starting with the $10
     * bill.
     * 
     * @param args A reference to a string array containing command-line arguments.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float monetaryAmount;
        int totalPennies, remainingBalance, tenDollars, fiveDollars, oneDollar, quarters, dimes,
                nickels, pennies;
        System.out.print("Enter monetary amount: ");
        // 1.Read an amount entered by the user.
        monetaryAmount = input.nextFloat();
        // 2.Multiply the amount by 100.
        totalPennies = (int) (monetaryAmount * 100);

        System.out.println("That's equivalent to:");

        // 3.Divide the original amount by 1000 and take the remainder.
        tenDollars = totalPennies / 1000;
        remainingBalance = totalPennies % 1000;
        // 4.Display the result,the number of ten dollars.
        System.out.println(tenDollars + " ten dollar bills");

        // 5.Divide the remaining balance by 500 and take the remainder.
        fiveDollars = remainingBalance / 500;
        remainingBalance %= 500;
        // 6.Display the result,the number of five dollars.
        System.out.println(fiveDollars + " five dollar bills");

        // 7.Divide the remaining balance by 100 and take the remainder.
        oneDollar = remainingBalance / 100;
        remainingBalance %= 100;
        // 8.Display the result,the number of one dollars.
        System.out.println(oneDollar + " one dollar bills");

        // 9.Divide the remaining balance by 25 and take the remainder.
        quarters = remainingBalance / 25;
        remainingBalance %= 25;
        // 10.Display the result,the number of quarters.
        System.out.println(quarters + " quarters");

        // 11.Divide the remaining balance by 10 and take the remainder.
        dimes = remainingBalance / 10;
        remainingBalance %= 10;
        // 12.Display the result,the number of dimes.
        System.out.println(dimes + " dimes");

        // 13.Divide the remaining balance by 5 and take the remainder.
        nickels = remainingBalance / 5;
        remainingBalance %= 5;
        // 14.Display the result,the number of nickels.
        System.out.println(nickels + " nickels");

        // 15.Divide the remaining balance by 1.
        pennies = remainingBalance / 1;
        // 16.Display the result,the number of pennies.
        System.out.println(pennies + " pennies");

        input.close();
    }
}