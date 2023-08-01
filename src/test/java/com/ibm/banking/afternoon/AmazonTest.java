package com.ibm.banking.afternoon;

import java.io.FileInputStream;
import java.util.Properties;

public class AmazonTest {

    public static void main(String[] args) throws Exception {
        
        
        
       // read data from properties file
//      FileInputStream fis = new FileInputStream("C:\\Users\\91995\\eclipse-workspace\\com.ibm.banking.afternoon\\testData\\config.properties");
        
//      FileInputStream fis = new FileInputStream(".\\testData\\config.properties");
        
        FileInputStream fis = new FileInputStream("./data.properties");
        
        
        
        Properties prop = new Properties();
        
        prop.load(fis);
        
      
         
        String applicationURL = prop.getProperty("nop_appURL");
        
        System.out.println("Application URL : " + applicationURL);
        
        System.out.println("Application userName : " + prop.getProperty("username"));
        
        System.out.println("Application password : " + prop.getProperty("password"));
        System.out.println("Application password1 : " + prop.getProperty("password1"));
        System.out.println("Application  : " + prop.getProperty("keyNotPresent", "Default Value"));

    }

}