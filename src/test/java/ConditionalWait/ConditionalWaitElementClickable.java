package ConditionalWait;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalWaitElementClickable {
    WebDriver driver;
    Logger log;
    
    @BeforeTest
    public void launchApp() throws Exception {
        
        
        //log configuration
        
        log = Logger.getLogger("nopComm App");
        PropertyConfigurator.configure(".\\testData\\log4j.properties");
        
        
        log.info("--------------info----------------");
        log.warn("--------------warn----------------");
        log.error("--------------error----------------");
        
        
        log.info("launching chrome browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        
        driver.manage().window().maximize();
        
        log.info("launching application: " );
        //driver.get(Constants.sample_element_condition);
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
    }
    
    
    @AfterTest
    public void closeApp() throws Exception {
        log.info("closing an application: " );
        
        Thread.sleep(5000);
        driver.close();
        
        
    }
    
    
    @Test
    public void verifyLoginFeature() throws Exception {
        
        
        //sync issue
        //conditional wait
        
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("submitButton"))));
        
        
        driver.findElement(By.id("submitButton")).click();
        
    }

}
