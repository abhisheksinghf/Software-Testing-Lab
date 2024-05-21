import com.thoughtworks.selenium.*;

@SuppressWarnings("deprecation")
public class exp11 extends SeleneseTestCase
{ 
public void setUp() throws Exception {
 setUp("http://www.redbus.in/","*firefox");
 }
public void testloginlogout()
{
 selenium.setSpeed("1000"); 
 selenium.open("index.html/");
 selenium.waitForPageToLoad("30000");
 selenium.windowMaximize();
 int num = selenium.getXpathCount("//p").intValue();
 System.out.println("The number of option elements present are " +num);
 }
}
