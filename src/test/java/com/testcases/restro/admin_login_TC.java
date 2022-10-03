package com.testcases.restro;

import com.webpages.restro.add_restaurant;
import com.webpages.restro.admin_login;
import com.webpages.restro.util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class admin_login_TC {

    WebDriver driver ;

    util ut ;
    admin_login lg ;
    add_restaurant add_rests ;
    private String admin_url = "https://restro-admin-app.web.app/";

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Danish.Mustafa//Downloads//chromedriver_win32 (6)//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        lg = new admin_login(driver);
        add_rests = new add_restaurant(driver);
        driver.get(admin_url);
    }


    @Test
    public void testAdminLogin(){
        Boolean login_status = lg.login("admin@gmail.com","123456");
        Assert.assertTrue(login_status);
    }


    @Test
    public void addrest(){
        lg.login("admin@gmail.com","123456");
        add_rests.addRestaurant();
    }

}
