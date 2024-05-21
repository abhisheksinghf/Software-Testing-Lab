import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class LoginPage{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.linkedin.com/login");
		d.findElement(By.name("session_key")).sendKeys("dipstlab@gmail.com");
		d.findElement(By.name("session_password")).sendKeys("Stlab@123");
		d.findElement(By.tagName("button")).click();
		String url = d.getCurrentUrl();
		if(url.equals("https://www.linkedin.com/feed/"))
		{
			System.out.println("Login Successfull! ");
		}
		else
		{
			System.out.println("Login Failed! ");
		}
	}
}