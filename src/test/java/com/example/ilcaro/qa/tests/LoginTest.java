package com.example.ilcaro.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @BeforeMethod
    public void ensurePreconditions() {
        if (app.getUserHelper().isUserLoggedIn()) {
            app.getUserHelper().clickLogoutBtnOnHeader();
        }
    }

//    public boolean isUserLoggedIn() {
//
//        //verify that button logout exist on page
//        return isElementPresent(By.xpath("//a{contains(., 'logOut')}"));
//    }

    @Test
    public void testLogin() throws InterruptedException {

        app.getUserHelper().clickLoginBtn();

        app.getUserHelper().fillLoginForm("kupidon19711610893762495@gmail.com", "Abc12345");
        //click to yalla btn
        //  clickByCss("[type='submit']");
        app.getUserHelper().pausa(2000);
        //clickToYallaBtn();no work
        app.getUserHelper().clickByCss("[type='submit']");

        Assert.assertTrue(app.getUserHelper().isUserLoggedIn());
    }


}


//    public void click(By locator) {
//        wd.findElement(locator).click();
//    }



