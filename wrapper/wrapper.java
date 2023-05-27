package wrapper;

import java.util.StringTokenizer;

public class wrapper {
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer("a+b*(c/d)=e", "()+-*/", true);
        while (tokenizer.hasMoreTokens()) {
            System.out.print(tokenizer.nextToken() + " ");
        }
    }
}
