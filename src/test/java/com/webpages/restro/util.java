package com.webpages.restro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class util {
    WebDriver driver ;
    public util(WebDriver driver){
        this.driver= driver ;
    }

    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Danish.Mustafa//Downloads//chromedriver_win32 (6)//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }



}
