
    import java.util.Scanner;

    public class SquareAreaCalculator {
        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the side length of the square
            System.out.print("Enter the side length of the square: ");

            // Read the user's input as a double (assuming decimal values are allowed)
            double sideLength = scanner.nextDouble();

            // Close the Scanner since we no longer need it
            scanner.close();

            // Calculate the area of the square
            double area = sideLength * sideLength;

            // Display the result
            System.out.println("The area of the square with side length " + sideLength + " is: " + area);
        }
    }


