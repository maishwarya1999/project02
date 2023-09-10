
    import java.util.Scanner;

    public class SubtractionCalculator {
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

            // Calculate the difference using the subtractNumbers method
            double difference = subtractNumbers(num1, num2);

            // Display the result
            System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);
        }

        // Method to subtract two numbers
        public static double subtractNumbers(double a, double b) {
            return a - b;
        }
    }


