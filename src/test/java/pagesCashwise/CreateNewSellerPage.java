package pagesCashwise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateNewSellerPage {


        public CreateNewSellerPage(){

            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[2]/button[1]")
        public WebElement signIn;

        @FindBy(xpath = "//*[@id=\":r3:\"]")
        public WebElement email;

        @FindBy(xpath = "//*[@id=\":r4:\"]")
        public WebElement password;

        @FindBy(xpath = "/html/body/div[2]/div[3]/div/form/button")
        public WebElement signInBtn;

        @FindBy(xpath = "//*[@id=\"sidebar\"]/div[3]/div[1]/div[1]/li")
        public WebElement expenses;

        @FindBy(xpath = "//*[@id=\"main\"]/div/div/header/div/button")
        public WebElement addSellerBtn;

        @FindBy(xpath = "//*[@name=\"company_name\"]")
        public WebElement title;

        @FindBy(xpath = "//*[@name=\"seller_name\"]")
        public WebElement fullName;

        @FindBy(xpath = "//*[@name=\"email\"]")
        public WebElement emailField;

        @FindBy(xpath = "//*[@name=\"phone_number\"]")
        public WebElement phoneNumber;

        @FindBy(xpath = "//*[@name=\"address\"]")
        public WebElement address;

        @FindBy(xpath = "//*[@id=\"sellerForm\"]/div[6]/button[2]")
        public WebElement saveBtn;

    }

