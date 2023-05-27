package demo1;

import java.io.*;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("lll.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("nnbb");
        pw.close();
    }
}
