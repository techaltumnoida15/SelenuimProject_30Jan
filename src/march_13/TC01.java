package march_13;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.LCB;

public class TC01 extends LCB{

	@Test
	public void initiateSearch() throws Exception {
		
		//Enter URL
		driver.get("http://www.cheapoair.com");
		
		//User is on correct page
		String actualTitle = driver.getTitle();
		System.out.println("Page title = " + actualTitle);
		
		/*
		if(pageTitle.contains("CheapOair")) {
			System.out.println("User is on correct page");
		}
		else {
			System.out.println("User is not on correct page");
		}
		*/
		String expectedTitle = "CheapOair";
		
		Assert.assertTrue(actualTitle.contains(expectedTitle), "User is on incorrct page.");
		System.out.println("User is on correct page");
		
		//Check if Flight Tab is selected
		WebElement flightTab = driver.findElement(By.cssSelector("a[id='flights']"));
		String flightTabAttribute = flightTab.getAttribute("class");
		System.out.println(flightTabAttribute);
		
		Assert.assertTrue(flightTabAttribute.contains("active"), "Flight tab is not selected.");
		System.out.println("Flight tab is selected");
		
		//Check if Round trip is selected
		WebElement roundTripRadio = driver.findElement(By.cssSelector("input[id='roundTrip']"));
		roundTripRadio.isSelected();    //applicable for Radio/Checkbox
		
		Assert.assertTrue(roundTripRadio.isSelected(), "Round trip is not selected.");
		System.out.println("Round trip is selected.");
		
		//Enter FROM
		WebElement from = driver.findElement(By.cssSelector("input[id='from0']"));
		String alreadyEnteredFrom = from.getAttribute("value");
		
		//if(!(alreadyEnteredFrom == "") || !(alreadyEnteredFrom == null)) {
		if(!alreadyEnteredFrom.isEmpty() && alreadyEnteredFrom != null) {
			//Clear
			driver.findElement(By.cssSelector("a[class='suggestion-box__clear icon']")).click();
			System.out.println("Clear FROM field.");
			
			//Enter
			from.sendKeys("LAS");
			System.out.println("From is typed.");
			Thread.sleep(2000);
			
			//Press TAB key
			from.sendKeys(Keys.TAB);
		}
		else {
			//Enter
			from.sendKeys("LAS");
		}
		
		//Enter TO
		WebElement to = driver.findElement(By.cssSelector("input[id='to0']"));
		to.sendKeys("NYC");
		Thread.sleep(3000);
		
		WebElement toSuggestion = driver.findElement(By.xpath("(//div[contains(@class, 'suggestion-box__content')])[2]"));
		Assert.assertTrue(toSuggestion.getAttribute("class").contains("visible"), "To suggestion box is not present.");
		System.out.println("To suggestion box is present.");
		
		List<WebElement> allSuggestion = driver.findElement(By.xpath("(//div[contains(@class, 'suggestion-box__content')])[2]/ul")).findElements(By.tagName("li"));
		System.out.println("Total suggestions are = " + allSuggestion.size());
		
		for(int i = 0; i<allSuggestion.size(); i++) {
			String suggestedTo = allSuggestion.get(i).getText();
			System.out.println(suggestedTo);
			
			if(suggestedTo.contains("EWR")) {
				allSuggestion.get(i).click();
				break;
			}
		}
		
		
		//Select Depart Date
		String a = "div[class='calendar__wrapper clearfix'] > div > div:nth-child(3) > div:nth-child(";
		int i = 1;
		String b = ") > a";

		String dateLocator = a + i + b;
		
		for(i = 1; i<=42; i++) {
			try {
				dateLocator = a + i + b;
				String dateInCal = driver.findElement(By.cssSelector(dateLocator)).getText();
				System.out.println(dateInCal);
				
				if(dateInCal.contains("24")) {
					driver.findElement(By.cssSelector(dateLocator)).click();
					break;
				}
			}
			catch(Exception e) {
				System.out.println("No date for selector = " + dateLocator);
			}
		}
		
		//Select Return Date
		
		
		
		//Click on Search
		
		
		//Verify that search data
		
		
		
	}
}
