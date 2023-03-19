package cashwiseTest;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesCashwise.CashwiseProject;
import utilities.Driver;
import utilities.Flow;

import java.util.ArrayList;
import java.util.List;

public class TestZhyldyz {
    CashwiseProject expenses = new CashwiseProject();


    @Test
    public void ExpensesDropdownVerification(){
        Driver.getDriver().get("https://cashwise.us");
        expenses.login("cashwise@gmail.com", "123123");
        Flow.wait(1000);

        expenses.expensesButton.click();
        Assert.assertEquals(3, expenses.expensesList.size(), "Size is different");

       List<String> expectedOptionsList = new ArrayList<>();
        expectedOptionsList.add("Sellers");
        expectedOptionsList.add("Products and services");
        expectedOptionsList.add("Check");

       for(WebElement option: expenses.expensesList){
           System.out.println(option.getText());
           Assert.assertTrue(expectedOptionsList.contains(option.getText()), "Expenses option failed");
       }


        expenses.sellersButton.click();
        String sellerHeader = expenses.sellersButton.getText();
        Assert.assertEquals("Sellers", sellerHeader, "Sellers' header is different");

        expenses.productAndServicesButton.click();
        String productHeader = expenses.productAndServicesButton.getText();
        Assert.assertEquals("Products and services", productHeader, "Products and services header is different");

        expenses.checkButton.click();
        String checkHeader = expenses.checkButton.getText();
        Assert.assertEquals("Check", checkHeader, "Check's header is different");








}
}
