package com.testcases.restro;

import com.webpages.restro.vendor_Menu;
import com.webpages.restro.vendor_login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class add_vendorMenu_TC {



    WebDriver driver ;
    vendor_login lg ;
    vendor_Menu menu ;



    private String vendor_url = "https://restroapp-358af.web.app/";

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Danish.Mustafa//Downloads//chromedriver_win32 (6)//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        lg = new vendor_login(driver);
        menu = new vendor_Menu(driver);
        driver.get(vendor_url);
    }


    @Test
    public void testMenuItem(){
        lg.vendor_login("vaden.deontre@ilydeen.org","123456789");
        menu.addMenuItems();

    }

    @Test
    public void testDrinksItem(){
        lg.vendor_login("vaden.deontre@ilydeen.org","123456789");
        menu.addDrinks();
    }




}
