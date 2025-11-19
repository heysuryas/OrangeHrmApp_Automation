
package Hooks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {
    	
    	   ChromeOptions options = new ChromeOptions();
        
           options.addArguments("--headless");
           options.addArguments("--window-size=1920,1080"); 
           options.addArguments("--disable-gpu");
           options.addArguments("--no-sandbox");
    	
        driver = new ChromeDriver(options);
       // driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("=== Browser Launched ===");
    }

    @After
    public void tearDown(Scenario scenario) {

        // Take screenshot when scenario fails
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Screenshot");
        }

        if (driver != null) {
            driver.quit();
            System.out.println("=== Browser Closed ===");
        }
    }
}


  
