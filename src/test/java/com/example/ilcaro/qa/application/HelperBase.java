package com.example.ilcaro.qa.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HelperBase {

    WebDriver wd;

    public HelperBase(  WebDriver wd)
    {
        this.wd = wd;
    }

    public void pausa(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public void clickToYallaBtn() {

        wd.findElement(By.cssSelector("[type='submit']")).click();
        //wd.findElement(By.cssSelector(".yalla_yalla__1Jxk6")).click();no work
    }//[type='submit']


    public void typeBy(By loc, String str) {

        wd.findElement(loc).click();
        wd.findElement(loc).clear();
        wd.findElement(loc).sendKeys(str);
    }
    public void clickByCss(String cssSelector) {
        wd.findElement(By.cssSelector(cssSelector)).click();
    }

    public void clickByXpath(String xPath) {
        wd.findElement(By.xpath(xPath)).click();
    }

    public void clickLoginBtn() {
        clickByCss("a[href='/login']");
    }
// for click to elements if don't see his to page use Actions
    public void click(By loc) {

        Actions actions = new Actions(wd);
        actions.moveToElement(wd.findElement(loc)).click().perform();
      //  wd.findElement(loc).click();
    }

    public void typeByCss(String cssSelector, String str) {

        clickByCss(cssSelector);
        wd.findElement(By.cssSelector(cssSelector)).clear();
        wd.findElement(By.cssSelector(cssSelector)).sendKeys(str);
    }
    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;
    }
}
