package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Home_page_function extends AbstractClass{

    WebDriver driver;

    public Home_page_function() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

   public void clickozelgun()
   {
       clickFunction(driver.findElement(By.xpath("//div[@class='navbar row ustmenuburada original']//span[contains(text(),'Özel Günler')]")));
   }
   public void clicksevgililergun()
   {
       clickFunction(driver.findElement(By.xpath("//div[@class='navbar row ustmenuburada original']//ul//a[normalize-space()='Sevgililer Günü']")));
   }
   public void clickproduct()
   {
       clickFunction(driver.findElement(By.xpath("(//div[@class='imageContainer'])[1]")));
   }
   public void readproductname()
   {
        String productname =driver.findElement(By.xpath("//h1[@class='western']")).getText();
        System.out.println(productname);
        String marka =driver.findElement(By.xpath("//span[@itemprop='name']")).getText();
        System.out.println(marka);
   }
   public void sendproductname(String product)
   {
       sendKeysFunction(driver.findElement(By.xpath("//input[@id='aramafrm']")),product);
   }
   public void clicksearchbutton()
   {
       clickFunction(driver.findElement(By.xpath("//div[@class='search']//i[@class='fa fa-search']")));
   }
   public void clickcicek()
   {
       clickFunction(driver.findElement(By.xpath("(//div[@class='imageContainer'])[1]")));
   }
   public void readcicekinfo()
   {
       String info =driver.findElement(By.xpath("(//p[@align='justify'])[2]")).getText();
       System.out.println(info);
       String price =driver.findElement(By.xpath("//div[@class='fiyatadet']")).getText();
       System.out.println(price);
   }
   public void clickhakkimizda()
    {
        AssertionFunction(driver.findElement(By.xpath("//h5[contains(text(),'Hakkımızda')]")),"Hakkımızda");
        clickFunction(driver.findElement(By.xpath("//a[contains(text(),'Hakkımızda')]")));
    }
    public void infohakimizda()
    {
        String info =driver.findElement(By.xpath("//div[@class='col2']")).getText();
        System.out.println(info);
    }
}
