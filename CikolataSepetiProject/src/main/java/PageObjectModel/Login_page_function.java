package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class Login_page_function extends AbstractClass{

    WebDriver driver;


    public Login_page_function() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickSignin() {
        clickFunction(driver.findElement(By.xpath("//a[normalize-space()='Üyelik']")));




    }

    public void sendUsername(String username) {
        sendKeysFunction(driver.findElement(By.xpath("//input[@id='email']")), username);
    }

    public void sendPassword(String password) {
        sendKeysFunction(driver.findElement(By.xpath("//input[@id='pass']")), password);


    }

    public void clickLoginbutton() throws InterruptedException {
        clickFunction(driver.findElement(By.xpath("//button[@id='girisyap']")));
        Thread.sleep(2000);
    }

    public void showerrormessagelogin() {
        String error = driver.findElement(By.xpath("//h3[contains(text(),'Giriş Yapın')]")).getText();
        Assert.assertEquals(error,"Giriş Yapın");
        System.out.println(error);
    }

    public void checkusername() {

        String username = driver.findElement(By.xpath("//span[contains(text(),'Siparişlerim')]")).getText();
        System.out.println(username);

    }

    public void cikispage() throws InterruptedException {
        clickFunction(driver.findElement(By.xpath("//i[@title='Çıkış']")));
        Thread.sleep(2000);

    }


    public void quitdriver() {
        Driver.closeDriver();
    }


}

