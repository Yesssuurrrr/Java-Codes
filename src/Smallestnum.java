import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class Smallestnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input three numbers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        // Use inbuilt function to find the smallest number
        int smallest = Collections.min(Arrays.asList(num1, num2, num3));
        
        // Display the result
        System.out.println("The smallest number is: " + smallest);
        
        scanner.close();
    }
}
