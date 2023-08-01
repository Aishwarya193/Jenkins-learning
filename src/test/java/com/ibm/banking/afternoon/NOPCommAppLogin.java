package com.ibm.banking.afternoon;

public class NOPCommAppLogin {

    public static void main(String[] args) throws Exception {
        
        
        
        ReadConfig conf = new ReadConfig();
        
        
        
        //launch an application in chrome browser
        
        System.out.println("launch application: " + conf.getApplicationURL());
        //enter userName
        System.out.println("enter username: " + conf.get_username());
        System.out.println("enter password: " + conf.get_password());
        
        
        

    }

}

