package XinYangZhouLab07;

/**
 * Test the dog design.
 * 
 * @author Xinyang Zhou
 * @version 1.0
 */
public class Driver {
    /**
     * Creates dog instances and uses them to test the instance methods.
     * 
     * @param args A reference to a string array containing command-line arguments
     */
    public static void main(String[] args) {
        // Test constructors.

        // Create a default dog, dog1.
        Dog dog1 = new Dog();

        // Create a dog with a name “Buddy” or a name of your choice, dog2.
        Dog dog2 = new Dog("Buddy");

        // Create a string object, string1.
        String string1 = new String();

        // Test toString.
        // Print dog1.
        System.out.println(dog1.toString());
        // Print dog2.
        System.out.println(dog2.toString());

        // Test getName.
        // Retrieve dog1’s name. Print the name.
        System.out.println("dog1's name: " + dog1.getName());
        // Retrieve dog2’s name. Print the name.
        System.out.println("dog2's name: " + dog2.getName());

        // Test setName.
        // Change dog1’s name. Print dog1.
        dog1.setName("Hamme");
        System.out.println(dog1.toString());
        // Change dog2’s name. Print dog2.
        dog2.setName("Quito");
        System.out.println(dog2.toString());

        // Test equal.
        // Compare dog1 with dog2, print the comparison result.
        System.out.println(dog1.equals(dog2));
        // Compare dog1 with string1, print the comparison result.
        System.out.println(dog1.equals(string1));
    }
}
