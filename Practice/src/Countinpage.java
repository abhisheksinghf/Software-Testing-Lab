////import org.openqa.selenium.*;
////import org.openqa.selenium.firefox.*;
////import java.util.*;
////
////public class Countinpage {
////	public static void main(String[] args)
////	{
////		System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
////		WebDriver d = new FirefoxDriver();
//////		d.get("https://dtek.karnataka.gov.in");
////		d.get("file:///C:\\Users\\Lenovo\\Documents\\Zooki_v1.0\\Zooki_v1.0.0\\HTML\\index-4.html");
////		List<WebElement> mylist = d.findElements(By.xpath("//a"));
////		System.out.println("No of Objects Present are "+mylist.size());
////	}
////}
//import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.*;
//import java.util.*;
//
//public class Countinpage{
//	public static void main(String[] args)
//	{
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		WebDriver d = new FirefoxDriver();
//		d.get("https://abhisheksinghf.github.io/College_Website/");
//		List<WebElement> mylist = d.findElements(By.xpath("//a"));
//		System.out.println("The Number of Objects Present are "+mylist.size());
//	}
//}
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import java.util.*;

public class Countinpage{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://dtek.karnataka.gov.in");
		
		List<WebElement> mylist = d.findElements(By.xpath("//a"));
		System.out.println("Total Number of Objects in a Page are : "+mylist.size());
		
	}
}
















