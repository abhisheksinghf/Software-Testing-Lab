import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class DemonstrateSelenium{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://software-testing-lab.github.io/GCD/");
		d.findElement(By.name("n1")).sendKeys("20");
		d.findElement(By.name("n2")).sendKeys("80");
		d.findElement(By.name("get_gcd")).click();
		String result = d.findElement(By.name("result")).getAttribute("value");
		System.out.println("The GCD is "+result);
	}
}