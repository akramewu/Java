/**
 * 
 */
package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Akram
 *
 */
public class TestIEBrowser 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "C:\\Libraries\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://enterprise-demo.orangehrmlive.com/");
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		driver.close();

	}

}
