package XinYangZhouLab08;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The Driver of Dog class
 * 
 * @author Xinyang Zhou
 * @version 1.0
 */
public class Driver {

    /**
     * Starts the program for testing the Dog class.
     * 
     * @param args A reference to a string array containing command-lins arguments
     */
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        // Create a list of dogs and store them in an array list.
        create(dogs);

        // Print this list of dogs.
        print(dogs);

        // Sort the list using the static sort method in class Collections.
        Collections.sort(dogs);

        // Print this list of dogs again.
        print(dogs);

    }

    /**
     * Adds the dogs into the dogs list.
     * 
     * @param dogs The reference to the list of dogs
     */
    public static void create(ArrayList<Dog> dogs) {
        dogs.add(new Dog("Hamme"));
        dogs.add(new Dog("Quito"));
        dogs.add(new Dog("Alea"));
        dogs.add(new Dog("Anwyll"));
        dogs.add(new Dog("Satchel"));
        dogs.add(new Dog("Iscah"));
        dogs.add(new Dog("Maebh"));
        dogs.add(new Dog("Rowdy"));
        dogs.add(new Dog("Deja"));
    }

    /**
     * Prints the list.
     * 
     * @param dogs The reference to the list of dogs
     */
    public static void print(ArrayList<Dog> dogs) {
        // Displays the objects of the dogs list.
        System.out.println("The dogs list: ");
        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }
        System.out.println();
    }
}
