package Pageobjects;

import BaseclassFramework.Baseclass;
import org.openqa.selenium.By;

public class TC1_Loginpage extends Baseclass {

    static By SignInButton=By.xpath("//a[@title='Log in to your customer account']");
    static By Username=By.xpath("(//input[contains(@class,'is_required validate')])[2]");
    static By Password=By.xpath("(//input[contains(@class,'is_required validate')])[3]");
    static By UserSigninButton= ( By.xpath("//button[@id='SubmitLogin']//span[1]"));



    public static void SignInButton()throws InterruptedException{
        driver.findElement(SignInButton).click();

    }

    public static void UserSignInButton()throws Exception
    {
        //Global Variables
        driver.findElement(Username).sendKeys("testautomationmfs@gmail.com");
        driver.findElement(Password).sendKeys("TestAutomation@123");


        driver.findElement(UserSigninButton) .click();

    }




}
