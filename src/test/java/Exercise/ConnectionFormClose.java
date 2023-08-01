package Exercise;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConnectionFormClose {
    
    
    
    WebDriver driver;
    

	 
    
    @AfterTest
    public void closeApp() throws Exception {
        
        
        System.out.println("closing application");
        Thread.sleep(5000);
        driver.close();   //------- close current browser instance
        //driver.quit();  //------- close all browser instance
        
        
    }
    
   
        
    @BeforeTest
    public void launchApp() throws Exception {
    	

    	//taken file as input
    	FileInputStream fio = new FileInputStream("./data.properties");
    	 Properties prop = new Properties();
    	 prop.load(fio);
    	 
    	 //read data appln url
          String applicationURL = prop.getProperty("nop_appURL");
        System.out.println("Application url taken from file is : "+applicationURL);
        
        
        //read launchapp
        String launchapp = prop.getProperty("launchapp");
        System.out.println("Application launchapp taken from file is : "+launchapp);
        
        
        
        if ( launchapp.equalsIgnoreCase("chrome"))
        {
        	WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            
            driver.manage().window().maximize();
            Thread.sleep(5000);
            driver.get(applicationURL);
            Thread.sleep(5000);
            System.out.println("launching application in chrome");
        }
        else if (launchapp.equalsIgnoreCase("edge"))
        {
        	WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            
            driver.manage().window().maximize();
            Thread.sleep(5000);
            driver.get(applicationURL);
            Thread.sleep(5000);
            System.out.println("launching application in edge");
        }
        else 
        {
        	WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            
            driver.manage().window().maximize();
            Thread.sleep(5000);
            driver.get(applicationURL);
            Thread.sleep(5000);
            System.out.println("launching application by default in chrome");
        }
    }

}
