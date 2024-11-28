public class SmallestNumber {
    public static void main(String[] args) {
        // Define three numbers
        int num1 = 25;
        int num2 = 42;
        int num3 = 17;
        
        // Determine the smallest number
        int smallest = num1;
        
        if (num2 < smallest) {
            smallest = num2;
        }
        
        if (num3 < smallest) {
            smallest = num3;
        }
        
        // Display the result
        System.out.println("The smallest number is: " + smallest);
    }
}
