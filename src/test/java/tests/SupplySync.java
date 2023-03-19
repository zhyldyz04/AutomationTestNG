package tests;

import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.SupplySyncLoginPage;
import utilities.Config;
import utilities.Driver;
import utilities.Flow;

public class SupplySync {

    SupplySyncLoginPage supplySyncLoginPage = new SupplySyncLoginPage();


    @Test
    public void loginPositive(){
        Driver.getDriver().get(Config.getValue("supplySyncURL"));
        supplySyncLoginPage.login("codewise@gmail.com", "123123");
        String expectedURL = "https://supplysync.us/dashboard/companies";
        Flow.wait(1500);

        Assert.assertEquals(expectedURL, Driver.getDriver().getCurrentUrl());

    }

    @Test(groups = {"smoke"})
    public void loginNegative(){
        Driver.getDriver().get(Config.getValue("supplySyncURL"));
        supplySyncLoginPage.login("random@gmail.com","12345");

        String errorMessage = supplySyncLoginPage.errorMessage.getText();
        String expectedMessage = "Incorrect login and/or password.";

        Assert.assertEquals(expectedMessage, errorMessage);

    }




}
