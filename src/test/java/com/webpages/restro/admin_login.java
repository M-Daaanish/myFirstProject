package com.webpages.restro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class admin_login {

    WebDriver driver ;

    public admin_login(WebDriver driver){
        this.driver = driver ;
    }

    private By emailAddress = By.xpath("//input[@type='email']");
    private By password = By.xpath("//input[@type='password']");
    private By login_btn = By.xpath("//button[@class='u-loginbutton001 mt-3']");
    private By admin_name = By.xpath("//div[@class='d-flex align-items-center']//div");

    public Boolean login(String email, String enter_password){
        driver.findElement(emailAddress).sendKeys(email);
        driver.findElement(password).sendKeys(enter_password);
        driver.findElement(login_btn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver.findElement(admin_name).isDisplayed();



    }

}
