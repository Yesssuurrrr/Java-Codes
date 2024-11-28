import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input an octal number from the user
        System.out.print("Enter an octal number: ");
        String octal = scanner.next();
        
        // Convert octal to decimal
        int decimal = Integer.parseInt(octal, 8);
        
        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);
        
        // Display the binary result
        System.out.println("The binary representation of octal " + octal + " is: " + binary);
        
        scanner.close();
    }
}
