package crossbrowserTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.ibm.banking.afternoon.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestCrossBrowser {
    
    // crtl+shift+O ---- add import/remove unused imports
        WebDriver driver;
        ReadConfig conf;

        
        
        @Parameters("ibm_br")
        @BeforeTest
        public void launchApp(String browserDetails) throws Exception {

            conf = new ReadConfig();

          
            System.out.println("....get value from textNG xml file: " + browserDetails);
            String ibm_browser = browserDetails;

            if (ibm_browser.equalsIgnoreCase("chrome")) {

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

            } else if (ibm_browser.equalsIgnoreCase("edge")) {

                // Edge browser
            	WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            } else if (ibm_browser.equalsIgnoreCase("firefox")) {

                // Firefox browser
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else {

                System.out.println("execution on default browser: chrome");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }

            driver.manage().window().maximize();

            System.out.println("Application URL from config file: " + conf.getApplicationURL());

            driver.get(conf.getApplicationURL());

        }

        @AfterTest
        public void closeApp() throws Exception {
            Thread.sleep(5000);
            System.out.println("closing application");
            driver.close();
        }


}



