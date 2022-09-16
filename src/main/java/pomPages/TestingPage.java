package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	@FindBy(id="Selenium Training")
	private WebElement selTraining;
	
	@FindBy(id="cartArea")
	private WebElement cartarea;
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement seleniumTraining()
	{
		return selTraining;
		
	}
	
	public WebElement cart()
	{
		return cartarea;
		
	}
}
