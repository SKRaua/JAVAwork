package lab05;



import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Tokenize an expression using specific delimiters or a sentence by space.
 * @author Qi Wang
 * @version 1.0
 */
public class StringSplitter {

	/**
	 * Tokenize a user-entered input using specific delimiters or a space character.
	 * @param args A reference to a string array containing command-line arguments
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String expression;
		StringTokenizer tokenizer;
		
		//Read an arithmetic expression
		System.out.print("Enter an arithmetic expression or a sentence: ");
		expression = input.nextLine();
		
		tokenizer = new StringTokenizer(expression, "()+-*/ ", true);
		
		while(tokenizer.hasMoreTokens()){
			System.out.print(tokenizer.nextToken() + " ");
		}
		
		System.out.println();

		input.close();

	}

}
