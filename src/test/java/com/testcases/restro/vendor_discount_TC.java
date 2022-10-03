package com.testcases.restro;

import com.webpages.restro.vendor_Menu;
import com.webpages.restro.vendor_discountCampaign;
import com.webpages.restro.vendor_login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class vendor_discount_TC {


WebDriver driver ;
vendor_login lg ;
vendor_discountCampaign dc ;


    private String vendor_url = "https://restroapp-358af.web.app/";

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Danish.Mustafa//Downloads//chromedriver_win32 (6)//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        lg = new vendor_login(driver);
        dc = new vendor_discountCampaign(driver);
        driver.get(vendor_url);
    }

    @Test
    public void testDiscountCampaign(){
        lg.vendor_login("vaden.deontre@ilydeen.org","123456789");
       String actualStatus = dc.addDiscountCampaign();
      Assert.assertEquals(actualStatus,"Campaign created");
    }

    @Test
    public void testTable(){
        lg.vendor_login("vaden.deontre@ilydeen.org","123456789");
        dc.getTable();
    }

    @Test
    public void selectRange(){
        lg.vendor_login("vaden.deontre@ilydeen.org","123456789");
            String date = dc.selectGraphFilter("Last 2 Days");
        Assert.assertEquals(date,"2 Days");
    }
}
