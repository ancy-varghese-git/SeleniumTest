package com.ann.casestudyone;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoogleSearchPageTraditionalSeleniumTests {//extends BaseSeleniumTests {

	/*@Test
	public void getSearchPage() {
		this.driver.get("https://www.google.com");
		WebElement element = this.driver.findElement(By.name("q"));
		assertNotNull(element);

	}

	@Test
	public void getGoogleTitle() {
		this.driver.get("https://www.google.com");
		assertEquals("Title mismatch", "Google", driver.getTitle());

	}
*/
	@Test
	public void getGoogleFirefox() {
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://40.113.221.175:4444/wd/hub"), new FirefoxOptions());
			driver.get("http://www.google.com");
		} catch (MalformedURLException e) {
			System.out.println("incorrect url");
		}
	} 
}