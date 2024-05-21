import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class DemoWebpage {
	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("file:///C:\\Users\\Lenovo\\Downloads\\gcd.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("n1")).sendKeys("30");
		driver.findElement(By.name("n2")).sendKeys("20");
		driver.findElement(By.name("get_gcd")).click();
		String result = driver.findElement(By.name("result")).getAttribute("value");
		
		System.out.println("GCD is "+result);
	}
}
