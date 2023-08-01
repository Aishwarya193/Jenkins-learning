package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboardPage {

	 WebDriver driver;

	    public dashboardPage(WebDriver driver) {

	        this.driver = driver;

	    }
	    
	    //identifications
	    By Customers = By.partialLinkText("Customers");
	    
	    
	    public void clickCustomers() throws InterruptedException
	    {
	    	Thread.sleep(1000);
	    	driver.findElement(Customers).click();
	    }
	    
	    
}
