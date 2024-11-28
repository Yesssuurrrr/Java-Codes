import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms in the harmonic series: ");
        int n = scanner.nextInt();

        // Generate the harmonic series
        if (n <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            System.out.print("Harmonic series: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(1.0 / i + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
