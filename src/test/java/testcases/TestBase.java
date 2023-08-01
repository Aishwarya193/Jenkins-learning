package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;

public class TestBase {
    
    WebDriver driver;
    
    
    @BeforeTest
    public void launchApp() {
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        
        driver.manage().window().maximize();
        driver.get(Constants.nop_app); //https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
        
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        
    }

    
    
    @AfterTest
    public void closeApp() throws Exception {
        
        Thread.sleep(6000);
        
        driver.close();
        driver.quit();
        
    }
}

