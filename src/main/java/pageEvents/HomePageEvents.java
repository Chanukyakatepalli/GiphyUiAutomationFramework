package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;
import test.java.BaseTest;

public class HomePageEvents {

    public void clickOnLoginIcon(){
     ElementFetch elementFetch = new ElementFetch();
     BaseTest.logger.info("Clicking on Login Icon");
     elementFetch.getWebElement("XPATH", HomePageElements.loginIcon).click();
    }
}
