package TestCase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1_testng {
	@Test
public void demo1(){
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleIs("Google"));
	System.out.println("opening google");
	AssertJUnit.assertEquals(driver.getTitle(), "Google");
	System.out.println("closing google");
	driver.quit();
}
}
