package test.java;

import main.java.pageEvents.AccountPageEvents;
import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.LoginPageEvents;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void successfulLoginToGiphyAccount(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnLoginIcon();
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.verifyLoginPageDisplayedOrNot();
        loginPageEvents.enterValidEmailId();
        loginPageEvents.enterValidPassword();
        loginPageEvents.clickOnLoginButton();
        AccountPageEvents accountPageEvents = new AccountPageEvents();
        accountPageEvents.verifyAccountPageDisplayedOrNot();

    }

    @Test
    public void invalidEmailErrorMsgValidation(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnLoginIcon();
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.verifyLoginPageDisplayedOrNot();
        loginPageEvents.validateInvalidEmailErrorMsg();
    }



    @Test
    public void invalidPasswordErrorMsgValidation(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnLoginIcon();
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.verifyLoginPageDisplayedOrNot();
        loginPageEvents.validateInvalidPwdErrorMsg();
    }
}
