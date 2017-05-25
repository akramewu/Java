/**
 * 
 */
package crossBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Akram
 *
 */
public class VerifyTitle 
{
	
   WebDriver driver;
   @Test
   @Parameters("browser")
   //String browserName;
   
   public void verifypagetitle(String browserName)
   {
	   if(browserName.equalsIgnoreCase("firefox"))
	   {
		   driver = new FirefoxDriver();
	   }
	   else if(browserName.equalsIgnoreCase("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver", "C:\\Libraries - Copy\\chromedriver.exe");
		   driver = new ChromeDriver();
	   }
	   else if (browserName.equalsIgnoreCase("IE")) 
	   {
		   System.setProperty("webdriver.ie.driver", "C:\\Libraries\\IEDriverServer.exe");
		   driver = new InternetExplorerDriver();
	   }
	   
	   driver.manage().window().maximize();
	   driver.get("http://www.facebook.com");
	   System.out.println(driver.getTitle());
	   driver.quit();
   }
}
