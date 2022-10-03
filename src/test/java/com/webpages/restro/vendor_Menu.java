package com.webpages.restro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class vendor_Menu {

    WebDriver driver ;

    public vendor_Menu(WebDriver driver){
        this.driver = driver ;
    }

     // Main menu locators
    private By menu_opt = By.xpath("//a[@href='/menu']");
    private By menu_tab = By.xpath("//li[contains(text(),'Menu')]");
    private By addFood_opt = By.xpath("//p[contains(text(),'+ Add Food')]");
    private By cat_name = By.xpath("//input[@name='name']");
    private By cat_position = By.xpath("//input[@name='position']");
    private By cat_dropdown = By.xpath("//h2[contains(text(),'Food Menu')]//i");
    private By click_cat = By.xpath("//h3[@class='mt-1']");
    private By sub_cat_name = By.xpath("//input[@class='form-control u-nameitem455']");


    //Drinks locators

    private By drinks_dropdown = By.xpath("//h2[contains(text(),'Drink Menu')]//i");
    private By add_drinks = By.xpath("//p[contains(text(),'+ Add Drinks')]");
    private By drink_categoryName = By.xpath("//input[@name='name']");
    private By drink_name = By.xpath("//input[@class='form-control u-nameitem455']");

    //Common b/w main food and drinks
    private By sub_description = By.xpath("//textarea[@class='form-control']");
    private By price = By.xpath("//div[@class='mb-3']//input");
    private By upload_image = By.xpath("//input[@type='file']");
    private By image_uploaded_popup = By.xpath("//div[@role='status'][contains(text(),'Image uploaded successfully')]");
    private By save_btn = By.xpath("//button[contains(text(),'Save')]");
    private By click_sub_cat = By.xpath("//p[@id='categoryDetails'][contains(text(),'+ Add ')]");
    private By accept_btn= By.xpath("//button[contains(text(),'Accept')]");


    //Methods

    public void clickMenu_opt(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(menu_opt).click();
    }
    public void click_menuTab(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(menu_tab).click();
    }

    //Business Method
    public void addMenuItems(){

        //Intialize explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
         clickMenu_opt();
         click_menuTab();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(addFood_opt).click();
        driver.findElement(cat_name).sendKeys("Paratha Rolls");
        driver.findElement(accept_btn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(cat_dropdown)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(click_cat)).click();

        driver.findElement(click_sub_cat).click();
        driver.findElement(sub_cat_name).sendKeys("Chicken paratha roll");
        driver.findElement(sub_description).sendKeys("Testing description");
        WebElement u_image = driver.findElement(upload_image);
        u_image.sendKeys("C:/Users/Danish.Mustafa/Desktop/Restro/discount.jpg");
        driver.findElement(price).clear();
        driver.findElement(price).sendKeys("20");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(image_uploaded_popup));
        driver.findElement(save_btn).click();

    }



    public void addDrinks(){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        clickMenu_opt();
        click_menuTab();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(add_drinks).click();
        driver.findElement(drink_categoryName).sendKeys("Cold Drinks");
        driver.findElement(accept_btn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(drinks_dropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(click_cat)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(click_sub_cat)).click();
        driver.findElement(drink_name).sendKeys("7up");
        driver.findElement(sub_description).sendKeys("Testing drinks");
        driver.findElement(upload_image).sendKeys("C:/Users/Danish.Mustafa/Desktop/Restro/fanta.jfif");
        driver.findElement(price).sendKeys("15");
        wait.until(ExpectedConditions.visibilityOfElementLocated(image_uploaded_popup));
        driver.findElement(save_btn).click();



    }



}
