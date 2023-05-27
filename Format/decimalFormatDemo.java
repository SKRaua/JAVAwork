package Format;

import java.text.DecimalFormat;

public class decimalFormatDemo {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("00.00");
        int a = 12;
        String formattedA = format.format(a);
        System.out.println(formattedA);
    }

}
