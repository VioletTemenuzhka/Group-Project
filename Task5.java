package com.syntax.GroupExercise;

public class Task5 {
    // Picture task
}

interface WebDriver {
    void open();
    void close();
    String getTitle = null;
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
    void navigate();

}

interface TakesScreenshot extends WebDriver {
    void getScreenshot();
}

class ChromeDriver implements RemoteWebDriver,TakesScreenshot, WebDriver {

    @Override
    public void open() {
        System.out.println("Open Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome browser");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to www.google.com with Chrome browser");
    }
    @Override
    public void getScreenshot() {
        System.out.println("Get screenshot while in Chrome browser");
    }
}

class FirefoxDriver implements RemoteWebDriver,TakesScreenshot, WebDriver{

    @Override
    public void open() {
        System.out.println("Open FirefoxDriver browser");
    }

    @Override
    public void close() {
        System.out.println("Close FirefoxDriver browser");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to www.google.com with FirefoxDriver browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get screenshot while in FirefoxDriver browser");

    }
}

class SafariDriver implements RemoteWebDriver,TakesScreenshot, WebDriver{

    @Override
    public void open() {
        System.out.println("Open SafariDriver browser");
    }

    @Override
    public void close() {
        System.out.println("Close SafariDriver browser");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to www.google.com with SafariDriver browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get screenshot while in SafariDriver browser");
    }
}