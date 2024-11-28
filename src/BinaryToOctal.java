import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a binary number from the user
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        
        // Convert binary to decimal
        int decimal = Integer.parseInt(binary, 2);
        
        // Convert decimal to octal
        String octal = Integer.toOctalString(decimal);
        
        // Display the octal result
        System.out.println("The octal representation of binary " + binary + " is: " + octal);
        
        scanner.close();
    }
}
