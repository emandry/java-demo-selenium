# Java-Demo-Selenium

This is a simple WebProject with Gradle and Selenium that simulates a user calculating the perimeter and area of a rectangle.

##Requirements
1.- Install Firefox and Chrome web browser
2.- Download the drivers and change the path of it: 

###With Chrome
You can download it from: https://sites.google.com/a/chromium.org/chromedriver/downloads, and change in SeleniumChromeTest.java the line that says:
`System.setProperty("webdriver.chrome.driver", "/Users/username/Desktop/selenium/chromedriver");`
with the path of your chromedriver

###With Firefox
You can download it from: https://github.com/mozilla/geckodriver/releases, and change in SeleniumFirefoxTest.java the line that says:
`System.setProperty("webdriver.gecko.driver", "/Users/username/Desktop/selenium/geckodriver");`
with the path of your chromedriver

## How to run the test 

Deploy or run the webpage. In case it is not run on localhost or a port different than 8080, you will need to change it on the SeleniumChromeTest.java and SeleniumFirefoxTest.java 

`./gradlew clean test`


## NOTE
This is a empty application. If you try to build it, you will receive an error
