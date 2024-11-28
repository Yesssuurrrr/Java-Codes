import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a binary number from the user
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        
        // Convert binary to decimal
        int decimal = Integer.parseInt(binary, 2);
        
        // Display the decimal result
        System.out.println("The decimal representation of binary " + binary + " is: " + decimal);
        
        scanner.close();
    }
}
