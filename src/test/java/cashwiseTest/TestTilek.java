package cashwiseTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesCashwise.CashwiseProject;
import utilities.Driver;

public class TestTilek {

   CashwiseProject expense = new CashwiseProject();

    @Test
    public void ProductsServicesPositiveTest() {

        Driver.getDriver().get("https://cashwise.us");
        expense.login("yyerkanatov@gmail.com", "qwerty79");
        expense.expenseButton.click();
        expense.productAndServices.click();
        int actualRowSize=Driver.getDriver().findElements(By.xpath("//table/tbody")).size();
        expense.addProductsButton.click();
        expense.productAndServicesInfoPositive();
        int totalRowSize=Driver.getDriver().findElements(By.xpath("//table/tbody")).size();
        if (totalRowSize>actualRowSize){
            Assert.assertTrue(totalRowSize>actualRowSize,"NO TIENE SERVICIO NUEVO");
        }
        expense.deleteOpton();
    }

    @Test
    public void ProductsServicesNegativeTest(){

        Driver.getDriver().get("https://cashwise.us");
        expense.login("yyerkanatov@gmail.com", "qwerty79");
        expense.expenseButton.click();
        expense.productAndServices.click();
        expense.addProductsButton.click();
        expense.productAndServicesInfoNegative();
        int properYear=2023;
        String actualYear=expense.wrongYear.getText().substring(6);
        System.out.println(actualYear);
        int aYear=Integer.parseInt(actualYear);
        if (aYear<properYear){
            Assert.assertTrue(aYear>properYear,"INVALID YEAR");


        }

    }

}

