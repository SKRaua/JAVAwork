package wrapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A program that reads arithmetic expressions from an input file and tokenizes
 * them.
 */
public class Tokenizer {
    /**
     * Reads the expressions from the input file, tokenizes them, and displays the
     * tokens.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        // The name of the input file
        String fileName = "expressions.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                List<String> tokens = tokenize(line);
                for (String token : tokens) {
                    System.out.println(token);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    /**
     * Tokenizes an arithmetic expression by splitting it into individual tokens.
     *
     * @param expression The expression to tokenize.
     * @return A list of the individual tokens in the expression.
     */
    private static List<String> tokenize(String expression) {
        List<String> tokens = new ArrayList<>();

        // Split the expression on whitespace and parentheses, and keep the parentheses
        // as separate tokens
        String[] parts = expression.split("\\s+|(?=[()])|(?<=[()])");

        for (String part : parts) {
            if (!part.isEmpty()) {
                tokens.add(part);
            }
        }

        return tokens;
    }
}
