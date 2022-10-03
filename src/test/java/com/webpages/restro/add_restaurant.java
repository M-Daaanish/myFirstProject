package com.webpages.restro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class add_restaurant {
    WebDriver driver ;

    public  add_restaurant(WebDriver driver){
        this.driver = driver ;
    }

    private By Menu_restaurant = By.xpath("//a[@href='/restaurants']");
    private By add_res = By.xpath("//button[@class='u-menubutton001 ml-3']");
    private By rest_name = By.xpath("//input[@name='restaurant_name']");
    private By contact_name = By.xpath("//input[@name='contact_name']");
    private By rest_email = By.xpath("//input[@name='restaurant_email']");
    private By contact_email = By.xpath("//input[@name='contact_email']");
    private By rest_phoneno = By.xpath("/html/body/div[3]/div/div/div/div[2]/div[3]/div/div[1]/div/input");
    private By contact_no = By.xpath("/html/body/div[3]/div/div/div/div[2]/div[3]/div/div[2]/div/input");
    private By contact_role = By.xpath("//input[@name='contact_role']");
    private By founding_date = By.xpath("//input[@name='founding_date']");
    private By rest_address = By.xpath("//textarea[@name='restaurant_address']");
    private By rest_description = By.xpath("//textarea[@name='restaurant_description']");
    private By select_country = By.xpath("//select[@name='country']");
    private By select_city = By.xpath("//select[@name='city']");
    private By select_area = By.xpath("//select[@name='area']");
    private By rest_type = By.xpath("//input[@name='restaurant_type']");
    private By no_of_tables = By.xpath("//input[@name='number_of_tables']");
    private By QR_code = By.xpath("//input[@name='number_of_qrcodes']");
    private By trn_license = By.xpath("//input[@name='trn_license']");
    private By VAT = By.xpath("//input[@name='vat']");
    private By campaign_msg_fee = By.xpath("//input[@name='campaign_message_fee']");
    private By commission_msgs = By.xpath("//input[@name='campaign_commission']");
    private By pairing_commission = By.xpath("//input[@name='pairing_commission']");
    private By subscription = By.xpath("//input[@name='subscription']");
    private By currency = By.xpath("//select[@name='currency']");
    private By click_launch = By.xpath("//button[@class='submitButton']");

    // Methods

    public void enterRest_name(String name)
    { driver.findElement(rest_name).sendKeys(name);}
    public void enterRest_email(String emailAddress){driver.findElement(rest_email).sendKeys(emailAddress);}
    public void enter_contact_email(String c_email){
        driver.findElement(contact_email).sendKeys(c_email);
 }
    public void enter_contactName(String c_name){
        driver.findElement(contact_name).sendKeys(c_name);
    }
    public void enter_rest_phone(String phone){
        driver.findElement(rest_phoneno).sendKeys(phone);
    }
    public void enter_contact_no(String c_number){
        driver.findElement(contact_no).sendKeys(c_number);
    }
    public void enter_contact_role(String role){
        driver.findElement(contact_role).sendKeys(role);
    }
    public void enter_founding_date(String f_date){
        driver.findElement(founding_date).sendKeys(f_date);
    }
    public void enterRest_address(String address){
        driver.findElement(rest_address).sendKeys(address);
    }

    public void select_count(){
        Select country = new Select(driver.findElement(select_country));
        country.selectByVisibleText("UAE");
    }
    public void selectCity(){
        Select city = new Select(driver.findElement(select_city));
        city.selectByVisibleText("Dubai");
    }
    public void selectArea(){
        Select area = new Select(driver.findElement(select_area));
        area.selectByVisibleText("Marina");}
    public void enter_rest_type(String type){
        driver.findElement(rest_type).sendKeys(type);
        }

        public void description(String desc){
        driver.findElement(rest_description).sendKeys(desc);
        }
    public void VAT_tax(String tax){
        driver.findElement(VAT).sendKeys(tax);
    }
        public void enter_table(String tables){
        driver.findElement(no_of_tables).sendKeys(tables);
        }

        public void enter_QR(String QRcode){
        driver.findElement(QR_code).sendKeys(QRcode);
        }
        public void enter_trn(String license){
        driver.findElement(trn_license).sendKeys(license);
        }
        public void enter_campaign_fee(String fee){
        driver.findElement(campaign_msg_fee).clear();
        driver.findElement(campaign_msg_fee).sendKeys(fee);
        }
        public void commission_message(String msg){
        driver.findElement(commission_msgs).clear();
        driver.findElement(commission_msgs).sendKeys(msg);
        }
        public void pairing(String pairing_com){
        driver.findElement(pairing_commission).clear();
        driver.findElement(pairing_commission).sendKeys(pairing_com);
        }
        public void enter_subscription(String subs){
        driver.findElement(subscription).clear();
        driver.findElement(subscription).sendKeys(subs);
        }
        public void selectCurrency(){
        Select d_currecncy = new Select(driver.findElement(currency));
        d_currecncy.selectByVisibleText("AED");
        }
        public void click_launch_btn(){
        driver.findElement(click_launch).click();
        }


        public void addRestaurant()
        {



            driver.findElement(Menu_restaurant).click();
            driver.findElement(add_res).click();
            enterRest_name("Auto Restro 1");
            enter_contactName("Zahid");
            enterRest_email("restroAuto2@gmail.com");
            enter_contact_email("restroAuto3@gmail.com");
            enter_rest_phone("+92344762893");
            enter_contact_no("+9256356453");
            enter_founding_date("22//08/2022");
            enter_contact_role("admin");
            enterRest_address("Testing Address");
            description("XYZ description");
            select_count();
            selectCity();
            selectArea();
            enter_trn("3435323ABNKD");
            VAT_tax("15");
            enter_rest_type("American");
            enter_table("25");
            enter_QR("25");
            enter_campaign_fee("1");
            commission_message("1");
            pairing("1");
            enter_subscription("1");
            selectCurrency();
            click_launch_btn();
        }



}
