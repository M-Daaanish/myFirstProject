package com.webpages.restro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class vendor_login {

    WebDriver driver ;

    public vendor_login(WebDriver driver){
        this.driver = driver ;
    }


    private By vendor_email = By.xpath("//input[@type='email']");
    private By vendor_password = By.xpath("//input[@type='password']");
    private By click_btn = By.xpath("//button[@class='u-loginbutton001 mt-3']");


    public void vendor_login(String email , String password){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(vendor_email).sendKeys(email);
        driver.findElement(vendor_password).sendKeys(password);
        driver.findElement(click_btn).click();
    }





}
