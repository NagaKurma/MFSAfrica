package Pageobjects;

import BaseclassFramework.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TC2_Pricelowtohigh extends Baseclass {

   static String[] array = {"$16.40 ","$16.51","$26.00","$27.00","$28.98","$30.50","$50.99"};

   public static void Pricelowtohigh()throws InterruptedException{
       Actions actions=new Actions(driver);
       driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
       Thread.sleep(2000);
       WebElement popularTab=driver.findElement(By.linkText("POPULAR"));
       actions.moveToElement(popularTab).click().perform();

       int index = 0;
       while (index < array.length) {
           String arrays = array[index];
           System.out.println(arrays);
           index++;
       }
   }

    }

