public class LargestNumber {
    public static void main(String[] args) {
        // Define three numbers
        int num1 = 25;
        int num2 = 42;
        int num3 = 17;
        
        // Determine the largest number
        int largest = num1;
        
        if (num2 > largest) {
            largest = num2;
        }
        
        if (num3 > largest) {
            largest = num3;
        }
        
        // Display the result
        System.out.println("The largest number is: " + largest);
    }
}
