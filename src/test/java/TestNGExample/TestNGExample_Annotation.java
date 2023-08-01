package TestNGExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGExample_Annotation {
    
    //pre-condition ----- BeforeSuite ----->BeforeTest ----->BeforeClass ----->BeforeMethod
    //Test
    //post-condition <----- AfterSuite <-----AfterTest <-----AfterClass <-----AfterMethod
    
    
    
    
    @BeforeClass
    public void BeforeClass() {
        
        System.out.println("============******BeforeClass*********===========");
    }
    
    
    @AfterClass
    public void AfterClass() {
        
        System.out.println("===========********AfterClass********===========");
    }
    
    
    @BeforeMethod
    public void BeforeMethod() {
        
        System.out.println("BeforeMethod: before execution on any test case.");
        System.out.println("=====================test case execution started============================");
    }
    
    
    @AfterMethod
    public void AfterMethod() {
        
        System.out.println("AfterMethod: after execution on any test case.");
        System.out.println("=====================test case execution completed============================");
    }
    
    
    @BeforeSuite
    public void BeforeSuite() {
        
        System.out.println("--------BeforeSuite----------------");
    }
    
    
    @AfterSuite
    public void AfterSuite() {
        
        System.out.println("--------AfterSuite----------------");
    }

    
    @BeforeTest
    public void BeforeTest() {
        
        System.out.println("============BeforeTest===========");
    }
    
    
    @AfterTest
    public void AfterTest() {
        
        System.out.println("===========AfterTest===========");
    }
    
    
    @Test
    public void addItem() {
        System.out.println("--------add items test case----------------");
        
    }
    
    
    @Test
    public void payment() {
        System.out.println("--------payment test case----------------");
        
    }
}

