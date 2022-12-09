# Final Exam TAE Academy
> This project is a program which allows basic tests on the ESPN web page and the Disneyland application for Android.

## Objectives

- Create a hybrid (web / mobile) automation framework following the architectural and
clean coding best practices. The framework should include the following Test Cases
regarding web and mobile:

### Web Module

Based on the ESPN webpage (use the following link, do not open a region-based
ESPN web page):

Web Browser URL: https://www.espnqa.com/?src=com&_adblock=true&espn=cloud

Create a single test for the following steps:

1. Go to https://www.espnqa.com/?src=com&_adblock=true&espn=cloud
2. Click ‘Log in’ element - Validate a modal is present and contains:
   - ‘ESPN’ Logo
   - ‘Log In’ button
   - ‘Sign Up’ button
3. Click ‘Sign Up’ button and validate:
   - ‘Sign Up’ title is present
   - ‘First Name’ input is present
   - ‘Last name’ input is present
   - ‘Email’ input is present
   - ‘Password’ input is present
   - ‘Sign Up’ button
   - 'X' close button
4. Enter valid information in the form and click ‘Sign Up’
5. Once logged in, go to 'Watch' and validate that at least one carousel is present:
   - Each card in the carousel has a title and a small description about
   streaming source
6. Click on the second card in the first carousel and validate
   - 'X' button to close is present
7. Click 'X' button to close
8. Go back to the landing page
9. Perform mouse hover the ‘User Icon’ element located at the top right corner of
   the view:
   - Validate the element 'Nav text' has the right information previously
   entered in the sign up modal: 'Welcome {{username}}!'
10. Click 'Log Out' element and validate:
    - The user has logged out successfully i.e. Validate the element 'Nav text'
    has text: 'Welcome!' without user name specified

### Mobile Module

Based on the Disneyland mobile application, create automated test cases for the
following scenarios.

1. Category List Test

|#  | Action                                               | Expected Result                            | Notes                                                                                |
|---|------------------------------------------------------|--------------------------------------------|--------------------------------------------------------------------------------------|
| 1 | Tap Map Button available in Dashboard Page           | A Map view should be shown                 | Map Button Option is available in the bottom bar, the second item from left to right |
| 2 | Tap Category List                                    | Different categories are listed to select  | (Attractions is default option)                                                      |
| 3 | Check if the Hotels Option is available in the list  | Hotels Option should be available          | N/A                                                                                  |   |

2. Privacy & Legal

| #   | Action                                              | Expected Result                                                                                                                          | Notes                                                             |
|-----|-----------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------|
| 1   | Tap on Menu Button available in Dashboard Page      | A Menu button view should be shown                                                                                                       | Menu Button Option is available in the bottom bar, the five item from left to right. |
| 2   | Scroll down until bottom of the screen              | Different categories are listed to select:  <br> -My Profile <br> -Property Rules <br> -Link to Account <br> -Help <br> -Privacy & Legal | N/A                                                               |
| 3   | Tap on Privacy & legal | Privacy & Legal screen is displayed                                                                                                      | N/A                                                               |
| 4   | User can see a list of options | The screen have 6 option: <br> -Privacy Policy <br> -Terms of use <br> -Supplemental Terms and Conditions <br> -Legal Notices <br> -Property Rules <br> -Electronic <br> -Communication <br> -Disclosure     | N/A                |

3. Privacy & Legal

| #   | Action                                              | Expected Result                             | Notes                                                             |
|-----|-----------------------------------------------------|---------------------------------------------|-------------------------------------------------------------------|
| 1   | Tap Add Plans Button available in Dashboard Page    | Add Plans Option List is shown to the user  | Add Plans Button Option is available in the bottom bar, the third item from left to right |
| 2   | Check if the Reserve Dining Option is in the list            | Reserve Dining Option should be enabled     | N/A |


## Table of content

* [Environment](#environment)
    * [File Descriptions](#file-descriptions)
    * [API Endpoint](#api-endpoint)
* [Installation](#installation)
* [Usage](#usage)
* [Bugs](#bugs)
* [Author](#author)
* [License](#license)

##  Environment
This project was developed on IntelliJ IDEA 2022.2.3 (Community Edition), JDK 11.0.16.1 and Maven 3.8.6.

For this project, several dependencies were installed, and to run both the web and the mobile modules sequentially using one suiteTest.xml, the following dependencies were installed using specific versions: 

    Testng.version 6.14.3
    Selenium.version 3.141.59
    Appium.version 7.2.0

These are not the last versions are of the dependencies mentioned above and were installed because there is an incompatibility between those three dependencies when the last versions are used. Some problems found were: 

- The last version of TestNG did not work properly with Appium version 7.2.0.
- Inability to work with Json files when the last versions of Selenium and Appium were used.

For more information about the last issue, check this link out: https://stackoverflow.com/questions/69742325/java-lang-noclassdeffounderror-org-openqa-selenium-remote-internal-jsontowebele

## Installation

1. Clone this repository

```
Open IntelliJ -> Select Git -> Select Clone... -> Select URL and enter "https://github.com/jcgonzalezb/TAE_Academy_Automation_Final_Exam" -> Click on Clone.
```

After this, the program is ready to run.

## Usage

Before running the program, make sure that the Android Studio is running a simulation of a device. This device must have installed Android 11.0. Also, make sure that the appium server is connected and working properly.

1. Once the program is installed, find the suiteTest.xml file, make right-click on this file and select "Run suiteTest.xml".
2. The program will run first the web module and then the mobile module.
3. The tests inside the suiteTest.xml will run and the results of the tests will be shown.

Here is an example of the test results for the web module.
```
ChromeDriver was started successfully.
Dec 09, 2022 10:08:46 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Deleting all the cookies
Navigating to https://www.espnqa.com/?src=com&_adblock=true&espn=cloud
Navigating to the ESPN Landing Page
The User Modal is present.
Validate User Modal information.
The ESPN logo is present.
The 'Log In' button is present.
The 'Sign Up' button is present.
Validate 'Sign Up' modal information.
The 'Create Account' title is present.
The 'First Name' input is present.
The 'Last Name' input is present.
The 'Email' input is present.
The 'Password' input is present.
The 'Sign Up' button on the create account modal is present.
The 'X' close button is present.
Inserting valid information to Sign Up.
Sign Up procedure completed!
Navigating to the ESPN Watch Page.
The first carousel is present.
The second card on the first carousel is present.
The 'X' button to close the window is present.
Navigating to the ESPN Landing Page.
Validate welcome message with username on the user panel.
The username is correct.
Log Out procedure completed!
Validate welcome message without username on the user panel.
The element 'Nav text' has text: 'Welcome!' without username.
┌───────────────────────────────────────────────────────────────────────────────────┐
│ Share your Cucumber Report with your team at https://reports.cucumber.io          │
│ Activate publishing with one of the following:                                    │
│                                                                                   │
│ src/test/resources/cucumber.properties:          cucumber.publish.enabled=true    │
│ src/test/resources/junit-platform.properties:    cucumber.publish.enabled=true    │
│ Environment variable:                            CUCUMBER_PUBLISH_ENABLED=true    │
│ JUnit:                                           @CucumberOptions(publish = true) │
│                                                                                   │
│ More information at https://cucumber.io/docs/cucumber/environment-variables/      │
│                                                                                   │
│ Disable this message with one of the following:                                   │
│                                                                                   │
│ src/test/resources/cucumber.properties:          cucumber.publish.quiet=true      │
│ src/test/resources/junit-platform.properties:    cucumber.publish.quiet=true      │
└───────────────────────────────────────────────────────────────────────────────────┘

===============================================
Default Suite
Total tests run: 1, Failures: 0, Skips: 0
===============================================


Process finished with exit code 0
```

Here is an example of the test results for the mobile module.
```
Testing started at 12:47 PM ...
log4j:WARN No such property [conversionPattern] in org.apache.log4j.ConsoleAppender.
Navigating to the Tutorial Screen.
Dec 05, 2022 12:47:19 PM io.appium.java_client.remote.AppiumCommandExecutor$1 lambda$0
INFO: Detected dialect: W3C
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by net.sf.cglib.core.ReflectUtils$1 (file:/C:/Users/juancamilo.gonzalez/.m2/repository/cglib/cglib/3.2.12/cglib-3.2.12.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of net.sf.cglib.core.ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
Navigating to the Dashboard Screen.
Navigating to the Disneyland Map.
Validate the Disneyland Map.
The Map button is displayed.
The Disneyland map is displayed.
Validate the Category button.
The Category button is displayed.
The Category title is displayed.
Validate the Hotels Category.
The Hotels Category is available.
Application closed.
Navigating to the Tutorial Screen.
Dec 05, 2022 12:48:02 PM io.appium.java_client.remote.AppiumCommandExecutor$1 lambda$0
INFO: Detected dialect: W3C
Navigating to the Dashboard Screen.
Validate moreOtherOptions button.
The moreOtherOptions button is displayed.
Navigating to the More Options Screen.
Scroll down until bottom of the screen.
Validate 'My Profile' option
Validate 'Property Rules' option
Validate 'Cast Compliment' option
Validate 'Link to Account' option
Validate 'Car Locator' option
Validate 'Help' option
Validate 'Privacy & Legal' option
Navigating to Privacy & Legal Screen
Validate 'Privacy & Legal' option list
Validate 'Privacy Policy' option
Validate 'Terms of Use' option
Validate 'Supplemental Terms and Conditions' option
Validate 'Legal Notices' option
Validate 'Property Rules' option
Validate 'Electronic Communications Disclosure' option
Validate 'Your California Privacy Rights' option
Validate 'Do Not Sell My Personal Information' option
Validate 'In-App Maps Subject to Google Terms and Conditions' option
Validate 'In-App Maps Subject to Google Privacy Policy' option
Application closed.
Navigating to the Tutorial Screen.
Dec 05, 2022 12:48:44 PM io.appium.java_client.remote.AppiumCommandExecutor$1 lambda$0
INFO: Detected dialect: W3C
Navigating to the Dashboard Screen.
Validate 'Buy Tickets Reserve Dining' button.
The 'Buy Tickets Reserve Dining' button is displayed.
Navigating to 'Buy Tickets Reserve Dining' Screen.
Validate 'Buy Tickets Reserve Dining' list.
The 'Buy Tickets Reserve Dining' list is displayed.
Validate 'Check Dining Availability' button.
The 'Check Dining Availability' button.
Application closed.

Before All/After All failed
java.lang.NullPointerException
	at org.Globant.steps.web.EspnSteps.tearDown(EspnSteps.java:29)


3 Scenarios (3 passed)
13 Steps (13 passed)
2m9.659s


┌───────────────────────────────────────────────────────────────────────────────────┐
│ Share your Cucumber Report with your team at https://reports.cucumber.io          │
│ Activate publishing with one of the following:                                    │
│                                                                                   │
│ src/test/resources/cucumber.properties:          cucumber.publish.enabled=true    │
│ src/test/resources/junit-platform.properties:    cucumber.publish.enabled=true    │
│ Environment variable:                            CUCUMBER_PUBLISH_ENABLED=true    │
│ JUnit:                                           @CucumberOptions(publish = true) │
│                                                                                   │
│ More information at https://cucumber.io/docs/cucumber/environment-variables/      │
│                                                                                   │
│ Disable this message with one of the following:                                   │
│                                                                                   │
│ src/test/resources/cucumber.properties:          cucumber.publish.quiet=true      │
│ src/test/resources/junit-platform.properties:    cucumber.publish.quiet=true      │
└───────────────────────────────────────────────────────────────────────────────────┘
Exception in thread "main" java.lang.NullPointerException
	at org.Globant.steps.web.EspnSteps.tearDown(EspnSteps.java:29)

Process finished with exit code 1

```

## Bugs

No known bugs at this time.

## Author

- Juan Camilo González <a href="https://twitter.com/juankter" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/twitter.svg" alt="juankter" height="30" width="40" /></a>
  <a href="https://bit.ly/2MBNR0t" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="https://bit.ly/2mbnr0t" height="30" width="40" /></a>

## License

Public Domain. No copy write protection.