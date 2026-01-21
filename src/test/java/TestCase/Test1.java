package TestCase;
import Browser.browser;

import Pages.page1;
import ScreenShot.capture;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeMethod
	public void open() throws Exception{
		browser.openBrowser();
	}
	
	@DataProvider(name="data1")
	public Object[][] data() throws Exception{
		Object[][] arrobj= {{"Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus","Rediff.com"}};
		return arrobj;
	}
	@Test(dataProvider="data1")
	public void Navigate(String wait,String verification) throws Exception{
		browser.navigate(wait);
		capture.screenShot("Navigate");
		boolean condition=page1.title().contains(verification);
		Assert.assertTrue(condition);
		Reporter.log("Testcase 1 Title Asssertion pass");
	}
   @AfterMethod
   public void close() throws Exception{
	   browser.closeBrowser();
   }
}
