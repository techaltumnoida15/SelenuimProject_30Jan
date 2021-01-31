package pack01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC02 {
	
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
		
		//Enter email ID
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("it.tyagi@gmail.com");
		System.out.println("User id is entered.");
		
		//Enter Passwd
		driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("abc@123");
		System.out.println("Enter Passwd");
		
		//Click on Login
		driver.findElement(By.cssSelector("button[class='btn-primary loginButton']")).click();
		System.out.println("Click on Login");
		
		Thread.sleep(3000);
		
		//Verify that login is successful or not
		String errMessage = driver.findElement(By.cssSelector("div[class='server-err']")).getText();
		System.out.println("errMessage = " + errMessage);
		
		if(errMessage.contains("Invalid details")) {
			System.out.println("Login is failed");
		}
		else {
			System.out.println("Login is successful");
		}
			
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}
}


	
	