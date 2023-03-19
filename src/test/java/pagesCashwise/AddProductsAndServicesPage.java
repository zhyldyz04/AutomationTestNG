package pagesCashwise;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.Flow;

import java.util.Random;

public class AddProductsAndServicesPage {

    public AddProductsAndServicesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    Faker faker = new Faker();

    @FindBy(xpath = "//button[1]")
    public WebElement signInButton;
    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailBox;
    @FindBy(xpath = "(//input[@name='password'])")
    public WebElement passwordBox;
    @FindBy(xpath = "(//button[.='Sign in'])[2]")
    public WebElement loginButton;

    @FindBy(xpath = "(//li)[1]")
    public WebElement salesDropdownButton;
    @FindBy(xpath = "//a[.='Products and services']")
    public WebElement productsAndServicesButton;
    @FindBy(xpath = "//button[1]")
    public WebElement addProductsAndServicesButton;
    @FindBy(name = "product_title")
    public WebElement nameInput;
    @FindBy(name = "product_price")
    public WebElement priceInput;
    @FindBy(xpath = "(//div[@role='button'])[4]")
    public WebElement serviceTypeDropdown;
    @FindBy(xpath = "(//li[@role='option'])[1]")
    public WebElement productOption;
    @FindBy(xpath = "(//li[@role='option'])[2]")
    public WebElement serviceOption;
    @FindBy(xpath = "(//div[@role='button'])[5]")
    public WebElement categoryDropdown;
    @FindBy(xpath = "//div[@id='menu-category_id']//ul/button")
    public WebElement createNewCategoryButton;
    @FindBy(name = "category_title")
    public WebElement titleNameInput;
    @FindBy(name = "category_description")
    public WebElement titleDescriptionInput;
    @FindBy(xpath = "(//button[.='Save'])[2]")
    public WebElement saveButton;
    @FindBy(xpath = "(//ul/li)[1]")
    public WebElement optionOne;
    @FindBy(name = "product_description")
    public WebElement descriptionInput;
    @FindBy(xpath = "//button[.='Save']")
    public WebElement saveButtonFinal;

    public void login(String email, String password){
        signInButton.click();
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        loginButton.click();
        Flow.wait(700);
    }
    public void salesPage(){
        salesDropdownButton.click();
        productsAndServicesButton.click();
    }
    public void addingProductsAndServices(){
        Random random = new Random();
        int randomNumber = random.nextInt(1000000);
        String stringNumber = Integer.toString(randomNumber);

        addProductsAndServicesButton.click();
        nameInput.sendKeys(faker.name().fullName());
        priceInput.sendKeys(stringNumber);
        serviceTypeDropdown.click();
        serviceOption.click();
        categoryDropdown.click();
        createNewCategoryButton.click();
        titleNameInput.sendKeys(faker.name().title());
        titleDescriptionInput.sendKeys(faker.funnyName().name());
        saveButton.click();
        Flow.wait(700);
        optionOne.click();
        Flow.wait(700);
        descriptionInput.sendKeys(faker.book().title());
        saveButtonFinal.click();

    }
}
