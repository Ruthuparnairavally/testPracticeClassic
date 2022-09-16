package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {


	@FindBy(xpath="//a[text()='X']")
	private WebElement clsalert;
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement play;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pause;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlist;
	
	public WishListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void closeAlert()
	{
		clsalert.click();
	}
	
	public void playbtn()
	{
		play.click();
	}
	
	public void pausebtn()
	{
		pause.click();
	}
	
	public void addtowishlist()
	{
		wishlist.click();
	}
}
