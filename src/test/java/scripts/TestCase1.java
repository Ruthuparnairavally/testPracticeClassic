package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillRaryDemoPage;
import pomPages.SkillraryHomePage;

public class TestCase1 extends BaseClass {

	@Test
	public void tc1() throws InterruptedException
	{
		SkillraryHomePage hp = new SkillraryHomePage(driver);
		hp.gears();
		hp.skiraryDemo();
		
		wu.switchTabs(driver);
		
		SkillRaryDemoPage sd = new SkillRaryDemoPage(driver);
		
		wu.mouseHover(driver, sd.coursetb());
		sd.seleniumTraining();
		
		AddToCartPage ac = new AddToCartPage(driver);
		ac.addbtn();
		ac.cart();
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
}
