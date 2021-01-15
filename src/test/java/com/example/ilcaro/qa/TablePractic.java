package com.example.ilcaro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TablePractic {

    WebDriver wd;

    @BeforeClass
    public void setUp()
    {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/User-Pc/Downloads/index.html");
    }

    @Test
    public void tablePractic()
    {
       // WebElement el = wd.findElement(By.cssSelector(".nav-item[href$='#item1']"));
        WebElement el = wd.findElement(By.cssSelector("a[href$='#item1']"));
        el.click();
        el = wd.findElement(By.cssSelector(".message"));
        String message = el.getText();
        System.out.println("Message: " + message);

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //wd.manage().timeouts().implicitlyWait(2000, TimeUnit.MICROSECONDS);
        wd.quit();
    }
}
