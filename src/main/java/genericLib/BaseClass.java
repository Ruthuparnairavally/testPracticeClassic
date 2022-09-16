package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public PropertyFile p = new PropertyFile();
	public WebDriverUtilities wu = new WebDriverUtilities();
	
	@BeforeMethod
	public void openApp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getData("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		int status = res.getStatus();
		String name = res.getName();
		
		if(status==2)
		{
			ScreenShot s = new ScreenShot();
			s.getScreenShot(driver, name);
		}
		driver.quit();
	}
}
