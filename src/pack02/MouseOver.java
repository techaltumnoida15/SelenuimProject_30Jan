package pack02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basePack.LCB;

public class MouseOver extends LCB{

	@Test
	public void mouseOverTest() throws Exception{
		
		driver.get("http://www.amazon.in");
		
		Thread.sleep(3000);
		
		WebElement helloSignIn = driver.findElement(By.cssSelector("a[data-nav-role='signin']"));
		
		//Perform mouse over
		//Actions  = class
		Actions act = new Actions(driver);
		act.moveToElement(helloSignIn);
		act.build().perform();
		
		Thread.sleep(2000);
		
		//Click on Sign In
		WebElement signIn = driver.findElement(By.cssSelector("div[id='nav-flyout-ya-signin'] > a"));
		signIn.click();
		
		System.out.println("Click on Sign In.");
	}
}
