package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillRaryDemoPage;
import pomPages.SkillraryHomePage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass {

	@Test
	public void tec2() throws InterruptedException, FileNotFoundException, IOException
	{
		SkillraryHomePage hp = new SkillraryHomePage(driver);
		hp.gears();
		hp.skiraryDemo();
		
		wu.switchTabs(driver);
		
		SkillRaryDemoPage sd = new SkillRaryDemoPage(driver);
		wu.dropDown(sd.drpDown(), p.getData("coursename"));
		
		TestingPage tp = new TestingPage(driver);
		wu.dragAndDrop(driver, tp.seleniumTraining(),tp.cart());
		Thread.sleep(5000);
	}
}
