package com.example.ilcaro.qa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    @Test
    public void setRegistration() throws InterruptedException {

        //open reg form click to sign up
        openRegForm();

        //fill reg form
        String email = "kupidon1971"+ System.currentTimeMillis()+ "@gmail.com";
        System.out.println(email + " -MyEmail");
        fillRegForm(email, "Tatiana", "Gessen", "Abc12345");

        selectCheckBox();

        pausa(2000);
        clickToYallaBtn();
        pausa(2000);


    }

//    public void typeBy(By loc, String str) {
//
//        wd.findElement(loc).click();
//        wd.findElement(loc).clear();
//        wd.findElement(loc).sendKeys(str);
//    }
}
