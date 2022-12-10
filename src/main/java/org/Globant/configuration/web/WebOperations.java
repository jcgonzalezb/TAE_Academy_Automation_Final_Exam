package org.Globant.configuration.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Represents the operations done by a web browser.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public abstract class WebOperations {

    private final WebDriver driver;
    private final WebDriverWait wait;

    /**
     * Constructor method for the WebOperations class.
     *
     * @param driver : The driver that controls the behaviour
     *               of a web browser.
     */
    public WebOperations(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 50L);
        PageFactory.initElements(driver, this);
    }

    /**
     * Gets the driver for a web browser.
     *
     * @return An WebDriver element representing the driver for a web browser.
     */
    protected WebDriver getDriver() {
        return driver;
    }

    /**
     * Wrapper for click event.
     *
     * @param element : An WebElement element.
     */
    public void clickElement(WebElement element) {
        waitForClickable(element);
        element.click();
    }

    /**
     * Assigns a value as string to a WebElement.
     *
     * @param element : An WebElement.
     * @param text    : Value as string to a WebElement.
     */
    public void typeOnInput(WebElement element, String text) {
        element.sendKeys(text);
    }

    /**
     * Wrapper for Visibility event using a default timeout.
     *
     * @param element : A WebElement element.
     */
    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Wrapper for click on an element event using a default timeout.
     *
     * @param element : A WebElement element.
     */
    public void waitForClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Refreshes the current page.
     */
    public void reloadPage() {
        getDriver().navigate().refresh();
    }

    /**
     * Returns the user from other page on the ESPN site to the home page.
     *
     * @result The user is return to the ESPN home page.
     */
    public void switchToMain() {
        getDriver().switchTo().defaultContent();
    }
}
