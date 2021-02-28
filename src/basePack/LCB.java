package basePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class LCB {
	protected WebDriver driver;

	@Parameters({"browser"})
	@BeforeTest
	public void openBrowser(String browser) {
		//String browser = "firefox";
		
		/*
		 * String userName = System.getProperty("user.name");
		 * System.out.println("userName - " + userName);
		 * 
		 * String userHome = System.getProperty("user.home");
		 * System.out.println("user.home - " + userHome);
		 */
		
		/*
		 * String osName = System.getProperty("os.name"); System.out.println("osName - "
		 * + osName);
		 */
		
		//https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath - " + projectPath);
		
		if(browser.equalsIgnoreCase("chrome")) {
			//Open Chrome 
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe"); 
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			//Open Firefox
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			//Open IE 
			System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe"); 
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit(); // will close all instance of browser
		// driver.close(); //will close the current instance (focused browser window)
	}
}
