package com.example.ilcaro.qa.tests;

import com.example.ilcaro.qa.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    @Test
    public void setRegistration() throws InterruptedException {

        //open reg form click to sign up
        app.getUserHelper().openRegForm();

        //fill reg form
        String email = "kupidon1971"+ System.currentTimeMillis()+ "@gmail.com";
        System.out.println(email + " -MyEmail");
        app.getUserHelper().fillRegForm(new User().withEmail(email)
                .withFirstName("Tatiana")
                .withSurName("Gessen")
                .withPswd("Abc12345"));

        app.getUserHelper().selectCheckBox();

        app.getUserHelper().pausa(2000);
        app.getUserHelper().clickToYallaBtn();
        app.getUserHelper().pausa(2000);

        Assert.assertTrue(app.getUserHelper().isRegistrationFormPresent());
    }

    @Test
    public void setRegistrationNegative() throws InterruptedException {

        //open reg form click to sign up
        app.getUserHelper().openRegForm();

        //fill reg form
        String email = "kupidon1971"+ System.currentTimeMillis()+ "@gmail.com";
        System.out.println(email + " -MyEmail");
        app.getUserHelper().fillRegForm(new User().withEmail(email)
                .withFirstName("Tatiana")
             //   .withSurName("Gessen")
                .withPswd("Abc12345"));

        app.getUserHelper().selectCheckBox();

        app.getUserHelper().pausa(2000);
        app.getUserHelper().clickToYallaBtn();
        app.getUserHelper().pausa(2000);

          Assert.assertFalse(app.getUserHelper().isRegistrationFormPresent());
    }

}
