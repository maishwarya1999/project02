
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Prompt the user to enter the second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Close the scanner to prevent resource leak
            scanner.close();

            // Calculate the sum using the addNumbers method
            double sum = addNumbers(num1, num2);

            // Display the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        }

        // Method to add two numbers
        public static double addNumbers(double a, double b) {
            return a + b;
        }
    }