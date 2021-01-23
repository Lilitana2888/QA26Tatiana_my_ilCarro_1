package com.example.ilcaro.qa.application;

import com.example.ilcaro.qa.model.Car;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarHelper extends HelperBase{

    public CarHelper(WebDriver wd) {
        super(wd);
    }

    public  void initAddingNewCar()
    {
        click(By.cssSelector("header [href='/car']"));
    }

    public boolean isCarCreationFormPresent() {

        return isElementPresent(By.xpath("//h3[contains(.,'Let the car work')]"));
    }

    public void fillCarForm(Car car)

    {
        typeBy(By.cssSelector(".country"), car.getCountry());
        typeBy(By.cssSelector(".address"), car.getAddress());
        typeBy(By.cssSelector(".distance_included"), car.getDistance());

        typeBy(By.cssSelector(".serial_number"), car.getSerial_number());
        typeBy(By.cssSelector(".brand"), car.getBrand());
        typeBy(By.cssSelector(".model"), car.getModel());
        typeBy(By.cssSelector(".year"), car.getYear());
        typeBy(By.cssSelector(".engine"), car.getEngine());
        typeBy(By.cssSelector(".fuel_consumption"), car.getFuel_consumption());
        typeBy(By.cssSelector(".fuel"), car.getFuel());
        typeBy(By.cssSelector(".transmition"), car.getTransmition());

        typeBy(By.cssSelector(".wd"), car.getWheelsDrive());
        typeBy(By.cssSelector(".horsepower"), car.getHorsepower());
        typeBy(By.cssSelector(".torque"), car.getTorque());
        typeBy(By.cssSelector(".doors"), car.getDoors());
        typeBy(By.cssSelector(".seats"), car.getSeats());
        typeBy(By.cssSelector(".class"), car.getClasS());//
        typeBy(By.cssSelector("[name='about']"), car.getAbout());
        typeBy(By.cssSelector(".type_feature"), car.getType_feature());
        typeBy(By.cssSelector(".price"), car.getPrice());

    }
    public void clickOnSubmitBtn()
    {
        click(By.cssSelector("[type='submit']"));
    }


    }

