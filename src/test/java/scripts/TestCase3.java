package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryHomePage;
import pomPages.WishListPage;

public class TestCase3 extends BaseClass {

	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException
	{
		SkillraryHomePage sh = new SkillraryHomePage(driver);
		sh.searchTab(p.getData("searchtext"));
		sh.search();
		
		CoreJavaPage cp = new CoreJavaPage(driver);
		cp.corejava();
		
		WishListPage wp = new WishListPage(driver);;
		wp.closeAlert();
		
		wu.switchToFrame(driver);		
		wp.playbtn();
		Thread.sleep(3000);
		wp.pausebtn();
		wu.switchBackFrame(driver);
		wp.addtowishlist();
		
		Thread.sleep(3000);
		
	}
	
}
