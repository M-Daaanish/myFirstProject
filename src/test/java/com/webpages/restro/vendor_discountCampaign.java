package com.webpages.restro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class vendor_discountCampaign {

    WebDriver driver ;

    public vendor_discountCampaign(WebDriver driver){
        this.driver = driver ;
    }

    private By marketing_opt = By.xpath("//a[@href='/marketing']");
    private By add_discount_btn = By.xpath("//button[contains(text(),'+ Add Discount Campaign')]");
    private By discount_name = By.xpath("//input[@name='name']");
    private By discount_ms = By.xpath("//textarea[@name='message']");
    private By upload_disc_image = By.xpath("//input[@type='file']");
    private By customer_frequency = By.xpath("//div[@class=' css-b62m3t-container']");
    private By discount_amount = By.xpath("//input[@name='discount']");
    private By upto = By.xpath("//input[@name='max_discount']");
    private By validity = By.xpath("//input[@name='validity']");
    private By coupon_code = By.xpath("//input[@name='code']");
    private By daily_budget = By.xpath("//input[@name='daily_budget']");
    private By recurrence = By.xpath("//input[@name='recurrence']");
    private By start_date = By.xpath("//input[@name='start_date']");
    private By end_date = By.xpath("//input[@name='end_date']");
    private By all_week = By.xpath("//input[@id='allweek']");
    private  By launch_Btn = By.xpath("//button[@type='submit']");


    //Method

    public void click_marktOption(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(marketing_opt).click();
    }
    public void click_addDiscount(){
       driver.findElement(add_discount_btn).click();
    }
    public void enter_discName(String disc_name){
        driver.findElement(discount_name).sendKeys(disc_name);
    }
    public void enter_message(String discMessage){
        driver.findElement(discount_ms).sendKeys(discMessage);
    }
    public void uploadImage(){
        driver.findElement(upload_disc_image).sendKeys("C://Users//Danish.Mustafa//Desktop//Restro//discount.jpg");
    }
    public void selectCustomer_frequency(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(customer_frequency).click();

       List<WebElement> opt = driver.findElements(By.xpath("//div[@class=' css-11unzgr']"));

        for (int i = 0 ; i<opt.size();i++) {

            System.out.println(opt.get(i).getText());
            if(opt.get(i).getText().contains("Customers")){
                opt.get(i).click();
            }
        }

    }



    public void disc_amount(String amount){
        driver.findElement(discount_amount).sendKeys(amount);
    }
    public void upto(String amount_upto){
        driver.findElement(upto).sendKeys(amount_upto);
    }
    public void discount_validity(String val){
        driver.findElement(validity).sendKeys(val);
    }
    public void enter_code(String coupon){
        driver.findElement(coupon_code).sendKeys(coupon);
    }
   public void budget(String d_budget){
        driver.findElement(daily_budget).sendKeys(d_budget);
   }
   public void enter_recurrence(String r){
        driver.findElement(recurrence).sendKeys(r);
   }
   public void startDate(String s_date){
        driver.findElement(start_date).sendKeys(s_date);

   }
   public void endDate(String e_date){
        driver.findElement(end_date).sendKeys(e_date);
   }
   public void select_allWeek(){
        driver.findElement(all_week).click();
   }

   public void click_launch(){
        driver.findElement(launch_Btn).click();
   }



   // Business Method

    public String addDiscountCampaign(){
        click_marktOption();
        click_addDiscount();
        enter_discName("Auto Discount");
        enter_message("Testing XYZ");
        uploadImage();
        selectCustomer_frequency();
        disc_amount("20");
        upto("30000");
        enter_code("1234");
        enter_recurrence("5");
        discount_validity("5");
        budget("120000");
        startDate("16/09/2022");
        endDate("17/09/2022");
        select_allWeek();
        click_launch();

        return driver.findElement(By.xpath("//div//div[@role='status'][contains(text(),'Campaign created')]")).getText();

    }


  public void getTable() {
      click_marktOption();

      int countRow = driver.findElements(By.xpath("//table[@class='table responsive mt-3']//tbody//tr")).size();
      int countCol = driver.findElements(By.xpath("//table[@class='table responsive mt-3']//thead//tr/th")).size();


      for (int i = 1; i <= countRow; i++) {
          for (int j = 1; j < countCol; j++) {
              String table_date = driver.findElement(By.xpath("//table[@class='table responsive mt-3']//tbody//tr[" + i + "]//td[" + j + "]")).getText();
              System.out.println(table_date);

          }

      }

  }


  public String  selectGraphFilter(String dateRange){
         click_marktOption();
        driver.findElement(By.xpath("//div[@id='reportrange']//i")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> elements = driver.findElements(By.xpath("//div//div[@class='ranges']//ul//li"));
        for(int i=0; i<elements.size();i++){
           System.out.println(elements.get(i).getText());

            if(elements.get(i).getText().contains(dateRange)){
             elements.get(i).click();
            }
        }
         String actualDate = driver.findElement(By.xpath("//span[@id='reportrange']")).getText();
          return actualDate ;
    }

}


