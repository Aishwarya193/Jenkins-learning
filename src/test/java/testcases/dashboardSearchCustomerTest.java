package testcases;
import org.testng.annotations.Test;

import pages.CustomerPage;
import pages.LoginPage;
import pages.dashboardPage;

public class dashboardSearchCustomerTest extends TestBase {

    
    
    @Test(priority = -1)
    public void login() throws Exception {
        
        
        
        
        LoginPage lp = new LoginPage(driver);
       
        
        
        lp.enterEmail("admin@yourstore.com");
        lp.enterPass("admin");
        lp.clickRemCheckbox();
        lp.clickLoginButton();
        
        
        //verify application title
        lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
        
        
        
        
      }
    
    @Test (priority =1)
    public void verifydashboard() throws InterruptedException
    {
    	 dashboardPage dp= new dashboardPage(driver);
    	 CustomerPage cp =new CustomerPage(driver);

         //Click on Customers
         dp.clickCustomers();
         
         //click on Customers Option
         cp.clickCustomersOption();
         
         //click on Add New button
         cp.clickAddNewCustomer();
         
          //   Enter Customer info
         cp.findEmail("open@gmail.com");
         
         //clcik on SearchButton
         cp.clickButtonSearch();
    }
    
    
    
   
    
    
    
}