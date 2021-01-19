package com.example.ilcaro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase{

    @BeforeMethod
    public  void ensurePreconditions() throws InterruptedException {

        if(!isUserLoggedIn())
        {
            logIn();
        }
    }

    @Test
    public void testLogOut() throws InterruptedException {

        pausa(1000);
        clickLogoutBtnOnHeader();
        pausa(1000);

        Assert.assertFalse(isUserLoggedIn());
    }

}
