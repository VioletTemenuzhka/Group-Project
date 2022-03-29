package com.syntax.GroupExercise;

public class Task5Tester {
    public static void main(String[] args) {
        RemoteWebDriver[] browsers= {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver browser:browsers){
            browser.open();
            browser.navigate();
            browser.getScreenshot();
            browser.close();
        }


    }
}
