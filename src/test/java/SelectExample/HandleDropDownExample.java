package SelectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropDownExample extends BaseTest{
    
    
    
    @Test
    public void verifyCountryListTest() throws InterruptedException {
        
        
        
        
        WebElement countryList = driver.findElement(By.cssSelector("select[name='FromLB']"));
        
        
        Select list = new Select(countryList);
        
        System.out.println("-------------select values from dropdown/listbox---------------");
        
        
        System.out.println("countryList : is listbox accept multiple selection or not: " + list.isMultiple());
        
        list.selectByIndex(0);                      //USA
        list.selectByIndex(4);                      //India
        
        
        Thread.sleep(2000);
        
        list.selectByValue("Japan");                //Japan 
        Thread.sleep(2000);
        list.selectByVisibleText("Germany");        //Germany
        
        
        Thread.sleep(5000);
        
        list.deselectByIndex(2);                    //Japan 
        Thread.sleep(2000);
        list.deselectByValue("Germany");            //Germany
        Thread.sleep(2000);
        list.selectByVisibleText("USA");            //USA
        
        
        
        Thread.sleep(5000);
        
        list.selectByIndex(0);                      //USA
        
        list.deselectAll();
        
        Thread.sleep(5000);
        
        list.selectByValue("India");
        
        Thread.sleep(5000);
    }

    
    

    @Test
    public void verifyCarListTest() throws InterruptedException {
        
        
        
        
        WebElement carList = driver.findElement(By.cssSelector("select"));      //match ---- select ----by default first one
        
        
        Select list = new Select(carList);
        
        System.out.println("-------------select values from dropdown/listbox---------------");
        
        
        System.out.println("carList : is listbox accept multiple selection or not: " + list.isMultiple());
        
        Thread.sleep(2000);
        list.selectByIndex(1);                          //Saab
        Thread.sleep(2000);
        list.selectByIndex(4);                          //Toyota
        
        
        Thread.sleep(2000);
        
        list.selectByValue("Singapore");                //Opel  
        Thread.sleep(2000);
        list.selectByVisibleText("Audi");               //Audi
        
        
        Thread.sleep(5000);
        
        
        
        Thread.sleep(5000);
    }
    
}
