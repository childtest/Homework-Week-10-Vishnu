package homework.program_2_markSheet;

/* Rewrite the student mark sheet programme (From java-homework-week3
 programmes) using if else and while loop.*/

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            // Input student details
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNo = scanner.nextInt();

            Student student = new Student(name, rollNo);

            // Input and set marks
            int math = getValidMarks("Math");
            int science = getValidMarks("Science");
            int english = getValidMarks("English");
            student.setMarks(math, science, english);

            // Calculate and display results
            student.calculateResults();
            student.printMarkSheet();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

    }

    // Method for valid marks input by the user
    private static int getValidMarks(String subject) {
        int mark = -1;
        while (mark < 0 || mark > 100) {
            System.out.print("Enter " + subject + " marks (0-100): ");
            mark = scanner.nextInt();
            if (mark < 0 || mark > 100) {
                System.out.println("Invalid Input, Marks should be between 0 to 100.");
            }
        }
        return mark;
    }

}
