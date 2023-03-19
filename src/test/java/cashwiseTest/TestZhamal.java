package cashwiseTest;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesCashwise.AddProductsAndServicesPage;
import utilities.Driver;
import utilities.Flow;

public class TestZhamal {

    AddProductsAndServicesPage aPaS = new AddProductsAndServicesPage();

    @Test
    public void newRowVerification(){
        Driver.getDriver().get("https://cashwise.us");
        aPaS.login("cashwise@gmail.com", "123123");
        Flow.wait(1000);
        aPaS.salesPage();
        int initialRowSize = Driver.getDriver().findElements(By.xpath("//table/tbody")).size();
        aPaS.addingProductsAndServices();
        Flow.wait(500);
        int currentRowSize = Driver.getDriver().findElements(By.xpath("//table/tbody")).size();
        if(currentRowSize > initialRowSize){
            Assert.assertTrue(currentRowSize > initialRowSize, "New row was not added to the table");

        }
    }


}
