package TestNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample_PriorityExample {
    
    
    //priority
    //highest negative number having highest priority
    //by default priority is 0
    //if priority is same, execution as per naming conv (ascii value)
    
    
    
    
    
    @BeforeTest
    public void launchApp() {
        
        System.out.println("launching application");
    }
    
    
    @AfterTest
    public void closeApp() {
        
        System.out.println("closing application");
    }
    
    
    
    @Test(priority = -100)
    public void verifyLogin() {
        
        System.out.println("test case: verifyLogin");
        
    }
    
    
    @Test
    public void verifySearchItem() {
        
        System.out.println("test case: verifySearchItem ");
        
    }
    

    @Test(priority = 2)
    public void verifyAddItem() {
        
        System.out.println("test case: verifyAddItem to kart");
        
    }
    
    @Test(priority = 2)
    public void verifyCancelOrder() {
        
        System.out.println("test case: verifyCancelOrder ");
        
    }
    
    
    @Test(priority = 3)
    public void verifyPayment() {
        
        System.out.println("test case: verifyPayment");
        
    }
    
    @Test(priority = 4)
    public void verifyLogout() {
        
        System.out.println("test case: verifyLogout");
        
    }
    

}