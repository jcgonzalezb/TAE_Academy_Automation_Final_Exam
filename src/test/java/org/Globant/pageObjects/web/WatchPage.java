package org.Globant.pageObjects.web;

import org.Globant.reporting.Reporter;
import org.Globant.utils.web.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Represents the ESPN watch page.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class WatchPage extends BasePage {

    /**
     * The first Carousel on the watch page.
     */
    @FindBy(css = "#fittPageContainer > section > div:nth-child(1) > section")
    private WebElement firstCarousel;

    /**
     * The second card in the first Carousel on the watch page.
     */
    @FindBy(css = "#fittPageContainer > section > div:nth-child(1) > section > div.Carousel__Wrapper.relative.Carousel__Wrapper--canScrollRight > div > div > ul > li:nth-child(2)")
    private WebElement secondCardFirstCarousel;

    /**
     * The close button in the TV provider window.
     */
    @FindBy(css = ".lightbox__closebtn")
    private WebElement xButton;

    /**
     * Constructor method for the WatchPage class.
     *
     * @param driver The driver that controls the behaviour
     *               of a web browser.
     */
    public WatchPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Checks if the first carousel is displayed.
     *
     * @return True if the first carousel is displayed,
     * otherwise the return is false.
     */
    public boolean isFirstCarouselDisplayed() {
        super.waitForVisibility(firstCarousel);
        return firstCarousel.isDisplayed();
    }

    /**
     * Checks if the second card in the first carousel is displayed.
     *
     * @return True if the second card in the first carousel is displayed,
     * otherwise the return is false.
     */
    public boolean isSecondCardDisplayed() {
        super.waitForVisibility(secondCardFirstCarousel);
        return secondCardFirstCarousel.isDisplayed();
    }

    /**
     * Checks if the close button in TV provider window is displayed.
     *
     * @return True if close button in TV provider window is displayed,
     * otherwise the return is false.
     */
    public boolean isxButtonDisplayed() {
        super.waitForVisibility(xButton);
        return xButton.isDisplayed();
    }

    /**
     * Clicks on the second card in the first carousel.
     */
    public void clickOnSecondCard() {
        super.waitForVisibility(secondCardFirstCarousel);
        super.clickElement(secondCardFirstCarousel);
    }

    /**
     * Clicks on the close button in TV provider window is displayed.
     */
    public void clickOnxButton() {
        super.clickElement(xButton);
    }

    /**
     * Takes the user to the ESPN home page.
     */
    public void returnToHome() {
        Reporter.info("Navigating to the ESPN Landing Page.");
        super.getDriver().navigate().back();
    }
}
