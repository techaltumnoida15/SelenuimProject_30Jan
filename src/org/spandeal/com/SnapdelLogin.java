package org.spandeal.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basePack.LCB;

public class SnapdelLogin extends LCB{

	@Test
	public void snapdealLogin() throws Exception {
		driver.get("http://www.snapdeal.com");
		
		//Mouse Over - SignIn
		WebElement sigIn = driver.findElement(By.cssSelector("div[class='accountInner']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(sigIn);
		act.build().perform();
		
		Thread.sleep(2000);
		
		//Click on Login
		
		
		//Eneter mobile Num in the Popup
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("loginIframe")));
		
	}
}
