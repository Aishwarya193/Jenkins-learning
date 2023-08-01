package Exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Exercise_1 extends ConnectionFormClose{

	@org.testng.annotations.Test
	public void LoginTest() throws Exception
	{
		//taken file as input
    	FileInputStream fio = new FileInputStream("./data.properties");
    	 Properties prop = new Properties();
    	 prop.load(fio);
    	 
    	//read username
         String username = prop.getProperty("username");
         System.out.println("Application username taken from file is : "+username);
         
         //read password
         String password = prop.getProperty("password");
         System.out.println("Application password taken from file is : "+password);
         
		System.out.println("Application launched");
		
		//enter username
	   driver.findElement(By.xpath("//input[@type ='email']")).clear();
	   Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type ='email']")).sendKeys(username);
	Thread.sleep(1000);
	//enter password
	driver.findElement(By.xpath("//input[@type ='password']")).clear();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type ='password']")).sendKeys(password);   
	Thread.sleep(1000);
	
	//click checkbox
	driver.findElement(By.xpath("//input[@type ='checkbox']")).click(); 
	System.out.println("Checkbox is clicked");
	
	//get the text Value of Login Button 
	String ValueLogin =driver.findElement(By.xpath("//button[@type ='submit']")).getText(); 
	System.out.println("TextValue on login button is "+ValueLogin);
	
	//click on loginbutton
	driver.findElement(By.xpath("//button[@type ='submit']")).click(); 
	System.out.println("Clicked on login button");
	}
	
	@Test
	public void getAppURL() throws InterruptedException
	{
		//get URL
		Thread.sleep(1000);
		System.out.println("Application URL is: "+ driver.getCurrentUrl());
		
		//get Title
		Thread.sleep(1000);
	System.out.println("Application Title is: "	+driver.getTitle());
	}
	
	@Test
	public void LogoutTest() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Logo")).click();
		System.out.println("loggged out......");
		
		Thread.sleep(1000);
		System.out.println("Application URl after logout is: "+driver.getCurrentUrl());
		
		System.out.println("Application Title after logout is: "+driver.getTitle());
	}
}
