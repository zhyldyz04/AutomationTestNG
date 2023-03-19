package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class GoogleTest {


    @Test(groups = {"smoke"})
    public void search() {
        Driver.getDriver().get("https://google.com");
        Driver.getDriver().findElement(By.name("q")).sendKeys("Selenium " + Keys.ENTER);
    }


    @Test
    public void login() {
        Driver.getDriver().get("https://google.com");
        System.out.println(Driver.getDriver().getTitle());
        Assert.fail("op purpose");
    }

    @AfterMethod
    public void cleanup() {
        Driver.quitBrowser();
    }
}



