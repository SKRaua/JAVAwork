package ArrayList;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
//import java.io.File;
import java.io.FileNotFoundException;

public class demo {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<String>();
        create(words);
        display(words);
    }

    public static void create(ArrayList<String> words) throws FileNotFoundException {
        Scanner input = new Scanner(new File("words.txt"));
        while (input.hasNext()) {
            words.add(input.next());
        }
        input.close();
    }

    public static void display(ArrayList<String> words) {
        for (String temp : words) {
            System.out.println(temp);
        }
    }
}
