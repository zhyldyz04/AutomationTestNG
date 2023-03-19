package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GithubHomePage {


    public GithubHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "q")   //or xpath = (//input)[1]
    public WebElement searchInput;

    @FindBy(xpath = "//div[@class='f4 text-normal']/a")
    public List<WebElement> resultList;

    @FindBy(xpath = "//div[@class='color-bg-subtle']//ul[1]/li")
    public List <WebElement> socialMediaLinks;








}
