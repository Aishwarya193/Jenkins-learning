package SelectExample;



//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
  
  
  
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
      driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
      Thread.sleep(5000);
      System.out.println("launching application");
  }

}

