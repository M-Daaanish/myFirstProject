package com.testcases.restro;

import com.webpages.restro.add_restaurant;
import com.webpages.restro.admin_login;
import com.webpages.restro.util;
import com.webpages.restro.vendor_login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class vendor_login_TC {


    WebDriver driver ;
    vendor_login lg ;

    private String vendor_url = "https://restroapp-358af.web.app/";

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Danish.Mustafa//Downloads//chromedriver_win32 (6)//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        lg = new vendor_login(driver);
        driver.get(vendor_url);
    }



    @Test
    public void testLogin(){
        lg.vendor_login("vaden.deontre@ilydeen.org","123456789");
    }



}
