package com.example.ilcaro.qa.tests;

import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    @Test
    public void setRegistration() throws InterruptedException {

        //open reg form click to sign up
        app.getUserHelper().openRegForm();

        //fill reg form
        String email = "kupidon1971"+ System.currentTimeMillis()+ "@gmail.com";
        System.out.println(email + " -MyEmail");
        app.getUserHelper().fillRegForm(email, "Tatiana", "Gessen", "Abc12345");

        app.getUserHelper().selectCheckBox();

        app.getUserHelper().pausa(2000);
        app.getUserHelper().clickToYallaBtn();
        app.getUserHelper().pausa(2000);


    }

}
