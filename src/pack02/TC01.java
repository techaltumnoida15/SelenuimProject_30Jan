package pack02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import basePack.LCB;

public class TC01 extends LCB{
	@Test
	public void testCase01() throws Exception {
		System.out.println("Running Test");
		
		//Enter URL
		driver.get("http://www.naukri.com");
		
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
}
