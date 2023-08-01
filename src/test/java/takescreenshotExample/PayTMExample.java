package takescreenshotExample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PayTMExample {
    
    
WebDriver driver;
    
    @AfterTest
    public void closeApp() throws Exception {
        
        
        System.out.println("closing application");
        Thread.sleep(7000);
        driver.close();   //------- close current browser instance
        //driver.quit();  //------- close all browser instance
        
        
    }
    
    
        
    @BeforeTest
    public void launchApp() throws Exception {
        
        
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://www.amazon.in/");
        Thread.sleep(5000);
        System.out.println("launching paytm application");
    }
    
    
    @Test
    public void verifyPayTM() throws Exception {
        
        
        WebElement txt_Search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        txt_Search.sendKeys("iphone 14");
        
        
        WebElement btnGo = driver.findElement(By.cssSelector("#nav-search-submit-button"));
        btnGo.click();
        
        Thread.sleep(4000);
        
        
//      take a screenshot
        getScreenshot("AmazonSearchItem_18July");
        
        
    }
    
    
    
    
    public void getScreenshot(String fileName) throws Exception {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);              //base64 format
        
        File targetLocation = new File(".//ibm_screenshot//"+fileName+"_IBM.png");
        
        FileUtils.copyFile(screenshotFile, targetLocation);
        
    }

}

