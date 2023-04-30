import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalculatorTest {
	
	
   @Test
   public void main() throws InterruptedException, IOException, AWTException, UnsupportedFlavorException {
      // Launch the calculator application
      Runtime.getRuntime().exec("calc.exe");

      // Wait for the calculator application to launch
      Thread.sleep(5000);

      // Create a new Robot object
      Robot robot = new Robot();

      // Simulate keyboard input to enter numbers and perform operations
      robot.keyPress(KeyEvent.VK_1);
      robot.keyRelease(KeyEvent.VK_1);

      robot.keyPress(KeyEvent.VK_ADD);
      robot.keyRelease(KeyEvent.VK_ADD);

      robot.keyPress(KeyEvent.VK_2);
      robot.keyRelease(KeyEvent.VK_2);

      robot.keyPress(KeyEvent.VK_EQUALS);
      robot.keyRelease(KeyEvent.VK_EQUALS);
      
      robot.keyPress(KeyEvent.VK_CONTROL);
      Thread.sleep(200);															
      robot.keyPress(KeyEvent.VK_C);
      Thread.sleep(200);

      robot.keyRelease(KeyEvent.VK_CONTROL);
      Thread.sleep(200);
      robot.keyRelease(KeyEvent.VK_C);
      Thread.sleep(200);
      
      
      
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
  	String result = (String) clipboard.getData(DataFlavor.stringFlavor);

  	// Print the result to the console
  	System.out.println("Result: " + result);

//      WebDriver driver = new EdgeDriver();
//      // Verify the result 
//      WebElement resultElement = driver.findElement(By.id("CalculatoResults"));
//      String resultText = resultElement.getText();
//      // Verify the result
//      if (resultText.equals("3")) {
//          System.out.println("Test passed: result is correct");
//      } else {
//          System.out.println("Test failed: result is incorrect");
//      }
//
//      // Close the calculator application
//      Runtime.getRuntime().exec("taskkill /f /im calc.exe");
//   }
   }
}
