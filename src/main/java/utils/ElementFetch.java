package main.java.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.BaseTest;

import java.util.List;

public class ElementFetch {
    public WebElement getWebElement(String identifierType, String identifierValue){
        switch (identifierType){
            case "ID":
                return BaseTest.driver.findElement(By.id(identifierValue));
            case "CSS":
                return BaseTest.driver.findElement(By.cssSelector(identifierValue));
            case "TAGNAME":
                return BaseTest.driver.findElement(By.tagName(identifierValue));
            case "XPATH":
                return BaseTest.driver.findElement(By.xpath(identifierValue));
            default:
                return null;
        }

    }

    public boolean explicitWait(String identifierType, String identifierValue){
        WebDriverWait wait = new WebDriverWait(BaseTest.driver,3);
        switch (identifierType) {
            case "ID":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(identifierValue)));
                return true;
            case "CSS":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(identifierValue)));
                return true;
            case "TAGNAME":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(identifierValue)));
                return true;
            case "XPATH":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(identifierValue)));
                return true;
            default:
                return false;

        }

    }

    public List<WebElement> getListWebElements(String identifierType, String identifierValue){
        switch (identifierType){
            case "ID":
                return BaseTest.driver.findElements(By.id(identifierValue));
            case "CSS":
                return BaseTest.driver.findElements(By.cssSelector(identifierValue));
            case "TAGNAME":
                return BaseTest.driver.findElements(By.tagName(identifierValue));
            case "XPATH":
                return BaseTest.driver.findElements(By.xpath(identifierValue));
            default:
                return null;
        }
    }
}
