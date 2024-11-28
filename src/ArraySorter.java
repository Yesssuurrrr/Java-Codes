import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {
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

        // Sort the array
        Arrays.sort(numbers);

        // Find the middle index
        int midIndex = n / 2;

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Print the value at the middle index
        if (n % 2 == 0) {
            // If even number of elements, average the two middle values
            double midValue = (numbers[midIndex - 1] + numbers[midIndex]) / 2.0;
            System.out.println("Value at the middle index: " + midValue);
        } else {
            System.out.println("Value at the middle index: " + numbers[midIndex]);
        }

        // Close the scanner
        scanner.close();
    }
}
