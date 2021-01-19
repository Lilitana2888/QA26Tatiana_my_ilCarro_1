package com.example.ilcaro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase {


    @BeforeMethod
    public void ensurePreconditions() {
        if (isUserLoggedIn()) {
            clickLogoutBtnOnHeader();
        }
    }

//    public boolean isUserLoggedIn() {
//
//        //verify that button logout exist on page
//        return isElementPresent(By.xpath("//a{contains(., 'logOut')}"));
//    }

    @Test
    public void testLogin() throws InterruptedException {

        clickLoginBtn();

        fillLoginForm("kupidon19711610893762495@gmail.com", "Abc12345");
        //click to yalla btn
        //  clickByCss("[type='submit']");
        pausa(2000);
        //clickToYallaBtn();no work
        clickByCss("[type='submit']");

        Assert.assertTrue(isUserLoggedIn());
    }


}


//    public void click(By locator) {
//        wd.findElement(locator).click();
//    }



