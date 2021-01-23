package com.example.ilcaro.qa.application;

import com.example.ilcaro.qa.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {

    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void logIn() throws InterruptedException
    {
        clickByCss("a[href='/login']");

      //  fillLoginForm("kupidon19711610893762495@gmail.com", "Abc12345");
        fillLoginForm(new User()
                .withEmail("kupidon19711610893762495@gmail.com")
                 .withPswd( "Abc12345"));
        //click to yalla btn
        pausa(2000);
        clickByCss("[type='submit']");
    }

    public void fillLoginForm(User user) {
        typeByCss("[name='email']", user.getEmail());
        typeByCss("[name='password']", user.getPswd());
    }

    public void fillRegForm(User user) {

        typeBy(By.cssSelector("#first_name[ name='first_name'] "), user.getFirstName());
        typeBy(By.cssSelector("#second_name[ name='second_name'] "), user.getSurName());


        typeBy(By.cssSelector("#email"), user.getEmail());

        typeBy(By.cssSelector("#password"), user.getPswd());
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


   public boolean isRegistrationFormPresent() {
        return wd.findElements(By.xpath("//h2[contains(.,'Registration')]")).size()>0;
    }
}
