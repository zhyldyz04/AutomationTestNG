package cashwiseTest;

import com.google.common.annotations.VisibleForTesting;
import org.testng.Assert;
import org.testng.annotations.Test;

import pagesCashwise.CashWiseHomeWork;
import utilities.Driver;
import utilities.Flow;

public class TestNursultan {

    CashWiseHomeWork cashWiseHomeWork = new CashWiseHomeWork();

    @Test
    public void login() {
        Driver.getDriver().get("https://cashwise.us");
        Flow.wait(2000);

        cashWiseHomeWork.login("cashwise@gmail.com", "123123");
        cashWiseHomeWork.salesButton.click();
        Flow.wait(1000);
        cashWiseHomeWork.invoiceButton.click();
        cashWiseHomeWork.createInvoiceButton.click();

        String expectedURL = "https://cashwise.us/dashboard/sales/invoice/create";

        Assert.assertEquals(expectedURL, Driver.getDriver().getCurrentUrl(), "test is fail");





    }
}