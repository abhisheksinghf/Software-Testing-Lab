import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;

public class ComboBox {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com/campaign/landing.php");
		Select se = new Select(d.findElement(By.name("birthday_month")));
		List<WebElement> mylist = se.getOptions();
		System.out.println(mylist.size());
	}
}
