import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.linkedin.com/login");
		d.manage().window().maximize();
		d.findElement(By.name("session_key")).sendKeys("dipstlab@gmail.com");
		d.findElement(By.name("session_password")).sendKeys("Stlab@123");
		d.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[1]/form/div[3]/button")).click();
		String s = d.getCurrentUrl();
		if(s.equals("https://www.linkedin.com/feed/"))
		{
			System.out.println("Login Successfull");
		}
		else{
			System.out.println("Login Failed");
		}
		
	}
}
