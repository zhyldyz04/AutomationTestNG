package cashwiseTest;


import org.testng.Assert;
import org.testng.annotations.Test;
import pagesCashwise.CashwiseProject;
import utilities.Driver;

public class TestAigerim1 {
    CashwiseProject access = new CashwiseProject();


    @Test
    public void PositiveLogIn() {
        Driver.getDriver().get("https://cashwise.us");
        access.login("cashwise@gmail.com", "123123");

    }
    @Test
    public void NegativeLogIn() {

        Driver.getDriver().get("https://cashwise.us");
        access.login("cashwise@gmail.com", "0000000");
        String actual = Driver.getDriver().getCurrentUrl();
        String expected = "https://cashwise.us/main?showLogin=true";
        Assert.assertEquals(expected, actual);

    }
}

