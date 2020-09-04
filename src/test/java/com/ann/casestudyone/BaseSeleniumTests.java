package com.ann.casestudyone;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class BaseSeleniumTests {
	private static final String CHROMEDRIVER_EXE = "chromedriver.exe";

    protected WebDriver driver;

    @Before
    public void setUp() {
    	try {
    		
       /* String driverFile = findFile();
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(driverFile))
                .build();*/
    	 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
         
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
        options.addArguments("--headless");
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.merge(capabilities);
      //  this.driver = new ChromeDriver(service, options);
    	
    	driver = new RemoteWebDriver(new URL("http://40.113.221.175:4444/wd/hub"),options);
    		}
    		catch (MalformedURLException e) {
    		    System.out.println("incorrect url");
    		    }
    }

    private String findFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource(CHROMEDRIVER_EXE);
        return url.getFile();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}