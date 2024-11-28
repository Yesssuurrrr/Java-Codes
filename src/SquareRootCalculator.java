import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate the square root
        double squareRoot = Math.sqrt(number);

        // Print the result
        System.out.println("The square root of " + number + " is " + squareRoot);

        // Close the scanner
        scanner.close();
    }
}

