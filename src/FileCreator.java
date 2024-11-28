import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the file name
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        // Prompt the user to enter the data to be written into the file
        System.out.println("Enter the data to be saved in the file:");
        String data = scanner.nextLine();

        // Create and write data to the file
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(data);
            System.out.println("Data has been successfully written to " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
