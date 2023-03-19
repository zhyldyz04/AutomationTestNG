package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.Flow;

public class SauceTest {

    @Test(groups = {"smoke"})
    public void login() {
        Driver.getDriver().get("https://saucedemo.com");
        Flow.wait(1000);
    }

    @Test(priority = 2, groups = {"smoke", "products", "regression"})
    public void sort() {
        Driver.getDriver().get("https://saucedemo.com");
        Flow.wait(1000);
    }

    @Test(priority = 3)
    public void logout() {
        Driver.getDriver().get("https://saucedemo.com");
        Flow.wait(1000);
    }

    @AfterMethod
    public void cleanup() {
        Driver.quitBrowser();
    }


}
