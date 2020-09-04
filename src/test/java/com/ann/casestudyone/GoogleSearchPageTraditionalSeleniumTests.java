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

	WebDriver firefoxdriver;
	
	@Test
	public void getGoogleSearchPage() {
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	       capabilities.setBrowserName("firefox");
	       try {
			firefoxdriver = new RemoteWebDriver(new URL("http://40.113.221.175:4444/wd/hub"), capabilities);
			firefoxdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			firefoxdriver.get("https://www.google.com");
			//WebElement element = this.firefoxdriver.findElement(By.name("q"));
			//assertNotNull(element);
			assertNotNull(this.firefoxdriver.getTitle());
			Thread.sleep(1000);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			firefoxdriver.quit();
		}
	   	
		

	}

	@Test
	public void getGoogleTitle() {
	//	this.firefoxdriver.get("https://www.google.com");
		//assertEquals("Title mismatch", "Google", firefoxdriver.getTitle());

	}
 
}
