import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
public class CountObjectsOnWebpage {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://yourcodepartner.ga");
		List<WebElement> mylist = d.findElements(By.xpath("//a"));
		System.out.println("No of Elements are "+mylist.size());
	}
	
}