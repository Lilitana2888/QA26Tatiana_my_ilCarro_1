package com.example.ilcaro.qa.application;

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

    public void fillCarForm(String country, String address, String distance,
                            String serial_number, String brand, String model,
                            String year, String address1, String fuel_consumption,
                            String fuel, String transmition, String wheelsDrive,
                            String horsepower, String torque, String doors,
                            String seats, String clasS, String about, String type_feature, String price)

    {
        typeBy(By.cssSelector(".country"),country);
        typeBy(By.cssSelector(".address"), address);
        typeBy(By.cssSelector(".distance_included"), distance);

        typeBy(By.cssSelector(".serial_number"), serial_number);
        typeBy(By.cssSelector(".brand"), brand);
        typeBy(By.cssSelector(".model"), model);
        typeBy(By.cssSelector(".year"), year);
        typeBy(By.cssSelector(".engine"), address1);
        typeBy(By.cssSelector(".fuel_consumption"), fuel_consumption);
        typeBy(By.cssSelector(".fuel"), fuel);
        typeBy(By.cssSelector(".transmition"), transmition);

        typeBy(By.cssSelector(".wd"), wheelsDrive);
        typeBy(By.cssSelector(".horsepower"), horsepower);
        typeBy(By.cssSelector(".torque"), torque);
        typeBy(By.cssSelector(".doors"), doors);
        typeBy(By.cssSelector(".seats"), seats);
        typeBy(By.cssSelector(".class"), clasS);//
        typeBy(By.cssSelector("[name='about']"), about);
        typeBy(By.cssSelector(".type_feature"), type_feature);
        typeBy(By.cssSelector(".price"), price);

    }
    public void clickOnSubmitBtn()
    {
        click(By.cssSelector("[type='submit']"));
    }


    }

