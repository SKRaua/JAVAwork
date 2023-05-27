package XinYangZhouProject04;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * A grade report
 * 
 * @author Xinyang Zhou
 * @version 1.0
 */
public class Project04 {

    /**
     * Read test scores, process scores, and display a final report or save the
     * report into a text file.This can be extended easily to a group of n students.
     * 
     * @param args A reference to a string array containing command-line arguments.
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        FileWriter fw;
        PrintWriter pw;
        String reportName;

        DecimalFormat format1 = new DecimalFormat("000");
        DecimalFormat format2 = new DecimalFormat("000.0");

        int numOfStudents = 4;
        int[] text1Score = new int[numOfStudents];
        int[] text2Score = new int[numOfStudents];
        double[] average = new double[numOfStudents];
        char[] grade = new char[numOfStudents];

        int choice = 1;
        final int GRADE_REPORT = 1;
        final int GRADE_REPORT_IN_FILE = 2;
        final int EXIT = 3;

        // 1.Allow this user to cycle through selections until the selection is 3.
        // If thechoice is 3, end the program.
        do {

            System.out.println("Welcome to Grade Center!");
            System.out.println("Enter 1 to generate and display a grade report.");
            System.out.println("Enter 2 to generate a grade report and save it into a file.");
            System.out.println("Enter 3 to quit.");
            System.out.print("Enter a choice: ");
            // 2.Read user's selection.
            choice = input.nextInt();

            // 3.Determine whether the choice is 1 or 2.
            if (choice == GRADE_REPORT || choice == GRADE_REPORT_IN_FILE) {
                System.out.println("");
                System.out.println("Enter grades for test1 and test2");

                // 4.Read grades entered by the user.
                System.out.println("For test 1,");
                for (int i = 0; i < numOfStudents; i++) {
                    System.out.print("Enter score " + (i + 1) + ": ");
                    text1Score[i] = input.nextInt();
                }
                System.out.println("");
                System.out.println("For test 2,");
                for (int i = 0; i < numOfStudents; i++) {
                    System.out.print("Enter score " + (i + 1) + ": ");
                    text2Score[i] = input.nextInt();
                }
                System.out.println("");
                System.out.println("");

                // 5.Calculate average scores.
                for (int i = 0; i < numOfStudents; i++) {
                    average[i] = average(text1Score[i], text2Score[i]);
                }
                // 6.Calculate letter grades.
                for (int i = 0; i < numOfStudents; i++) {
                    grade[i] = toletterGrade(average[i]);
                }
                switch (choice) {
                    // 7.If the choice is 1,execute the "GRADE_REPORT" section.
                    case GRADE_REPORT:
                        // 8.Display the result,All students' scores, average scores and letter grades.
                        System.out.println("Test 1     Test 2     Average     Grade");
                        System.out.println("------     ------     -------     -----");
                        for (int i = 0; i < numOfStudents; i++) {
                            System.out.println(format1.format(text1Score[i]) + "        "
                                    + format1.format(text2Score[i]) + "        " + format2.format(average[i])
                                    + "       " + grade[i]);
                        }
                        System.out.println("");
                        System.out.println("");

                        break;
                    // 9.If the choice is 2,execute the "GRADE_REPORT_IN_FILE" section.
                    case GRADE_REPORT_IN_FILE:
                        System.out.println("A new file will be created for the report.");
                        System.out.println("Enter the new file name (For example, MyReport.txt.):");
                        // 10.Read the new file name entered by the user.
                        reportName = input.next();
                        fw = new FileWriter(new File(reportName));
                        pw = new PrintWriter(fw);

                        // 11.print the result all students' scores, average scores and
                        // letter grades in the file.
                        pw.println("Test 1     Test 2     Average     Grade");
                        pw.println("------     ------     -------     -----");
                        for (int i = 0; i < numOfStudents; i++) {
                            pw.println(format1.format(text1Score[i]) + "        " + format1.format(text2Score[i])
                                    + "        "
                                    + format2.format(average[i]) + "       " + grade[i]);
                        }
                        System.out.println("Report written into a file: " + reportName);
                        System.out.println("");
                        System.out.println("");

                        fw.close();
                        pw.close();
                        break;
                }
            }
        } while (choice != EXIT);
        input.close();
    }

    /**
     * Calculate Averages
     * 
     * @param score1 An integer
     * @param score2 An integer
     * @return average The average of two scores.
     */
    public static double average(int score1, int score2) {
        double average;
        // 1.Score one plus score two, then divide by two.
        average = (score1 + score2) / 2.0;
        return average;
    }

    /**
     * Assigning Letter Grade
     * 
     * @param score An double type
     * @return letterGrade The letter grade
     */
    public static char toletterGrade(Double score) {
        char letterGrade;
        if (score >= 90) {
            // 1.A score of 90 or above is A.
            letterGrade = 'A';
        } else if (score >= 80) {
            // 2.A score of 80 or above is B.
            letterGrade = 'B';
        } else if (score >= 70) {
            // 3.A score of 70 or above is C.
            letterGrade = 'C';
        } else {
            // 4.The rest is F.
            letterGrade = 'F';
        }
        return letterGrade;
    }
}
