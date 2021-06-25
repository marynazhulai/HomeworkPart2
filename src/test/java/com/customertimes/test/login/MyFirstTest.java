package com.customertimes.test.login;


import com.customertimes.test.BaseTest;
import com.customertimes.test.framework.driver.WebdriverRunner;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class MyFirstTest extends BaseTest {
    @BeforeClass
    public void beforeClass() {
        System.out.println("This is before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This is after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This is after method");
    }


   // @Test
    @Ignore
    public void checkSiteTitle (){

        WebdriverRunner.getWebDriver().get("https://www.amazon.com/");
        try {
            Thread.sleep(4_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String  expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = WebdriverRunner.getWebDriver().getTitle();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals (actualTitle, expectedTitle, "title is not expected");
        softAssert.assertEquals (actualTitle, expectedTitle, "title is not expected");
        softAssert.assertAll();


    }
}

