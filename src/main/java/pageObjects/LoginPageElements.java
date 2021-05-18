package main.java.pageObjects;

public interface LoginPageElements {

    String loginText = "//div[text()='Login']";
    String emailAddress = "//input[@placeholder='Email Address']";
    String password = "//input[@placeholder='Password']";
    String loginButton = "//button[contains(text(),'Log in')]";
    String errorMessage = "div .sc-bdnylx";
    String errorMessageIcon = "div .sc-eJoaVz";

}
