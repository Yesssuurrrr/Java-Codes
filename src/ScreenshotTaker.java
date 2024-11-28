import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ScreenshotTaker {
    public static void main(String[] args) {
        try {
            // Create a Robot instance
            Robot robot = new Robot();
            
            // Capture the screen dimensions
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            
            // Capture the screenshot
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            
            // Save the screenshot to a file
            File screenshotFile = new File("screenshot.png");
            ImageIO.write(screenFullImage, "png", screenshotFile);
            
            System.out.println("Screenshot taken and saved as screenshot.png");
        } catch (AWTException | IOException ex) {
            System.err.println("An error occurred: " + ex.getMessage());
        }
    }
}
