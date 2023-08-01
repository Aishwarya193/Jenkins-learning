


package crossbrowserTestNG;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NopCommApp extends BaseTestCrossBrowser{

    
    @Test
    public void verifyLogin() throws Exception {
        Thread.sleep(4000);
//      WebElement txtEmail = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
        txtEmail.clear();

        Thread.sleep(4000);

        System.out.println("enter username: " + conf.get_username());
        System.out.println("enter password: " + conf.get_password());

        txtEmail.sendKeys(conf.get_username());

        driver.findElement(By.xpath("//input[@value='admin']")).clear();
        driver.findElement(By.xpath("//input[@value='admin']")).sendKeys(conf.get_password());

        driver.findElement(By.xpath("//*[@type=\"checkbox\"]")).click();

        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();

        System.out.println("--------------after login------------------------");
        System.out.println("Applciation Title: " + driver.getTitle());
        System.out.println("Applciation URL: " + driver.getCurrentUrl());

        Thread.sleep(4000);

        String LogoutText = driver.findElement(By.xpath("//a[@href='/logout']")).getText();

        System.out.println("---------------" + LogoutText);

        driver.findElement(By.xpath("//a[@href='/logout']")).click();

        Thread.sleep(4000);
        System.out.println("--------------after logout------------------------");
        System.out.println("Applciation Title: " + driver.getTitle());
        System.out.println("Applciation URL: " + driver.getCurrentUrl());

    }

}
