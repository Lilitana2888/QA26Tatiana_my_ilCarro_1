package com.example.ilcaro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.sound.midi.MidiSystem;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegistrationTest {
    WebDriver wd;

    @BeforeMethod
    public void setUp()  {
        wd = new ChromeDriver();
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");

    }

    @Test
    public void setRegistration()
    {
        //open reg form click to sign up
        wd.findElement(By.cssSelector("[href=\'/signup\']")).click();

        //fill reg form
        wd.findElement(By.cssSelector("#first_name[ name='first_name']")).click();
        wd.findElement(By.cssSelector("#first_name[ name='first_name']")).clear();
        wd.findElement(By.cssSelector("#first_name[ name='first_name']")).sendKeys("Tatiana");

        wd.findElement(By.cssSelector("#second_name[name*='second_name']")).click();
        wd.findElement(By.cssSelector("#second_name[name*='second_name'] ")).clear();
        wd.findElement(By.cssSelector("#second_name[name*='second_name'] ")).sendKeys("Gessen");

        wd.findElement(By.id("email")).click();
        wd.findElement(By.id("email")).clear();
       wd.findElement(By.id("email")).sendKeys("kupidon1971@gmail.com");

        wd.findElement(By.id("password")).click();
       wd.findElement(By.id("password")).clear();
       wd.findElement(By.id("password")).sendKeys("Abc12345");

        wd.findElement(By.id("check_policy")).click();
        WebElement btnYalla = wd.findElement(By.cssSelector(".yalla_yalla__1Jxk6"));
       Boolean yallabtn = btnYalla.isEnabled();
       if(yallabtn = true)
       {
           btnYalla.click();
       }
       else
           wd.manage().timeouts().implicitlyWait(2000, TimeUnit.MICROSECONDS);
             btnYalla.click();



//       List<WebElement>  list = wd.findElements(By.className("signup__fields"));
//       int listsize = list.size();
//       System.out.println(listsize);


    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
         Thread.sleep(4000);
      //  wd.manage().timeouts().implicitlyWait(4000, TimeUnit.MICROSECONDS);don't work
        wd.quit();
    }
}
