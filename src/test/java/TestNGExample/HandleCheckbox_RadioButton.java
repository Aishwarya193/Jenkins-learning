package TestNGExample;
//import org.junit.Test;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class HandleCheckbox_RadioButton extends BaseTest{
  
  
  @Test
  public void verifyRadioButton() {
      
      
      driver.findElement(By.cssSelector("input[value=female]")).click();
      
      
  }

  
  
  @Test
  public void verifyCheckbox() throws InterruptedException {
      
      Thread.sleep(2000);
      driver.findElement(By.cssSelector("input[value=Car]")).click();;
      driver.findElement(By.cssSelector("input[value=Boat]")).click();;
      
      
  }
  
}


