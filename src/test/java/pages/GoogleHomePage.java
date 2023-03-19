package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class GoogleHomePage {

    public GoogleHomePage(){


        //PageFactory.initElements(driver, this);

    }

    @FindBy(id = "input")
    public WebElement searchBox;


}
