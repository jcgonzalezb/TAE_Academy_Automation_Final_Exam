package org.Globant.configuration.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.PageFactory.initElements;

/**
 * Represents the Mobile operations done by an Android application.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class MobileOperations {

    private final AndroidDriver<AndroidElement> driver;
    private final WebDriverWait wait;

    /**
     * Constructor method for the MobileOperations class.
     *
     * @param driver : The driver that controls the behaviour
     * of an android application.
     */
    public MobileOperations(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 40L);
        initElements(new AppiumFieldDecorator(
                driver, Duration.ofSeconds(0)), this);
    }

    /**
     * Gets the driver for an Android application.
     * @return An Android element representing the driver for an Android application.
     */
    public AndroidDriver<AndroidElement> getDriver() {
        return this.driver;
    }

    /**
     * Scrolls down the screen (From Top to Bottom).
     * @param swipes The swipes.
     */
    public void scrollDown(int swipes) {
        String locator = "new UiScrollable(new UiSelector()." +
                "resourceIdMatches(\".*ontainer.*\")).flingToEnd(1)";
        scroll(locator, swipes);
    }

    /**
     * Scrolls the screen.
     * @param locator The locator.
     * @param swipes  The swipes.
     */
    public void scroll(String locator, int swipes) {
        int swipesAmount = 0;
        while (swipesAmount < swipes) {
            try {
                driver.findElementByAndroidUIAutomator(locator);
                swipesAmount++;
            } catch (Exception e) {
                swipesAmount++;
            }
        }
    }

    /**
     * Wrapper for click event.
     * @param element : An Android element.
     */
    public void click(AndroidElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 15L);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    /**
     * Wrapper for Visibility event using a default timeout.
     * @param element : An Android element.
     * @return True if the Android element is available, otherwise the return is false.
     */
    public boolean isElementAvailable(AndroidElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 45L);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }

    /**
     * Wrapper for Visibility event using a custom timeout.
     * @param element : An Android element.
     * @param timeout : Timeout for visibility.
     * @return True if the Android element is available, otherwise the return is false.
     */
    public boolean isElementAvailable(AndroidElement element, long timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }
}
