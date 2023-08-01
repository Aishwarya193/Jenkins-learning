package com.ibm.banking.afternoon;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties prop;

    public ReadConfig() throws Exception {

        FileInputStream fis = new FileInputStream("./data.properties");

        prop = new Properties();

        prop.load(fis);

        prop.getProperty("username");

    }

    public String getApplicationURL() {

        String appURL = prop.getProperty("nop_appURL");
        return appURL;

    }

    public String get_username() {

        
        return prop.getProperty("username");

    }

    public String get_password() {

        
        return prop.getProperty("password");

    }
public String get_browser() {

        
        return prop.getProperty("browser");

    }

}
