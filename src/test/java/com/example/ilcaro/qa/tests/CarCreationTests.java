package com.example.ilcaro.qa.tests;

import com.example.ilcaro.qa.model.Car;
import org.testng.annotations.Test;

public class CarCreationTests extends TestBase {

    @Test
    public void testCarCreation() throws InterruptedException {

        app.getCarHelper().initAddingNewCar();
        // Assert.assertTrue(app.getCarHelper().isCarCreationFormPresent());
        app.getCarHelper().fillCarForm(
                new Car().setCountry("Israel").setAddress("Herzel2").setDistance("500")
                        .setSerial_number("233-67-222").setBrand("Toyota").setModel("Yaris")
                        .setYear("2019").setEngine("HC325677YH").setFuel_consumption("6.5")
                        .setFuel("PETROL").setTransmition("fuul Drive").setWheelsDrive("4WD")
                        .setHorsepower("149").setTorque("120").setDoors("5")
                        .setSeats("5").setClasS("C").setAbout("Very good car")
                        .setType_feature("no smoking").setPrice("55"));
        Thread.sleep(2000);
        app.getCarHelper().clickToYallaBtn();
    }
}
