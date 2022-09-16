package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsBtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillRaryDemo;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn;
	
	public SkillraryHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gears()
	{
		gearsBtn.click();
	}
	
	public void skiraryDemo()
	{
		skillRaryDemo.click();
	}
	
	public void searchTab(String text)
	{
		searchtb.sendKeys(text);;
	}
	
	public void search()
	{
		searchbtn.click();
	}
}
