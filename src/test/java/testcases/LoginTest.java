package testcases;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends TestBase {

    
    
    @Test
    public void verifyLoginFeature() throws Exception {
        
        
        
        
        LoginPage lp = new LoginPage(driver);
        
        
        lp.enterEmail("admin@yourstore.com");
        lp.enterPass("admin");
        lp.clickRemCheckbox();
        lp.clickLoginButton();
        
        
        //verify application title
        lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
        
        
        lp.clickLogoutButton();
        
        //verify application title
        lp.verifyApplicationTitle("Your store. Login");
        
    }
    
    
    
}