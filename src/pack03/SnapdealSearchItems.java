package pack03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.LCB;

public class SnapdealSearchItems extends LCB{

	@Test
	public void loginSnapDeal() throws Exception {
		driver.get("https://www.snapdeal.com/");
		
		Thread.sleep(2000);
		
		//Enter some keyword to search
		WebElement searchTextBox = driver.findElement(By.id("inputValEnter"));
		searchTextBox.sendKeys("Mobile");
		
		Thread.sleep(1000);
		
		List<WebElement> totalSuggestions = driver.findElement(By.cssSelector("ul[class='suggestionList_menu']")).findElements(By.tagName("li"));
		System.out.println("Total suggestions are = " + totalSuggestions.size());
		
		for(int i = 0; i<totalSuggestions.size(); i++) {
			String suggestionText = totalSuggestions.get(i).getText();
			System.out.println(suggestionText);
			
			if(suggestionText.contains("Oppo Mobile Phone")) {
				//Click on it
				totalSuggestions.get(i).click();
				break;
			}
		}
	}
}







