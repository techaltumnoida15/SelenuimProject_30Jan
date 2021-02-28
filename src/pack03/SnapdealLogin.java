package pack03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import basePack.LCB;

public class SnapdealLogin extends LCB{

	@Test
	public void loginSnapDeal() throws Exception {
		driver.get("https://www.snapdeal.com/");
		
		//Verify that user is on correct page
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
//		if(pageTitle.contains("Snapdeal.com")) {
//			System.out.println("User is on correct page");
//		}
//		else {
//			System.out.println("User is on wrong page.");
//		}
		
		Assert.assertTrue(pageTitle.contains("Snapdeal.com"), "User is on wrong page.");
		System.out.println("User is on correct page");
		
		WebElement signIn = driver.findElement(By.cssSelector("div[class='accountInner']"));
		
		//Mouse Over - SignIn
		//Actions - Class
		Actions act = new Actions(driver);
		act.moveToElement(signIn);
		act.build().perform();
		
		//Click on Login
		WebElement login = driver.findElement(By.cssSelector("span[class='accountBtn btn rippleWhite']"));
		login.click();
		
		Thread.sleep(2000);
		
		//Switch to iframe
		driver.switchTo().frame(driver.findElement(By.id("loginIframe")));
		
		//Enter Moobile/Email
		WebElement userEmail = driver.findElement(By.id("userName"));
		userEmail.sendKeys("9711235995");
	}
}







