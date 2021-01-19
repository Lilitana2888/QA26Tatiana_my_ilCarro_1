package com.example.ilcaro.qa.tests;

import com.example.ilcaro.qa.application.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {


    protected ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp()  {

        app.start();

    }


    @AfterMethod
    public void tearDown()  {

        app.stop();
    }


}
