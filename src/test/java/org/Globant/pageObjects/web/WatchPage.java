package org.Globant.pageObjects.web;


import org.Globant.reporting.Reporter;
import org.Globant.utils.web.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Represents the ESPN watch page.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class WatchPage extends BasePage {

    /**
     * Constructor method for the WatchPage class.
     * @param driver The driver that controls the behaviour
     * of a web browser.
     */
    public WatchPage(WebDriver driver){
        super(driver);
    }

    /**
     * The first Carousel on the watch page
     */
    @FindBy(css="#fittPageContainer > section > div:nth-child(1) > section")
    private WebElement firstCarousel;

    @FindBy (css = "section.Carousel")
    private List<WebElement> carouselList;

    @FindBy(css="#fittPageContainer > section > div:nth-child(1) > section > div.Carousel__Wrapper.relative.Carousel__Wrapper--canScrollRight > div > div > ul > li:nth-child(2)")
    private WebElement secondCardFirstCarousel;

    @FindBy(css=".lightbox__closebtn")
    private WebElement xButton;

    public boolean isFirstCarouselDisplayed() {
        super.waitForVisibility(firstCarousel);
        return firstCarousel.isDisplayed();
    }
    public boolean isSecondCardDisplayed() {
        super.waitForVisibility(secondCardFirstCarousel);
        return secondCardFirstCarousel.isDisplayed();
    }
    public boolean isxButtonDisplayed() {
        super.waitForVisibility(xButton);
        return xButton.isDisplayed();
    }

    public void clickOnxButton(){
        super.clickElement(xButton);
    }

    public void clickOnSecondCard(){
        super.waitForVisibility(secondCardFirstCarousel);
        super.clickElement(secondCardFirstCarousel);
    }

    public void returnToHome(){
        Reporter.info("Navigating to the ESPN Landing Page.");
        super.getDriver().navigate().back();
    }
}
