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

	@Test
	public void getGoogleSearchPage() {
		    try {
			WebDriver driver = new RemoteWebDriver(new URL("http://40.113.221.175:4444/wd/hub"), new FirefoxOptions());
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.google.com");
			//WebElement element = this.firefoxdriver.findElement(By.name("q"));
			//assertNotNull(element);
			//assertNotNull(this.driver.getTitle());
			//driver.quit();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getGoogleTitle() {
	//	this.firefoxdriver.get("https://www.google.com");
		//assertEquals("Title mismatch", "Google", firefoxdriver.getTitle());

	}
 
}
