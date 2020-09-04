package com.ann.casestudyone;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoogleSearchPageTraditionalSeleniumTests {//extends BaseSeleniumTests {

	WebDriver driver;
	
	@Test
	public void getGoogleSearchPage() {
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	       capabilities.setBrowserName("chrome");
	       ChromeOptions options = new ChromeOptions();
	        options.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
	        options.addArguments("--headless");
	        options.setExperimentalOption("useAutomationExtension", false);
	        options.addArguments("start-maximized"); // open Browser in maximized mode
	        options.addArguments("disable-infobars"); // disabling infobars
	        options.addArguments("--disable-extensions"); // disabling extensions
	        //options.addArguments("--disable-gpu"); // applicable to windows os only
	        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
	        options.merge(capabilities);
	       try {
			driver = new RemoteWebDriver(new URL("http://40.113.221.175:4444/wd/hub"), options);
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.google.com");
			//WebElement element = this.firefoxdriver.findElement(By.name("q"));
			//assertNotNull(element);
			//assertNotNull(this.driver.getTitle());
		
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	   	
		

	}

	@Test
	public void getGoogleTitle() {
	//	this.firefoxdriver.get("https://www.google.com");
		//assertEquals("Title mismatch", "Google", firefoxdriver.getTitle());

	}
 
}
