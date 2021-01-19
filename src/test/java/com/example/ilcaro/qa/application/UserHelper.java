package com.example.ilcaro.qa.application;

import com.example.ilcaro.qa.application.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {

    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void logIn() throws InterruptedException
    {
        clickByCss("a[href='/login']");

        fillLoginForm("kupidon19711610893762495@gmail.com", "Abc12345");
        //click to yalla btn
        pausa(2000);
        clickByCss("[type='submit']");
    }

    public void fillLoginForm(String email, String password) {
        typeByCss("[name='email']", email);
        typeByCss("[name='password']", password);
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

    public boolean isUserLoggedIn() {

        //verify that button logout exist on page
        return isElementPresent(By.xpath("//a[contains(.,'logOut')]"));
    }

    public void clickLogoutBtnOnHeader() {
        // click(By.xpath("//a{contains(., 'logOut')}")); no work
        click(By.cssSelector("a[href='/login"));
    }


}
