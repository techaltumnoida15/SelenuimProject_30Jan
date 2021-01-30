package pack01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC02 {
	
	WebDriver driver;	
	@BeforeTest
	public void openBrowser() {
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "H:\\Regression\\Selenium\\Drivers\\ChromeDriver_88\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.naukri.com");
	}
	
	@Test
	public void testCase01() {
		//TC Logic
		//Verify that user is on correct page
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title  = " + pageTitle);
		
		if(pageTitle.contains("Naukri.com")) {
			System.out.println("User is on correct page.");
		}
		else {
			System.out.println("Udser is on another page - Test FAIL");
		}
		
		//Verify Best Place to work
		WebElement bestPlaceToWork = driver.findElement(By.id("BestPlaces"));
		String textBestPlace = bestPlaceToWork.getText();
		System.out.println("textBestPlace = " + textBestPlace);
		
		if(textBestPlace.contains("Best Places to Work")) {
			System.out.println("Best Place to work is present.");
		}
		else {
			System.out.println("Best Place to work is not present. - Test Fail");
		}
		
		//Verify that All sectors should be selected
		WebElement allSectors = driver.findElement(By.cssSelector("#BestPlaces > ul > li"));
		String attValue = allSectors.getAttribute("class");
		
		System.out.println("attValue = " + attValue);
		
		if(attValue.contains("selected")) {
			System.out.println("All Sectors is selected.");
		}
		else {
			System.out.println("All Sectors is not selected. - Test Fail");
		}
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();  //will close all instance of browser
		//driver.close();   //will close the current instance (focused browser window)
	}
}


//Use ctrl + shift + l  => to get all shortcuts of eclipse

// ctrl + shift + o => to import all at once
	
	