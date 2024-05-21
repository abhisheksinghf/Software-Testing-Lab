import org.junit.Assert; 
import org.junit.Test; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 

public class Login { 
@Test
public void testLoginPage() 
 { 
 //Set system property 
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
 
 //Creates instance of webDriver class
 WebDriver driver=new ChromeDriver(); 
 
 //Launch the browser and navigate to "https://www.linkedin.com/login"
 driver.navigate().to("https://www.linkedin.com/login"); 
 
 //Maximize the Browser
 driver.manage().window().maximize(); 
 
 // Locate the username textbox and send value 
 driver.findElement(By.id("username")).sendKeys("dipstlab@gmail.com"); 
 
 // Locate the password textbox and send value
 driver.findElement(By.id("password")).sendKeys("Stlab@123"); 
 
 //Locate "Sign in" button and submit
 driver.findElement(By.xpath("//button[text()='Sign in']")).submit(); 
 
 //Expected URL on successful login is: https://www.linkedin.com/feed/
 String Expurl = "https://www.linkedin.com/feed/"; 
 
 //Compares expected result with actual result. 
 Assert.assertEquals(Expurl, driver.getCurrentUrl()); 
 
 System.out.println("Test Passed\nLogin Successful: "); 
 
 //Close the browser
 driver.close(); 
 } 
}