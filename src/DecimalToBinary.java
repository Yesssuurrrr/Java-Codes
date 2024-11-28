import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a decimal number from the user
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);
        
        // Display the binary result
        System.out.println("The binary representation of " + decimal + " is: " + binary);
        
        scanner.close();
    }
}
