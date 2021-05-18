package main.java.pageEvents;

import main.java.pageObjects.AccountPageElements;
import main.java.utils.Constants;
import main.java.utils.ElementFetch;
import org.testng.Assert;

public class AccountPageEvents {

    public void verifyAccountPageDisplayedOrNot(){
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertEquals(elementFetch.getWebElement("CSS", AccountPageElements.loginUsername).getText(), Constants.loginUserName);
    }
}
