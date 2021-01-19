package com.example.ilcaro.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {

    @BeforeMethod
    public  void ensurePreconditions() throws InterruptedException {

        if(!app.getUserHelper().isUserLoggedIn())
        {
            app.getUserHelper().logIn();
        }
    }

    @Test
    public void testLogOut() throws InterruptedException {

        app.getUserHelper().pausa(1000);
        app.getUserHelper().clickLogoutBtnOnHeader();
        app.getUserHelper().pausa(1000);

        Assert.assertFalse(app.getUserHelper().isUserLoggedIn());
    }

}
