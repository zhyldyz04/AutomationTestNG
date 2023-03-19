package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SupplySyncLoginPage {

    public SupplySyncLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(tagName = "input")
    public List<WebElement> inputBoxes;
    //or
    // @FindBy(id="input") for username
    //@FindBy(id="password") for password



    @FindBy(tagName = "button")
    public WebElement loginButton;

    @FindBy(tagName = "p")
    public WebElement errorMessage;


    public void login(String email, String password){
        inputBoxes.get(0).sendKeys(email);
        inputBoxes.get(1).sendKeys(password);
        loginButton.click();
    }


}
