package crossbrowserTestNG;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTestNgCMD {

    
    @Test
    public void verifyLogin() throws Exception {
        Thread.sleep(4000);
        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
       driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"); 
//      WebElement txtEmail = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
        txtEmail.clear();

        Thread.sleep(4000);

     

        txtEmail.sendKeys("admin@yourstore.com");

        driver.findElement(By.xpath("//input[@value='admin']")).clear();
        driver.findElement(By.xpath("//input[@value='admin']")).sendKeys("admin");

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
