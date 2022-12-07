package org.Globant.steps.mobile;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.Globant.pageObjects.mobile.SetUpMobile;
import org.Globant.reporting.Reporter;

public class MobileHooks {
    @Before
    public void startApp(){
        Reporter.info("Navigating to the Tutorial Screen.");
        SetUpMobile.environmentSetUp();
    }

    @After
    public void closeApp() {
        SetUpMobile.mobileApplicationEnd();
        Reporter.info("Application closed.");
    }

}
