package Pageobjects;

import BaseclassFramework.Baseclass;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class TC3_Navigationmenu extends Baseclass
{

    private static By w;


    public static void Navigationmenu_WomenTab()throws InterruptedException
    {
        Actions actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        WebElement WomenTab=driver.findElement(By.linkText("Women"));
        actions.moveToElement(WomenTab).click().perform();

    }
    public static void Navigationmenu_DressTab()throws InterruptedException
    {
        Actions actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        WebElement DressesTab=driver.findElement(By.linkText("Dresses"));
        actions.moveToElement(DressesTab).click().perform();

    }
    public static void Navigationmenu_EveingDressTab()throws InterruptedException
    {
        Actions actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        WebElement TShirtsTab=driver.findElement(By.xpath("//a[@title='Browse our different dresses to choose the perfect dress for an unforgettable evening!']"));
        actions.moveToElement(TShirtsTab).click().perform();

        WebElement checkBoxSelected=driver.findElement(By.id("layered_id_attribute_group_2"));
        checkBoxSelected.click();

        WebElement pinkCheckBoxSelected=driver.findElement(By.id("layered_id_attribute_group_24"));
        pinkCheckBoxSelected.click();

        WebElement  slider=driver.findElement(By.xpath("//div[@id='layered_price_slider']//a[1]"));
        WebElement  slider2=driver.findElement(By.xpath("(//div[@id='layered_price_slider']//a)[2]"));
        WebElement Img=driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
        WebElement MoreBtn=driver.findElement(By.xpath("//a[@itemprop='url']//span[1]"));

        Actions actions1=new Actions(driver);

        actions1.dragAndDropBy(slider,1,0).perform();
        Thread.sleep(2000);
        actions1.dragAndDropBy(slider2, (int) -3.1,0).perform();

        actions = new Actions(driver);
        actions.moveToElement(Img).moveToElement(MoreBtn).click().perform();

        driver.findElement(By.id("quantity_wanted")).clear();
        driver.findElement(By.id("quantity_wanted")).sendKeys("3");

        Select objSelect =new Select(driver.findElement(By.id("group_1")));

        objSelect.selectByVisibleText("M");

        driver.findElement(By.xpath("//a[@title='Pink']")).click();
        driver.findElement(By.xpath("//span[text()='Add to cart']")).click();

        //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Thread.sleep(40000);
        String TotalProductsCost=driver.findElement(By.xpath("//div[@class='layer_cart_row']//span")).getText();
        String TotalShippingCost=driver.findElement(By.xpath("(//div[@class='layer_cart_row']//span)[2]")).getText();
        String TotalCost=driver.findElement(By.xpath("(//div[@class='layer_cart_row']//span)[3]")).getText();

        String TotalProductsCostNew = TotalProductsCost.replace("$","");// replaceAll("\\D+", "");
        String TotalShippingCostNew = TotalShippingCost.replace("$","");// replaceAll("\\D+", "");

        double TotalCostExpected =Double.valueOf(TotalProductsCostNew)  + Double.valueOf(TotalShippingCostNew) ;
        String TotalCostExpectedNew= "$"+TotalCostExpected;
        Assert.assertEquals(TotalCost,TotalCostExpectedNew);

        String Quantity=driver.findElement(By.xpath("//strong[text()='Quantity']/following-sibling::span")).getText();
        String Color_Size=driver.findElement(By.xpath("(//div[@class='layer_cart_product_info']//span)[2]")).getText();
        //Quantity, Size, Colour, Total product cost, Shipping cost, total cost
        System.out.println("Quantity:"+" "+Quantity);
        System.out.println("Color and Size:"+" "+Color_Size);
        System.out.println("Total Products Cost:"+" "+TotalProductsCost);
        System.out.println("Shipping Cost:"+" "+TotalShippingCost);
        System.out.println("Total Cost:"+" "+TotalCost);



    }

    }

