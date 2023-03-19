package cashwiseTest;

import org.testng.annotations.Test;
import pagesCashwise.CreateNewSellerPage;
import utilities.Driver;

public class TestAzhar {


    CreateNewSellerPage createNewSellerPage = new CreateNewSellerPage();
    @Test
    public void singInPage() throws InterruptedException {

        Driver.getDriver().get("https://cashwise.us");

        createNewSellerPage.signIn.click();
        createNewSellerPage.email.sendKeys("cashwise@gmail.com");
        createNewSellerPage.password.sendKeys("123123");
        createNewSellerPage.signInBtn.click();
        createNewSellerPage.expenses.click();
        createNewSellerPage.addSellerBtn.click();
        Thread.sleep(3000);
        createNewSellerPage.title.sendKeys("LLS");
        createNewSellerPage.fullName.sendKeys("John Tester");
        createNewSellerPage.emailField.sendKeys("John.test@gmail.com");
        createNewSellerPage.phoneNumber.sendKeys("+996 553 77 88 99");
        createNewSellerPage.address.sendKeys("122 Ahunbaeva, Bishkek, KR");
        createNewSellerPage.saveBtn.click();

    }
}
