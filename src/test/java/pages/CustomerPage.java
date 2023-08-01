package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage {
	 WebDriver driver;

	    public CustomerPage(WebDriver driver) {

	        this.driver = driver;

	    }
	    
	    //identifications
	    By Customers =  By.xpath("//a[@href='/Admin/Customer/List']//p[1]");
	    By addNew = By.partialLinkText("Add new");
	    By searchemail =By.id("SearchEmail");
	  By searchButton =  By.cssSelector("button#search-customers");
	    
	    
	    public void clickCustomersOption() throws InterruptedException
	    {
	    	Thread.sleep(1000);
	    	driver.findElement(Customers).click();
	    }
	    
	    public void clickAddNewCustomer()
	    {
	    	driver.findElement(addNew);
	    }
	    
	    public void findEmail(String email)
	    {
	    	driver.findElement(searchemail).sendKeys(email);
	    }
	    
	    public void clickButtonSearch()
	    {
	    	driver.findElement(searchButton).click();
	    }
	    
}
