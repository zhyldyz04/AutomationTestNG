package pagesCashwise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CashWiseHomeWork {
    public CashWiseHomeWork()
    {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "(//button)[1]")
    public WebElement signIn;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailInputBox;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "(//button)[6]")
    public WebElement signInButton;

    @FindBy(xpath = "(//div/li)[1]")
    public WebElement salesButton;


    @FindBy(xpath = "(//div/a)[4]")
    public WebElement invoiceButton;

    @FindBy(xpath = "(//button)[1]")
    public WebElement createInvoiceButton;


    public void login(String email, String password) {
        signIn.click();
        emailInputBox.sendKeys(email);
        passwordInputBox.sendKeys(password);
        signInButton.click();
    }





}

