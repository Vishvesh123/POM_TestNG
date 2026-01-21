package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Browser.browser;

import Locators.Page2Object;

public class page2 extends browser{
	
	public static String getUrl() {
		wait.until(ExpectedConditions.visibilityOf(Page2Object.findWaitCondition()));
		return driver.getCurrentUrl();
	}
public static void fullName(String name) {
	try {
		
		wait.until(ExpectedConditions.visibilityOf(Page2Object.findWaitCondition()));
		WebElement element=Page2Object.findName();
		element.sendKeys(name);
//		WebElement element2=Page2Object.findMail();
//		WebElement element3=Page2Object.fullAvailabilityButton();
		
//		element2.sendKeys("sailesh");
//		element3.click();
	}catch(Exception e) {
		System.out.println("Error"+e);
	}
}

public static void mail(String id) {
	WebElement element=Page2Object.findMail();
	element.sendKeys(id);
}

public static void checkAvailability() {
	try {
		Page2Object.fullAvailabilityButton().click();
		
	}catch(Exception e) {
		System.out.println("Error"+e);
	}
}
public static String message() {
	String msg=null;
	try {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("success")));
	msg=Page2Object.findMessage().getText();
	System.out.println(msg);
	}catch(Exception e) {
		System.out.println(e);
	}
	return msg;
}

	
}
