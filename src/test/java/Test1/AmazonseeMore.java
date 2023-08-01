package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AmazonseeMore {

	WebDriver driver;
	
	@BeforeTest
	public void launchapp() throws InterruptedException
	{
		 WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        
	        
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/?ref=aisgw_intl_stripe_in");
	        Thread.sleep(5000);
	}
	
	@Test
	public void clickSeeMore() throws InterruptedException
	{
	WebElement element=	driver.findElement(By.xpath("//div[@id='desktop-grid-7']"));
		//WebElement element=	driver.findElement(By.xpath("//*[@id=\\\"CardInstancePBDZMaZYGMakHaSOob9QUQ\\\"]/div[3]/a"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);",element);
	Thread.sleep(5000);
	element.click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("See more")).click();
	//driver.findElement(By.xpath("//*[@id=\"CardInstancePBDZMaZYGMakHaSOob9QUQ\"]/div[3]/a")).click();
		//driver.findElement(By.xpath("(//span[text()='See more'])[2]")).click();
		
		//driver.findElement(By.cssSelector("div#CardInstance-7splt4xiW1veMw0GHjW0Q>div:nth-of-type(3)>a")).click();
	}
	
	@AfterTest
	public void closeApp()
	{
		driver.close();
		driver.quit();
	}
		

	

}
