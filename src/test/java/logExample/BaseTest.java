package logExample;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;

public class BaseTest {
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
        
        log.info("launching application: " + Constants.nop_app);
        driver.get(Constants.nop_app);
        Thread.sleep(5000);
    }
    
    
    @AfterTest
    public void closeApp() throws Exception {
        log.info("closing an application: " );
        
        Thread.sleep(7000);
        driver.close();
        
        
    }

}
