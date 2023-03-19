package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GithubHomePage;
import utilities.Config;
import utilities.Driver;
import utilities.Flow;

import java.util.Set;

public class GitHubTest {

    GithubHomePage githubHomePage = new GithubHomePage();


    @Test(groups = {"smoke"})
    public void search(){
        Driver.getDriver().get(Config.getValue("githuburl"));
        String testData = "java";
        githubHomePage.searchInput.sendKeys(testData + Keys.ENTER);

        for(WebElement result: githubHomePage.resultList){
            String resultStr = result.getText().toLowerCase();

            Assert.assertTrue(resultStr.contains(testData), "Result in Github search");
        }

    }

    @Test
    public void socialMedia(){
        Driver.getDriver().get(Config.getValue("githuburl"));
        Flow.scrollDown(15000);

        for(WebElement socialMedia: githubHomePage.socialMediaLinks){
            String currentURL = Driver.getDriver().getCurrentUrl();
            socialMedia.click();
            Flow.wait(600);
           String url = Driver.getDriver().getCurrentUrl();

           Assert.assertFalse(url.equalsIgnoreCase(currentURL));

           Driver.getDriver().navigate().back();
           Flow.wait(600);

        }

    }
}
