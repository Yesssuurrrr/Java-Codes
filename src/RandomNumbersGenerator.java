import java.util.Random;

public class RandomNumbersGenerator {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();
        
        // Define the range boundaries
        int lowerBound = -200;
        int upperBound = 50;
        
        // Generate and print 8 random numbers
        System.out.println("8 random numbers between -200 and 50:");
        for (int i = 0; i < 8; i++) {
            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            System.out.println(randomNumber);
        }
    }
}
