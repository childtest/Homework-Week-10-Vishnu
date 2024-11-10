package homework.program_1_calculate;

/* Write a “main” method into the main class. It has a scanner that takes
 user input. Also write the logic that it ask user to “Enter first Number:”,
 “Enter second Nuber:” “Please enter one of symbol +,-,*, /:” if user
 enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 other symbols.
 5. With the result it’s also print one more message “Would you like to do
 more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 enter Y program asking the user to enter First Number, and if user enter
 Nprogramme should terminate) */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        Calculator calculator = new Calculator(); // Create a Calculator object to perform calculations
        char continueCalculation;

        // Start a loop to allow the user to perform multiple calculations
        do {
            try {
                System.out.print("Enter first Number: ");
                int a = scanner.nextInt();

                System.out.print("Enter second Number: ");
                int b = scanner.nextInt();

                // Ask the user for the operation symbol (+, -, *, /)
                System.out.print("Please enter one of symbol +, -, *, /: ");
                char symbol = scanner.next().charAt(0);

                // Call the calculateResult method
                calculator.calculateResult(a, b, symbol);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }

            // Ask the user if they want to perform another calculation
            System.out.print("Would you like to do more calculations? Please enter 'Y' or 'N': ");
            continueCalculation = scanner.next().toUpperCase().charAt(0);

        } while (continueCalculation == 'Y'); // Continue if user enters 'Y', exit if 'N'

        // thank-you message when the program ends
        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }

}
