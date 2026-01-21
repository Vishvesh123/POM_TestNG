package Browser;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class browser {
public static WebDriver driver;
public static WebDriverWait wait;
public static Actions action;
public static Select select;
	//opening the browser
public static void openBrowser() throws Exception{
	try {
		String choice = utility.properties("browser"); //chrome
		if(choice.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(choice.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else if(choice.equalsIgnoreCase("FireFox")) {
			driver=new FirefoxDriver();
		}
	}catch(Exception e) {
		System.out.println("Browser - openBrowser");
	}
}

// Navigate to the URL
public static void navigate(String title) throws Exception{
	try {
		driver.get(utility.properties("url")); //https://www.rediff.com/
		driver.manage().window().maximize();
		action = new Actions(driver);
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(title));
	}catch(Exception e) {
		System.out.println("Browser - navigateBrowser"+ e);
	}
}

//Close Browser

public static void closeBrowser() {
	try {
		driver.quit();
	}catch(Exception e) {
		System.out.println("Browser - close"+ e);
	}
}

}
