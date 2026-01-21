package TestCase;
import Browser.browser;
import ScreenShot.capture;
import Pages.page1;
import Pages.page2;

public class Main {
public static void main(String ar[]) throws Exception  {
	browser.openBrowser();
	browser.navigate("Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus");
	capture.screenShot("HomePage");
//	browser.closeBrowser();
	page1.click("Create Account");
	page2.fullName("Shailesh Kumar");
	page2.mail("Shailesh.2026");
	page2.checkAvailability();
	System.out.println(page2.message());
	capture.screenShot("message");
}
}
