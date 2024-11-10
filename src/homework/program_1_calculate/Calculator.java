package homework.program_1_calculate;

/* Create four methods with manes “addition”, “subtraction”, “division”,
 and “multiplication”. All methods are instance methods and it doesn’t
 return anything. But it has two parameters with the names “int a” and
 “int b”. Also each method has System.out.println(). This prints the
 result. Also create one more method with the name “calculateResult”
 with three parameters with name int a, int b and char symbol. Write the
 logic in the calculateResult method that when the user enters first
 number and second number and symbol based on symbol it does
 calculate*/

public class Calculator {

    public void addition(int a, int b) {
        try {
            System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
        } catch (Exception e) {
            System.out.println("An error occurred during addition: " + e.getMessage());
        }
    }


    public void subtraction(int a, int b) {
        try {
            System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
        } catch (Exception e) {
            System.out.println("An error occurred during subtraction: " + e.getMessage());
        }
    }


    public void multiplication(int a, int b) {
        try {
            System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
        } catch (Exception e) {
            System.out.println("An error occurred during multiplication: " + e.getMessage());
        }
    }

    public void division(int a, int b) {
        try {
            if (b != 0) {
                System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred during division: " + e.getMessage());
        }
    }

    public void calculateResult(int a, int b, char symbol) {
        try {
            switch (symbol) {
                case '+':
                    addition(a, b);
                    break;
                case '-':
                    subtraction(a, b);
                    break;
                case '*':
                    multiplication(a, b);
                    break;
                case '/':
                    division(a, b);
                    break;
                default:
                    System.out.println("Invalid operation symbol. Please use +, -, *, or /.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("An error occurred in calculateResult method: " + e.getMessage());
        }
    }

}
