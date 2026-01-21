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

public class Test3 {
@BeforeMethod
public void open() throws Exception {
	browser.openBrowser();
}
@DataProvider(name ="data3")
public Object[][] data(){
	Object[][] obj= {{"Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus","Create Account","Shailesh Kumar","Shailesh.2026","Yippie! The ID you've chosen is available."}};
	return obj;
}

@Test(dataProvider="data3")
public void mailAvailability(String wait,String text,String name ,String mail,String verification) throws Exception {
	browser.navigate(wait);
	page1.click(text);
	page2.fullName(name);
	page2.mail(mail);
	page2.checkAvailability();
	
	Assert.assertEquals(page2.message(), verification);
	capture.screenShot("Message");
	Reporter.log("Testcase 3 Text Assertion pass");
}

@AfterMethod
public void close() {
	browser.closeBrowser();
}


}
