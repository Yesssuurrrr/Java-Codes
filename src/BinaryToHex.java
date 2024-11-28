import java.util.Scanner;

public class BinaryToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a binary number from the user
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        
        // Convert binary to decimal
        int decimal = Integer.parseInt(binary, 2);
        
        // Convert decimal to hexadecimal
        String hex = Integer.toHexString(decimal).toUpperCase();
        
        // Display the hexadecimal result
        System.out.println("The hexadecimal representation of binary " + binary + " is: " + hex);
        
        scanner.close();
    }
}
