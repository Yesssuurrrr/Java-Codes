import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilePrinter {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "HelloWorld.java";

        // Initialize BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line from the file and print it
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
