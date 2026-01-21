package TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
public void demo1(){
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.rediff.com/");
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleIs("Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus"));
	System.out.println("opening reddiff");
	AssertJUnit.assertEquals(driver.getTitle(), "Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus");
	System.out.println("closing rediff");
	driver.quit();
}
	
@BeforeTest
public void beforetest() {
	System.out.println("BeforeTest");
	
}
@BeforeClass
public void beforeclass() {
	System.out.println("BeforeClass");
}

@BeforeMethod
public void beforemethod() {
	System.out.println("BeforeMethod");
}
@AfterMethod
public void Aftermethod() {
	System.out.println("AfterMethod");
}
@AfterClass
public void afterclass() {
	System.out.println("AfterClass");
}
@AfterTest
public void aftertest() {
	System.out.println("AfterTest");
}
}

