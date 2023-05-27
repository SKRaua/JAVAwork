package XinYangZhouLab04;

import java.util.ArrayList;

/**
 * Wrapper classes exercises
 * 
 * @author Xinyang Zhou
 * @version 1.0
 */
public class Lab04 {

    /**
     * Practice the methods in Wrapper classes.
     * 
     * @param args A reference to a string array containing command-line arguments.
     */
    public static void main(String[] args) {
        // Pass a value to the constructor.
        // Integer num1 = new Integer(1);
        Integer num1;
        num1 = 1;

        // assign a primitive value to a wrapper class object
        // Autoboxes the value 1
        Integer num2;
        num2 = 1;
        // unboxing
        int num3 = num2;

        // Converts a String to an int.
        int iVar = Integer.parseInt("1");
        // Converts a number to a string.
        String str1 = Double.toString(2.222);

        // Create an array,ues the ArrayList class, which works only with objects.
        ArrayList<Integer> al = new ArrayList<Integer>(1);
        // Assigning a value with index 0 in the array.
        al.add(1);
        // Print the value with index 0 in the array.
        System.out.println("The value with index 0 in the array is: " + al.get(0));

        System.out.println("mun1=: " + num1);
        System.out.println("mun2=: " + num2);
        System.out.println("mun3=: " + num3);
        System.out.println("iVar=: " + iVar);
        System.out.println("str1=: " + str1);

        // Print the minimum value of the float.
        System.out.println("The minimum value for an float is "
                + Float.MIN_VALUE);
        // Print the maximum value of the float.
        System.out.println("The maximum value for an float is "
                + Float.MAX_VALUE);

        // Print the results of the problems.
        System.out.println("Is 'a' a digit? " + Character.isDigit('a'));
        System.out.println("Is 'a' a letter? " + Character.isLetter('a'));
        System.out.println("Is 'a' a letter or digit? " + Character.isLetterOrDigit('a'));
        System.out.println("Is 'a' uppercase? " + Character.isUpperCase('a'));
        System.out.println("Is 'a' lowercase? " + Character.isLowerCase('a'));

        // Print uppercase 'a';
        System.out.println("The uppercase 'a':" + Character.toUpperCase('a'));
        // Print lowercase 'A';
        System.out.println("The lowercase 'A':" + Character.toLowerCase('A'));

    }
}
