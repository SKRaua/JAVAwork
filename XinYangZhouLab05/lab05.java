package XinYangZhouLab05;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * A arithmetic expressions tokenizer
 * 
 * @author Xinyang Zhou
 * @version 1.0
 */
public class lab05 {

    /**
     * Read arithmetic expressions from the input file, tokenizes it, and
     * displays all the tokens of the expressions one token per line.
     * 
     * @param args A reference to a string array containing command-line arguments.
     */
    public static void main(String[] args) throws IOException {
        StringTokenizer tokenizer;
        String expression;
        Scanner input = new Scanner(new File("expressions.txt"));

        // Loop read expression.
        for (int i = 1; input.hasNextLine(); i++) {
            // Read an expression on one line.
            expression = input.nextLine();
            // Output the expression for separation.
            System.out.println("Expression " + i + ": " + expression);
            // Remove spaces from the expression.
            expression = expression.replaceAll(" ", "");
            // Tokenize the expression.
            tokenizer = new StringTokenizer(expression, "()*/+-", true);

            // Output this expression.
            while (tokenizer.hasMoreTokens()) {
                System.out.println(tokenizer.nextToken());
            }
        }
        input.close();
    }
}
