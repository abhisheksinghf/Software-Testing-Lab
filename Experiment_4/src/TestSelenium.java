
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestSelenium {
public static void main(String[] args) {
WebDriver driver1;
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
driver1 =new FirefoxDriver();
driver1.get("file:///C://Users//Lenovo//Downloads//gcd.html");
driver1.manage().window().maximize();
driver1.findElement(By.name("n1")).sendKeys("100");
driver1.findElement(By.name("n2")).sendKeys("78");
driver1.findElement(By.name("get_gcd")).click();
String result= driver1.findElement(By.name("result")).getAttribute("value");
System.out.println("the gcd is:"+ result);
}
}