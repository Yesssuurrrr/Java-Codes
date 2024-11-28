import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Generate the Fibonacci series
        if (n <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            long[] fibonacciSeries = new long[n];
            fibonacciSeries[0] = 0;
            if (n > 1) {
                fibonacciSeries[1] = 1;
                for (int i = 2; i < n; i++) {
                    fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
                }
            }
            System.out.println("The first " + n + " terms of the Fibonacci series are:");
            for (long num : fibonacciSeries) {
                System.out.print(num + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

