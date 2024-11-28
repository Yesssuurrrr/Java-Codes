import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a hexadecimal number from the user
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.next();
        
        // Convert hexadecimal to decimal
        int decimal = Integer.parseInt(hex, 16);
        
        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);
        
        // Display the binary result
        System.out.println("The binary representation of hexadecimal " + hex + " is: " + binary);
        
        scanner.close();
    }
}
