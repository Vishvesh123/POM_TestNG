package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.browser;

public class Page2Object extends browser{
	static By waitCondition=By.xpath("//h2[text()='Create a Rediffmail account']");
static By fullName=By.xpath("//input[@placeholder='Enter your full name']");
static By mail =By.xpath("//input[@placeholder='Enter Rediffmail ID']");
static By availabilityButton=By.xpath("//input[@value='Check availability']");
static By message=By.xpath("//span[@class='success']");

public static WebElement findWaitCondition() {
	WebElement element=driver.findElement(waitCondition);
return element;
}


public static WebElement findName() {
	WebElement element=driver.findElement(fullName);
	return element;
}
public static WebElement findMail() {
	WebElement element=driver.findElement(mail);
	return element;
}
public static WebElement fullAvailabilityButton() {
	WebElement element=driver.findElement(availabilityButton);
	return element;
}

public static WebElement findMessage() {
	WebElement element=driver.findElement(message);
return element;
}

}
