package com.example.ilcaro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;


    @BeforeMethod
    public void setUp()  {

        wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro-dev-v1.firebaseapp.com/");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void logIn() throws InterruptedException
    {
        clickByCss("a[href='/login']");

        fillLoginForm("kupidon19711610893762495@gmail.com", "Abc12345");
        //click to yalla btn
        pausa(2000);
        clickByCss("[type='submit']");
    }

    public void pausa(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public void fillRegForm(String email, String firstName, String surName, String pswd) {

        typeBy(By.cssSelector("#first_name[ name='first_name'] "), firstName);
        typeBy(By.cssSelector("#second_name[ name='second_name'] "), surName);


        typeBy(By.cssSelector("#email"),email);

        typeBy(By.cssSelector("#password"), pswd);
    }


    public void openRegForm() {
        click(By.cssSelector("[href=\'/signup\']"));
    }

    public void selectCheckBox() {
        wd.findElement(By.id("check_policy")).click();
    }

    public void clickToYallaBtn() {
        wd.findElement(By.cssSelector(".yalla_yalla__1Jxk6")).click();
    }
//change parametr By loc to str ???
   public void typeBy(By loc, String str) {

       wd.findElement(loc).click();
       wd.findElement(loc).clear();
       wd.findElement(loc).sendKeys(str);
   }

    public void fillLoginForm(String email, String password) {
        typeByCss("[name='email']", email);
        typeByCss("[name='password']", password);
    }

    public void clickByCss(String cssSelector) {
        wd.findElement(By.cssSelector(cssSelector)).click();
    }

    public void clickByXpath(String xPath) {
        wd.findElement(By.xpath(xPath)).click();
    }

    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;
    }

    public boolean isUserLoggedIn() {

        //verify that button logout exist on page
        return isElementPresent(By.xpath("//a[contains(.,'logOut')]"));
    }

    public void clickLoginBtn() {
        clickByCss("a[href='/login']");
    }

    public void click(By loc) {

        wd.findElement(loc).click();
    }

    private void typeByCss(String cssSelector, String str) {

        clickByCss(cssSelector);
        wd.findElement(By.cssSelector(cssSelector)).clear();
        wd.findElement(By.cssSelector(cssSelector)).sendKeys(str);
    }

    public void clickLogoutBtnOnHeader() {
       // click(By.xpath("//a{contains(., 'logOut')}")); no work
        click(By.cssSelector("a[href='/login"));
    }


    @AfterMethod
    public void tearDown()  {

        //  wd.manage().timeouts().implicitlyWait(4000, TimeUnit.MICROSECONDS);don't work
        wd.quit();
    }


}
