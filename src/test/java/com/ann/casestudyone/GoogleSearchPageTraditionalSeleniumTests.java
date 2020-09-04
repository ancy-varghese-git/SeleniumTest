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
public class GoogleSearchPageTraditionalSeleniumTests {// extends BaseSeleniumTests {

	@Test
	public void getGoogleSearchPage() {
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://40.113.221.175:4444/wd/hub"), new FirefoxOptions());
			driver.get("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement element = driver.findElement(By.name("q"));
			assertNotNull(element);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getSearchTitle() {
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://40.113.221.175:4444/wd/hub"), new FirefoxOptions());
			driver.get("https://www.google.com");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.name("q")).sendKeys("Selenium");
			String name = driver.findElement(By.name("q")).getAttribute("name");
			
			System.out.println("driver.findElement(By.name(\"q\")).getAttribute(\"name\") " + name);
			assertNotNull(name);

//			System.out.println("this.driver.getTitle() " + driver.getTitle());
//			assertEquals("Google", driver.getTitle());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	

}
