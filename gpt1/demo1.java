package gpt1;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class demo1 {
    public static final double TAX_RATE = 0.085;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        Random rand = new Random();

        // 获取客户信息
        System.out.print("Enter customer's first name: ");
        String firstName = input.nextLine().trim().toLowerCase();
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);

        System.out.print("Enter customer's last name: ");
        String lastName = input.nextLine().trim().toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1, Math.min(lastName.length(), 6));

        System.out.print("Enter length of carpet (in feet): ");
        int length = input.nextInt();

        System.out.print("Enter width of carpet (in feet): ");
        int width = input.nextInt();

        System.out.print("Enter price of carpet per square foot: ");
        double pricePerSqFt = input.nextDouble();

        // 计算账单信息
        double area = length * width;
        double subtotal = area * pricePerSqFt;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        // 生成客户ID
        String id = firstName.substring(0, 1) + lastName.substring(0, 5) + rand.nextInt(90) + 10;

        // 输出账单
        System.out.println("\nCustomer ID: " + id);
        System.out.println("Customer Name: " + firstName + " " + lastName);
        System.out.println(
                "Carpet Size: " + String.format("%03d", length) + " x " + String.format("%03d", width) + " (sq. ft.)");
        System.out.println("Carpet Price: $" + df.format(pricePerSqFt) + " per sq. ft.");
        System.out.println("Subtotal: $" + df.format(subtotal));
        System.out.println("Tax (" + df.format(TAX_RATE * 100) + "%): $" + df.format(tax));
        System.out.println("Total: $" + df.format(total));
        input.close();
    }
}
