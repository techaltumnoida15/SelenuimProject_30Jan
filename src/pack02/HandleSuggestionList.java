package pack02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.LCB;

public class HandleSuggestionList extends LCB{

	@Test
	public void handleSuggestionList() throws Exception {
		driver.get("http://www.yatra.com");
		
		//Click on FROM/Destination
		WebElement from = driver.findElement(By.cssSelector("input[id='BE_flight_origin_city']"));
		from.click();
		
		from.sendKeys("LAS");
		Thread.sleep(2000);

		String typedFrom = from.getAttribute("value");
		System.out.println("Typed city is = " + typedFrom);
		
		while(!typedFrom.equals("LAS")) {
			from.sendKeys("LAS");
			Thread.sleep(2000);
			
			typedFrom = from.getAttribute("value");
			System.out.println("Typed city in while loop = " + typedFrom);
			
			if(typedFrom.equals("LAS")) {
				break;
			}
		}
		
		List<WebElement> suggestionList = driver.findElement(By.cssSelector("div[class='viewport'] > div > div")).findElements(By.tagName("li"));
		System.out.println("Total suggestions are = " + suggestionList.size());
		
		for(int i = 0; i<suggestionList.size(); i++) {
			String suggestionText = suggestionList.get(i).getText();
			System.out.println(suggestionText);
			
			if(suggestionText.contains("Las Tunas (VTU)")) {
				suggestionList.get(i).click();
				break;
			}
		}
		
		
		Thread.sleep(5000);
	}
}
