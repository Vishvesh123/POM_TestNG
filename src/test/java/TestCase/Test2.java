package TestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser.browser;
import Pages.page1;
import Pages.page2;
import ScreenShot.capture;

public class Test2 {
@BeforeMethod
public void open() throws Exception{
	browser.openBrowser();
}

@DataProvider(name="data2")
public Object[][] data(){
	Object[][] obj= {{"Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus","Create Account","FormName=user_details"}};
	return obj;
}

@Test(dataProvider="data2")
public void account(String wait ,String text,String link) throws Exception{
	browser.navigate(wait);
	page1.click(text);
	capture.screenShot("Account");
	boolean result=page2.getUrl().endsWith(link);
	Assert.assertTrue(result);
	capture.screenShot("Message");
	Reporter.log("Testcase 2 Url Assertion pass");
}

@AfterMethod
public void close() throws Exception {
	browser.closeBrowser();
}
}
