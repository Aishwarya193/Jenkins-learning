package Selenium;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class LoginExample {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        
        
        //driver path
        //System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void tCLoginLogout() throws Exception {

        
        
        //handle sync issue
        
        Thread.sleep(5000);
        
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   //REST API ------ get/post/put/delete ------ JSON 
        
        
        
        Thread.sleep(5000);
        
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector(".oxd-button")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
        
        
        Thread.sleep(5000);
        driver.findElement(By.linkText("Logout")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".orangehrm-login-forgot-header")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".oxd-button--ghost")).click();
        
        Thread.sleep(5000);
    }
}










































