import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] numbers = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print the array in reverse order
        System.out.println("Array in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Print the value at the last index
        System.out.println("Value at the last index: " + numbers[n - 1]);

        // Close the scanner
        scanner.close();
    }
}
