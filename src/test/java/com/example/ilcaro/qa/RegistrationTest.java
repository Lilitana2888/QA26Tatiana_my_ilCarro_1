package com.example.ilcaro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {
    WebDriver wd;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        wd = new ChromeDriver();
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");
       // Thread.sleep(1000);
    }

    @Test
    public void setRegistration()
    {
        WebElement element = wd.findElement(By.name("address"));
        element.click();
        element.sendKeys("Tel Aviv");

    }


    @AfterMethod
    public void tearDown()
    {
        wd.quit();
    }
}
