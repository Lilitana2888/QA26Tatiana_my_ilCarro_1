package com.example.ilcaro.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarCreationTests extends TestBase{

    @Test
    public void testCarCreation() throws InterruptedException {

        app.getCarHelper().initAddingNewCar();
       // Assert.assertTrue(app.getCarHelper().isCarCreationFormPresent());
        app.getCarHelper().fillCarForm("Israel","Herzel2","500","233-67-222",
                "Toyota","Yaris","2019","HC325677YH","6.5","PETROL","fuul Drive",
                "4WD","149","120","5","5","C","Very good car","no smoking",
                "55");
        Thread.sleep(2000);
        app.getCarHelper().clickToYallaBtn();
    }
}
