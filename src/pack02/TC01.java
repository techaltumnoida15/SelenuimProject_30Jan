package pack02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01 {
	
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		//Open browser
		System.setProperty("webdriver.chrome.driver", "H:\\Regression\\Selenium\\Drivers\\ChromeDriver_88\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.naukri.com");
	}
	
	@Test
	public void testCase01() throws Exception {
		System.out.println("Running Test");
		
		//Click on Login
		driver.findElement(By.id("login_Layer")).click();
		System.out.println("Click on Login");
		
		//Wait
		Thread.sleep(3000);
		
		//Click on register for free
		//driver.findElement(By.xpath("(//a[@href='https://www.naukri.com/account/createaccount?othersrcp=16201&err=1'])[2]")).click();
		
		WebElement registerLink = driver.findElement(By.xpath("(//a[@href='https://www.naukri.com/account/createaccount?othersrcp=16201&err=1'])[2]"));
		registerLink.click();
		System.out.println("Click on Register");
		
		Thread.sleep(3000);
		
		//Click on 'I am fresher'
		//driver.findElement(By.cssSelector("button[class='action-btn fresh'")).click();
		
		WebElement fresherButton = driver.findElement(By.cssSelector("button[class='action-btn fresh'"));
		fresherButton.click();
		System.out.println("Click on I am Fresher");
		
		Thread.sleep(3000);
		
		WebElement outSideIndiaCheckbox = driver.findElement(By.cssSelector("label[for='outsideIndia']"));
		outSideIndiaCheckbox.click();
		System.out.println("Click on Outside India checkbox.");
		
		Thread.sleep(1000);
		
		int t  = 10;
		
		System.out.println(t);
		System.out.println("t");
		
		boolean isCheckBoxSelected_OutsideIndia = driver.findElement(By.id("outsideIndia")).isSelected();
		System.out.println(isCheckBoxSelected_OutsideIndia);
		
		if(isCheckBoxSelected_OutsideIndia) {
			System.out.println("Outside India checkbox is selected");
		}
		else {
			System.out.println("Outside India checkbox is not selected");
		}
		
		//Checking I agree checkbox
		WebElement iAgreeCheckbox = driver.findElement(By.id("term"));
		System.out.println(iAgreeCheckbox.isSelected());
		
		boolean isSelected_iAgree = iAgreeCheckbox.isSelected();
		
		if(isSelected_iAgree) {
			System.out.println("I agree checkbox is selected already");
		}
		else{
			System.out.println("I agree checkbox is not selected already");
		}
	}
	
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
