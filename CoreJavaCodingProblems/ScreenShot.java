package CoreJavaCodingProblems;

import java.awt.AWTException; 
import java.awt.Rectangle; 
import java.awt.Toolkit; 
import java.awt.Robot; 
import java.awt.image.BufferedImage; 
import java.io.IOException; 
import java.io.File; 
import javax.imageio.ImageIO; 
  
public class ScreenShot{ 
    public static final long serialVersionUID = 1L; 
    public static void main(String[] args) 
    { 
        try { 
            Thread.sleep(120); 
            Robot r = new Robot(); 
  
            // It saves screenshot to the value store in path variable 
            String path = "E://ScreenShotbyjava.jpg"; 
  
            // Used to get ScreenSize and capture image 
            Rectangle capture =  
            new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); 
            BufferedImage Image = r.createScreenCapture(capture); 
            ImageIO.write(Image, "jpg", new File(path)); 
            System.out.println("Screenshot is saved to "+path); 
        } 
        catch (AWTException | IOException | InterruptedException ex) { 
            System.out.println(ex); 
        } 
    } 
} 