package main.java.pageEvents;

import main.java.pageObjects.LoginPageElements;
import main.java.utils.Constants;
import main.java.utils.ElementFetch;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import test.java.BaseTest;
import org.openqa.selenium.WebElement;


public class LoginPageEvents {

    public void verifyLoginPageDisplayedOrNot(){
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.loginText).size()>0,"Login page did not open");
    }

    public void enterValidEmailId(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering Valid Email Address");
        elementFetch.getWebElement("XPATH",LoginPageElements.emailAddress).sendKeys(Constants.validEmailAddress);
    }

    public void enterValidPassword(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering Valid Password");
        elementFetch.getWebElement("XPATH",LoginPageElements.password).sendKeys(Constants.validPassword);
    }

    public void clickOnLoginButton(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Clicking on Login Button");
        WebElement loginButton = elementFetch.getWebElement("XPATH",LoginPageElements.loginButton);
        loginButton.click();
    }

    public void validateInvalidEmailErrorMsg(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering Invalid Email Id");
        WebElement invalidEmail = elementFetch.getWebElement("XPATH",LoginPageElements.emailAddress);
        invalidEmail.sendKeys(Constants.invalidEmailAddress);
        invalidEmail.sendKeys(Keys.TAB);
        Assert.assertTrue(elementFetch.explicitWait("CSS",LoginPageElements.errorMessage));
        BaseTest.logger.info("Error message displayed for Invalid Email Id");
        Assert.assertEquals(elementFetch.getWebElement("CSS",LoginPageElements.errorMessage).getText(),Constants.errorMessageForEmail);
    }

    public void validateInvalidPwdErrorMsg(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering Invalid Password");
        WebElement invalidPwd = elementFetch.getWebElement("XPATH",LoginPageElements.password);
        invalidPwd.sendKeys(Constants.invalidPassword);
        invalidPwd.sendKeys(Keys.TAB);
        Assert.assertTrue(elementFetch.explicitWait("CSS",LoginPageElements.errorMessage));
        BaseTest.logger.info("Error message displayed for Invalid Password");
        Assert.assertEquals(elementFetch.getWebElement("CSS",LoginPageElements.errorMessage).getText(),Constants.errorMessageForPassword);
    }

}
