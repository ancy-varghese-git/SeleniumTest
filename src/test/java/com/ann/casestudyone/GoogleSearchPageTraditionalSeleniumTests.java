package com.ann.casestudyone;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class GoogleSearchPageTraditionalSeleniumTests extends BaseSeleniumTests {

    @Test
    public void getSearchPage() {
        this.driver.get("https://www.google.com");
        WebElement element = this.driver.findElement(By.name("q"));
        assertNotNull(element);
        
        //we expect the title “Google “ should be present 
		//String Expectedtitle = "Google";
		//it will fetch the actual title 
		//String Actualtitle = driver.getTitle();
		//System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
		//it will compare actual title and expected title
		//Assert.assertEquals(Actualtitle, Expectedtitle);
		//print out the result
		//System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
		 
    }

   /* @Test
    public void getSumPage() {
        this.driver.get("https://www.google.com");
        WebElement element = this.driver.findElement(By.name("q"));
        assertNotNull(element);
    }*/
}