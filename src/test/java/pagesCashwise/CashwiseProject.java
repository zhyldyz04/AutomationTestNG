package pagesCashwise;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.Flow;

import java.util.List;

public class CashwiseProject {

    Actions sd=new Actions(Driver.getDriver());
    Faker faker = new Faker();

    public CashwiseProject() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "(//button)[1]")
    public WebElement signIn;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailInputBox;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "(//button)[6]")
    public WebElement signInButton;


    @FindBy(xpath = "(//div/li)[2]")
    public WebElement expensesButton;

    @FindBy(xpath = "(//div[@class='MuiAccordion-region'])[2]//a")
    public List<WebElement> expensesList;


    @FindBy(xpath = "(//div/a)[5]")
    public WebElement sellersButton;


    @FindBy(xpath = "(//div/a)[6]")
    public WebElement productAndServicesButton;

    @FindBy(xpath = "(//div/a)[7]")
    public WebElement checkButton;




    public void login(String email, String password) {
        signIn.click();
        emailInputBox.sendKeys(email);
        passwordInputBox.sendKeys(password);
        signInButton.click();

    }


    @FindBy(xpath = "//*[@id=\"sidebar\"]/div[3]/div[1]")
    public WebElement expenseButton;
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div[3]/div[2]/div/div/div/div/div/a[2]")
    public WebElement productAndServices;
    @FindBy(xpath = "//button[1]")
    public WebElement addProductsButton;
    @FindBy(xpath = "//input")
    public List<WebElement> productDescriptionInputs;
    @FindBy(xpath = "//input")
    public List<WebElement> productAndServicesInputList;
    @FindBy(id = "mui-component-select-service_type_id")
    public WebElement serviceTypeButton;
    @FindBy(xpath = "//ul/li")
    public List<WebElement> serviceTypeInputBoxes;
    @FindBy(id = "mui-component-select-category_id")
    public WebElement buttonAfterServiceType;
    @FindBy(xpath = "//*[@id=\"menu-category_id\"]/div[3]/ul/button")
    public WebElement categoryButton;
    @FindBy(xpath = "//form[@id='categoryForm']//input")
    public List<WebElement> categoryInput;
    @FindBy(name = "do_remind_every_month")
    public List<WebElement> repeatRadioButton;
    @FindBy(xpath = "(//button)[7]")
    public WebElement categorySavebutton;
    @FindBy (xpath = "(//ul/li)[1]")
    public WebElement categoryOption1;
    @FindBy (xpath = "(//input)[6]")
    public WebElement dateOfPayInput;
    @FindBy(xpath ="(//input)[7]")
    public WebElement remindInput;
    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/button[2]")
    public WebElement saveButton;
    @FindBy (xpath = "/html/body/div[2]/div[3]/div/div/div/button[1]")
    public WebElement cancelButton;
    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> newProduct;
    @FindBy (xpath = "//table//tbody")
    public  WebElement tableSize;
    @FindBy(xpath ="//*[@id=\"mui-component-select-category_id\"]")
    public WebElement categoryButton2;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/table/tbody/tr/td[5]/div/span[1]")
    public WebElement wrongYear;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/button[1]")
    public WebElement categoryCancelButton;
    @FindBy(xpath ="//*[@id=\"main\"]/div/div/table/tbody/tr/td[6]/div/button[2]" )
    public WebElement deleteButton;
    @FindBy(xpath ="/html/body/div[2]/div[3]/div/div/div/button[2]" )
    public WebElement deleteButton2;



    public void productAndServicesInfoPositive(){
        productAndServicesInputList.get(0).sendKeys(faker.name().fullName());
        productAndServicesInputList.get(1).sendKeys("12345678900987654321");
        productAndServicesInputList.get(4).sendKeys(faker.address().fullAddress());
        serviceTypeButton.click();
        serviceTypeInputBoxes.get(1).click();
        categoryButton2.click();
        //buttonAFterServiceType.click();
        categoryButton.click();
        Flow.wait(500);
        sd.scrollByAmount(0,800).perform();
        categoryInput.get(0).sendKeys(faker.aviation().airport());
        categoryInput.get(1).sendKeys(faker.address().fullAddress());
        // categorySavebutton.click();
        //sd.moveToElement(categoryOption1).click().build().perform();
        categoryCancelButton.click();
        categoryOption1.click();
        dateOfPayInput.sendKeys("10/10/2023");
        remindInput.sendKeys(faker.number().digit());
        repeatRadioButton.get(1).click();
        //cancelButton.click();
        saveButton.click();


    }

    public void deleteOpton(){
        deleteButton.click();
        deleteButton2.click();
    }
    public void productAndServicesInfoNegative(){
        productAndServicesInputList.get(0).sendKeys(faker.name().fullName());
        productAndServicesInputList.get(1).sendKeys("12345678900987654321");
        productAndServicesInputList.get(4).sendKeys(faker.address().fullAddress());
        serviceTypeButton.click();
        serviceTypeInputBoxes.get(1).click();
        categoryButton2.click();
        Flow.wait(500);
        sd.scrollByAmount(0,800).perform();
        categoryOption1.click();
        dateOfPayInput.sendKeys("01/01/0011");
        remindInput.sendKeys(faker.number().digit());
        repeatRadioButton.get(1).click();
        cancelButton.click();
        saveButton.click();

    }


}





