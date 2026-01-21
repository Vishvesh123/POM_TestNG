package Locators;
import Browser.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Page1Object extends browser {
static By logo=By.xpath("//div[@class='logo']");
static By createAccount=By.tagName("a");

public static WebElement logo() {
	WebElement element= driver.findElement(logo);
	return element;
}

public static List<WebElement> link(){
	List<WebElement> element=driver.findElements(createAccount);
	return element;
}
}
